package u2;

import m0.s;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends q6.j implements p6.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0.m f7318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p6.e f7319f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7320g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(y0.m mVar, p6.e eVar, int i) {
        super(2);
        this.f7318e = mVar;
        this.f7319f = eVar;
        this.f7320g = i;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int w7 = m0.b.w(this.f7320g | 1);
        r2.o.e(this.f7318e, this.f7319f, (s) obj, w7);
        return c6.m.f1757a;
    }
}
