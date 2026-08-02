package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cvk extends jkp implements jlm {
    public static final cvk a;
    public int b;
    public String c = "";

    static {
        cvk cvkVar = new cvk();
        a = cvkVar;
        jkp.I(cvk.class, cvkVar);
    }

    private cvk() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new cvk();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(cvk.class);
        }
        throw null;
    }
}
