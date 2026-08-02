package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjk extends jkp implements jlm {
    public static final cjk a;
    public int b;
    public double c;

    static {
        cjk cjkVar = new cjk();
        a = cjkVar;
        jkp.I(cjk.class, cjkVar);
    }

    private cjk() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001က\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new cjk();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(cjk.class);
        }
        throw null;
    }
}
