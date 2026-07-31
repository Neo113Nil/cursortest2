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
public final class AFb1jSDK implements AFb1uSDK {
    private final AFd1nSDK AFInAppEventParameterName;

    public AFb1jSDK(AFd1nSDK aFd1nSDK) {
        this.AFInAppEventParameterName = aFd1nSDK;
    }

    @Override // com.appsflyer.internal.AFb1uSDK
    public final void AFInAppEventType() {
        try {
            if (new File(this.AFInAppEventParameterName.AFKeystoreWrapper.getFilesDir(), "AFRequestCache").exists()) {
                return;
            }
            new File(this.AFInAppEventParameterName.AFKeystoreWrapper.getFilesDir(), "AFRequestCache").mkdir();
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not create cache directory", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFb1uSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String AFInAppEventType(AFb1mSDK aFb1mSDK) {
        OutputStreamWriter outputStreamWriter;
        OutputStreamWriter outputStreamWriter2 = null;
        try {
            File file = new File(this.AFInAppEventParameterName.AFKeystoreWrapper.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
                return null;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 40) {
                AFLogger.INSTANCE.i(AFg1jSDK.CACHE, "reached cache limit, not caching request");
                return null;
            }
            AFLogger.INSTANCE.i(AFg1jSDK.CACHE, new StringBuilder("caching request with URL: ").append(aFb1mSDK.AFInAppEventParameterName).toString());
            String l = Long.toString(System.currentTimeMillis());
            File file2 = new File(new File(this.AFInAppEventParameterName.AFKeystoreWrapper.getFilesDir(), "AFRequestCache"), l);
            file2.createNewFile();
            OutputStreamWriter outputStreamWriter3 = new OutputStreamWriter(new FileOutputStream(file2.getPath(), true), Charset.defaultCharset());
            try {
                outputStreamWriter3.write("version=");
                outputStreamWriter3.write(aFb1mSDK.AFKeystoreWrapper);
                outputStreamWriter3.write(10);
                outputStreamWriter3.write("url=");
                outputStreamWriter3.write(aFb1mSDK.AFInAppEventParameterName);
                outputStreamWriter3.write(10);
                outputStreamWriter3.write("data=");
                outputStreamWriter3.write(Base64.encodeToString(aFb1mSDK.AFInAppEventType(), 2));
                outputStreamWriter3.write(10);
                AFe1eSDK aFe1eSDK = aFb1mSDK.values;
                if (aFe1eSDK != null) {
                    outputStreamWriter3.write("type=");
                    outputStreamWriter3.write(aFe1eSDK.name());
                    outputStreamWriter3.write(10);
                }
                outputStreamWriter3.flush();
                AFLogger.INSTANCE.i(AFg1jSDK.CACHE, "done, cacheKey: ".concat(String.valueOf(l)));
                try {
                    outputStreamWriter3.close();
                    return l;
                } catch (IOException e) {
                    AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e);
                    return l;
                }
            } catch (Exception e2) {
                outputStreamWriter = outputStreamWriter3;
                e = e2;
                try {
                    AFLogger.afErrorLog("CACHE: Could not cache request", e);
                    if (outputStreamWriter != null) {
                        try {
                            outputStreamWriter.close();
                        } catch (IOException e3) {
                            AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e3);
                        }
                    }
                    return null;
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
            } catch (Throwable th2) {
                outputStreamWriter2 = outputStreamWriter3;
                th = th2;
                if (outputStreamWriter2 != null) {
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            outputStreamWriter = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.appsflyer.internal.AFb1uSDK
    public final List<AFb1mSDK> valueOf() {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(this.AFInAppEventParameterName.AFKeystoreWrapper.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    AFLogger.INSTANCE.i(AFg1jSDK.CACHE, new StringBuilder("Found cached request").append(file2.getName()).toString());
                    arrayList.add(AFKeystoreWrapper(file2));
                }
            }
            return arrayList;
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not get cached requests", e);
            return arrayList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static AFb1mSDK AFKeystoreWrapper(File file) {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2 = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                try {
                    char[] cArr = new char[(int) file.length()];
                    inputStreamReader.read(cArr);
                    AFb1mSDK aFb1mSDK = new AFb1mSDK(cArr);
                    aFb1mSDK.valueOf = file.getName();
                    try {
                        inputStreamReader.close();
                        return aFb1mSDK;
                    } catch (IOException e) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e);
                        return aFb1mSDK;
                    }
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

    @Override // com.appsflyer.internal.AFb1uSDK
    public final boolean AFInAppEventType(String str) {
        File file = new File(new File(this.AFInAppEventParameterName.AFKeystoreWrapper.getFilesDir(), "AFRequestCache"), str);
        AFLogger.INSTANCE.i(AFg1jSDK.CACHE, new StringBuilder("Deleting ").append(str).append(" from cache").toString());
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

    @Override // com.appsflyer.internal.AFb1uSDK
    public final void values() {
        try {
            File file = new File(this.AFInAppEventParameterName.AFKeystoreWrapper.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                AFLogger.INSTANCE.i(AFg1jSDK.CACHE, new StringBuilder("Found cached request").append(file2.getName()).toString());
                AFLogger.INSTANCE.i(AFg1jSDK.CACHE, new StringBuilder("Deleting ").append(file2.getName()).append(" from cache").toString());
                file2.delete();
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not cache request", e);
        }
    }
}
