package com.apm.insight.l;

import android.annotation.TargetApi;
import android.app.ActivityManager;

/* compiled from: JellyBeanV16Compat.java */
/* loaded from: classes4.dex */
public final class i {
    private static a a = new b(0);

    /* compiled from: JellyBeanV16Compat.java */
    static class a {
        private a() {
        }

        public long a(ActivityManager.MemoryInfo memoryInfo) {
            return 0L;
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    /* compiled from: JellyBeanV16Compat.java */
    @TargetApi(16)
    static class b extends a {
        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b) {
            this();
        }

        @Override // com.apm.insight.l.i.a
        public final long a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    public static long a(ActivityManager.MemoryInfo memoryInfo) {
        return a.a(memoryInfo);
    }
}
