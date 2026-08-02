package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jns extends jkp implements jlm {
    public static final jns a;
    public int b;
    public long c;
    public String d = "";
    public int e;

    static {
        jns jnsVar = new jns();
        a = jnsVar;
        jkp.I(jns.class, jnsVar);
    }

    private jns() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new jns();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jns.class);
        }
        throw null;
    }
}
