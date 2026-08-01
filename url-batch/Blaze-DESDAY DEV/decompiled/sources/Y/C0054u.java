package Y;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import g.AbstractActivityC0108i;

/* renamed from: Y.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0054u extends z1.d implements androidx.lifecycle.P, a.y, i0.f, M {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0108i f1156a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC0108i f1157b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f1158c;
    public final I d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0108i f1159e;

    public C0054u(AbstractActivityC0108i abstractActivityC0108i) {
        this.f1159e = abstractActivityC0108i;
        Handler handler = new Handler();
        this.d = new I();
        this.f1156a = abstractActivityC0108i;
        this.f1157b = abstractActivityC0108i;
        this.f1158c = handler;
    }

    @Override // i0.f
    public final i0.d b() {
        return this.f1159e.d.f2566b;
    }

    @Override // z1.d
    public final View b0(int i) {
        return this.f1159e.findViewById(i);
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        return this.f1159e.c();
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t e() {
        return this.f1159e.f2256t;
    }

    @Override // z1.d
    public final boolean e0() {
        Window window = this.f1159e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // Y.M
    public final void f() {
    }
}
