package B;

import e2.InterfaceC0422a;

/* renamed from: B.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0018t extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0014o f446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f448g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ U f449h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f450i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0018t(C0014o c0014o, int i3, int i4, U u3, R1.f fVar) {
        super(0);
        this.f446e = c0014o;
        this.f447f = i3;
        this.f448g = i4;
        this.f449h = u3;
        this.f450i = fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [R1.f, java.lang.Object] */
    @Override // e2.InterfaceC0422a
    public final Object b() {
        int intValue = ((Number) this.f450i.getValue()).intValue();
        U u3 = this.f449h;
        boolean z3 = u3.d() == 1;
        C0014o c0014o = this.f446e;
        C0.H h3 = (C0.H) c0014o.f431e;
        int i3 = this.f447f;
        long k3 = h3.k(i3);
        int i4 = C0.J.f568c;
        int i5 = (int) (k3 >> 32);
        int e3 = h3.e(i5);
        int i6 = h3.f558b.f623f;
        if (e3 != intValue) {
            i5 = intValue >= i6 ? h3.h(i6 - 1) : h3.h(intValue);
        }
        int i7 = (int) (k3 & 4294967295L);
        if (h3.e(i7) != intValue) {
            i7 = intValue >= i6 ? h3.d(i6 - 1, false) : h3.d(intValue, false);
        }
        int i8 = this.f448g;
        if (i5 == i8) {
            return c0014o.a(i7);
        }
        if (i7 == i8) {
            return c0014o.a(i5);
        }
        if (!(u3.f318b ^ z3) ? i3 >= i5 : i3 > i7) {
            i5 = i7;
        }
        return c0014o.a(i5);
    }
}
