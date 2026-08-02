package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jkb extends jkp implements jlm {
    public static final jkb a;
    public long b;
    public int c;

    static {
        jkb jkbVar = new jkb();
        a = jkbVar;
        jkp.I(jkb.class, jkbVar);
    }

    private jkb() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new jkb();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jkb.class);
        }
        throw null;
    }
}
