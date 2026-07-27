package f1;

/* loaded from: classes.dex */
public final class L extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public M2.C f6508j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f6509k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f6510l;

    /* renamed from: m, reason: collision with root package name */
    public int f6511m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(N n2, E2.c cVar) {
        super(cVar);
        this.f6510l = n2;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f6509k = obj;
        this.f6511m |= Integer.MIN_VALUE;
        return this.f6510l.h(null, false, this);
    }
}
