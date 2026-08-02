package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class y4 implements i7 {
    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new k8(new Handler(Looper.getMainLooper()));
    }
}
