package n0;

import m0.r;

/* loaded from: classes.dex */
public final class a extends Y.b {

    /* renamed from: e, reason: collision with root package name */
    public r f1082e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1083f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f1084g;

    /* renamed from: h, reason: collision with root package name */
    public int f1085h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Y.b bVar2) {
        super(bVar2);
        this.f1084g = bVar;
    }

    @Override // Y.b
    public final Object c(Object obj) {
        this.f1083f = obj;
        this.f1085h |= Integer.MIN_VALUE;
        return this.f1084g.b(null, this);
    }
}
