package Y;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import g.AbstractActivityC0106i;

/* renamed from: Y.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0054u extends w1.l implements androidx.lifecycle.P, a.y, i0.f, M {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractActivityC0106i f1129e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractActivityC0106i f1130f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f1131g;
    public final I h;
    public final /* synthetic */ AbstractActivityC0106i i;

    public C0054u(AbstractActivityC0106i abstractActivityC0106i) {
        this.i = abstractActivityC0106i;
        Handler handler = new Handler();
        this.h = new I();
        this.f1129e = abstractActivityC0106i;
        this.f1130f = abstractActivityC0106i;
        this.f1131g = handler;
    }

    @Override // w1.l
    public final View I(int i) {
        return this.i.findViewById(i);
    }

    @Override // w1.l
    public final boolean J() {
        Window window = this.i.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // Y.M
    public final void a() {
    }

    @Override // i0.f
    public final i0.d b() {
        return this.i.d.f2535b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        return this.i.c();
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.i.f2216t;
    }
}
