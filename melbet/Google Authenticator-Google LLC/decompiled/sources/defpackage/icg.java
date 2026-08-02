package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class icg extends jkp implements jlm {
    public static final icg a;
    public static final iwq c;
    public jkx b = jlu.a;

    static {
        icg icgVar = new icg();
        a = icgVar;
        jkp.I(icg.class, icgVar);
        c = jkp.O(job.a, icgVar, icgVar, 198889211, jmr.MESSAGE);
    }

    private icg() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new icg();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(icg.class);
        }
        throw null;
    }
}
