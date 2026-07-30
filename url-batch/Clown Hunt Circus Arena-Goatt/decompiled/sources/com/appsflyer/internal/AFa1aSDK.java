package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class AFa1aSDK {
    private static String AFInAppEventType;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFInAppEventParameterName(File file) {
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        byte[] bArr2 = null;
        randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
            } catch (IOException e) {
                e = e;
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
            } catch (IOException e2) {
                AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e2);
            }
        } catch (IOException e3) {
            e = e3;
            bArr = bArr2;
            randomAccessFile2 = randomAccessFile;
            AFLogger.afErrorLog("Exception while reading InstallationFile: ", e);
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException e4) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e4);
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
                } catch (IOException e5) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e5);
                }
            }
            throw th;
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return new String(bArr2, Charset.defaultCharset());
    }

    public static synchronized String AFInAppEventParameterName(AFb1bSDK aFb1bSDK, AFb1fSDK aFb1fSDK) {
        synchronized (AFa1aSDK.class) {
            if (aFb1bSDK.AFInAppEventParameterName == null) {
                return AFInAppEventType;
            }
            if (AFInAppEventType == null) {
                String valueOf = aFb1fSDK.valueOf("AF_INSTALLATION", (String) null);
                if (valueOf != null) {
                    AFInAppEventType = valueOf;
                } else {
                    try {
                        File file = new File(aFb1bSDK.AFInAppEventParameterName.getFilesDir(), "AF_INSTALLATION");
                        if (file.exists()) {
                            AFInAppEventType = AFInAppEventParameterName(file);
                            file.delete();
                        } else {
                            AFInAppEventType = new StringBuilder().append(System.currentTimeMillis()).append("-").append(Math.abs(new SecureRandom().nextLong())).toString();
                        }
                        aFb1fSDK.values("AF_INSTALLATION", AFInAppEventType);
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Error getting AF unique ID", e);
                    }
                }
                if (AFInAppEventType != null) {
                    AppsFlyerProperties.getInstance().set("uid", AFInAppEventType);
                }
            }
            return AFInAppEventType;
        }
    }
}
