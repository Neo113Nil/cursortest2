package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnd extends jkp implements jlm {
    public static final jnd a;
    public int b;
    public String c = "";
    public jne d;
    public jnf e;

    static {
        jnd jndVar = new jnd();
        a = jndVar;
        jkp.I(jnd.class, jndVar);
    }

    private jnd() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new jnd();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jnd.class);
        }
        throw null;
    }
}
