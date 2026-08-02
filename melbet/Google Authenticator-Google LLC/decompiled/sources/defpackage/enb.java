package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class enb extends jkp implements jlm {
    public static final enb a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public float f;
    private int g;

    static {
        enb enbVar = new enb();
        a = enbVar;
        jkp.I(enb.class, enbVar);
    }

    private enb() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ခ\u0004", new Object[]{"g", "b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new enb();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(enb.class);
        }
        throw null;
    }
}
