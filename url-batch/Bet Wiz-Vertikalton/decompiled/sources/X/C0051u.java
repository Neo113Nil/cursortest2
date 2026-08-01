package X;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import g.AbstractActivityC0132i;

/* renamed from: X.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051u extends x1.d implements androidx.lifecycle.P, a.y, h0.f, M {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractActivityC0132i f1109e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractActivityC0132i f1110f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f1111g;
    public final I h;
    public final /* synthetic */ AbstractActivityC0132i i;

    public C0051u(AbstractActivityC0132i abstractActivityC0132i) {
        this.i = abstractActivityC0132i;
        Handler handler = new Handler();
        this.h = new I();
        this.f1109e = abstractActivityC0132i;
        this.f1110f = abstractActivityC0132i;
        this.f1111g = handler;
    }

    @Override // x1.d
    public final View N(int i) {
        return this.i.findViewById(i);
    }

    @Override // x1.d
    public final boolean Q() {
        Window window = this.i.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // X.M
    public final void a() {
    }

    @Override // h0.f
    public final h0.d b() {
        return this.i.d.f2512b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        return this.i.c();
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.i.f2455t;
    }
}
