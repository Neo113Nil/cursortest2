package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewz extends jkp implements jlm {
    public static final ewz a;
    public int b;
    public jjq c = jjq.d;
    private int d;

    static {
        ewz ewzVar = new ewz();
        a = ewzVar;
        jkp.I(ewz.class, ewzVar);
    }

    private ewz() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0004ည\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new ewz();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ewz.class);
        }
        throw null;
    }
}
