package com.apm.insight.l;

import android.app.ActivityManager;

/* loaded from: classes.dex */
public class n {
    static final a a = new b();

    private static class a {
        private a() {
        }

        public long a(ActivityManager.MemoryInfo memoryInfo) {
            return 0L;
        }
    }

    private static class b extends a {
        private b() {
            super();
        }

        @Override // com.apm.insight.l.n.a
        public long a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    public static long a(ActivityManager.MemoryInfo memoryInfo) {
        return a.a(memoryInfo);
    }
}
