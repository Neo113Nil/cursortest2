package M0;

/* renamed from: M0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0060s extends w0.a implements w0.f {

    /* renamed from: f, reason: collision with root package name */
    public static final r f685f = new r(w0.e.f3081e, C0059q.f682f);

    public AbstractC0060s() {
        super(w0.e.f3081e);
    }

    public abstract void c(w0.i iVar, Runnable runnable);

    public boolean d() {
        return !(this instanceof i0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [E0.l, F0.j] */
    @Override // w0.a, w0.i
    public final w0.g f(w0.h hVar) {
        w0.g gVar;
        F0.i.e(hVar, "key");
        if (!(hVar instanceof r)) {
            if (w0.e.f3081e == hVar) {
                return this;
            }
            return null;
        }
        r rVar = (r) hVar;
        w0.h hVar2 = this.f3077e;
        if ((hVar2 == rVar || rVar.f684f == hVar2) && (gVar = (w0.g) rVar.f683e.i(this)) != null) {
            return gVar;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [E0.l, F0.j] */
    @Override // w0.a, w0.i
    public final w0.i i(w0.h hVar) {
        F0.i.e(hVar, "key");
        boolean z2 = hVar instanceof r;
        w0.j jVar = w0.j.f3082e;
        if (z2) {
            r rVar = (r) hVar;
            w0.h hVar2 = this.f3077e;
            if ((hVar2 == rVar || rVar.f684f == hVar2) && ((w0.g) rVar.f683e.i(this)) != null) {
                return jVar;
            }
        } else if (w0.e.f3081e == hVar) {
            return jVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0063v.b(this);
    }
}
