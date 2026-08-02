package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gvz {
    public final guq a;

    private gvz(guq guqVar) {
        this.a = guqVar;
    }

    public static gvz b() {
        return new gvz(gta.d(false));
    }

    public static gvz c() {
        return new gvz(gta.j);
    }

    public static Runnable d(gvz gvzVar, Runnable runnable) {
        guq guqVar = gvzVar.a;
        guqVar.getClass();
        long j = gvx.a;
        guqVar.getClass();
        return new gvs(guqVar, runnable);
    }

    public final gut a() {
        guq guqVar = this.a;
        guq b = gta.b();
        gta.f(guqVar);
        return new gsg((Object) b, 7);
    }

    public final boolean e() {
        return this.a == null;
    }

    public final String toString() {
        guq guqVar = this.a;
        return guqVar == null ? "null ref" : guqVar.toString();
    }
}
