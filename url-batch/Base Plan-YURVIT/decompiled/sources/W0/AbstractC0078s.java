package W0;

/* renamed from: W0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0078s extends G0.a implements G0.f {

    /* renamed from: f, reason: collision with root package name */
    public static final r f972f = new r(G0.e.f499e, C0077q.f969f);

    public AbstractC0078s() {
        super(G0.e.f499e);
    }

    public abstract void c(G0.i iVar, Runnable runnable);

    public boolean d() {
        return !(this instanceof i0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((G0.g) r3.f970e.j(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return G0.j.f500e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (G0.e.f499e == r3) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [O0.l, P0.i] */
    @Override // G0.a, G0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final G0.i i(G0.h hVar) {
        P0.h.e(hVar, "key");
        if (hVar instanceof r) {
            r rVar = (r) hVar;
            G0.h hVar2 = this.f495e;
            if (hVar2 != rVar && rVar.f971f != hVar2) {
                return this;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [O0.l, P0.i] */
    @Override // G0.a, G0.i
    public final G0.g m(G0.h hVar) {
        G0.g gVar;
        P0.h.e(hVar, "key");
        if (hVar instanceof r) {
            r rVar = (r) hVar;
            G0.h hVar2 = this.f495e;
            if ((hVar2 == rVar || rVar.f971f == hVar2) && (gVar = (G0.g) rVar.f970e.j(this)) != null) {
                return gVar;
            }
        } else if (G0.e.f499e == hVar) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0081v.b(this);
    }
}
