package t2;

import F.C0090d0;

/* renamed from: t2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1051d extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9015g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0090d0 f9016h;

    /* renamed from: i, reason: collision with root package name */
    public int f9017i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1051d(C0090d0 c0090d0, V1.d dVar) {
        super(dVar);
        this.f9016h = c0090d0;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f9015g = obj;
        this.f9017i |= Integer.MIN_VALUE;
        return this.f9016h.e(null, this);
    }
}
