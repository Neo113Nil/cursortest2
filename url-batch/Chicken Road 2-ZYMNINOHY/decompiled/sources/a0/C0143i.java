package a0;

import a.AbstractC0124a;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import c0.C0267A;
import c0.C0270c;
import java.util.ArrayList;
import s0.C1409e;
import x0.C1523a;

/* renamed from: a0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4163a;

    /* renamed from: b, reason: collision with root package name */
    public final L1.k f4164b;

    public C0143i(Context context) {
        this.f4163a = context;
        this.f4164b = new L1.k(context, false);
    }

    public final AbstractC0135a[] a(Handler handler, SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A, SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A2, SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A3, SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A4) {
        ArrayList arrayList = new ArrayList();
        Context context = this.f4163a;
        w0.i iVar = new w0.i(context);
        L1.k kVar = this.f4164b;
        iVar.f15804c = kVar;
        iVar.f15805d = 5000L;
        iVar.f15806e = handler;
        iVar.f15807f = surfaceHolderCallbackC0125A;
        iVar.f15808g = 50;
        AbstractC0124a.t(!iVar.f15803b);
        Handler handler2 = iVar.f15806e;
        AbstractC0124a.t((handler2 == null && iVar.f15807f == null) || !(handler2 == null || iVar.f15807f == null));
        iVar.f15803b = true;
        arrayList.add(new w0.k(iVar));
        E1.a0 a0Var = new E1.a0(context);
        AbstractC0124a.t(!a0Var.f566b);
        a0Var.f566b = true;
        if (((B1.j) a0Var.f568d) == null) {
            a0Var.f568d = new B1.j(new U.n[0]);
        }
        if (((C0267A) a0Var.f570f) == null) {
            if (((l2.e) a0Var.f571g) == null) {
                a0Var.f571g = new l2.e(context, 26);
            }
            if (((c0.J) a0Var.f569e) == null) {
                a0Var.f569e = c0.J.f5500a;
            }
            G1.c cVar = new G1.c(context);
            C0270c c0270c = context != null ? null : (C0270c) a0Var.f567c;
            Context context2 = (Context) cVar.f835b;
            if (context2 == null) {
                cVar.f838e = c0270c;
            }
            l2.e eVar = (l2.e) a0Var.f571g;
            cVar.f836c = eVar;
            cVar.f837d = (c0.J) a0Var.f569e;
            if (eVar == null) {
                cVar.f836c = new l2.e(context2, 26);
            }
            a0Var.f570f = new C0267A(cVar);
        } else {
            AbstractC0124a.t(((l2.e) a0Var.f571g) == null);
            AbstractC0124a.t(((c0.J) a0Var.f569e) == null);
        }
        arrayList.add(new c0.K(this.f4163a, kVar, handler, surfaceHolderCallbackC0125A2, new c0.I(a0Var)));
        arrayList.add(new C1409e(surfaceHolderCallbackC0125A3, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new k0.b(surfaceHolderCallbackC0125A4, looper));
        arrayList.add(new k0.b(surfaceHolderCallbackC0125A4, looper));
        arrayList.add(new C1523a());
        L1.k kVar2 = new L1.k();
        context.getClass();
        kVar2.f1648a = context;
        arrayList.add(new i0.f(kVar2));
        return (AbstractC0135a[]) arrayList.toArray(new AbstractC0135a[0]);
    }
}
