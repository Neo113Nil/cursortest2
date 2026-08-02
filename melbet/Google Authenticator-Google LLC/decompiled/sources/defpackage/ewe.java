package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewe extends jkp implements jlm {
    public static final ewe a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        ewe eweVar = new ewe();
        a = eweVar;
        jkp.I(ewe.class, eweVar);
    }

    private ewe() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (i2 == 3) {
            return new ewe();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ewe.class);
        }
        throw null;
    }
}
