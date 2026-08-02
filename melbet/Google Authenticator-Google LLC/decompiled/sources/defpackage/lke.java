package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lke extends jkp implements jlm {
    public static final lke a;
    private static volatile jlr f;
    public int b;
    public int c;
    public String d = "";
    public int e;

    static {
        lke lkeVar = new lke();
        a = lkeVar;
        jkp.I(lke.class, lkeVar);
    }

    private lke() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        jlr jlrVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"b", "c", lgb.j, "d", "e"});
        }
        if (i2 == 3) {
            return new lke();
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
        jlr jlrVar2 = f;
        if (jlrVar2 != null) {
            return jlrVar2;
        }
        synchronized (lke.class) {
            jlrVar = f;
            if (jlrVar == null) {
                jlrVar = new jkk(a);
                f = jlrVar;
            }
        }
        return jlrVar;
    }
}
