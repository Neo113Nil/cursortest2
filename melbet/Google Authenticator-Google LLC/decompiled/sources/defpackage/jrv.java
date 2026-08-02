package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrv implements jsb, jpt {
    private static final Object a = new Object();
    private volatile jsb b;
    private volatile Object c = a;

    private jrv(jsb jsbVar) {
        this.b = jsbVar;
    }

    public static jpt a(jsb jsbVar) {
        if (jsbVar instanceof jpt) {
            return (jpt) jsbVar;
        }
        jsbVar.getClass();
        return new jrv(jsbVar);
    }

    public static jsb c(jsb jsbVar) {
        jsbVar.getClass();
        return jsbVar instanceof jrv ? jsbVar : new jrv(jsbVar);
    }

    private final synchronized Object d() {
        Object obj = this.c;
        Object obj2 = a;
        if (obj != obj2) {
            return obj;
        }
        Object b = this.b.b();
        Object obj3 = this.c;
        if (obj3 != obj2 && obj3 != b) {
            throw new IllegalStateException(a.ac(b, obj3, "Scoped provider was invoked recursively returning different results: ", " & ", ". This is likely due to a circular dependency."));
        }
        this.c = b;
        this.b = null;
        return b;
    }

    @Override // defpackage.koe, defpackage.kod
    public final Object b() {
        Object obj = this.c;
        return obj == a ? d() : obj;
    }
}
