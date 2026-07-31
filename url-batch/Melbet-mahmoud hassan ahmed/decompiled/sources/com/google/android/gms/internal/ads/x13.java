package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class x13 {
    public static boolean a(int i7) {
        int i8 = i7 - 1;
        return i8 == 2 || i8 == 4 || i8 == 5 || i8 == 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int b(Context context, u03 u03Var) {
        String str;
        int i7;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] listFiles = file.listFiles(new l93(Pattern.compile(".*\\.so$", 2)));
            if (listFiles != null && listFiles.length != 0) {
                try {
                    fileInputStream = new FileInputStream(listFiles[0]);
                    try {
                        bArr = new byte[20];
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                } catch (IOException e7) {
                    d(null, e7.toString(), context, u03Var);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] != 2) {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s7 = ByteBuffer.wrap(bArr2).getShort();
                        if (s7 == 3) {
                            fileInputStream.close();
                            i7 = 5;
                        } else if (s7 == 40) {
                            fileInputStream.close();
                            i7 = 3;
                        } else if (s7 == 62) {
                            fileInputStream.close();
                            i7 = 7;
                        } else if (s7 != 183) {
                            d(bArr, null, context, u03Var);
                        } else {
                            fileInputStream.close();
                            i7 = 6;
                        }
                        if (i7 == 1000) {
                            String c7 = c(context, u03Var);
                            if (TextUtils.isEmpty(c7)) {
                                c7 = "Empty dev arch";
                            } else if (c7.equalsIgnoreCase("i686") || c7.equalsIgnoreCase("x86")) {
                                i7 = 5;
                            } else if (c7.equalsIgnoreCase("x86_64")) {
                                i7 = 7;
                            } else if (c7.equalsIgnoreCase("arm64-v8a")) {
                                i7 = 6;
                            } else if (c7.equalsIgnoreCase("armeabi-v7a") || c7.equalsIgnoreCase("armv71")) {
                                i7 = 3;
                            }
                            d(null, c7, context, u03Var);
                            i7 = 1;
                        }
                        u03Var.b(5018, i7 != 1 ? i7 != 3 ? i7 != 5 ? i7 != 6 ? i7 != 7 ? "null" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
                        return i7;
                    }
                    d(bArr, null, context, u03Var);
                }
                fileInputStream.close();
                i7 = 1;
                if (i7 == 1000) {
                }
                u03Var.b(5018, i7 != 1 ? i7 != 3 ? i7 != 5 ? i7 != 6 ? i7 != 7 ? "null" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
                return i7;
            }
            str = "No .so";
        } else {
            str = "No lib/";
        }
        u03Var.b(5017, str);
        i7 = 1000;
        if (i7 == 1000) {
        }
        u03Var.b(5018, i7 != 1 ? i7 != 3 ? i7 != 5 ? i7 != 6 ? i7 != 7 ? "null" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
        return i7;
    }

    private static final String c(Context context, u03 u03Var) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String b7 = a53.OS_ARCH.b();
        if (!TextUtils.isEmpty(b7) && hashSet.contains(b7)) {
            return b7;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException | NoSuchFieldException e7) {
            u03Var.c(2024, 0L, e7);
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }

    private static final void d(byte[] bArr, String str, Context context, u03 u03Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(a53.OS_ARCH.b());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        u03Var.b(4007, sb.toString());
    }
}
