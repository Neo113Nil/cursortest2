package m0;

import G1.m;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0641a extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6915g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m f6916h;

    /* renamed from: i, reason: collision with root package name */
    public int f6917i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0641a(m mVar, X1.c cVar) {
        super(cVar);
        this.f6916h = mVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f6915g = obj;
        this.f6917i |= Integer.MIN_VALUE;
        return this.f6916h.d(0L, 0L, this);
    }
}
