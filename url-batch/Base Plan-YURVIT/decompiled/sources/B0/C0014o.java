package B0;

/* renamed from: B0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014o extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f100h;

    /* renamed from: i, reason: collision with root package name */
    public int f101i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0015p f102j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0014o(C0015p c0015p, I0.b bVar) {
        super(bVar);
        this.f102j = c0015p;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f100h = obj;
        this.f101i |= Integer.MIN_VALUE;
        return this.f102j.a(null, this);
    }
}
