package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eug extends jkp implements jlm {
    public static final eug a;
    public String b = "";
    public long c;
    private int d;

    static {
        eug eugVar = new eug();
        a = eugVar;
        jkp.I(eug.class, eugVar);
    }

    private eug() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new eug();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(eug.class);
        }
        throw null;
    }
}
