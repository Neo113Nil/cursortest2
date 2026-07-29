package com.xsj.crasheye;

import android.text.TextUtils;
import android.util.Base64;
import com.xsj.crasheye.log.Logger;
import com.xsj.crasheye.minidump.MinidumpStackAnalyzer;
import com.xsj.crasheye.pushstrategy.DateRefreshStrategy;
import com.xsj.crasheye.pushstrategy.MergerSession;
import com.xsj.crasheye.util.Utils;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class DataFlusher extends BaseExecutor implements InterfaceExecutor {
    private static final int MAX_FILE_SIZE = 5242880;
    private MinidumpStackAnalyzer mMinidumpStackAnalyzer = new MinidumpStackAnalyzer();

    DataFlusher() {
    }

    public synchronized void send() {
        Thread newThread = new LowPriorityThreadFactory().newThread(new Runnable() { // from class: com.xsj.crasheye.DataFlusher.1
            @Override // java.lang.Runnable
            public void run() {
                File[] listFiles;
                DataFlusher.this.BuildNativateErrorData();
                DataFlusher.this.BuildNotSaveNativateErrorData();
                MergerSession.MergerSessionFiles();
                if (!Utils.allowedToSendData()) {
                    Logger.logInfo("You have enabled the FlushOnlyOverWiFi option and there is no WiFi connection, data will not be sent now.");
                    return;
                }
                if (Properties.FILES_PATH == null || (listFiles = new File(Properties.FILES_PATH).listFiles(CrasheyeFileFilter.getInstance())) == null || listFiles.length <= 0) {
                    return;
                }
                boolean checkCanReportBySpanTime = listFiles.length >= 2 ? true : DateRefreshStrategy.getInstance().checkCanReportBySpanTime();
                for (File file : listFiles) {
                    if (file.exists()) {
                        if (file.length() > 5242880 || file.length() == 0) {
                            Utils.deleteFile(file);
                        } else {
                            if (!checkCanReportBySpanTime && file.getName().startsWith(CrasheyeFileFilter.SESIONFIX)) {
                                if (DateRefreshStrategy.getInstance().checkCanReportByFileCount(MergerSession.GetSessionCountByFileName(file.getName()))) {
                                    checkCanReportBySpanTime = true;
                                }
                            }
                            NetSenderResponse netSenderResponse = new NetSenderResponse("", null);
                            try {
                                String readFile = Utils.readFile(file.getAbsolutePath());
                                if (readFile != null && readFile.length() != 0) {
                                    if (new NetSender().sendBlocking((String) null, readFile, false).getSentSuccessfully().booleanValue()) {
                                        if (file.getName().startsWith(CrasheyeFileFilter.SESIONFIX)) {
                                            DateRefreshStrategy.getInstance().updataLastReportTime(Utils.getTimeForLong());
                                            DateRefreshStrategy.getInstance().saveLastReportTime(Properties.AppContent);
                                        }
                                        Utils.deleteFile(file);
                                    }
                                }
                                if (Crasheye.crasheyeCallback != null) {
                                    Crasheye.crasheyeCallback.netSenderResponse(netSenderResponse);
                                }
                            } catch (Exception e) {
                                netSenderResponse.setException(e);
                                netSenderResponse.setSentSuccessfully(false);
                                e.printStackTrace();
                                if (Crasheye.crasheyeCallback != null) {
                                    Crasheye.crasheyeCallback.netSenderResponse(netSenderResponse);
                                }
                            }
                        }
                    }
                }
            }
        });
        if (getExecutor() != null) {
            getExecutor().execute(newThread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void BuildNativateErrorData() {
        File[] listFiles = new File(Properties.FILES_PATH).listFiles(new FileFilter() { // from class: com.xsj.crasheye.DataFlusher.2
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                return file.getName().startsWith(CrasheyeFileFilter.NATIVEPREFIX) && file.getName().endsWith(CrasheyeFileFilter.POSTFIX);
            }
        });
        if (listFiles != null) {
            for (File file : listFiles) {
                try {
                    JSONObject jSONObject = new JSONObject(Utils.readFile(file.getAbsolutePath()));
                    JSONObject jSONObject2 = jSONObject.getJSONObject("crash");
                    String string = jSONObject2.getString("dumpfile");
                    File file2 = new File(string);
                    if (!file2.exists()) {
                        Logger.logWarning("native crash dump file is not exists");
                        Utils.deleteFile(file);
                    } else {
                        byte[] byteArray = Utils.toByteArray(string);
                        if (byteArray != null) {
                            jSONObject2.put("file", Base64.encodeToString(byteArray, 2));
                        }
                        BuildMinidumpAnalyzed(file2, jSONObject);
                        BuildNativeErrorCustomData(string, jSONObject);
                        BuildNativeSystemLogData(string, jSONObject);
                        BuildNativeBreadcrumbData(string, jSONObject);
                        BuildMonoStackData(string, jSONObject);
                        Utils.writeFile(CrasheyeFileFilter.createNewFile(), String.valueOf(jSONObject.toString()) + Properties.getSeparator(EnumActionType.ndkerror));
                        Utils.deleteFile(file2);
                        Utils.deleteFile(file);
                        DeleteNativeDataFile(string);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Logger.logWarning("build ndk error report fail");
                }
            }
        }
    }

    private void DeleteNativeDataFile(String str) {
        for (String str2 : new String[]{CrasheyeFileFilter.CUSTOMFILE, CrasheyeFileFilter.BREADCRUMBSFILE, CrasheyeFileFilter.MONOSTACKFILE}) {
            Utils.deleteFile(str.replace(CrasheyeFileFilter.RAWNATIVEFILE, str2));
        }
    }

    private void BuildNativeBreadcrumbData(String str, JSONObject jSONObject) {
        byte[] byteArray;
        String replace = str.replace(CrasheyeFileFilter.RAWNATIVEFILE, CrasheyeFileFilter.BREADCRUMBSFILE);
        File file = new File(replace);
        if (!file.exists() || file.isDirectory() || (byteArray = Utils.toByteArray(replace)) == null) {
            return;
        }
        List<byte[]> byteSplit = Utils.byteSplit(CrasheyeFileFilter.NATIVESEPARATOR.getBytes(), byteArray);
        if (byteSplit.size() % 2 != 0) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < byteSplit.size(); i += 2) {
            try {
                String str2 = new String(byteSplit.get(i), "UTF-8");
                jSONArray.put(String.valueOf(str2) + ":" + new String(byteSplit.get(i + 1), "UTF-8"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (jSONArray.length() != 0) {
            try {
                jSONObject.put("breadcrumbs", jSONArray);
            } catch (JSONException e2) {
                Logger.logError(e2.getMessage());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void BuildNativeSystemLogData(String str, JSONObject jSONObject) {
        String str2;
        String replace = str.replace(CrasheyeFileFilter.RAWNATIVEFILE, CrasheyeFileFilter.SYSTEMLOGFILE);
        File file = new File(replace);
        try {
            if (!file.exists() || file.isDirectory()) {
                Logger.logInfo("old SEND_LOG: false");
            } else {
                Logger.logInfo("old SEND_LOG: true");
                try {
                    str2 = readNativeLogFile(replace, Properties.LOG_LINES);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = "NA";
                }
                Logger.logInfo("----------- start of syslog ------------");
                Logger.logInfo(str2);
                Logger.logInfo("----------- end of syslog ------------");
                jSONObject.put("log", str2);
                return;
            }
            jSONObject.put("log", str2);
            return;
        } catch (JSONException e) {
            Logger.logError(e.getMessage());
            return;
        }
        str2 = null;
        if (TextUtils.isEmpty(str2)) {
        }
        Logger.logInfo("----------- start of syslog ------------");
        Logger.logInfo(str2);
        Logger.logInfo("----------- end of syslog ------------");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00a5 -> B:12:0x00a8). Please report as a decompilation issue!!! */
    private String readNativeLogFile(String str, long j) {
        RandomAccessFile randomAccessFile;
        int i;
        String readLine;
        ArrayList arrayList = new ArrayList();
        RandomAccessFile randomAccessFile2 = null;
        randomAccessFile2 = null;
        randomAccessFile2 = null;
        randomAccessFile2 = null;
        try {
            try {
                try {
                    randomAccessFile = new RandomAccessFile(str, "r");
                } catch (IOException e) {
                    e.printStackTrace();
                    randomAccessFile2 = randomAccessFile2;
                }
            } catch (FileNotFoundException e2) {
                e = e2;
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th) {
            th = th;
            randomAccessFile = randomAccessFile2;
        }
        try {
            long length = randomAccessFile.length();
            long filePointer = randomAccessFile.getFilePointer();
            long j2 = (length + filePointer) - 1;
            randomAccessFile.seek(j2);
            int i2 = 0;
            while (true) {
                i = (j2 > filePointer ? 1 : (j2 == filePointer ? 0 : -1));
                if (i <= 0) {
                    break;
                }
                int read = randomAccessFile.read();
                if (read == 10 || read == 13) {
                    String readLine2 = randomAccessFile.readLine();
                    if (readLine2 != null) {
                        arrayList.add(String.valueOf(readLine2) + "\n");
                        i2++;
                        i = (((long) i2) > j ? 1 : (((long) i2) == j ? 0 : -1));
                        if (i >= 0) {
                            break;
                        }
                    }
                    j2--;
                }
                j2--;
                randomAccessFile.seek(j2);
                if (j2 == 0 && (readLine = randomAccessFile.readLine()) != null) {
                    arrayList.add(String.valueOf(readLine) + "\n");
                    i2++;
                    i = (i2 > j ? 1 : (i2 == j ? 0 : -1));
                    if (i >= 0) {
                        break;
                    }
                }
            }
            randomAccessFile.close();
            randomAccessFile2 = i;
        } catch (FileNotFoundException e4) {
            e = e4;
            randomAccessFile2 = randomAccessFile;
            e.printStackTrace();
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
                randomAccessFile2 = randomAccessFile2;
            }
            Collections.reverse(arrayList);
            return TextUtils.join("", arrayList);
        } catch (IOException e5) {
            e = e5;
            randomAccessFile2 = randomAccessFile;
            e.printStackTrace();
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
                randomAccessFile2 = randomAccessFile2;
            }
            Collections.reverse(arrayList);
            return TextUtils.join("", arrayList);
        } catch (Throwable th2) {
            th = th2;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
        Collections.reverse(arrayList);
        return TextUtils.join("", arrayList);
    }

    private void BuildNativeErrorCustomData(String str, JSONObject jSONObject) {
        byte[] byteArray;
        JSONObject optJSONObject;
        String replace = str.replace(CrasheyeFileFilter.RAWNATIVEFILE, CrasheyeFileFilter.CUSTOMFILE);
        File file = new File(replace);
        if (!file.exists() || file.isDirectory() || (byteArray = Utils.toByteArray(replace)) == null) {
            return;
        }
        List<byte[]> byteSplit = Utils.byteSplit(CrasheyeFileFilter.NATIVESEPARATOR.getBytes(), byteArray);
        if (byteSplit.size() % 2 != 0) {
            return;
        }
        String str2 = null;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < byteSplit.size(); i += 2) {
            try {
                String str3 = new String(byteSplit.get(i), "UTF-8");
                String str4 = new String(byteSplit.get(i + 1), "UTF-8");
                if (str3.equals("scriptstack")) {
                    str2 = str4;
                } else {
                    hashMap.put(str3, str4);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (str2 != null && (optJSONObject = jSONObject.optJSONObject("crash")) != null) {
            try {
                optJSONObject.put("scriptstack", str2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        if (hashMap.size() != 0) {
            try {
                jSONObject.put("extradata", new JSONObject(hashMap));
            } catch (JSONException e3) {
                Logger.logError(e3.getMessage());
            }
        }
    }

    private void BuildMonoStackData(String str, JSONObject jSONObject) {
        byte[] byteArray;
        JSONObject optJSONObject;
        String replace = str.replace(CrasheyeFileFilter.RAWNATIVEFILE, CrasheyeFileFilter.MONOSTACKFILE);
        File file = new File(replace);
        if (!file.exists() || file.isDirectory() || (byteArray = Utils.toByteArray(replace)) == null) {
            return;
        }
        String str2 = null;
        try {
            str2 = new String(byteArray, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if (str2 == null || (optJSONObject = jSONObject.optJSONObject("crash")) == null) {
            return;
        }
        try {
            optJSONObject.put("scriptstack", str2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void BuildNotSaveNativateErrorData() {
        File[] listFiles = new File(Properties.FILES_PATH).listFiles(new FileFilter() { // from class: com.xsj.crasheye.DataFlusher.3
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                return file.getName().endsWith(CrasheyeFileFilter.RAWNATIVEFILE);
            }
        });
        if (listFiles != null) {
            for (File file : listFiles) {
                try {
                    ActionNativeError actionNativeError = new ActionNativeError(file.getAbsolutePath());
                    actionNativeError.SetNativeCrashData(file.getAbsolutePath());
                    actionNativeError.SetLastUnSave();
                    JSONObject json = actionNativeError.toJson();
                    BuildMinidumpAnalyzed(file, json);
                    BuildNativeErrorCustomData(file.getAbsolutePath(), json);
                    BuildNativeSystemLogData(file.getAbsolutePath(), json);
                    BuildNativeBreadcrumbData(file.getAbsolutePath(), json);
                    BuildMonoStackData(file.getAbsolutePath(), json);
                    Utils.writeFile(CrasheyeFileFilter.createNewFile(), String.valueOf(json.toString()) + Properties.getSeparator(EnumActionType.ndkerror));
                    Utils.deleteFile(file);
                    DeleteNativeDataFile(file.getAbsolutePath());
                } catch (Exception e) {
                    e.printStackTrace();
                    Logger.logWarning("build ndk error report fail");
                }
            }
        }
    }

    @Override // com.xsj.crasheye.InterfaceExecutor
    public ExecutorService getExecutor() {
        if (executor == null) {
            executor = Executors.newFixedThreadPool(1);
        }
        return executor;
    }

    private void BuildMinidumpAnalyzed(File file, JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (!Properties.libcrasheye_stack_analyze) {
            Logger.logWarning("libminidump_stack_analyze not enabled!");
            return;
        }
        if (file == null || !file.exists()) {
            Logger.logError("dumpFile is null or not exists");
            return;
        }
        File analyze = this.mMinidumpStackAnalyzer.analyze(file);
        if (analyze != null) {
            String str = null;
            try {
                str = Utils.readFile(analyze.getAbsolutePath());
            } catch (Throwable th) {
                th.printStackTrace();
                Logger.logError(th.getMessage());
            }
            if (str != null && jSONObject != null && (optJSONObject = jSONObject.optJSONObject("crash")) != null) {
                try {
                    optJSONObject.put("minidump_stack", str);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            Utils.deleteFile(analyze);
        }
    }
}
