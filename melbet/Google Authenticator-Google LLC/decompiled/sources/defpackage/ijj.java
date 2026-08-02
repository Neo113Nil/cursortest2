package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class ijj extends jkp implements jlm {
    public static final ijj a;
    private int b;
    private ijz c;

    static {
        ijj ijjVar = new ijj();
        a = ijjVar;
        jkp.I(ijj.class, ijjVar);
    }

    private ijj() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new ijj();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ijj.class);
        }
        throw null;
    }
}
