package o;

/* loaded from: classes.dex */
public final class Z extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public long f8737j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f8738k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H1.z f8739l;

    /* renamed from: m, reason: collision with root package name */
    public int f8740m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(H1.z zVar, E2.c cVar) {
        super(cVar);
        this.f8739l = zVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f8738k = obj;
        this.f8740m |= Integer.MIN_VALUE;
        return this.f8739l.a(0L, 0L, this);
    }
}
