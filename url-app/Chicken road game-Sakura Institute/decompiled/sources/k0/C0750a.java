package k0;

import B1.C0097d;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0750a extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f7352j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0097d f7353k;

    /* renamed from: l, reason: collision with root package name */
    public int f7354l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0750a(C0097d c0097d, E2.c cVar) {
        super(cVar);
        this.f7353k = c0097d;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f7352j = obj;
        this.f7354l |= Integer.MIN_VALUE;
        return this.f7353k.f(0L, 0L, this);
    }
}
