package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfb extends jkp implements jlm {
    public static final lfb a;
    public int b;
    public lfa c;
    public lfz d;
    public int e;
    public lez f;
    public String g = "";

    static {
        lfb lfbVar = new lfb();
        a = lfbVar;
        jkp.I(lfb.class, lfbVar);
    }

    private lfb() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", jnw.l, "f", "g"});
        }
        if (i2 == 3) {
            return new lfb();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lfb.class);
        }
        throw null;
    }
}
