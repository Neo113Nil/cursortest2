package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class joo extends jkp implements jlm {
    public static final joo a;
    public int b;
    public int c;
    public long e;
    public long f;
    public String d = "";
    public jkx g = jlu.a;

    static {
        joo jooVar = new joo();
        a = jooVar;
        jkp.I(joo.class, jooVar);
    }

    private joo() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0006\u001a", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new joo();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(joo.class);
        }
        throw null;
    }
}
