package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes.dex */
final class b03 implements Runnable {
    b03() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = e03.f4417i;
        if (handler != null) {
            handler2 = e03.f4417i;
            runnable = e03.f4418j;
            handler2.post(runnable);
            handler3 = e03.f4417i;
            runnable2 = e03.f4419k;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
