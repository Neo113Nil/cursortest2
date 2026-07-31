package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class mz {

    /* renamed from: a, reason: collision with root package name */
    private final ad0 f8809a;

    /* renamed from: b, reason: collision with root package name */
    private final ov f8810b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f8811c;

    /* renamed from: d, reason: collision with root package name */
    private final r2.w f8812d;

    /* renamed from: e, reason: collision with root package name */
    final rw f8813e;

    /* renamed from: f, reason: collision with root package name */
    private yu f8814f;

    /* renamed from: g, reason: collision with root package name */
    private r2.d f8815g;

    /* renamed from: h, reason: collision with root package name */
    private r2.h[] f8816h;

    /* renamed from: i, reason: collision with root package name */
    private s2.e f8817i;

    /* renamed from: j, reason: collision with root package name */
    private nx f8818j;

    /* renamed from: k, reason: collision with root package name */
    private r2.x f8819k;

    /* renamed from: l, reason: collision with root package name */
    private String f8820l;

    /* renamed from: m, reason: collision with root package name */
    private final ViewGroup f8821m;

    /* renamed from: n, reason: collision with root package name */
    private int f8822n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f8823o;

    /* renamed from: p, reason: collision with root package name */
    private r2.r f8824p;

    public mz(ViewGroup viewGroup, int i7) {
        this(viewGroup, null, false, ov.f9836a, null, i7);
    }

    mz(ViewGroup viewGroup, AttributeSet attributeSet, boolean z6, ov ovVar, nx nxVar, int i7) {
        pv pvVar;
        this.f8809a = new ad0();
        this.f8812d = new r2.w();
        this.f8813e = new lz(this);
        this.f8821m = viewGroup;
        this.f8810b = ovVar;
        this.f8818j = null;
        this.f8811c = new AtomicBoolean(false);
        this.f8822n = i7;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                xv xvVar = new xv(context, attributeSet);
                this.f8816h = xvVar.b(z6);
                this.f8820l = xvVar.a();
                if (viewGroup.isInEditMode()) {
                    bo0 b7 = qw.b();
                    r2.h hVar = this.f8816h[0];
                    int i8 = this.f8822n;
                    if (hVar.equals(r2.h.f21150q)) {
                        pvVar = pv.j();
                    } else {
                        pv pvVar2 = new pv(context, hVar);
                        pvVar2.f10385o = c(i8);
                        pvVar = pvVar2;
                    }
                    b7.h(viewGroup, pvVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e7) {
                qw.b().g(viewGroup, new pv(context, r2.h.f21142i), e7.getMessage(), e7.getMessage());
            }
        }
    }

    private static pv b(Context context, r2.h[] hVarArr, int i7) {
        for (r2.h hVar : hVarArr) {
            if (hVar.equals(r2.h.f21150q)) {
                return pv.j();
            }
        }
        pv pvVar = new pv(context, hVarArr);
        pvVar.f10385o = c(i7);
        return pvVar;
    }

    private static boolean c(int i7) {
        return i7 == 1;
    }

    public final r2.h[] a() {
        return this.f8816h;
    }

    public final r2.d d() {
        return this.f8815g;
    }

    public final r2.h e() {
        pv e7;
        try {
            nx nxVar = this.f8818j;
            if (nxVar != null && (e7 = nxVar.e()) != null) {
                return r2.y.c(e7.f10380j, e7.f10377g, e7.f10376f);
            }
        } catch (RemoteException e8) {
            io0.i("#007 Could not call remote method.", e8);
        }
        r2.h[] hVarArr = this.f8816h;
        if (hVarArr != null) {
            return hVarArr[0];
        }
        return null;
    }

    public final r2.r f() {
        return this.f8824p;
    }

    public final r2.v g() {
        zy zyVar = null;
        try {
            nx nxVar = this.f8818j;
            if (nxVar != null) {
                zyVar = nxVar.j();
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
        return r2.v.d(zyVar);
    }

    public final r2.w i() {
        return this.f8812d;
    }

    public final r2.x j() {
        return this.f8819k;
    }

    public final s2.e k() {
        return this.f8817i;
    }

    public final cz l() {
        nx nxVar = this.f8818j;
        if (nxVar != null) {
            try {
                return nxVar.k();
            } catch (RemoteException e7) {
                io0.i("#007 Could not call remote method.", e7);
            }
        }
        return null;
    }

    public final String m() {
        nx nxVar;
        if (this.f8820l == null && (nxVar = this.f8818j) != null) {
            try {
                this.f8820l = nxVar.t();
            } catch (RemoteException e7) {
                io0.i("#007 Could not call remote method.", e7);
            }
        }
        return this.f8820l;
    }

    public final void n() {
        try {
            nx nxVar = this.f8818j;
            if (nxVar != null) {
                nxVar.N();
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    public final void o(kz kzVar) {
        try {
            if (this.f8818j == null) {
                if (this.f8816h == null || this.f8820l == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f8821m.getContext();
                pv b7 = b(context, this.f8816h, this.f8822n);
                nx d7 = "search_v2".equals(b7.f10376f) ? new hw(qw.a(), context, b7, this.f8820l).d(context, false) : new ew(qw.a(), context, b7, this.f8820l, this.f8809a).d(context, false);
                this.f8818j = d7;
                d7.v3(new ev(this.f8813e));
                yu yuVar = this.f8814f;
                if (yuVar != null) {
                    this.f8818j.b1(new zu(yuVar));
                }
                s2.e eVar = this.f8817i;
                if (eVar != null) {
                    this.f8818j.M3(new no(eVar));
                }
                r2.x xVar = this.f8819k;
                if (xVar != null) {
                    this.f8818j.c6(new s00(xVar));
                }
                this.f8818j.r5(new m00(this.f8824p));
                this.f8818j.b6(this.f8823o);
                nx nxVar = this.f8818j;
                if (nxVar != null) {
                    try {
                        x3.a m7 = nxVar.m();
                        if (m7 != null) {
                            this.f8821m.addView((View) x3.b.O0(m7));
                        }
                    } catch (RemoteException e7) {
                        io0.i("#007 Could not call remote method.", e7);
                    }
                }
            }
            nx nxVar2 = this.f8818j;
            Objects.requireNonNull(nxVar2);
            if (nxVar2.F4(this.f8810b.a(this.f8821m.getContext(), kzVar))) {
                this.f8809a.t6(kzVar.p());
            }
        } catch (RemoteException e8) {
            io0.i("#007 Could not call remote method.", e8);
        }
    }

    public final void p() {
        try {
            nx nxVar = this.f8818j;
            if (nxVar != null) {
                nxVar.V();
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    public final void q() {
        try {
            nx nxVar = this.f8818j;
            if (nxVar != null) {
                nxVar.H();
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    public final void r(yu yuVar) {
        try {
            this.f8814f = yuVar;
            nx nxVar = this.f8818j;
            if (nxVar != null) {
                nxVar.b1(yuVar != null ? new zu(yuVar) : null);
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    public final void s(r2.d dVar) {
        this.f8815g = dVar;
        this.f8813e.r(dVar);
    }

    public final void t(r2.h... hVarArr) {
        if (this.f8816h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        u(hVarArr);
    }

    public final void u(r2.h... hVarArr) {
        this.f8816h = hVarArr;
        try {
            nx nxVar = this.f8818j;
            if (nxVar != null) {
                nxVar.R3(b(this.f8821m.getContext(), this.f8816h, this.f8822n));
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
        this.f8821m.requestLayout();
    }

    public final void v(String str) {
        if (this.f8820l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f8820l = str;
    }

    public final void w(s2.e eVar) {
        try {
            this.f8817i = eVar;
            nx nxVar = this.f8818j;
            if (nxVar != null) {
                nxVar.M3(eVar != null ? new no(eVar) : null);
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    public final void x(boolean z6) {
        this.f8823o = z6;
        try {
            nx nxVar = this.f8818j;
            if (nxVar != null) {
                nxVar.b6(z6);
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    public final void y(r2.r rVar) {
        try {
            this.f8824p = rVar;
            nx nxVar = this.f8818j;
            if (nxVar != null) {
                nxVar.r5(new m00(rVar));
            }
        } catch (RemoteException e7) {
            io0.i("#008 Must be called on the main UI thread.", e7);
        }
    }

    public final void z(r2.x xVar) {
        this.f8819k = xVar;
        try {
            nx nxVar = this.f8818j;
            if (nxVar != null) {
                nxVar.c6(xVar == null ? null : new s00(xVar));
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }
}
