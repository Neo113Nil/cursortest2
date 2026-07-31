package com.chartboost.sdk.impl;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class wb {
    public static final wb a = new wb();
    public static volatile boolean b = true;
    public static final AtomicLong c = new AtomicLong(0);
    public static volatile long d = 5000;

    public final ch a() {
        return null;
    }

    public final String a(int i) {
        return null;
    }

    public final boolean b() {
        return b;
    }

    public final void c() {
        c.set(0L);
    }

    public static /* synthetic */ String a(wb wbVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        return wbVar.a(i);
    }

    public final void a(boolean z) {
        b = z;
    }
}
