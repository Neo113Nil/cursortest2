package m6;

import y5.g;

/* loaded from: classes.dex */
final class i2 implements g.b, g.c<i2> {

    /* renamed from: f, reason: collision with root package name */
    public static final i2 f19292f = new i2();

    private i2() {
    }

    @Override // y5.g
    public <R> R fold(R r7, f6.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r7, pVar);
    }

    @Override // y5.g.b, y5.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // y5.g.b
    public g.c<?> getKey() {
        return this;
    }

    @Override // y5.g
    public y5.g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // y5.g
    public y5.g plus(y5.g gVar) {
        return g.b.a.d(this, gVar);
    }
}
