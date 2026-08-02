package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jse implements jsb {
    private static final Object a = new Object();
    private volatile jsb b;
    private volatile Object c = a;

    private jse(jsb jsbVar) {
        this.b = jsbVar;
    }

    public static jsb a(jsb jsbVar) {
        return ((jsbVar instanceof jse) || (jsbVar instanceof jrv)) ? jsbVar : new jse(jsbVar);
    }

    @Override // defpackage.koe, defpackage.kod
    public final Object b() {
        Object obj = this.c;
        if (obj != a) {
            return obj;
        }
        jsb jsbVar = this.b;
        if (jsbVar == null) {
            return this.c;
        }
        Object b = jsbVar.b();
        this.c = b;
        this.b = null;
        return b;
    }
}
