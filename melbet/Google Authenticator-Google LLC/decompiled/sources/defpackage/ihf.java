package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihf extends jkp implements jlm {
    public static final ihf a;
    public int b;
    public ihh c;
    public ihk d;

    static {
        ihf ihfVar = new ihf();
        a = ihfVar;
        jkp.I(ihf.class, ihfVar);
    }

    private ihf() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0006ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ihf();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ihf.class);
        }
        throw null;
    }
}
