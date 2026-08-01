package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class w extends a.y implements androidx.lifecycle.p0, androidx.lifecycle.r, g1.e, n0 {

    /* renamed from: n, reason: collision with root package name */
    public final g.j f567n;

    /* renamed from: o, reason: collision with root package name */
    public final g.j f568o;

    /* renamed from: p, reason: collision with root package name */
    public final Handler f569p;

    /* renamed from: q, reason: collision with root package name */
    public final k0 f570q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g.j f571r;

    public w(g.j jVar) {
        this.f571r = jVar;
        Handler handler = new Handler();
        this.f570q = new k0();
        this.f567n = jVar;
        this.f568o = jVar;
        this.f569p = handler;
    }

    @Override // a.y
    public final View M(int i) {
        return this.f571r.findViewById(i);
    }

    @Override // a.y
    public final boolean N() {
        Window window = this.f571r.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // g1.e
    public final g1.c b() {
        return this.f571r.i.f1703b;
    }

    @Override // androidx.lifecycle.p0
    public final androidx.lifecycle.o0 d() {
        return this.f571r.d();
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t e() {
        return this.f571r.f1651z;
    }

    @Override // androidx.fragment.app.n0
    public final void a() {
    }
}
