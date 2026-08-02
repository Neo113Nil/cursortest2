package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gsc extends jkp implements jlm {
    public static final gsc a;
    public int b;
    public gsb c;
    public int d;

    static {
        gsc gscVar = new gsc();
        a = gscVar;
        jkp.I(gsc.class, gscVar);
    }

    private gsc() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new gsc();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(gsc.class);
        }
        throw null;
    }
}
