package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ija extends jkp implements jlm {
    public static final ija a;
    public int b;
    private int c;

    static {
        ija ijaVar = new ija();
        a = ijaVar;
        jkp.I(ija.class, ijaVar);
    }

    private ija() {
        jkq jkqVar = jkq.a;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "b", hrn.j});
        }
        if (i2 == 3) {
            return new ija();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ija.class);
        }
        throw null;
    }
}
