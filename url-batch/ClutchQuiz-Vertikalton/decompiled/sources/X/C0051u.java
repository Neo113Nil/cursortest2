package X;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import g.AbstractActivityC0136i;

/* renamed from: X.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051u extends T.d implements androidx.lifecycle.S, a.y, h0.f, M {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0136i f1135a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC0136i f1136b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f1137c;
    public final I d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0136i f1138e;

    public C0051u(AbstractActivityC0136i abstractActivityC0136i) {
        this.f1138e = abstractActivityC0136i;
        Handler handler = new Handler();
        this.d = new I();
        this.f1135a = abstractActivityC0136i;
        this.f1136b = abstractActivityC0136i;
        this.f1137c = handler;
    }

    @Override // T.d
    public final View C(int i) {
        return this.f1138e.findViewById(i);
    }

    @Override // T.d
    public final boolean D() {
        Window window = this.f1138e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // X.M
    public final void a() {
    }

    @Override // h0.f
    public final h0.d b() {
        return this.f1138e.d.f2580b;
    }

    @Override // androidx.lifecycle.S
    public final androidx.lifecycle.Q c() {
        return this.f1138e.c();
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v d() {
        return this.f1138e.f2451t;
    }
}
