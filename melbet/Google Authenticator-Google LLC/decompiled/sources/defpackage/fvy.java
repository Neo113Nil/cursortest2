package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fvy extends jkp implements jlm {
    public static final fvy a;
    public int b;
    public boolean c;
    public jkx d = jlu.a;
    public int e;

    static {
        fvy fvyVar = new fvy();
        a = fvyVar;
        jkp.I(fvy.class, fvyVar);
    }

    private fvy() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001a\u0003᠌\u0001", new Object[]{"b", "c", "d", "e", bmw.n});
        }
        if (i2 == 3) {
            return new fvy();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(fvy.class);
        }
        throw null;
    }
}
