package com.startapp.sdk.internal;

import android.os.Handler;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class l5 implements c7 {
    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        w7 w7Var = new w7("startapp-".concat("db"));
        w7Var.start();
        return new v7(new Handler(w7Var.getLooper()));
    }
}
