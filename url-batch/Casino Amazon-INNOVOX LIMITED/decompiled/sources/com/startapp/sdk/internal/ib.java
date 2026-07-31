package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Message;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ib implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kb f275a;

    public ib(kb kbVar) {
        this.f275a = kbVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        kb kbVar = this.f275a;
        synchronized (kbVar) {
            kbVar.d = true;
            kbVar.notifyAll();
        }
        return true;
    }
}
