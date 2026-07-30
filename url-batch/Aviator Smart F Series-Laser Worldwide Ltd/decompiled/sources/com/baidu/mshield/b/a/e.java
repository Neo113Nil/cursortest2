package com.baidu.mshield.b.a;

import android.os.Build;
import android.os.Process;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes2.dex */
public class e {
    public static String a() {
        try {
            String[] strArr = Build.SUPPORTED_ABIS;
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
                sb.append(',');
            }
            return sb.toString().substring(0, r0.length() - 1);
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return "";
        }
    }

    public static int b() {
        try {
            return Runtime.getRuntime().availableProcessors();
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        com.baidu.mshield.b.c.a.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c() {
        File file;
        Throwable th;
        BufferedReader bufferedReader;
        String readLine;
        boolean is64Bit;
        if (Build.VERSION.SDK_INT > 22) {
            is64Bit = Process.is64Bit();
            return is64Bit;
        }
        try {
            file = new File("/proc/" + Process.myPid() + "/maps");
        } catch (Throwable th2) {
            com.baidu.mshield.b.c.a.a(th2);
        }
        if (file.exists()) {
            try {
            } catch (IOException e8) {
                com.baidu.mshield.b.c.a.a(e8);
            }
            if (!file.isDirectory()) {
                try {
                    bufferedReader = new BufferedReader(new FileReader(file));
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = null;
                }
                do {
                    try {
                        readLine = bufferedReader.readLine();
                    } catch (Throwable th4) {
                        th = th4;
                        try {
                            com.baidu.mshield.b.c.a.a(th);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return false;
                        } finally {
                        }
                    }
                    if (readLine == null) {
                        bufferedReader.close();
                        return false;
                    }
                } while (!readLine.contains("/system/lib64/libc.so"));
                bufferedReader.close();
                return true;
            }
        }
        return false;
    }
}
