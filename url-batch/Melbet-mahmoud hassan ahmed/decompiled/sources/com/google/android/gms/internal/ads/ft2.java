package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class ft2 implements xv1 {
    protected ft2() {
    }

    @Override // com.google.android.gms.internal.ads.xv1
    public final h52 a(Looper looper, Handler.Callback callback) {
        return new iw2(new Handler(looper, callback));
    }
}
