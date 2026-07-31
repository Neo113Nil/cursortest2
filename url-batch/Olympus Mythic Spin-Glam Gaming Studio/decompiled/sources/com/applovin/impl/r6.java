package com.applovin.impl;

/* loaded from: classes11.dex */
public class r6 extends i5 {
    private final Runnable g;

    public r6(com.applovin.impl.sdk.k kVar, String str, Runnable runnable) {
        this(kVar, false, str, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.g.run();
    }

    public r6(com.applovin.impl.sdk.k kVar, boolean z, String str, Runnable runnable) {
        super("TaskRunnable:" + str, kVar, z);
        this.g = runnable;
    }
}
