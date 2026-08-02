package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhq extends jkp implements jlm {
    public static final lhq a;
    private static volatile jlr c;
    public jkx b = jlu.a;

    static {
        lhq lhqVar = new lhq();
        a = lhqVar;
        jkp.I(lhq.class, lhqVar);
    }

    private lhq() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        jlr jlrVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"b", lhp.class});
        }
        if (i2 == 3) {
            return new lhq();
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
        synchronized (lhq.class) {
            jlrVar = c;
            if (jlrVar == null) {
                jlrVar = new jkk(a);
                c = jlrVar;
            }
        }
        return jlrVar;
    }
}
