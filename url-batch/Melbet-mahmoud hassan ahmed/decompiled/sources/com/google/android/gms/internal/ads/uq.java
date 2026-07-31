package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.Future;
import r3.c;

/* loaded from: classes.dex */
final class uq implements c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ mq f12909a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bp0 f12910b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ wq f12911c;

    uq(wq wqVar, mq mqVar, bp0 bp0Var) {
        this.f12911c = wqVar;
        this.f12909a = mqVar;
        this.f12910b = bp0Var;
    }

    @Override // r3.c.a
    public final void O0(Bundle bundle) {
        Object obj;
        boolean z6;
        final lq lqVar;
        obj = this.f12911c.f13916d;
        synchronized (obj) {
            z6 = this.f12911c.f13914b;
            if (z6) {
                return;
            }
            this.f12911c.f13914b = true;
            lqVar = this.f12911c.f13913a;
            if (lqVar == null) {
                return;
            }
            dc3 dc3Var = wo0.f13894a;
            final mq mqVar = this.f12909a;
            final bp0 bp0Var = this.f12910b;
            final cc3<?> H = dc3Var.H(new Runnable() { // from class: com.google.android.gms.internal.ads.rq
                @Override // java.lang.Runnable
                public final void run() {
                    uq uqVar = uq.this;
                    lq lqVar2 = lqVar;
                    mq mqVar2 = mqVar;
                    bp0 bp0Var2 = bp0Var;
                    try {
                        oq j02 = lqVar2.j0();
                        jq C5 = lqVar2.i0() ? j02.C5(mqVar2) : j02.o4(mqVar2);
                        if (!C5.j()) {
                            bp0Var2.f(new RuntimeException("No entry contents."));
                            wq.e(uqVar.f12911c);
                            return;
                        }
                        tq tqVar = new tq(uqVar, C5.h(), 1);
                        int read = tqVar.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        tqVar.unread(read);
                        bp0Var2.e(yq.b(tqVar, C5.i(), C5.l(), C5.c(), C5.k()));
                    } catch (RemoteException | IOException e7) {
                        io0.e("Unable to obtain a cache service instance.", e7);
                        bp0Var2.f(e7);
                        wq.e(uqVar.f12911c);
                    }
                }
            });
            final bp0 bp0Var2 = this.f12910b;
            bp0Var2.b(new Runnable() { // from class: com.google.android.gms.internal.ads.sq
                @Override // java.lang.Runnable
                public final void run() {
                    bp0 bp0Var3 = bp0.this;
                    Future future = H;
                    if (bp0Var3.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, wo0.f13899f);
        }
    }

    @Override // r3.c.a
    public final void q0(int i7) {
    }
}
