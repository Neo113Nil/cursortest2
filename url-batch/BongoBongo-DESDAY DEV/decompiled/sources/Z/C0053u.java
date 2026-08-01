package Z;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import g.AbstractActivityC0106i;

/* renamed from: Z.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053u extends A1.d implements androidx.lifecycle.P, a.y, j0.f, M {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractActivityC0106i f1209e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractActivityC0106i f1210f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f1211g;

    /* renamed from: h, reason: collision with root package name */
    public final I f1212h;
    public final /* synthetic */ AbstractActivityC0106i i;

    public C0053u(AbstractActivityC0106i abstractActivityC0106i) {
        this.i = abstractActivityC0106i;
        Handler handler = new Handler();
        this.f1212h = new I();
        this.f1209e = abstractActivityC0106i;
        this.f1210f = abstractActivityC0106i;
        this.f1211g = handler;
    }

    @Override // A1.d
    public final View Y(int i) {
        return this.i.findViewById(i);
    }

    @Override // A1.d
    public final boolean Z() {
        Window window = this.i.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // Z.M
    public final void a() {
    }

    @Override // j0.f
    public final j0.d b() {
        return this.i.d.f2666b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        return this.i.c();
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.i.f2336t;
    }
}
