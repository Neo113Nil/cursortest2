package Z;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import h.AbstractActivityC0132i;

/* renamed from: Z.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056u extends H1.d implements androidx.lifecycle.S, b.x, j0.f, M {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC0132i f1637b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractActivityC0132i f1638c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f1639d;
    public final I e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0132i f1640f;

    public C0056u(AbstractActivityC0132i abstractActivityC0132i) {
        this.f1640f = abstractActivityC0132i;
        Handler handler = new Handler();
        this.e = new I();
        this.f1637b = abstractActivityC0132i;
        this.f1638c = abstractActivityC0132i;
        this.f1639d = handler;
    }

    @Override // H1.d
    public final View S(int i) {
        return this.f1640f.findViewById(i);
    }

    @Override // H1.d
    public final boolean T() {
        Window window = this.f1640f.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // j0.f
    public final j0.d b() {
        return this.f1640f.f2180d.f3167b;
    }

    @Override // androidx.lifecycle.S
    public final androidx.lifecycle.Q c() {
        return this.f1640f.c();
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v e() {
        return this.f1640f.f2803t;
    }

    @Override // Z.M
    public final void f() {
    }
}
