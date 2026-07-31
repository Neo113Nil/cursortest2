package b;

import androidx.lifecycle.w;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s implements androidx.lifecycle.s, AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f1016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f1017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f1018f;

    public s(o oVar, u uVar, t tVar, w wVar) {
        this.f1016d = oVar;
        this.f1017e = uVar;
        this.f1018f = wVar;
    }

    @Override // androidx.lifecycle.s
    public final void b(androidx.lifecycle.u uVar, androidx.lifecycle.o oVar) {
        boolean z3 = oVar.a().compareTo(androidx.lifecycle.p.f850g) >= 0 && this.f1017e.f1022b;
        o oVar2 = this.f1016d;
        oVar2.c(z3);
        if (oVar == androidx.lifecycle.o.ON_DESTROY) {
            oVar2.b();
            this.f1018f.f(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f1018f.f(this);
    }
}
