package Z;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import g.AbstractActivityC0110i;

/* renamed from: Z.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050u extends z1.l implements androidx.lifecycle.P, a.y, j0.f, M {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0110i f1218a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC0110i f1219b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f1220c;
    public final I d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0110i f1221e;

    public C0050u(AbstractActivityC0110i abstractActivityC0110i) {
        this.f1221e = abstractActivityC0110i;
        Handler handler = new Handler();
        this.d = new I();
        this.f1218a = abstractActivityC0110i;
        this.f1219b = abstractActivityC0110i;
        this.f1220c = handler;
    }

    @Override // j0.f
    public final j0.d c() {
        return this.f1221e.d.f2686b;
    }

    @Override // z1.l
    public final View c0(int i) {
        return this.f1221e.findViewById(i);
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O d() {
        return this.f1221e.d();
    }

    @Override // Z.M
    public final void e() {
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t f() {
        return this.f1221e.f2318t;
    }

    @Override // z1.l
    public final boolean f0() {
        Window window = this.f1221e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
