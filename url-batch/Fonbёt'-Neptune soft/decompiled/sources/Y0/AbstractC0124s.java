package Y0;

/* renamed from: Y0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0124s extends H0.a implements H0.f {

    /* renamed from: f, reason: collision with root package name */
    public static final r f1228f = new r(H0.e.f502e, C0123q.f1225f);

    public AbstractC0124s() {
        super(H0.e.f502e);
    }

    public abstract void c(H0.i iVar, Runnable runnable);

    /* JADX WARN: Type inference failed for: r4v2, types: [P0.l, Q0.i] */
    @Override // H0.a, H0.i
    public final H0.i d(H0.h hVar) {
        Q0.h.e(hVar, "key");
        boolean z2 = hVar instanceof r;
        H0.j jVar = H0.j.f503e;
        if (z2) {
            r rVar = (r) hVar;
            H0.h hVar2 = this.f496e;
            if ((hVar2 == rVar || rVar.f1227f == hVar2) && ((H0.g) rVar.f1226e.i(this)) != null) {
                return jVar;
            }
        } else if (H0.e.f502e == hVar) {
            return jVar;
        }
        return this;
    }

    public boolean e() {
        return !(this instanceof i0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [P0.l, Q0.i] */
    @Override // H0.a, H0.i
    public final H0.g k(H0.h hVar) {
        Q0.h.e(hVar, "key");
        if (!(hVar instanceof r)) {
            if (H0.e.f502e == hVar) {
                return this;
            }
            return null;
        }
        r rVar = (r) hVar;
        H0.h hVar2 = this.f496e;
        if (hVar2 != rVar && rVar.f1227f != hVar2) {
            return null;
        }
        H0.g gVar = (H0.g) rVar.f1226e.i(this);
        if (gVar instanceof H0.g) {
            return gVar;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0127v.b(this);
    }
}
