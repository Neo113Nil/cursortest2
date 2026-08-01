package X;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import g.AbstractActivityC0131i;

/* renamed from: X.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051u extends s1.l implements androidx.lifecycle.P, a.y, h0.f, M {
    public final AbstractActivityC0131i h;
    public final AbstractActivityC0131i i;

    /* renamed from: j, reason: collision with root package name */
    public final Handler f1037j;

    /* renamed from: k, reason: collision with root package name */
    public final I f1038k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0131i f1039l;

    public C0051u(AbstractActivityC0131i abstractActivityC0131i) {
        this.f1039l = abstractActivityC0131i;
        Handler handler = new Handler();
        this.f1038k = new I();
        this.h = abstractActivityC0131i;
        this.i = abstractActivityC0131i;
        this.f1037j = handler;
    }

    @Override // s1.l
    public final View O(int i) {
        return this.f1039l.findViewById(i);
    }

    @Override // s1.l
    public final boolean R() {
        Window window = this.f1039l.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // X.M
    public final void a() {
    }

    @Override // h0.f
    public final h0.d b() {
        return this.f1039l.d.f2459b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        return this.f1039l.c();
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f1039l.f2393t;
    }
}
