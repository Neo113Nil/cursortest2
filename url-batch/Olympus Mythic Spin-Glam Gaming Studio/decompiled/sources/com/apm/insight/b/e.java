package com.apm.insight.b;

import androidx.annotation.CallSuper;

/* compiled from: AbsLooperDispatchListener.java */
/* loaded from: classes15.dex */
public abstract class e {
    public static long a;
    public static long b;
    public volatile boolean c = false;

    public boolean a() {
        return false;
    }

    @CallSuper
    public void a(String str) {
        this.c = true;
    }

    @CallSuper
    public void b(String str) {
        this.c = false;
    }
}
