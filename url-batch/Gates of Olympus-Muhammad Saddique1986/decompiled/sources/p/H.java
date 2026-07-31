package p;

import q.C0806b;

/* loaded from: classes.dex */
public final class H extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public C0776m0 f7521g;

    /* renamed from: h, reason: collision with root package name */
    public C0788t f7522h;

    /* renamed from: i, reason: collision with root package name */
    public C0806b f7523i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f7524j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0776m0 f7525k;

    /* renamed from: l, reason: collision with root package name */
    public int f7526l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C0776m0 c0776m0, X1.c cVar) {
        super(cVar);
        this.f7525k = c0776m0;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f7524j = obj;
        this.f7526l |= Integer.MIN_VALUE;
        return C0776m0.C0(this.f7525k, null, this);
    }
}
