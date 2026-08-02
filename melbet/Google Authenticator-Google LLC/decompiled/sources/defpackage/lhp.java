package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhp extends jkp implements jlm {
    public static final lhp a;
    private static volatile jlr h;
    public int b;
    public Object d;
    public boolean g;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        lhp lhpVar = new lhp();
        a = lhpVar;
        jkp.I(lhp.class, lhpVar);
    }

    private lhp() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        jlr jlrVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003:\u0000\u00045\u0000\u00054\u0000\u0006;\u0000\u0007=\u0000\bဇ\u0002", new Object[]{"d", "c", "b", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new lhp();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        jlr jlrVar2 = h;
        if (jlrVar2 != null) {
            return jlrVar2;
        }
        synchronized (lhp.class) {
            jlrVar = h;
            if (jlrVar == null) {
                jlrVar = new jkk(a);
                h = jlrVar;
            }
        }
        return jlrVar;
    }
}
