package com.apm.insight.b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j {
    private static int a = 5;
    private static b b;
    private static a c;
    private static boolean d;
    private static Printer e;

    public interface a {
        void a(long j);
    }

    static class b implements Printer {
        List<Printer> a = new ArrayList();
        List<Printer> b = new ArrayList();
        List<Printer> c = new ArrayList();
        boolean d = false;
        boolean e = false;

        b() {
        }

        @Override // android.util.Printer
        public void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long currentTimeMillis = j.c != null ? System.currentTimeMillis() : 0L;
            if (str.charAt(0) == '>' && this.e) {
                for (Printer printer : this.c) {
                    if (!this.a.contains(printer)) {
                        this.a.add(printer);
                    }
                }
                this.c.clear();
                this.e = false;
            }
            if (this.a.size() > j.a) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (Printer printer2 : this.a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            if (str.charAt(0) == '<' && this.d) {
                for (Printer printer3 : this.b) {
                    this.a.remove(printer3);
                    this.c.remove(printer3);
                }
                this.b.clear();
                this.d = false;
            }
            if (j.c == null || currentTimeMillis <= 0) {
                return;
            }
            j.c.a(System.currentTimeMillis() - currentTimeMillis);
        }
    }

    public static void a() {
        if (d) {
            return;
        }
        d = true;
        b = new b();
        Printer d2 = d();
        e = d2;
        if (d2 != null) {
            b.a.add(e);
        }
        if (com.apm.insight.i.r()) {
            Looper.getMainLooper().setMessageLogging(b);
        }
    }

    public static void a(Printer printer) {
        if (printer == null || b.c.contains(printer)) {
            return;
        }
        b.c.add(printer);
        b.e = true;
    }

    private static Printer d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }
}
