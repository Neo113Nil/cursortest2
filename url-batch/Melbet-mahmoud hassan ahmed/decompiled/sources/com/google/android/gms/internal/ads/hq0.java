package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class hq0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6380a;

    /* renamed from: b, reason: collision with root package name */
    private final tq0 f6381b;

    /* renamed from: c, reason: collision with root package name */
    private final ViewGroup f6382c;

    /* renamed from: d, reason: collision with root package name */
    private gq0 f6383d;

    public hq0(Context context, ViewGroup viewGroup, eu0 eu0Var) {
        this.f6380a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f6382c = viewGroup;
        this.f6381b = eu0Var;
        this.f6383d = null;
    }

    public final gq0 a() {
        r3.o.e("getAdVideoUnderlay must be called from the UI thread.");
        return this.f6383d;
    }

    public final void b(int i7, int i8, int i9, int i10) {
        r3.o.e("The underlay may only be modified from the UI thread.");
        gq0 gq0Var = this.f6383d;
        if (gq0Var != null) {
            gq0Var.m(i7, i8, i9, i10);
        }
    }

    public final void c(int i7, int i8, int i9, int i10, int i11, boolean z6, sq0 sq0Var) {
        if (this.f6383d != null) {
            return;
        }
        t10.a(this.f6381b.n().a(), this.f6381b.m(), "vpr2");
        Context context = this.f6380a;
        tq0 tq0Var = this.f6381b;
        gq0 gq0Var = new gq0(context, tq0Var, i11, z6, tq0Var.n().a(), sq0Var);
        this.f6383d = gq0Var;
        this.f6382c.addView(gq0Var, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f6383d.m(i7, i8, i9, i10);
        this.f6381b.Z(false);
    }

    public final void d() {
        r3.o.e("onDestroy must be called from the UI thread.");
        gq0 gq0Var = this.f6383d;
        if (gq0Var != null) {
            gq0Var.v();
            this.f6382c.removeView(this.f6383d);
            this.f6383d = null;
        }
    }

    public final void e() {
        r3.o.e("onPause must be called from the UI thread.");
        gq0 gq0Var = this.f6383d;
        if (gq0Var != null) {
            gq0Var.A();
        }
    }

    public final void f(int i7) {
        r3.o.e("setPlayerBackgroundColor must be called from the UI thread.");
        gq0 gq0Var = this.f6383d;
        if (gq0Var != null) {
            gq0Var.i(i7);
        }
    }
}
