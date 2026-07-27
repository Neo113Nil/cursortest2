package E;

import A.M;

/* loaded from: classes.dex */
public final class d extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f2181j;

    /* renamed from: k, reason: collision with root package name */
    public int f2182k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ M f2183l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(M m4, C2.a aVar) {
        super(aVar);
        this.f2183l = m4;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f2181j = obj;
        this.f2182k |= Integer.MIN_VALUE;
        return this.f2183l.d(null, this);
    }
}
