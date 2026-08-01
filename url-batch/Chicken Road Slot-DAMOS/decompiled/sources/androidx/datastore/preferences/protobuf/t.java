package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class t implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final v f634d;

    /* renamed from: e, reason: collision with root package name */
    public v f635e;

    public t(v vVar) {
        this.f634d = vVar;
        if (vVar.g()) {
            te.a1.e("Default instance must be immutable.");
            throw null;
        }
        this.f635e = vVar.i();
    }

    public final v a() {
        v b10 = b();
        b10.getClass();
        if (v.f(b10, true)) {
            return b10;
        }
        throw new c1();
    }

    public final v b() {
        boolean g = this.f635e.g();
        v vVar = this.f635e;
        if (!g) {
            return vVar;
        }
        vVar.getClass();
        t0 t0Var = t0.f636c;
        t0Var.getClass();
        t0Var.a(vVar.getClass()).d(vVar);
        vVar.h();
        return this.f635e;
    }

    public final void c() {
        if (this.f635e.g()) {
            return;
        }
        v i3 = this.f634d.i();
        v vVar = this.f635e;
        t0 t0Var = t0.f636c;
        t0Var.getClass();
        t0Var.a(i3.getClass()).a(i3, vVar);
        this.f635e = i3;
    }

    public final Object clone() {
        t tVar = (t) this.f634d.c(5);
        tVar.f635e = b();
        return tVar;
    }
}
