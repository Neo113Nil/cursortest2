package B1;

/* loaded from: classes.dex */
public final class H extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f960j;

    /* renamed from: k, reason: collision with root package name */
    public int f961k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F f962l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(F f4, C2.a aVar) {
        super(aVar);
        this.f962l = f4;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f960j = obj;
        this.f961k |= Integer.MIN_VALUE;
        return this.f962l.d(null, this);
    }
}
