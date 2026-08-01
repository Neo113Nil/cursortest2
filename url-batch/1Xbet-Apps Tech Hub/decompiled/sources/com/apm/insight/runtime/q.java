package com.apm.insight.runtime;

import android.system.Os;
import android.system.OsConstants;

/* loaded from: classes.dex */
public class q {
    private static long a = -1;

    public static class a {
        private static long a = -1;

        public static long a() {
            if (q.a == -1) {
                long unused = q.a = 1000 / b();
            }
            return q.a;
        }

        public static long a(long j) {
            long j2 = a;
            if (j2 > 0) {
                return j2;
            }
            long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
            if (sysconf > 0) {
                j = sysconf;
            }
            a = j;
            return j;
        }

        private static long a(String str, long j) {
            try {
                int i = Class.forName("libcore.io.OsConstants").getField(str).getInt(null);
                Class<?> cls = Class.forName("libcore.io.Libcore");
                Class<?> cls2 = Class.forName("libcore.io.Os");
                return ((Long) cls2.getMethod("sysconf", Integer.TYPE).invoke(cls.getField("os").get(null), Integer.valueOf(i))).longValue();
            } catch (Throwable th) {
                th.printStackTrace();
                return j;
            }
        }

        public static long b() {
            return a(100L);
        }
    }
}
