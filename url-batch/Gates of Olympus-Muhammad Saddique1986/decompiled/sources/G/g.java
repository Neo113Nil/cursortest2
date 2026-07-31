package G;

import B.L;

/* loaded from: classes.dex */
public final class g extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1997g;

    /* renamed from: h, reason: collision with root package name */
    public int f1998h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L f1999i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(L l3, V1.d dVar) {
        super(dVar);
        this.f1999i = l3;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f1997g = obj;
        this.f1998h |= Integer.MIN_VALUE;
        return this.f1999i.e(null, this);
    }
}
