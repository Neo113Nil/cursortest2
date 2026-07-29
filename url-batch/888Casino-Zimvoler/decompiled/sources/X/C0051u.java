package X;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import g.AbstractActivityC0125i;
import h0.C0132d;
import h0.InterfaceC0134f;

/* renamed from: X.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051u extends q1.d implements androidx.lifecycle.P, a.y, InterfaceC0134f, M {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractActivityC0125i f992e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractActivityC0125i f993f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f994g;
    public final I h;
    public final /* synthetic */ AbstractActivityC0125i i;

    public C0051u(AbstractActivityC0125i abstractActivityC0125i) {
        this.i = abstractActivityC0125i;
        Handler handler = new Handler();
        this.h = new I();
        this.f992e = abstractActivityC0125i;
        this.f993f = abstractActivityC0125i;
        this.f994g = handler;
    }

    @Override // X.M
    public final void a() {
    }

    @Override // h0.InterfaceC0134f
    public final C0132d b() {
        return this.i.d.f2374b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        return this.i.c();
    }

    @Override // q1.d
    public final View c0(int i) {
        return this.i.findViewById(i);
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.i.f2320t;
    }

    @Override // q1.d
    public final boolean d0() {
        Window window = this.i.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
