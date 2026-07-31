package h1;

/* renamed from: h1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0503v extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6198g;

    /* renamed from: h, reason: collision with root package name */
    public int f6199h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H1.b f6200i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0503v(H1.b bVar, V1.d dVar) {
        super(dVar);
        this.f6200i = bVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f6198g = obj;
        this.f6199h |= Integer.MIN_VALUE;
        return this.f6200i.e(null, this);
    }
}
