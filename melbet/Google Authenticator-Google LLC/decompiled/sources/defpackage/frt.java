package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class frt extends jkp implements jlm {
    public static final frt a;
    public int b;
    public frr c;
    public String d = "";
    public boolean e;

    static {
        frt frtVar = new frt();
        a = frtVar;
        jkp.I(frt.class, frtVar);
    }

    private frt() {
        jlu jluVar = jlu.a;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new frt();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(frt.class);
        }
        throw null;
    }
}
