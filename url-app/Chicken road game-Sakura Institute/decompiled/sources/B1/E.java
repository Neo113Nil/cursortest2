package B1;

/* loaded from: classes.dex */
public final class E extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f951j;

    /* renamed from: k, reason: collision with root package name */
    public int f952k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F f953l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f4, C2.a aVar) {
        super(aVar);
        this.f953l = f4;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f951j = obj;
        this.f952k |= Integer.MIN_VALUE;
        return this.f953l.d(null, this);
    }
}
