package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jna extends jkp implements jlm {
    public static final jna a;
    public String b = "";
    public jkx c = jlu.a;

    static {
        jna jnaVar = new jna();
        a = jnaVar;
        jkp.I(jna.class, jnaVar);
    }

    private jna() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"b", "c", jnm.class});
        }
        if (i2 == 3) {
            return new jna();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jna.class);
        }
        throw null;
    }
}
