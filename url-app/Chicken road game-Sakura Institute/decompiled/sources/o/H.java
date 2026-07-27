package o;

import p.C0926b;

/* loaded from: classes.dex */
public final class H extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public C0891i0 f8627j;

    /* renamed from: k, reason: collision with root package name */
    public C0911t f8628k;

    /* renamed from: l, reason: collision with root package name */
    public C0926b f8629l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f8630m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0891i0 f8631n;

    /* renamed from: o, reason: collision with root package name */
    public int f8632o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C0891i0 c0891i0, E2.c cVar) {
        super(cVar);
        this.f8631n = c0891i0;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f8630m = obj;
        this.f8632o |= Integer.MIN_VALUE;
        return C0891i0.F0(this.f8631n, null, this);
    }
}
