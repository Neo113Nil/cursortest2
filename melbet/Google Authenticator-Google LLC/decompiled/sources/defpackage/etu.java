package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class etu extends jkp implements jlm {
    public static final etu a;
    public long e;
    private int g;
    public jli f = jli.a;
    public String b = "";
    public jjq c = jjq.d;
    public String d = "";

    static {
        etu etuVar = new etu();
        a = etuVar;
        jkp.I(etu.class, etuVar);
    }

    private etu() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"g", "b", "c", "d", "e", "f", new ikk(jmr.STRING, "", jmr.MESSAGE, eto.a)});
        }
        if (i2 == 3) {
            return new etu();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(etu.class);
        }
        throw null;
    }
}
