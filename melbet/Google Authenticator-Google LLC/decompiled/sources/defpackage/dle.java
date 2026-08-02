package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dle extends jkp implements jlm {
    public static final dle a;
    public int b;
    public String c = "";
    public int d;

    static {
        dle dleVar = new dle();
        a = dleVar;
        jkp.I(dle.class, dleVar);
    }

    private dle() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", bmw.f});
        }
        if (i2 == 3) {
            return new dle();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(dle.class);
        }
        throw null;
    }
}
