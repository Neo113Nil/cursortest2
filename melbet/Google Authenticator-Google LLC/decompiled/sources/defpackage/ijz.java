package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijz extends jkp implements jlm {
    public static final ijz a;
    public int b;
    public hpq c;
    private iiw d;

    static {
        ijz ijzVar = new ijz();
        a = ijzVar;
        jkp.I(ijz.class, ijzVar);
    }

    private ijz() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ijz();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ijz.class);
        }
        throw null;
    }
}
