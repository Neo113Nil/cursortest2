package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgs extends jkp implements jlm {
    public static final lgs a;
    public jkt b;
    public jkt c;

    static {
        lgs lgsVar = new lgs();
        a = lgsVar;
        jkp.I(lgs.class, lgsVar);
    }

    private lgs() {
        jkq jkqVar = jkq.a;
        this.b = jkqVar;
        this.c = jkqVar;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new lgs();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lgs.class);
        }
        throw null;
    }
}
