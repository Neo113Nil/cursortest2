package com.baidu.bbalbscesium.o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f4184a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final String f4185b = "Util";

    private c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(File file) {
        FileReader fileReader;
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader(file);
            try {
                try {
                    char[] cArr = new char[8192];
                    CharArrayWriter charArrayWriter = new CharArrayWriter();
                    while (true) {
                        int read = fileReader.read(cArr);
                        if (read <= 0) {
                            break;
                        }
                        charArrayWriter.write(cArr, 0, read);
                    }
                    String charArrayWriter2 = charArrayWriter.toString();
                    try {
                        fileReader.close();
                    } catch (Exception e8) {
                        a(e8);
                    }
                    return charArrayWriter2;
                } catch (Exception e9) {
                    e = e9;
                    a(e);
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Exception e10) {
                            a(e10);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileReader2 = fileReader;
                if (fileReader2 != null) {
                    try {
                        fileReader2.close();
                    } catch (Exception e11) {
                        a(e11);
                    }
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            fileReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (fileReader2 != null) {
            }
            throw th;
        }
    }

    public static String a(byte[] bArr, String str, boolean z7) {
        return com.baidu.bbalbscesium.m.c.a(bArr, str, z7);
    }

    public static String a(byte[] bArr, boolean z7) {
        return com.baidu.bbalbscesium.m.c.a(bArr, z7);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e8) {
                a(e8);
            }
        }
    }

    public static void a(Throwable th) {
    }

    public static boolean a(Context context, String str) {
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getApplicationContext().getSystemService("activity")).getRunningServices(100)) {
            if (runningServiceInfo.pid == Process.myPid() && !TextUtils.equals(runningServiceInfo.service.getClassName(), str)) {
                return true;
            }
        }
        return false;
    }
}
