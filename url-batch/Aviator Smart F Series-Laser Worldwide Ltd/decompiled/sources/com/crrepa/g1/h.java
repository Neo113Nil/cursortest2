package com.crrepa.g1;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public class h {
    private h() {
    }

    public static File a(File file, String str) {
        if (file != null && file.exists() && !TextUtils.isEmpty(str)) {
            if (file.isFile()) {
                return a(str, file);
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return null;
            }
            for (File file2 : listFiles) {
                if (!file2.isDirectory()) {
                    return a(str, file2);
                }
                a(file2, str);
            }
        }
        return null;
    }

    private static void b(File file) {
        try {
            file.delete();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Nullable
    private static File a(String str, File file) {
        if (j.a(str, file)) {
            return file;
        }
        return null;
    }

    public static String a(byte[] bArr, File file) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
            } catch (IOException e8) {
                e8.printStackTrace();
            }
            if (bArr == null) {
                return null;
            }
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (IOException e9) {
                e = e9;
            }
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e10) {
                e = e10;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
                return file.getAbsolutePath();
            } catch (Throwable th) {
                th = th;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                throw th;
            }
            return file.getAbsolutePath();
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }

    public static void a(File file) {
        File[] listFiles;
        if (file == null || !file.exists() || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            b(file2);
        }
    }

    public static void a(File file, byte[] bArr, int i8) {
        FileInputStream fileInputStream;
        if (file == null || !file.exists() || bArr.length - i8 < file.length()) {
            return;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (IOException e8) {
                    e8.printStackTrace();
                    return;
                }
            } catch (Exception e9) {
                e = e9;
            }
        } catch (Throwable th) {
            th = th;
            fileInputStream = fileInputStream2;
        }
        try {
            byte[] bArr2 = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr2);
                if (read <= 0) {
                    break;
                }
                System.arraycopy(bArr2, 0, bArr, i8, read);
                i8 += read;
            }
            fileInputStream.close();
        } catch (Exception e10) {
            e = e10;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static byte[] a(String str) {
        Throwable th;
        FileInputStream fileInputStream;
        byte[] bArr;
        IOException e8;
        FileInputStream fileInputStream2 = null;
        byte[] bArr2 = null;
        fileInputStream2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception e9) {
                e = e9;
                bArr = null;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = fileInputStream2;
        }
        try {
            bArr2 = new byte[fileInputStream.available()];
            fileInputStream.read(bArr2);
            try {
                fileInputStream.close();
                return bArr2;
            } catch (IOException e10) {
                e8 = e10;
                e8.printStackTrace();
                return bArr2;
            }
        } catch (Exception e11) {
            e = e11;
            byte[] bArr3 = bArr2;
            fileInputStream2 = fileInputStream;
            bArr = bArr3;
            e.printStackTrace();
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e12) {
                    bArr2 = bArr;
                    e8 = e12;
                    e8.printStackTrace();
                    return bArr2;
                }
            }
            return bArr;
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
            throw th;
        }
    }
}
