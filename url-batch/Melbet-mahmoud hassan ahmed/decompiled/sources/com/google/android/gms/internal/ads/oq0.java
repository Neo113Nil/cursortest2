package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes.dex */
final class oq0 implements Runnable {
    oq0(qq0 qq0Var) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
