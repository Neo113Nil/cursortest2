package com.yandex.mobile.ads.impl;

import android.os.ConditionVariable;

/* loaded from: classes3.dex */
final class ay1 extends Thread {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ConditionVariable f23515b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ by1 f23516c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ay1(by1 by1Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f23516c = by1Var;
        this.f23515b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        InterfaceC2004im interfaceC2004im;
        synchronized (this.f23516c) {
            this.f23515b.open();
            this.f23516c.b();
            interfaceC2004im = this.f23516c.f23968b;
            interfaceC2004im.getClass();
        }
    }
}
