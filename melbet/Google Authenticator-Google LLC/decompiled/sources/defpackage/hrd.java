package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hrd extends jkp implements jlm {
    public static final hrd a;
    public int b;
    public hrb c;
    public hrc d;
    public hra e;
    public hqz f;

    static {
        hrd hrdVar = new hrd();
        a = hrdVar;
        jkp.I(hrd.class, hrdVar);
    }

    private hrd() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0004\u0000\u0001\u0002\b\u0004\u0000\u0000\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0007ဉ\u0006\bဉ\u0007", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new hrd();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(hrd.class);
        }
        throw null;
    }
}
