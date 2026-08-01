package k0;

/* renamed from: k0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0055p extends W.a implements W.f {

    /* renamed from: c, reason: collision with root package name */
    public static final C0054o f934c = new C0054o(W.e.f448b, C0053n.f931c);

    public AbstractC0055p() {
        super(W.e.f448b);
    }

    public abstract void d(W.i iVar, Runnable runnable);

    @Override // W.a, W.i
    public final W.i e(W.h hVar) {
        e0.h.e(hVar, "key");
        boolean z = hVar instanceof C0054o;
        W.j jVar = W.j.f449b;
        if (z) {
            C0054o c0054o = (C0054o) hVar;
            W.h hVar2 = this.f444b;
            if ((hVar2 == c0054o || c0054o.f933c == hVar2) && c0054o.a(this) != null) {
                return jVar;
            }
        } else if (W.e.f448b == hVar) {
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
        if (!(hVar instanceof C0054o)) {
            if (W.e.f448b == hVar) {
                return this;
            }
            return null;
        }
        C0054o c0054o = (C0054o) hVar;
        W.h hVar2 = this.f444b;
        if ((hVar2 == c0054o || c0054o.f933c == hVar2) && (a2 = c0054o.a(this)) != null) {
            return a2;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0058t.a(this);
    }
}
