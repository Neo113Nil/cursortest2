package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class u implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final w f782d;

    /* renamed from: e, reason: collision with root package name */
    public w f783e;

    public u(w wVar) {
        this.f782d = wVar;
        if (wVar.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f783e = wVar.i();
    }

    public final w a() {
        w b8 = b();
        b8.getClass();
        if (w.f(b8, true)) {
            return b8;
        }
        throw new d1();
    }

    public final w b() {
        if (!this.f783e.g()) {
            return this.f783e;
        }
        w wVar = this.f783e;
        wVar.getClass();
        u0 u0Var = u0.f784c;
        u0Var.getClass();
        u0Var.a(wVar.getClass()).d(wVar);
        wVar.h();
        return this.f783e;
    }

    public final void c() {
        if (this.f783e.g()) {
            return;
        }
        w i = this.f782d.i();
        w wVar = this.f783e;
        u0 u0Var = u0.f784c;
        u0Var.getClass();
        u0Var.a(i.getClass()).a(i, wVar);
        this.f783e = i;
    }

    public final Object clone() {
        u uVar = (u) this.f782d.c(5);
        uVar.f783e = b();
        return uVar;
    }
}
