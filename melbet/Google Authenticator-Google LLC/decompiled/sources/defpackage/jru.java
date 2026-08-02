package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jru implements jrw {
    private jsb a;

    public static void a(jru jruVar, jsb jsbVar) {
        if (jruVar.a != null) {
            throw new IllegalStateException();
        }
        jruVar.a = jsbVar;
    }

    @Override // defpackage.koe, defpackage.kod
    public final Object b() {
        jsb jsbVar = this.a;
        if (jsbVar != null) {
            return jsbVar.b();
        }
        throw new IllegalStateException();
    }
}
