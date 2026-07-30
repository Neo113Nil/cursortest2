package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import k2.AbstractC4642m;
import k2.C4643n;
import q2.BinderC4912s;
import q2.C4893i;
import q2.C4903n;
import q2.C4907p;
import q2.InterfaceC4921w0;
import v2.AbstractC5123a;

/* renamed from: com.google.android.gms.internal.ads.Fc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2549Fc extends AbstractC5123a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f24969a;

    /* renamed from: b, reason: collision with root package name */
    public final q2.f1 f24970b;

    /* renamed from: c, reason: collision with root package name */
    public final q2.K f24971c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24972d;

    public C2549Fc(Context context, String str) {
        BinderC3317hd binderC3317hd = new BinderC3317hd();
        this.f24972d = System.currentTimeMillis();
        new AtomicLong();
        this.f24969a = context;
        new AtomicReference(str);
        this.f24970b = q2.f1.f40041a;
        C4903n c4903n = C4907p.f40108g.f40110b;
        q2.g1 g1Var = new q2.g1();
        c4903n.getClass();
        this.f24971c = (q2.K) new C4893i(c4903n, context, g1Var, str, binderC3317hd).d(context, false);
    }

    @Override // v2.AbstractC5123a
    public final k2.s a() {
        InterfaceC4921w0 interfaceC4921w0 = null;
        try {
            q2.K k6 = this.f24971c;
            if (k6 != null) {
                interfaceC4921w0 = k6.M();
            }
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
        return new k2.s(interfaceC4921w0);
    }

    @Override // v2.AbstractC5123a
    public final void c(AbstractC4642m abstractC4642m) {
        try {
            q2.K k6 = this.f24971c;
            if (k6 != null) {
                k6.B0(new BinderC4912s(abstractC4642m));
            }
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // v2.AbstractC5123a
    public final void d(Activity activity) {
        if (activity == null) {
            u2.i.f("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            q2.K k6 = this.f24971c;
            if (k6 != null) {
                k6.T2(new V2.b(activity));
            }
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }

    public final void e(q2.F0 f02, k2.x xVar) {
        try {
            q2.K k6 = this.f24971c;
            if (k6 != null) {
                f02.f39943n = this.f24972d;
                q2.f1 f1Var = this.f24970b;
                Context context = this.f24969a;
                f1Var.getClass();
                k6.C2(q2.f1.a(context, f02), new q2.c1(xVar, this));
            }
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
            xVar.onAdFailedToLoad(new C4643n(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
