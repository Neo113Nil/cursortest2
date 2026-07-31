package com.bytedance.adsdk.ugeno.nps;

import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public class iv implements Runnable {
    private WeakReference<Runnable> zmn;

    public iv(Runnable runnable) {
        this.zmn = new WeakReference<>(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.zmn.get();
        if (runnable != null) {
            runnable.run();
        }
    }
}
