package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hzw extends jkp implements jlm {
    public static final hzw a;

    static {
        hzw hzwVar = new hzw();
        a = hzwVar;
        jkp.I(hzw.class, hzwVar);
    }

    private hzw() {
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
            return new hzw();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(hzw.class);
        }
        throw null;
    }
}
