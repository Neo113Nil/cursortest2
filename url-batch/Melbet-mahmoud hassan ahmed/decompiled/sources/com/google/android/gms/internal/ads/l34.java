package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
final class l34 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n34 f7813a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l34(n34 n34Var, Looper looper) {
        super(looper);
        this.f7813a = n34Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        n34.a(this.f7813a, message);
    }
}
