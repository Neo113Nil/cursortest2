package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.Collections;

/* loaded from: classes.dex */
public final class qq1 extends u90 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, y30 {

    /* renamed from: f, reason: collision with root package name */
    private View f10792f;

    /* renamed from: g, reason: collision with root package name */
    private cz f10793g;

    /* renamed from: h, reason: collision with root package name */
    private mm1 f10794h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10795i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10796j = false;

    public qq1(mm1 mm1Var, rm1 rm1Var) {
        this.f10792f = rm1Var.N();
        this.f10793g = rm1Var.R();
        this.f10794h = mm1Var;
        if (rm1Var.Z() != null) {
            rm1Var.Z().X0(this);
        }
    }

    private final void e() {
        View view;
        mm1 mm1Var = this.f10794h;
        if (mm1Var == null || (view = this.f10792f) == null) {
            return;
        }
        mm1Var.O(view, Collections.emptyMap(), Collections.emptyMap(), mm1.w(this.f10792f));
    }

    private final void f() {
        View view = this.f10792f;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f10792f);
        }
    }

    private static final void s6(y90 y90Var, int i7) {
        try {
            y90Var.D(i7);
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.v90
    public final cz a() {
        r3.o.e("#008 Must be called on the main UI thread.");
        if (!this.f10795i) {
            return this.f10793g;
        }
        io0.d("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.v90
    public final k40 c() {
        r3.o.e("#008 Must be called on the main UI thread.");
        if (this.f10795i) {
            io0.d("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        mm1 mm1Var = this.f10794h;
        if (mm1Var == null || mm1Var.A() == null) {
            return null;
        }
        return this.f10794h.A().a();
    }

    @Override // com.google.android.gms.internal.ads.v90
    public final void d1(x3.a aVar, y90 y90Var) {
        r3.o.e("#008 Must be called on the main UI thread.");
        if (this.f10795i) {
            io0.d("Instream ad can not be shown after destroy().");
            s6(y90Var, 2);
            return;
        }
        View view = this.f10792f;
        if (view == null || this.f10793g == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            io0.d(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
            s6(y90Var, 0);
            return;
        }
        if (this.f10796j) {
            io0.d("Instream ad should not be used again.");
            s6(y90Var, 1);
            return;
        }
        this.f10796j = true;
        f();
        ((ViewGroup) x3.b.O0(aVar)).addView(this.f10792f, new ViewGroup.LayoutParams(-1, -1));
        y2.t.y();
        jp0.a(this.f10792f, this);
        y2.t.y();
        jp0.b(this.f10792f, this);
        e();
        try {
            y90Var.d();
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.v90
    public final void g() {
        r3.o.e("#008 Must be called on the main UI thread.");
        f();
        mm1 mm1Var = this.f10794h;
        if (mm1Var != null) {
            mm1Var.a();
        }
        this.f10794h = null;
        this.f10792f = null;
        this.f10793g = null;
        this.f10795i = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        e();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        e();
    }

    @Override // com.google.android.gms.internal.ads.v90
    public final void zze(x3.a aVar) {
        r3.o.e("#008 Must be called on the main UI thread.");
        d1(aVar, new pq1(this));
    }
}
