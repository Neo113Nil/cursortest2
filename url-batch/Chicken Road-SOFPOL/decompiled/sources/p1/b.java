package p1;

import c5.x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5716g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x f5717h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x xVar, i6.c cVar) {
        super(cVar);
        this.f5717h = xVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.f5716g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f5717h.h(0L, this);
    }
}
