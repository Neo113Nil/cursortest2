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

/* loaded from: classes3.dex */
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
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not create cache directory", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFb1tSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String AFInAppEventType(AFb1qSDK aFb1qSDK) {
        OutputStreamWriter outputStreamWriter;
        OutputStreamWriter outputStreamWriter2 = null;
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
            AFLogger.INSTANCE.i(AFg1aSDK.CACHE, new StringBuilder("caching request with URL: ").append(aFb1qSDK.valueOf).toString());
            String l = Long.toString(System.currentTimeMillis());
            File file2 = new File(new File(this.AFKeystoreWrapper.AFKeystoreWrapper.getFilesDir(), "AFRequestCache"), l);
            file2.createNewFile();
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file2.getPath(), true), Charset.defaultCharset());
            try {
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
                    AFLogger.INSTANCE.i(AFg1aSDK.CACHE, "done, cacheKey: ".concat(String.valueOf(l)));
                    try {
                        outputStreamWriter.close();
                    } catch (IOException e) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e);
                    }
                    return l;
                } catch (Exception e2) {
                    e = e2;
                    AFLogger.afErrorLog("CACHE: Could not cache request", e);
                    if (outputStreamWriter != null) {
                        try {
                            outputStreamWriter.close();
                        } catch (IOException e3) {
                            AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e3);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                outputStreamWriter2 = outputStreamWriter;
                if (outputStreamWriter2 != null) {
                    try {
                        outputStreamWriter2.close();
                    } catch (IOException e4) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e4);
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            outputStreamWriter = null;
        } catch (Throwable th2) {
            th = th2;
            if (outputStreamWriter2 != null) {
            }
            throw th;
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
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not get cached requests", e);
        }
        if (listFiles == null) {
            return arrayList;
        }
        for (File file2 : listFiles) {
            AFLogger.INSTANCE.i(AFg1aSDK.CACHE, new StringBuilder("Found cached request").append(file2.getName()).toString());
            arrayList.add(values(file2));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
                    } catch (IOException e) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e);
                    }
                    return aFb1qSDK;
                } catch (Exception e2) {
                    e = e2;
                    AFLogger.afErrorLogForExcManagerOnly("error while loading request from cache", e);
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        } catch (IOException e3) {
                            AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e3);
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
                    } catch (IOException e4) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e4);
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
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
        AFLogger.INSTANCE.i(AFg1aSDK.CACHE, new StringBuilder("Deleting ").append(str).append(" from cache").toString());
        if (!file.exists()) {
            return true;
        }
        try {
            return file.delete();
        } catch (Exception e) {
            AFLogger.afErrorLog(new StringBuilder("CACHE: Could not delete ").append(str).append(" from cache").toString(), e);
            return false;
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
                AFLogger.INSTANCE.i(AFg1aSDK.CACHE, new StringBuilder("Found cached request").append(file2.getName()).toString());
                AFLogger.INSTANCE.i(AFg1aSDK.CACHE, new StringBuilder("Deleting ").append(file2.getName()).append(" from cache").toString());
                file2.delete();
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not cache request", e);
        }
    }
}
