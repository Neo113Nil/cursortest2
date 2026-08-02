package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ich extends jkp implements jlm {
    public static final ich a;
    public static final iwq d;
    public int b;
    public jjq c = jjq.d;

    static {
        ich ichVar = new ich();
        a = ichVar;
        jkp.I(ich.class, ichVar);
        d = jkp.O(job.a, ichVar, ichVar, 202735639, jmr.MESSAGE);
    }

    private ich() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new ich();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ich.class);
        }
        throw null;
    }
}
