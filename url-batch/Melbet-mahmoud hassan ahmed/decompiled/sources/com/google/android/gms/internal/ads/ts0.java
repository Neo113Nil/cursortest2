package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ts0 implements p3.h {

    /* renamed from: f, reason: collision with root package name */
    protected final Context f12367f;

    /* renamed from: g, reason: collision with root package name */
    protected final String f12368g;

    /* renamed from: h, reason: collision with root package name */
    protected final WeakReference<tq0> f12369h;

    public ts0(tq0 tq0Var) {
        Context context = tq0Var.getContext();
        this.f12367f = context;
        this.f12368g = y2.t.q().L(context, tq0Var.l().f10301f);
        this.f12369h = new WeakReference<>(tq0Var);
    }

    static /* bridge */ /* synthetic */ void f(ts0 ts0Var, String str, Map map) {
        tq0 tq0Var = ts0Var.f12369h.get();
        if (tq0Var != null) {
            tq0Var.t("onPrecacheEvent", map);
        }
    }

    @Override // p3.h
    public void a() {
    }

    public abstract void g();

    public final void h(String str, String str2, String str3, String str4) {
        bo0.f3473b.post(new ss0(this, str, str2, str3, str4));
    }

    protected final void i(String str, String str2, int i7) {
        bo0.f3473b.post(new qs0(this, str, str2, i7));
    }

    public final void j(String str, String str2, long j7) {
        bo0.f3473b.post(new rs0(this, str, str2, j7));
    }

    public final void l(String str, String str2, int i7, int i8, long j7, long j8, boolean z6, int i9, int i10) {
        bo0.f3473b.post(new ps0(this, str, str2, i7, i8, j7, j8, z6, i9, i10));
    }

    public final void m(String str, String str2, long j7, long j8, boolean z6, long j9, long j10, long j11, int i7, int i8) {
        bo0.f3473b.post(new os0(this, str, str2, j7, j8, j9, j10, j11, z6, i7, i8));
    }

    protected void o(int i7) {
    }

    protected void q(int i7) {
    }

    protected void r(int i7) {
    }

    protected void s(int i7) {
    }

    public abstract boolean t(String str);

    public boolean u(String str, String[] strArr) {
        return t(str);
    }

    public boolean v(String str, String[] strArr, ks0 ks0Var) {
        return t(str);
    }
}
