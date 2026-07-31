package m0;

import G1.m;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0642b extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6918g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m f6919h;

    /* renamed from: i, reason: collision with root package name */
    public int f6920i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0642b(m mVar, X1.c cVar) {
        super(cVar);
        this.f6919h = mVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f6918g = obj;
        this.f6920i |= Integer.MIN_VALUE;
        return this.f6919h.e(0L, this);
    }
}
