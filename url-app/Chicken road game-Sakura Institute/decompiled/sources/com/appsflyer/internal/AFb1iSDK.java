package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import m1.n;

/* loaded from: classes.dex */
public final class AFb1iSDK implements AFb1tSDK {
    private final AFd1lSDK AFKeystoreWrapper;

    public AFb1iSDK(AFd1lSDK aFd1lSDK) {
        this.AFKeystoreWrapper = aFd1lSDK;
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final void AFInAppEventParameterName() {
        try {
            if (new File(this.AFKeystoreWrapper.AFKeystoreWrapper.getFilesDir(), "AFRequestCache").exists()) {
                return;
            }
            new File(this.AFKeystoreWrapper.AFKeystoreWrapper.getFilesDir(), "AFRequestCache").mkdir();
        } catch (Exception e4) {
            AFLogger.afErrorLog("CACHE: Could not create cache directory", e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFb1tSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String AFInAppEventType(AFb1qSDK aFb1qSDK) {
        OutputStreamWriter outputStreamWriter;
        n nVar = 0;
        try {
            try {
                File file = new File(this.AFKeystoreWrapper.AFKeystoreWrapper.getFilesDir(), "AFRequestCache");
                if (!file.exists()) {
                    file.mkdir();
                    return null;
                }
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 40) {
                    AFLogger.INSTANCE.i(AFg1aSDK.CACHE, "reached cache limit, not caching request");
                    return null;
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1aSDK aFg1aSDK = AFg1aSDK.CACHE;
                StringBuilder sb = new StringBuilder("caching request with URL: ");
                sb.append(aFb1qSDK.valueOf);
                aFLogger.i(aFg1aSDK, sb.toString());
                String l4 = Long.toString(System.currentTimeMillis());
                File file2 = new File(new File(this.AFKeystoreWrapper.AFKeystoreWrapper.getFilesDir(), "AFRequestCache"), l4);
                file2.createNewFile();
                outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file2.getPath(), true), Charset.defaultCharset());
                try {
                    outputStreamWriter.write("version=");
                    outputStreamWriter.write(aFb1qSDK.AFKeystoreWrapper);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("url=");
                    outputStreamWriter.write(aFb1qSDK.valueOf);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("data=");
                    outputStreamWriter.write(Base64.encodeToString(aFb1qSDK.AFInAppEventType(), 2));
                    outputStreamWriter.write(10);
                    AFf1zSDK aFf1zSDK = aFb1qSDK.values;
                    if (aFf1zSDK != null) {
                        outputStreamWriter.write("type=");
                        outputStreamWriter.write(aFf1zSDK.name());
                        outputStreamWriter.write(10);
                    }
                    outputStreamWriter.flush();
                    aFLogger.i(aFg1aSDK, "done, cacheKey: ".concat(String.valueOf(l4)));
                    try {
                        outputStreamWriter.close();
                    } catch (IOException e4) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e4);
                    }
                    return l4;
                } catch (Exception e5) {
                    e = e5;
                    AFLogger.afErrorLog("CACHE: Could not cache request", e);
                    if (outputStreamWriter != null) {
                        try {
                            outputStreamWriter.close();
                        } catch (IOException e6) {
                            AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e6);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                nVar = "AFRequestCache";
                if (nVar != 0) {
                    try {
                        nVar.close();
                    } catch (IOException e7) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e7);
                    }
                }
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
            outputStreamWriter = null;
        } catch (Throwable th2) {
            th = th2;
            if (nVar != 0) {
            }
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final void valueOf() {
        try {
            File file = new File(this.AFKeystoreWrapper.AFKeystoreWrapper.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1aSDK aFg1aSDK = AFg1aSDK.CACHE;
                StringBuilder sb = new StringBuilder("Found cached request");
                sb.append(file2.getName());
                aFLogger.i(aFg1aSDK, sb.toString());
                StringBuilder sb2 = new StringBuilder("Deleting ");
                sb2.append(file2.getName());
                sb2.append(" from cache");
                aFLogger.i(aFg1aSDK, sb2.toString());
                file2.delete();
            }
        } catch (Exception e4) {
            AFLogger.afErrorLog("CACHE: Could not cache request", e4);
        }
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final List<AFb1qSDK> values() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(this.AFKeystoreWrapper.AFKeystoreWrapper.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            }
            listFiles = file.listFiles();
        } catch (Exception e4) {
            AFLogger.afErrorLog("CACHE: Could not get cached requests", e4);
        }
        if (listFiles == null) {
            return arrayList;
        }
        for (File file2 : listFiles) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1aSDK aFg1aSDK = AFg1aSDK.CACHE;
            StringBuilder sb = new StringBuilder("Found cached request");
            sb.append(file2.getName());
            aFLogger.i(aFg1aSDK, sb.toString());
            arrayList.add(values(file2));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static AFb1qSDK values(File file) {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2 = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                try {
                    char[] cArr = new char[(int) file.length()];
                    inputStreamReader.read(cArr);
                    AFb1qSDK aFb1qSDK = new AFb1qSDK(cArr);
                    aFb1qSDK.AFInAppEventParameterName = file.getName();
                    try {
                        inputStreamReader.close();
                    } catch (IOException e4) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e4);
                    }
                    return aFb1qSDK;
                } catch (Exception e5) {
                    e = e5;
                    AFLogger.afErrorLogForExcManagerOnly("error while loading request from cache", e);
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        } catch (IOException e6) {
                            AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e6);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStreamReader2 = inputStreamReader;
                if (inputStreamReader2 != null) {
                    try {
                        inputStreamReader2.close();
                    } catch (IOException e7) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e7);
                    }
                }
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
            inputStreamReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStreamReader2 != null) {
            }
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final boolean values(String str) {
        File file = new File(new File(this.AFKeystoreWrapper.AFKeystoreWrapper.getFilesDir(), "AFRequestCache"), str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.CACHE;
        StringBuilder sb = new StringBuilder("Deleting ");
        sb.append(str);
        sb.append(" from cache");
        aFLogger.i(aFg1aSDK, sb.toString());
        if (!file.exists()) {
            return true;
        }
        try {
            return file.delete();
        } catch (Exception e4) {
            StringBuilder sb2 = new StringBuilder("CACHE: Could not delete ");
            sb2.append(str);
            sb2.append(" from cache");
            AFLogger.afErrorLog(sb2.toString(), e4);
            return false;
        }
    }
}
