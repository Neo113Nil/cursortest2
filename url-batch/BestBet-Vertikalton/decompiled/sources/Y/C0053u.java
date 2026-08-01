package Y;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import g.AbstractActivityC0128i;

/* renamed from: Y.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053u extends H1.l implements androidx.lifecycle.S, a.y, j0.f, M {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0128i f1488a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC0128i f1489b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f1490c;
    public final I d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0128i f1491e;

    public C0053u(AbstractActivityC0128i abstractActivityC0128i) {
        this.f1491e = abstractActivityC0128i;
        Handler handler = new Handler();
        this.d = new I();
        this.f1488a = abstractActivityC0128i;
        this.f1489b = abstractActivityC0128i;
        this.f1490c = handler;
    }

    @Override // H1.l
    public final View V(int i) {
        return this.f1491e.findViewById(i);
    }

    @Override // H1.l
    public final boolean W() {
        Window window = this.f1491e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // j0.f
    public final j0.d b() {
        return this.f1491e.d.f3084b;
    }

    @Override // androidx.lifecycle.S
    public final androidx.lifecycle.Q c() {
        return this.f1491e.c();
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v e() {
        return this.f1491e.f2673t;
    }

    @Override // Y.M
    public final void f() {
    }
}
