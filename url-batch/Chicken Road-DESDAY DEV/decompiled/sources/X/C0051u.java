package X;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import g.AbstractActivityC0133i;

/* renamed from: X.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051u extends u1.l implements androidx.lifecycle.P, a.y, h0.f, M {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractActivityC0133i f1069e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractActivityC0133i f1070f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f1071g;
    public final I h;
    public final /* synthetic */ AbstractActivityC0133i i;

    public C0051u(AbstractActivityC0133i abstractActivityC0133i) {
        this.i = abstractActivityC0133i;
        Handler handler = new Handler();
        this.h = new I();
        this.f1069e = abstractActivityC0133i;
        this.f1070f = abstractActivityC0133i;
        this.f1071g = handler;
    }

    @Override // u1.l
    public final View L(int i) {
        return this.i.findViewById(i);
    }

    @Override // u1.l
    public final boolean O() {
        Window window = this.i.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // X.M
    public final void a() {
    }

    @Override // h0.f
    public final h0.d b() {
        return this.i.d.f2447b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        return this.i.c();
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.i.f2394t;
    }
}
