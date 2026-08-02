package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lga extends jkp implements jlm {
    public static final lga a;
    public int b;
    public int c;
    public int d;

    static {
        lga lgaVar = new lga();
        a = lgaVar;
        jkp.I(lga.class, lgaVar);
    }

    private lga() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new lga();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lga.class);
        }
        throw null;
    }
}
