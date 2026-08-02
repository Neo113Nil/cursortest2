package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cvg extends jkp implements jlm {
    public static final cvg a;
    public String b = "";
    public jkx c = jlu.a;

    static {
        cvg cvgVar = new cvg();
        a = cvgVar;
        jkp.I(cvg.class, cvgVar);
    }

    private cvg() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"b", "c", cvl.class});
        }
        if (i2 == 3) {
            return new cvg();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(cvg.class);
        }
        throw null;
    }
}
