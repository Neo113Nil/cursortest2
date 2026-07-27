package k0;

import B1.C0097d;

/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0751b extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f7355j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0097d f7356k;

    /* renamed from: l, reason: collision with root package name */
    public int f7357l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0751b(C0097d c0097d, E2.c cVar) {
        super(cVar);
        this.f7356k = c0097d;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f7355j = obj;
        this.f7357l |= Integer.MIN_VALUE;
        return this.f7356k.g(0L, this);
    }
}
