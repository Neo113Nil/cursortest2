package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class w extends b4.d implements androidx.lifecycle.p0, androidx.lifecycle.r, h1.e, n0 {

    /* renamed from: o, reason: collision with root package name */
    public final g.i f673o;

    /* renamed from: p, reason: collision with root package name */
    public final g.i f674p;

    /* renamed from: q, reason: collision with root package name */
    public final Handler f675q;

    /* renamed from: r, reason: collision with root package name */
    public final k0 f676r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g.i f677s;

    public w(g.i iVar) {
        this.f677s = iVar;
        Handler handler = new Handler();
        this.f676r = new k0();
        this.f673o = iVar;
        this.f674p = iVar;
        this.f675q = handler;
    }

    @Override // b4.d
    public final View G(int i) {
        return this.f677s.findViewById(i);
    }

    @Override // b4.d
    public final boolean J() {
        Window window = this.f677s.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // h1.e
    public final h1.c a() {
        return this.f677s.i.f1972b;
    }

    @Override // androidx.lifecycle.p0
    public final androidx.lifecycle.o0 e() {
        return this.f677s.e();
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t f() {
        return this.f677s.A;
    }

    @Override // androidx.fragment.app.n0
    public final void d() {
    }
}
