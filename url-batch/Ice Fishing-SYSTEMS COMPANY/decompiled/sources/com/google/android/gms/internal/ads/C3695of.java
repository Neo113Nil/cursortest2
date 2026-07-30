package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import q2.C4879b;
import q2.C4903n;
import q2.C4907p;
import q2.InterfaceC4921w0;

/* renamed from: com.google.android.gms.internal.ads.of, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3695of extends F2.c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3211ff f33156a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f33157b;

    /* renamed from: c, reason: collision with root package name */
    public final BinderC3964tf f33158c;

    /* renamed from: d, reason: collision with root package name */
    public final long f33159d;

    public C3695of(Context context, String str) {
        C4903n c4903n = C4907p.f40108g.f40110b;
        BinderC3317hd binderC3317hd = new BinderC3317hd();
        c4903n.getClass();
        InterfaceC3211ff interfaceC3211ff = (InterfaceC3211ff) new C4879b(c4903n, context, str, binderC3317hd).d(context, false);
        this.f33159d = System.currentTimeMillis();
        new AtomicLong();
        this.f33157b = context.getApplicationContext();
        new AtomicReference(str);
        this.f33156a = interfaceC3211ff;
        this.f33158c = new BinderC3964tf();
    }

    @Override // F2.c
    public final k2.s a() {
        InterfaceC4921w0 interfaceC4921w0 = null;
        try {
            InterfaceC3211ff interfaceC3211ff = this.f33156a;
            if (interfaceC3211ff != null) {
                interfaceC4921w0 = interfaceC3211ff.m();
            }
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
        return new k2.s(interfaceC4921w0);
    }

    @Override // F2.c
    public final void d(Activity activity, k2.q qVar) {
        BinderC3964tf binderC3964tf = this.f33158c;
        binderC3964tf.f34425u = qVar;
        if (activity == null) {
            u2.i.f("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            InterfaceC3211ff interfaceC3211ff = this.f33156a;
            if (interfaceC3211ff != null) {
                interfaceC3211ff.h1(binderC3964tf);
                interfaceC3211ff.i3(new V2.b(activity));
            }
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }

    public final void e(q2.F0 f02, F2.d dVar) {
        try {
            InterfaceC3211ff interfaceC3211ff = this.f33156a;
            if (interfaceC3211ff != null) {
                f02.f39943n = this.f33159d;
                interfaceC3211ff.f2(q2.f1.a(this.f33157b, f02), new BinderC3803qf(dVar, this, 0));
            }
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }
}
