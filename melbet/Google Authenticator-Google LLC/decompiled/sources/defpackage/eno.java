package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eno extends jkp implements jlm {
    public static final eno a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    private int f;

    static {
        eno enoVar = new eno();
        a = enoVar;
        jkp.I(eno.class, enoVar);
    }

    private eno() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"f", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new eno();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(eno.class);
        }
        throw null;
    }
}
