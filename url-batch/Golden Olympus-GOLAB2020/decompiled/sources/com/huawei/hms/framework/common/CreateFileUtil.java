package com.huawei.hms.framework.common;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.libcore.io.ExternalStorageFile;
import com.huawei.libcore.io.ExternalStorageFileInputStream;
import com.huawei.libcore.io.ExternalStorageFileOutputStream;
import com.huawei.libcore.io.ExternalStorageRandomAccessFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class CreateFileUtil {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f14130a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String byteArrayToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i4 = 0;
        for (byte b4 : bArr) {
            int i5 = i4 + 1;
            char[] cArr2 = f14130a;
            cArr[i4] = cArr2[(b4 >>> 4) & 15];
            i4 += 2;
            cArr[i5] = cArr2[b4 & 15];
        }
        return new String(cArr);
    }

    public static void deleteSecure(File file) {
        if (file == null || !file.exists() || file.delete()) {
            return;
        }
        Logger.w("CreateFileUtil", "deleteSecure exception");
    }

    public static String getCacheDirPath(Context context) {
        return context == null ? "" : ContextCompat.getProtectedStorageContext(context).getCacheDir().getPath();
    }

    public static String getCanonicalPath(String str) {
        try {
            return newFile(str).getCanonicalPath();
        } catch (IOException e4) {
            Logger.w("CreateFileUtil", "the canonicalPath has IOException", e4);
            return str;
        } catch (SecurityException e5) {
            Logger.w("CreateFileUtil", "the canonicalPath has securityException", e5);
            return str;
        } catch (Exception e6) {
            Logger.w("CreateFileUtil", "the canonicalPath has other Exception", e6);
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        if (r10 == null) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getFileHashData(String str, String str2) {
        FileInputStream fileInputStream;
        ?? r22 = 0;
        r2 = null;
        r2 = null;
        r2 = null;
        r2 = null;
        r2 = null;
        r2 = null;
        r2 = null;
        r2 = null;
        r2 = null;
        r2 = null;
        String str3 = null;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                fileInputStream = newSafeFileInputStream(str);
                try {
                    byte[] bArr = new byte[1024];
                    long j4 = 0;
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, read);
                        j4 += read;
                    }
                    if (j4 > 0) {
                        str3 = byteArrayToHex(messageDigest.digest());
                    }
                } catch (FileNotFoundException e4) {
                    e = e4;
                    Logger.e("CreateFileUtil", "getFileHashData FileNotFoundException", e);
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return str3;
                } catch (IOException e5) {
                    e = e5;
                    Logger.e("CreateFileUtil", "getFileHashData IOException", e);
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return str3;
                } catch (IllegalArgumentException e6) {
                    e = e6;
                    Logger.e("CreateFileUtil", "getFileHashData IllegalArgumentException", e);
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return str3;
                } catch (IndexOutOfBoundsException e7) {
                    e = e7;
                    Logger.e("CreateFileUtil", "getFileHashData IndexOutOfBoundsException", e);
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return str3;
                } catch (NoSuchAlgorithmException e8) {
                    e = e8;
                    Logger.e("CreateFileUtil", "getFileHashData NoSuchAlgorithmException", e);
                }
            } catch (Throwable th) {
                th = th;
                r22 = str;
                if (r22 != 0) {
                    try {
                        r22.close();
                    } catch (IOException unused) {
                        Logger.e("CreateFileUtil", "Close FileInputStream failed!");
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e9) {
            e = e9;
            fileInputStream = null;
        } catch (IOException e10) {
            e = e10;
            fileInputStream = null;
        } catch (IllegalArgumentException e11) {
            e = e11;
            fileInputStream = null;
        } catch (IndexOutOfBoundsException e12) {
            e = e12;
            fileInputStream = null;
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (r22 != 0) {
            }
            throw th;
        }
        try {
            fileInputStream.close();
        } catch (IOException unused2) {
            Logger.e("CreateFileUtil", "Close FileInputStream failed!");
        }
        return str3;
    }

    @Deprecated
    public static boolean isPVersion() {
        return EmuiUtil.isUpPVersion();
    }

    public static File newFile(String str) {
        if (str == null) {
            return null;
        }
        return (EmuiUtil.isUpPVersion() && ReflectionUtils.checkCompatible("com.huawei.libcore.io.ExternalStorageFile")) ? new ExternalStorageFile(str) : new File(str);
    }

    public static FileInputStream newFileInputStream(String str) {
        if (str != null) {
            return (EmuiUtil.isUpPVersion() && ReflectionUtils.checkCompatible("com.huawei.libcore.io.ExternalStorageFileInputStream")) ? new ExternalStorageFileInputStream(str) : new FileInputStream(str);
        }
        Logger.w("CreateFileUtil", "newFileInputStream  file is null");
        throw new FileNotFoundException("file is null");
    }

    public static FileOutputStream newFileOutputStream(File file) {
        if (file != null) {
            return (EmuiUtil.isUpPVersion() && ReflectionUtils.checkCompatible("com.huawei.libcore.io.ExternalStorageFileOutputStream")) ? new ExternalStorageFileOutputStream(file) : new FileOutputStream(file);
        }
        Logger.e("CreateFileUtil", "newFileOutputStream  file is null");
        throw new FileNotFoundException("file is null");
    }

    public static RandomAccessFile newRandomAccessFile(String str, String str2) {
        if (str != null) {
            return (EmuiUtil.isUpPVersion() && ReflectionUtils.checkCompatible("com.huawei.libcore.io.ExternalStorageRandomAccessFile")) ? new ExternalStorageRandomAccessFile(str, str2) : new RandomAccessFile(str, str2);
        }
        Logger.w("CreateFileUtil", "newFileOutputStream  file is null");
        throw new FileNotFoundException("file is null");
    }

    public static File newSafeFile(String str) {
        if (str == null) {
            return null;
        }
        try {
            File newFile = newFile(str);
            return !newFile.exists() ? new File(str) : newFile;
        } catch (RuntimeException unused) {
            Logger.w("CreateFileUtil", "newFile is runtimeException");
            return new File(str);
        } catch (Throwable unused2) {
            Logger.w("CreateFileUtil", "newFile is Throwable");
            return new File(str);
        }
    }

    public static FileInputStream newSafeFileInputStream(String str) {
        try {
            return newFileInputStream(str);
        } catch (FileNotFoundException unused) {
            Logger.w("CreateFileUtil", "newFileInputStream is fileNotFoundException");
            return new FileInputStream(str);
        } catch (RuntimeException unused2) {
            Logger.w("CreateFileUtil", "newFileInputStream is runtimeException");
            return new FileInputStream(str);
        } catch (Throwable unused3) {
            Logger.w("CreateFileUtil", "newFileInputStream is Throwable");
            return new FileInputStream(str);
        }
    }

    public static FileOutputStream newSafeFileOutputStream(File file) {
        try {
            return newFileOutputStream(file);
        } catch (FileNotFoundException unused) {
            Logger.w("CreateFileUtil", "newFileOutputStream is fileNotFoundException");
            return new FileOutputStream(file);
        } catch (RuntimeException unused2) {
            Logger.w("CreateFileUtil", "newFileOutputStream is runtimeException");
            return new FileOutputStream(file);
        } catch (Throwable unused3) {
            Logger.w("CreateFileUtil", "newFileOutputStream is Throwable");
            return new FileOutputStream(file);
        }
    }

    public static RandomAccessFile newSafeRandomAccessFile(String str, String str2) {
        if (str == null) {
            Logger.w("CreateFileUtil", "newRandomAccessFile  file is null");
            throw new FileNotFoundException("file is null");
        }
        try {
            return newRandomAccessFile(str, str2);
        } catch (FileNotFoundException unused) {
            Logger.w("CreateFileUtil", "newRandomAccessFile is fileNotFoundException");
            return new RandomAccessFile(str, str2);
        } catch (RuntimeException unused2) {
            Logger.w("CreateFileUtil", "newRandomAccessFile is runtimeException");
            return new RandomAccessFile(str, str2);
        } catch (Throwable unused3) {
            Logger.w("CreateFileUtil", "newRandomAccessFile is Throwable");
            return new RandomAccessFile(str, str2);
        }
    }

    public static void deleteSecure(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        deleteSecure(newFile(str));
    }
}
