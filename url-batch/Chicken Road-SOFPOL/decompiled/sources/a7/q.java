package a7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class q extends g6.a implements g6.e {

    /* renamed from: e, reason: collision with root package name */
    public static final p f293e = new p(g6.d.f3045d, new a4.a(1));

    public q() {
        super(g6.d.f3045d);
    }

    public abstract void h(g6.h hVar, Runnable runnable);

    public boolean i(g6.h hVar) {
        return !(this instanceof p1);
    }

    public q k(int i) {
        f7.a.a(i);
        return new f7.g(this, i);
    }

    @Override // g6.a, g6.h
    public final g6.f l(g6.g gVar) {
        g6.f fVar;
        q6.i.e(gVar, "key");
        if (gVar instanceof p) {
            p pVar = (p) gVar;
            g6.g gVar2 = this.f3042d;
            if ((gVar2 == pVar || pVar.f291e == gVar2) && (fVar = (g6.f) pVar.f290d.i(this)) != null) {
                return fVar;
            }
        } else if (g6.d.f3045d == gVar) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + x.g(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((g6.f) r3.f290d.i(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return g6.i.f3046d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (g6.d.f3045d == r3) goto L15;
     */
    @Override // g6.a, g6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g6.h v(g6.g gVar) {
        q6.i.e(gVar, "key");
        if (gVar instanceof p) {
            p pVar = (p) gVar;
            g6.g gVar2 = this.f3042d;
            if (gVar2 != pVar && pVar.f291e != gVar2) {
                return this;
            }
        }
    }
}
