package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.UUID;

/* loaded from: classes.dex */
final class ac {

    /* renamed from: a, reason: collision with root package name */
    private static String f3423a;

    public static synchronized String a(WeakReference<Context> weakReference) {
        String obj;
        synchronized (ac.class) {
            if (weakReference.get() == null) {
                return f3423a;
            }
            if (f3423a == null) {
                String str = null;
                if (weakReference.get() != null) {
                    str = weakReference.get().getSharedPreferences("appsflyer-data", 0).getString("AF_INSTALLATION", null);
                }
                if (str != null) {
                    f3423a = str;
                } else {
                    try {
                        File file = new File(weakReference.get().getFilesDir(), "AF_INSTALLATION");
                        if (file.exists()) {
                            f3423a = a(file);
                            file.delete();
                        } else {
                            if (Build.VERSION.SDK_INT >= 9) {
                                long currentTimeMillis = System.currentTimeMillis();
                                StringBuilder sb = new StringBuilder();
                                sb.append(currentTimeMillis);
                                sb.append("-");
                                sb.append(Math.abs(new SecureRandom().nextLong()));
                                obj = sb.toString();
                            } else {
                                obj = UUID.randomUUID().toString();
                            }
                            f3423a = obj;
                        }
                        String str2 = f3423a;
                        SharedPreferences.Editor edit = weakReference.get().getSharedPreferences("appsflyer-data", 0).edit();
                        edit.putString("AF_INSTALLATION", str2);
                        if (Build.VERSION.SDK_INT >= 9) {
                            edit.apply();
                        } else {
                            edit.commit();
                        }
                    } catch (Exception e) {
                        d.a("Error getting AF unique ID", e);
                    }
                }
                if (f3423a != null) {
                    j.a().a("uid", f3423a);
                }
            }
            return f3423a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String a(File file) {
        byte[] bArr;
        byte[] bArr2;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        RandomAccessFile randomAccessFile3 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    try {
                        bArr2 = new byte[(int) randomAccessFile.length()];
                    } catch (IOException e) {
                        e = e;
                        randomAccessFile2 = randomAccessFile;
                        bArr = null;
                    }
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile3 = randomAccessFile;
                    if (randomAccessFile3 != null) {
                        try {
                            randomAccessFile3.close();
                        } catch (IOException e2) {
                            d.a("Exception while trying to close the InstallationFile", e2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                bArr = null;
            }
            try {
                randomAccessFile.readFully(bArr2);
                randomAccessFile.close();
                try {
                    randomAccessFile.close();
                } catch (IOException e4) {
                    d.a("Exception while trying to close the InstallationFile", e4);
                }
            } catch (IOException e5) {
                randomAccessFile2 = randomAccessFile;
                bArr = bArr2;
                e = e5;
                randomAccessFile3 = randomAccessFile2;
                d.a("Exception while reading InstallationFile: ", e);
                if (randomAccessFile3 != null) {
                    try {
                        randomAccessFile3.close();
                    } catch (IOException e6) {
                        d.a("Exception while trying to close the InstallationFile", e6);
                    }
                }
                bArr2 = bArr;
                if (bArr2 == null) {
                }
                return new String(bArr2);
            }
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            return new String(bArr2);
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
