package K1;

import B.L;

/* loaded from: classes.dex */
public final class c extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3258g;

    /* renamed from: h, reason: collision with root package name */
    public int f3259h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L f3260i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(L l3, V1.d dVar) {
        super(dVar);
        this.f3260i = l3;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f3258g = obj;
        this.f3259h |= Integer.MIN_VALUE;
        return this.f3260i.e(null, this);
    }
}
