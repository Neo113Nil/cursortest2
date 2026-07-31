package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class n32 implements wo {
    protected n32() {
    }

    @Override // com.yandex.mobile.ads.impl.wo
    public final long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.yandex.mobile.ads.impl.wo
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.yandex.mobile.ads.impl.wo
    public final we0 a(Looper looper, Handler.Callback callback) {
        return new p32(new Handler(looper, callback));
    }
}
