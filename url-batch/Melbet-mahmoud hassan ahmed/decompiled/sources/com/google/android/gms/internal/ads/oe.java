package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
final class oe extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ pe f9620a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    oe(pe peVar, Looper looper) {
        super(looper);
        this.f9620a = peVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f9620a.d(message);
    }
}
