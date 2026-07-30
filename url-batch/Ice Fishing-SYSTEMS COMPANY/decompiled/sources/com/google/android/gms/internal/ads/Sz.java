package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class Sz implements Lz {

    /* renamed from: a, reason: collision with root package name */
    public final Oy f27663a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3457kA f27664b;

    /* renamed from: c, reason: collision with root package name */
    public final C3403jA f27665c;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f27666d;

    /* renamed from: e, reason: collision with root package name */
    public final C3619nA f27667e;

    /* renamed from: f, reason: collision with root package name */
    public final C4158xA f27668f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f27669g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final String f27670h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f27671j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f27672k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f27673l;

    /* renamed from: m, reason: collision with root package name */
    public E2 f27674m;

    public Sz(Oy oy, InterfaceC3457kA interfaceC3457kA, C3403jA c3403jA, C3619nA c3619nA, C4158xA c4158xA, C3066cy c3066cy, ExecutorService executorService) {
        this.f27663a = oy;
        this.f27664b = interfaceC3457kA;
        this.f27665c = c3403jA;
        this.f27666d = executorService;
        this.f27667e = c3619nA;
        this.f27668f = c4158xA;
        this.f27670h = c3066cy.R();
        this.i = c3066cy.Z();
        this.f27671j = c3066cy.Y();
        this.f27672k = c3066cy.P();
        this.f27673l = c3066cy.Q();
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final String a() {
        synchronized (this.f27669g) {
            try {
                E2 e22 = this.f27674m;
                if (e22 == null) {
                    return "3.893135394.-1";
                }
                return (String) e22.f24634v;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final RunnableFutureC3083dE b(Context context) {
        return C3686oN.p(new T6(13, this, context), this.f27666d);
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final void c(MotionEvent motionEvent) {
        try {
            synchronized (this.f27669g) {
                try {
                    E2 e22 = this.f27674m;
                    if (e22 != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("evt", motionEvent);
                        ((M.h) e22.f24635w).w(e22.f24633u, Optional.of(hashMap));
                    } else {
                        this.f27668f.b(20105);
                    }
                } finally {
                }
            }
        } catch (B5 | C4207y5 e6) {
            this.f27668f.d(20104, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final JD d() {
        boolean z8 = this.f27673l;
        HD hd = HD.f25326n;
        C3403jA c3403jA = this.f27665c;
        if (z8) {
            RunnableFutureC3083dE p6 = C3686oN.p(CallableC2988ba.f29508g, c3403jA.f32091e);
            c3403jA.f32090d.e(20312, p6);
            return C3686oN.A(p6, new Qz(this, 1), hd);
        }
        JD s3 = JD.s(c3403jA.d());
        Rz rz = Rz.f27455b;
        ExecutorService executorService = this.f27666d;
        final int i = 0;
        C3945tD y6 = C3686oN.y(C3686oN.u(s3, Throwable.class, rz, executorService), new CD(this) { // from class: com.google.android.gms.internal.ads.Oz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Sz f26789b;

            {
                this.f26789b = this;
            }

            @Override // com.google.android.gms.internal.ads.CD
            public final J3.a b(Object obj) {
                switch (i) {
                    case 0:
                        Sz sz = this.f26789b;
                        My my = (My) obj;
                        if (my != null) {
                            Oy oy = sz.f27663a;
                            List D8 = my.D();
                            Hy hy = (Hy) oy;
                            synchronized (hy.f25483m) {
                                C3184f6 c3184f6 = hy.f25486p;
                                c3184f6.h();
                                ((C3239g6) c3184f6.f30000u).N((InterfaceC3414jL) D8);
                            }
                        }
                        if (!sz.f27664b.a(my)) {
                            sz.f27668f.b(20103);
                            throw new B0.c(1);
                        }
                        C3403jA c3403jA2 = sz.f27665c;
                        C4307zy c4307zy = c3403jA2.f32088b;
                        c4307zy.getClass();
                        RunnableFutureC3083dE p9 = C3686oN.p(new Vs(5, c4307zy), c4307zy.f35644b);
                        c3403jA2.f32090d.e(20304, p9);
                        return C3686oN.A(p9, new Qz(sz, 0), HD.f25326n);
                    default:
                        Throwable th = (Throwable) obj;
                        Sz sz2 = this.f26789b;
                        if (!sz2.f27672k) {
                            return C3686oN.l(th);
                        }
                        CallableC2988ba callableC2988ba = CallableC2988ba.f29508g;
                        C3403jA c3403jA3 = sz2.f27665c;
                        RunnableFutureC3083dE p10 = C3686oN.p(callableC2988ba, c3403jA3.f32091e);
                        c3403jA3.f32090d.e(20312, p10);
                        return C3686oN.A(p10, new Qz(sz2, 1), HD.f25326n);
                }
            }
        }, executorService);
        final int i4 = 1;
        return C3686oN.v(y6, Throwable.class, new CD(this) { // from class: com.google.android.gms.internal.ads.Oz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Sz f26789b;

            {
                this.f26789b = this;
            }

            @Override // com.google.android.gms.internal.ads.CD
            public final J3.a b(Object obj) {
                switch (i4) {
                    case 0:
                        Sz sz = this.f26789b;
                        My my = (My) obj;
                        if (my != null) {
                            Oy oy = sz.f27663a;
                            List D8 = my.D();
                            Hy hy = (Hy) oy;
                            synchronized (hy.f25483m) {
                                C3184f6 c3184f6 = hy.f25486p;
                                c3184f6.h();
                                ((C3239g6) c3184f6.f30000u).N((InterfaceC3414jL) D8);
                            }
                        }
                        if (!sz.f27664b.a(my)) {
                            sz.f27668f.b(20103);
                            throw new B0.c(1);
                        }
                        C3403jA c3403jA2 = sz.f27665c;
                        C4307zy c4307zy = c3403jA2.f32088b;
                        c4307zy.getClass();
                        RunnableFutureC3083dE p9 = C3686oN.p(new Vs(5, c4307zy), c4307zy.f35644b);
                        c3403jA2.f32090d.e(20304, p9);
                        return C3686oN.A(p9, new Qz(sz, 0), HD.f25326n);
                    default:
                        Throwable th = (Throwable) obj;
                        Sz sz2 = this.f26789b;
                        if (!sz2.f27672k) {
                            return C3686oN.l(th);
                        }
                        CallableC2988ba callableC2988ba = CallableC2988ba.f29508g;
                        C3403jA c3403jA3 = sz2.f27665c;
                        RunnableFutureC3083dE p10 = C3686oN.p(callableC2988ba, c3403jA3.f32091e);
                        c3403jA3.f32090d.e(20312, p10);
                        return C3686oN.A(p10, new Qz(sz2, 1), HD.f25326n);
                }
            }
        }, hd);
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final int e() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final RunnableFutureC3083dE f(Context context, View view, Activity activity) {
        return C3686oN.p(new CallableC2831Vm(this, context, view, activity, 5), this.f27666d);
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final RunnableFutureC3083dE g(Context context, String str, View view) {
        return C3686oN.p(new CallableC2831Vm(this, context, str, view, 6), this.f27666d);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(HashMap hashMap) {
        String str;
        C4104wA a9;
        String str2;
        hashMap.put("v", this.f27670h);
        J3.a aVar = (J3.a) hashMap.get("gs");
        J3.a aVar2 = (J3.a) hashMap.get(com.anythink.expressad.f.a.b.da);
        C4158xA c4158xA = this.f27668f;
        byte[] bArr = null;
        long j9 = -1;
        if (aVar != null) {
            a9 = c4158xA.a(20107);
            try {
                try {
                    a9.a();
                    D6 d62 = (D6) aVar.get(this.f27671j, TimeUnit.MILLISECONDS);
                    if (d62 != null) {
                        bArr = d62.A0().b();
                        str = d62.v0().length() > 1 ? d62.v0() : "E";
                        try {
                            if (d62.w0()) {
                                j9 = d62.x0();
                            }
                        } catch (ClassCastException e6) {
                            e = e6;
                            a9.b(e);
                            a9.c();
                            if (str.equals("E")) {
                            }
                            hashMap.put("int", str);
                            if (bArr != null) {
                            }
                            hashMap.put("gv", Long.valueOf(j9));
                        } catch (InterruptedException e9) {
                            e = e9;
                            a9.b(e);
                            a9.c();
                            if (str.equals("E")) {
                            }
                            hashMap.put("int", str);
                            if (bArr != null) {
                            }
                            hashMap.put("gv", Long.valueOf(j9));
                        } catch (ExecutionException e10) {
                            e = e10;
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                e = cause;
                            }
                            a9.b(e);
                            a9.c();
                            if (str.equals("E")) {
                            }
                            hashMap.put("int", str);
                            if (bArr != null) {
                            }
                            hashMap.put("gv", Long.valueOf(j9));
                        } catch (TimeoutException e11) {
                            e = e11;
                            a9.b(e);
                            a9.c();
                            if (str.equals("E")) {
                            }
                            hashMap.put("int", str);
                            if (bArr != null) {
                            }
                            hashMap.put("gv", Long.valueOf(j9));
                        }
                    } else {
                        str = "E";
                    }
                } finally {
                }
            } catch (ClassCastException e12) {
                e = e12;
                str = "E";
                a9.b(e);
                a9.c();
                if (str.equals("E")) {
                    a9 = c4158xA.a(20108);
                    try {
                        try {
                            a9.a();
                            str2 = (String) aVar2.get(this.i, TimeUnit.MILLISECONDS);
                            if (true != AbstractC3217fl.q(str2)) {
                            }
                        } catch (ClassCastException e13) {
                            e = e13;
                            a9.b(e);
                        } catch (InterruptedException e14) {
                            e = e14;
                            a9.b(e);
                        } catch (ExecutionException e15) {
                            e = e15;
                            Throwable cause2 = e.getCause();
                            if (cause2 != null) {
                                e = cause2;
                            }
                            a9.b(e);
                        } catch (TimeoutException e16) {
                            e = e16;
                            a9.b(e);
                        }
                    } finally {
                    }
                }
                hashMap.put("int", str);
                if (bArr != null) {
                }
                hashMap.put("gv", Long.valueOf(j9));
            } catch (InterruptedException e17) {
                e = e17;
                str = "E";
                a9.b(e);
                a9.c();
                if (str.equals("E")) {
                }
                hashMap.put("int", str);
                if (bArr != null) {
                }
                hashMap.put("gv", Long.valueOf(j9));
            } catch (ExecutionException e18) {
                e = e18;
                str = "E";
            } catch (TimeoutException e19) {
                e = e19;
                str = "E";
                a9.b(e);
                a9.c();
                if (str.equals("E")) {
                }
                hashMap.put("int", str);
                if (bArr != null) {
                }
                hashMap.put("gv", Long.valueOf(j9));
            }
            a9.c();
        } else {
            str = "E";
        }
        if (str.equals("E") && aVar2 != null) {
            a9 = c4158xA.a(20108);
            a9.a();
            str2 = (String) aVar2.get(this.i, TimeUnit.MILLISECONDS);
            if (true != AbstractC3217fl.q(str2)) {
                str = str2;
            }
        }
        hashMap.put("int", str);
        if (bArr != null) {
            hashMap.put("att", bArr);
        }
        hashMap.put("gv", Long.valueOf(j9));
    }

    public final void i(M.h hVar, byte[] bArr, boolean z8) {
        C4104wA a9 = this.f27668f.a(20102);
        try {
            try {
                a9.a();
                synchronized (this.f27669g) {
                    this.f27674m = E2.a(hVar, bArr, z8);
                }
                a9.c();
            } catch (B5 e6) {
                e = e6;
                a9.b(e);
                throw new B0.c("r: 2", e);
            } catch (C4207y5 e9) {
                e = e9;
                a9.b(e);
                throw new B0.c("r: 2", e);
            } catch (Throwable th) {
                a9.b(th);
                throw th;
            }
        } catch (Throwable th2) {
            a9.c();
            throw th2;
        }
    }

    public final String j(HashMap hashMap) {
        String g9;
        C4158xA c4158xA = this.f27668f;
        try {
            c4158xA.a(20110).a();
            synchronized (this.f27669g) {
                try {
                    E2 e22 = this.f27674m;
                    if (e22 == null) {
                        c4158xA.b(20109);
                        g9 = "";
                    } else {
                        byte[] bArr = (byte[]) ((M.h) e22.f24635w).w(e22.f24632n, Optional.of(hashMap));
                        FC fc = HC.f25321e;
                        if (fc.f25324b != null) {
                            fc = new FC(fc.f25323a, (Character) null);
                        }
                        g9 = fc.g(bArr.length, bArr);
                    }
                } finally {
                }
            }
            return g9;
        } finally {
        }
    }
}
