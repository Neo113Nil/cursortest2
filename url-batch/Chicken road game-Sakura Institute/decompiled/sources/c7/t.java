package c7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class t extends h6.a implements h6.f {

    /* renamed from: g, reason: collision with root package name */
    public static final s f1744g = new s(h6.e.f4660f, new r(0));

    public t() {
        super(h6.e.f4660f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((h6.g) r3.f1738f.f(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return h6.j.f4661f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (h6.e.f4660f == r3) goto L15;
     */
    @Override // h6.a, h6.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h6.i F(h6.h hVar) {
        r6.k.f(hVar, "key");
        if (hVar instanceof s) {
            s sVar = (s) hVar;
            h6.h hVar2 = this.f4654f;
            if (hVar2 != sVar && sVar.f1739g != hVar2) {
                return this;
            }
        }
    }

    public abstract void V(h6.i iVar, Runnable runnable);

    public void W(h6.i iVar, Runnable runnable) {
        V(iVar, runnable);
    }

    public boolean X(h6.i iVar) {
        return !(this instanceof t1);
    }

    public t Y(int i7) {
        h7.a.a(i7);
        return new h7.g(this, i7);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + a0.i(this);
    }

    @Override // h6.a, h6.i
    public final h6.g u(h6.h hVar) {
        h6.g gVar;
        r6.k.f(hVar, "key");
        if (hVar instanceof s) {
            s sVar = (s) hVar;
            h6.h hVar2 = this.f4654f;
            if ((hVar2 == sVar || sVar.f1739g == hVar2) && (gVar = (h6.g) sVar.f1738f.f(this)) != null) {
                return gVar;
            }
        } else if (h6.e.f4660f == hVar) {
            return this;
        }
        return null;
    }
}
