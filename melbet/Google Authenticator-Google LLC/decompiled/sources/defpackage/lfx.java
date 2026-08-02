package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfx extends jkp implements jlm {
    public static final lfx a;
    public int b;
    public int c = 0;
    public Object d;
    public long e;
    public jkb f;

    static {
        lfx lfxVar = new lfx();
        a = lfxVar;
        jkp.I(lfx.class, lfxVar);
    }

    private lfx() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"d", "c", "b", "e", "f", lfu.class, lfv.class, lft.class});
        }
        if (i2 == 3) {
            return new lfx();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lfx.class);
        }
        throw null;
    }
}
