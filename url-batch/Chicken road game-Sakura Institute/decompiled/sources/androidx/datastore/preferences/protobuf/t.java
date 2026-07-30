package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class t implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public final v f913f;

    /* renamed from: g, reason: collision with root package name */
    public v f914g;

    public t(v vVar) {
        this.f913f = vVar;
        if (vVar.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f914g = vVar.i();
    }

    public final v a() {
        v b9 = b();
        b9.getClass();
        if (v.f(b9, true)) {
            return b9;
        }
        throw new h1();
    }

    public final v b() {
        if (!this.f914g.g()) {
            return this.f914g;
        }
        v vVar = this.f914g;
        vVar.getClass();
        v0 v0Var = v0.f916c;
        v0Var.getClass();
        v0Var.a(vVar.getClass()).e(vVar);
        vVar.h();
        return this.f914g;
    }

    public final void c() {
        if (this.f914g.g()) {
            return;
        }
        v i7 = this.f913f.i();
        v vVar = this.f914g;
        v0 v0Var = v0.f916c;
        v0Var.getClass();
        v0Var.a(i7.getClass()).b(i7, vVar);
        this.f914g = i7;
    }

    public final Object clone() {
        t tVar = (t) this.f913f.c(5);
        tVar.f914g = b();
        return tVar;
    }
}
