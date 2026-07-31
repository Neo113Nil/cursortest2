package x1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c2 implements d7.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8392e;

    public /* synthetic */ c2(int i, Object obj) {
        this.f8391d = i;
        this.f8392e = obj;
    }

    @Override // d7.g
    public final Object a(Object obj, g6.c cVar) {
        switch (this.f8391d) {
            case 0:
                ((m1) this.f8392e).f8509d.h(((Number) obj).floatValue());
                break;
            default:
                y3.b0 b0Var = (y3.b0) this.f8392e;
                if ((b0Var.f8845j.i() instanceof y3.k0) || (r2 = y3.b0.e(b0Var, true, cVar)) != h6.a.f3204d) {
                    break;
                }
                break;
        }
        return c6.m.f1757a;
    }
}
