package k0;

/* renamed from: k0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0057p extends W.a implements W.f {

    /* renamed from: c, reason: collision with root package name */
    public static final C0056o f881c = new C0056o(W.e.f393b, C0055n.f878c);

    public AbstractC0057p() {
        super(W.e.f393b);
    }

    public abstract void d(W.i iVar, Runnable runnable);

    @Override // W.a, W.i
    public final W.i e(W.h hVar) {
        e0.h.e(hVar, "key");
        boolean z2 = hVar instanceof C0056o;
        W.j jVar = W.j.f394b;
        if (z2) {
            C0056o c0056o = (C0056o) hVar;
            W.h hVar2 = this.f389b;
            if ((hVar2 == c0056o || c0056o.f880c == hVar2) && c0056o.a(this) != null) {
                return jVar;
            }
        } else if (W.e.f393b == hVar) {
            return jVar;
        }
        return this;
    }

    public boolean g() {
        return !(this instanceof b0);
    }

    @Override // W.a, W.i
    public final W.g k(W.h hVar) {
        W.g a2;
        e0.h.e(hVar, "key");
        if (!(hVar instanceof C0056o)) {
            if (W.e.f393b == hVar) {
                return this;
            }
            return null;
        }
        C0056o c0056o = (C0056o) hVar;
        W.h hVar2 = this.f389b;
        if ((hVar2 == c0056o || c0056o.f880c == hVar2) && (a2 = c0056o.a(this)) != null) {
            return a2;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0060t.a(this);
    }
}
