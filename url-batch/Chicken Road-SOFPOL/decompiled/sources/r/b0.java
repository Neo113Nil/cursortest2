package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b0 extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ float f6227h;

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        return ((b0) l((g6.c) obj2, Float.valueOf(((Number) obj).floatValue()))).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        b0 b0Var = new b0(2, cVar);
        b0Var.f6227h = ((Number) obj).floatValue();
        return b0Var;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        s6.a.K(obj);
        return Boolean.valueOf(this.f6227h > 0.0f);
    }
}
