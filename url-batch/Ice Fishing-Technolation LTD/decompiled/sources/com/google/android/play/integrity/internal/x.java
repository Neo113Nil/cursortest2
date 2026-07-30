package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
/* loaded from: classes2.dex */
final class x extends t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f77a;

    x(ae aeVar) {
        this.f77a = aeVar;
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
        obj = this.f77a.g;
        synchronized (obj) {
            atomicInteger = this.f77a.m;
            if (atomicInteger.get() > 0) {
                atomicInteger2 = this.f77a.m;
                if (atomicInteger2.decrementAndGet() > 0) {
                    sVar2 = this.f77a.c;
                    sVar2.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
            }
            ae aeVar = this.f77a;
            iInterface = aeVar.o;
            if (iInterface != null) {
                sVar = aeVar.c;
                sVar.d("Unbind from service.", new Object[0]);
                ae aeVar2 = this.f77a;
                context = aeVar2.b;
                serviceConnection = aeVar2.n;
                context.unbindService(serviceConnection);
                this.f77a.h = false;
                this.f77a.o = null;
                this.f77a.n = null;
            }
            this.f77a.x();
        }
    }
}
