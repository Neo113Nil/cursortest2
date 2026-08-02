package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgc extends jkp implements jlm {
    public static final lgc a;
    public int b;
    public int c = 0;
    public Object d;
    public int e;

    static {
        lgc lgcVar = new lgc();
        a = lgcVar;
        jkp.I(lgc.class, lgcVar);
    }

    private lgc() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0003\u0001\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002>\u0000\u0003᠌\u0001\u0004<\u0000", new Object[]{"d", "c", "b", "e", lgb.a, lga.class});
        }
        if (i2 == 3) {
            return new lgc();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lgc.class);
        }
        throw null;
    }
}
