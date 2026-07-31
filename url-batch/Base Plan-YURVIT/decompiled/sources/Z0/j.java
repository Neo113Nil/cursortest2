package Z0;

import N.P;

/* loaded from: classes.dex */
public final class j extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1097h;

    /* renamed from: i, reason: collision with root package name */
    public int f1098i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f1099j;

    /* renamed from: k, reason: collision with root package name */
    public P f1100k;

    /* renamed from: l, reason: collision with root package name */
    public e f1101l;

    /* renamed from: m, reason: collision with root package name */
    public a1.n f1102m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(P p2, G0.d dVar) {
        super(dVar);
        this.f1099j = p2;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f1097h = obj;
        this.f1098i |= Integer.MIN_VALUE;
        return this.f1099j.m(null, this);
    }
}
