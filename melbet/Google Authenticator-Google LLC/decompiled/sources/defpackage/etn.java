package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class etn extends jkp implements jlm {
    public static final etn a;
    public int b;
    public String c = "";
    public jjq d = jjq.d;
    public String e = "";
    public jkx f;
    public jkx g;
    public boolean h;
    public long i;

    static {
        etn etnVar = new etn();
        a = etnVar;
        jkp.I(etn.class, etnVar);
    }

    private etn() {
        jlu jluVar = jlu.a;
        this.f = jluVar;
        this.g = jluVar;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"b", "e", "c", "d", "f", eto.class, "g", "h", "i"});
        }
        if (i2 == 3) {
            return new etn();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(etn.class);
        }
        throw null;
    }
}
