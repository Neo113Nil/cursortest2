package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dfg extends jkp implements jlm {
    public static final dfg a;
    public int b;
    public boolean c;
    public int d;

    static {
        dfg dfgVar = new dfg();
        a = dfgVar;
        jkp.I(dfg.class, dfgVar);
    }

    private dfg() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", bmw.e});
        }
        if (i2 == 3) {
            return new dfg();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(dfg.class);
        }
        throw null;
    }
}
