package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgl extends jkp implements jlm {
    public static final lgl a;
    public jkw b;
    public jkw c;
    public jkt d;
    public jkt e;
    public jkt f;
    public jkx g;

    static {
        lgl lglVar = new lgl();
        a = lglVar;
        jkp.I(lgl.class, lglVar);
    }

    private lgl() {
        jlh jlhVar = jlh.a;
        this.b = jlhVar;
        this.c = jlhVar;
        jkq jkqVar = jkq.a;
        this.d = jkqVar;
        this.e = jkqVar;
        this.f = jkqVar;
        this.g = jlu.a;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0006\u0000\u0001%\u0002%\u0003'\u0004'\u0005'\u0006\u001a", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new lgl();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lgl.class);
        }
        throw null;
    }
}
