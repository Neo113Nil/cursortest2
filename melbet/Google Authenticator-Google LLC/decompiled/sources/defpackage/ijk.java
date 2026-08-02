package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijk extends jkp implements jlm {
    public static final ijk a;
    public int b;
    public String c = "";
    public int d;
    public jjd e;
    public hpq f;

    static {
        ijk ijkVar = new ijk();
        a = ijkVar;
        jkp.I(ijk.class, ijkVar);
    }

    private ijk() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", hrn.p, "e", "f"});
        }
        if (i2 == 3) {
            return new ijk();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ijk.class);
        }
        throw null;
    }
}
