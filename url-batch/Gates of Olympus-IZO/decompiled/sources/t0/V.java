package t0;

import I.C0120t;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public U.k f7846a;

    /* renamed from: b, reason: collision with root package name */
    public int f7847b;

    /* renamed from: c, reason: collision with root package name */
    public K.d f7848c;

    /* renamed from: d, reason: collision with root package name */
    public K.d f7849d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0120t f7851f;

    public V(C0120t c0120t, U.k kVar, int i3, K.d dVar, K.d dVar2, boolean z3) {
        this.f7851f = c0120t;
        this.f7846a = kVar;
        this.f7847b = i3;
        this.f7848c = dVar;
        this.f7849d = dVar2;
        this.f7850e = z3;
    }

    public final boolean a(int i3, int i4) {
        K.d dVar = this.f7848c;
        int i5 = this.f7847b;
        U.j jVar = (U.j) dVar.f2640d[i3 + i5];
        U.j jVar2 = (U.j) this.f7849d.f2640d[i5 + i4];
        W w3 = X.f7852a;
        return Z1.i.a(jVar, jVar2) || U.m.a(jVar, jVar2);
    }
}
