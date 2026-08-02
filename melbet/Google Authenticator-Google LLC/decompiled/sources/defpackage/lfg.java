package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfg extends jkp implements jlm {
    public static final lfg a;
    public int b;
    public String c = "";
    public jkw d = jlh.a;

    static {
        lfg lfgVar = new lfg();
        a = lfgVar;
        jkp.I(lfg.class, lfgVar);
    }

    private lfg() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003(", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new lfg();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lfg.class);
        }
        throw null;
    }
}
