package Z2;

import W2.InterfaceC0280c0;

/* loaded from: classes.dex */
public final class F extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public G f4617j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0331g f4618k;

    /* renamed from: l, reason: collision with root package name */
    public I f4619l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0280c0 f4620m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f4621n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ G f4622o;

    /* renamed from: p, reason: collision with root package name */
    public int f4623p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(G g4, C2.a aVar) {
        super(aVar);
        this.f4622o = g4;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f4621n = obj;
        this.f4623p |= Integer.MIN_VALUE;
        G.m(this.f4622o, null, this);
        return D2.a.f2163d;
    }
}
