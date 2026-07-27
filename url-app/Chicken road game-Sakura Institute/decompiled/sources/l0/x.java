package l0;

import W2.r0;

/* loaded from: classes.dex */
public final class x extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public r0 f7952j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f7953k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0800A f7954l;

    /* renamed from: m, reason: collision with root package name */
    public int f7955m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C0800A c0800a, E2.a aVar) {
        super(aVar);
        this.f7954l = c0800a;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f7953k = obj;
        this.f7955m |= Integer.MIN_VALUE;
        return this.f7954l.f(0L, null, this);
    }
}
