package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jop extends jkp implements jlm {
    public static final jop a;
    public jkx b = jlu.a;

    static {
        jop jopVar = new jop();
        a = jopVar;
        jkp.I(jop.class, jopVar);
    }

    private jop() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", joo.class});
        }
        if (i2 == 3) {
            return new jop();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jop.class);
        }
        throw null;
    }
}
