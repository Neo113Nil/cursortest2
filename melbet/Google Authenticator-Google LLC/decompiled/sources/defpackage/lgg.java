package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgg extends jkp implements jlm {
    public static final lgg a;
    private int b;
    private hrh c;
    private byte d = 2;

    static {
        lgg lggVar = new lgg();
        a = lggVar;
        jkp.I(lgg.class, lggVar);
    }

    private lgg() {
        jlu jluVar = jlu.a;
        jlh jlhVar = jlh.a;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0003", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new lgg();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lgg.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
