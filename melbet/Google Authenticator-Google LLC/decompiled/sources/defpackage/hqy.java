package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hqy extends jkp implements jlm {
    public static final hqy a;
    public int b;
    public boolean c;
    public long d;

    static {
        hqy hqyVar = new hqy();
        a = hqyVar;
        jkp.I(hqy.class, hqyVar);
    }

    private hqy() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new hqy();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(hqy.class);
        }
        throw null;
    }
}
