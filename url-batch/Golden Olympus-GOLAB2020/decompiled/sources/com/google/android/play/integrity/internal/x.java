package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class x extends t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f13647a;

    x(ae aeVar) {
        this.f13647a = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        s sVar;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        s sVar2;
        obj = this.f13647a.f13621g;
        synchronized (obj) {
            try {
                atomicInteger = this.f13647a.f13627m;
                if (atomicInteger.get() > 0) {
                    atomicInteger2 = this.f13647a.f13627m;
                    if (atomicInteger2.decrementAndGet() > 0) {
                        sVar2 = this.f13647a.f13617c;
                        sVar2.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                }
                ae aeVar = this.f13647a;
                iInterface = aeVar.f13629o;
                if (iInterface != null) {
                    sVar = aeVar.f13617c;
                    sVar.d("Unbind from service.", new Object[0]);
                    ae aeVar2 = this.f13647a;
                    context = aeVar2.f13616b;
                    serviceConnection = aeVar2.f13628n;
                    context.unbindService(serviceConnection);
                    this.f13647a.f13622h = false;
                    this.f13647a.f13629o = null;
                    this.f13647a.f13628n = null;
                }
                this.f13647a.x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
