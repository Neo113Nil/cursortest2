package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hzs extends jkp implements jlm {
    public static final hzs a;

    static {
        hzs hzsVar = new hzs();
        a = hzsVar;
        jkp.I(hzs.class, hzsVar);
    }

    private hzs() {
        jjq jjqVar = jjq.d;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new hzs();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(hzs.class);
        }
        throw null;
    }
}
