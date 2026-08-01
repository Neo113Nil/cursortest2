package W;

import a.AbstractC0016a;
import d0.p;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: b, reason: collision with root package name */
    public final h f444b;

    public a(h hVar) {
        this.f444b = hVar;
    }

    @Override // W.i
    public final i c(i iVar) {
        return AbstractC0016a.w(this, iVar);
    }

    @Override // W.i
    public i e(h hVar) {
        return AbstractC0016a.v(this, hVar);
    }

    @Override // W.i
    public final Object f(Object obj, p pVar) {
        return pVar.e(obj, this);
    }

    @Override // W.g
    public final h getKey() {
        return this.f444b;
    }

    @Override // W.i
    public g k(h hVar) {
        return AbstractC0016a.k(this, hVar);
    }
}
