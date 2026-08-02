package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ler extends jkp implements jlm {
    public static final ler a;
    public int b;
    public int c;
    public long d;
    public lem e;

    static {
        ler lerVar = new ler();
        a = lerVar;
        jkp.I(ler.class, lerVar);
    }

    private ler() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ler();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ler.class);
        }
        throw null;
    }
}
