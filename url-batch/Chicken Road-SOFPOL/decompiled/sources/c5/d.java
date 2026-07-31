package c5;

import android.view.ViewGroup;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1653a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f1654b;

    public d(ViewGroup viewGroup) {
        this.f1654b = viewGroup;
    }

    @Override // c5.p, c5.m
    public final void b() {
        s6.a.I(this.f1654b, false);
    }

    @Override // c5.p, c5.m
    public final void c() {
        s6.a.I(this.f1654b, true);
    }

    @Override // c5.m
    public final void d(o oVar) {
        if (!this.f1653a) {
            s6.a.I(this.f1654b, false);
        }
        oVar.x(this);
    }

    @Override // c5.p, c5.m
    public final void f(o oVar) {
        s6.a.I(this.f1654b, false);
        this.f1653a = true;
    }
}
