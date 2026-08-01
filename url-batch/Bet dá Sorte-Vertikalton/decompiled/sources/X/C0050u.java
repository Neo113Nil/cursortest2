package X;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import g.AbstractActivityC0128i;

/* renamed from: X.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050u extends u1.l implements androidx.lifecycle.P, a.y, h0.f, M {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractActivityC0128i f1083e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractActivityC0128i f1084f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f1085g;
    public final I h;
    public final /* synthetic */ AbstractActivityC0128i i;

    public C0050u(AbstractActivityC0128i abstractActivityC0128i) {
        this.i = abstractActivityC0128i;
        Handler handler = new Handler();
        this.h = new I();
        this.f1083e = abstractActivityC0128i;
        this.f1084f = abstractActivityC0128i;
        this.f1085g = handler;
    }

    @Override // u1.l
    public final View V(int i) {
        return this.i.findViewById(i);
    }

    @Override // u1.l
    public final boolean Y() {
        Window window = this.i.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // X.M
    public final void a() {
    }

    @Override // h0.f
    public final h0.d b() {
        return this.i.d.f2486b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        return this.i.c();
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.i.f2434t;
    }
}
