package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgi extends jkp implements jlm {
    public static final lgi a;
    public int b;
    public int c;
    public int d;
    public jkt e;
    public jkt f;

    static {
        lgi lgiVar = new lgi();
        a = lgiVar;
        jkp.I(lgi.class, lgiVar);
    }

    private lgi() {
        jkq jkqVar = jkq.a;
        this.e = jkqVar;
        this.f = jkqVar;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003'\u0004'", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new lgi();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lgi.class);
        }
        throw null;
    }
}
