package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihi extends jkp implements jlm {
    public static final ihi a;
    public jkt b = jkq.a;
    public jkx c = jlu.a;

    static {
        ihi ihiVar = new ihi();
        a = ihiVar;
        jkp.I(ihi.class, ihiVar);
    }

    private ihi() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002\u001a", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new ihi();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ihi.class);
        }
        throw null;
    }
}
