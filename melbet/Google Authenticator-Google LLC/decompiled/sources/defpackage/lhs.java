package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhs extends jkp implements jlm {
    public static final lhs a;
    private static volatile jlr c;
    public jli b = jli.a;

    static {
        lhs lhsVar = new lhs();
        a = lhsVar;
        jkp.I(lhs.class, lhsVar);
    }

    private lhs() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        jlr jlrVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", lhr.a});
        }
        if (i2 == 3) {
            return new lhs();
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
        jlr jlrVar2 = c;
        if (jlrVar2 != null) {
            return jlrVar2;
        }
        synchronized (lhs.class) {
            jlrVar = c;
            if (jlrVar == null) {
                jlrVar = new jkk(a);
                c = jlrVar;
            }
        }
        return jlrVar;
    }
}
