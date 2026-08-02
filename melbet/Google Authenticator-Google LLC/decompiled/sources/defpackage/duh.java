package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class duh {
    public final jpt a;
    private final jpt b;
    private final jpt c;
    private final jpt d;

    public duh(jpt jptVar, jpt jptVar2, jpt jptVar3, jpt jptVar4) {
        this.b = jptVar;
        this.c = jptVar2;
        this.d = jptVar3;
        this.a = jptVar4;
    }

    public final duo a() {
        Object b = this.c.b();
        b.getClass();
        return (duo) b;
    }

    public final duq b() {
        Object b = this.b.b();
        b.getClass();
        return (duq) b;
    }

    public final iyh c() {
        Object b = this.d.b();
        b.getClass();
        return (iyh) b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof duh)) {
            return false;
        }
        duh duhVar = (duh) obj;
        return ksp.b(this.b, duhVar.b) && ksp.b(this.c, duhVar.c) && ksp.b(this.d, duhVar.d) && ksp.b(this.a, duhVar.a);
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "FragmentInjectables(viewModelDataLazy=" + this.b + ", renderingObjectsLazy=" + this.c + ", bentoIntentLauncherBinderLazy=" + this.d + ", onResultEventHandlerLazy=" + this.a + ")";
    }
}
