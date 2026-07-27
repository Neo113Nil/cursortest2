package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class AFb1kSDK {
    private static String values;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFKeystoreWrapper(File file) {
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        byte[] bArr2 = null;
        randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
            } catch (IOException e4) {
                e = e4;
                bArr = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bArr2 = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr2);
            randomAccessFile.close();
            try {
                randomAccessFile.close();
            } catch (IOException e5) {
                AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e5);
            }
        } catch (IOException e6) {
            e = e6;
            bArr = bArr2;
            randomAccessFile2 = randomAccessFile;
            AFLogger.afErrorLog("Exception while reading InstallationFile: ", e);
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException e7) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e7);
                }
            }
            bArr2 = bArr;
            if (bArr2 == null) {
            }
            return new String(bArr2, Charset.defaultCharset());
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException e8) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e8);
                }
            }
            throw th;
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return new String(bArr2, Charset.defaultCharset());
    }

    public static synchronized String valueOf(AFd1lSDK aFd1lSDK, AFd1qSDK aFd1qSDK) {
        synchronized (AFb1kSDK.class) {
            if (aFd1lSDK.AFKeystoreWrapper == null) {
                return values;
            }
            if (values == null) {
                String AFKeystoreWrapper = aFd1qSDK.AFKeystoreWrapper("AF_INSTALLATION", (String) null);
                if (AFKeystoreWrapper != null) {
                    values = AFKeystoreWrapper;
                } else {
                    try {
                        File file = new File(aFd1lSDK.AFKeystoreWrapper.getFilesDir(), "AF_INSTALLATION");
                        if (file.exists()) {
                            values = AFKeystoreWrapper(file);
                            file.delete();
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            StringBuilder sb = new StringBuilder();
                            sb.append(currentTimeMillis);
                            sb.append("-");
                            sb.append(Math.abs(new SecureRandom().nextLong()));
                            values = sb.toString();
                        }
                        aFd1qSDK.AFInAppEventParameterName("AF_INSTALLATION", values);
                    } catch (Exception e4) {
                        AFLogger.afErrorLog("Error getting AF unique ID", e4);
                    }
                }
                if (values != null) {
                    AppsFlyerProperties.getInstance().set("uid", values);
                }
            }
            return values;
        }
    }
}
