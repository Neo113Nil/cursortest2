package t0;

import I.C0174t;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public U.p f8676a;

    /* renamed from: b, reason: collision with root package name */
    public int f8677b;

    /* renamed from: c, reason: collision with root package name */
    public K.d f8678c;

    /* renamed from: d, reason: collision with root package name */
    public K.d f8679d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8680e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0174t f8681f;

    public W(C0174t c0174t, U.p pVar, int i3, K.d dVar, K.d dVar2, boolean z3) {
        this.f8681f = c0174t;
        this.f8676a = pVar;
        this.f8677b = i3;
        this.f8678c = dVar;
        this.f8679d = dVar2;
        this.f8680e = z3;
    }

    public final boolean a(int i3, int i4) {
        K.d dVar = this.f8678c;
        int i5 = this.f8677b;
        U.o oVar = (U.o) dVar.f3214d[i3 + i5];
        U.o oVar2 = (U.o) this.f8679d.f3214d[i5 + i4];
        X x3 = Y.f8682a;
        return f2.j.a(oVar, oVar2) || U.a.a(oVar, oVar2);
    }
}
