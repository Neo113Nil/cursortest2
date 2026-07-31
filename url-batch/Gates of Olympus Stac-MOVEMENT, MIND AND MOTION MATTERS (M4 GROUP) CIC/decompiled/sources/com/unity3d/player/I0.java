package com.unity3d.player;

/* loaded from: classes.dex */
final class I0 implements Runnable {
    I0() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC0007c.a();
        } catch (Exception e) {
            AbstractC0053z.Log(6, "Exception when hiding Activity Indicator " + e);
        }
    }
}
