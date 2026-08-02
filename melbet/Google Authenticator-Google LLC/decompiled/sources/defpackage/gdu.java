package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gdu implements jrw {
    private final jsb a;
    private final jsb b;

    public gdu(jsb jsbVar, jsb jsbVar2) {
        this.a = jsbVar;
        this.b = jsbVar2;
    }

    public static cbp c(Object obj) {
        return new cbp((iwq) obj);
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cbp b() {
        jsb jsbVar = this.b;
        Object b = this.a.b();
        return c(b);
    }
}
