package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfu extends jkp implements jlm {
    public static final lfu a;
    public int b;
    public lfw c;
    public long d;
    public String e = "";
    public int f;
    public long g;

    static {
        lfu lfuVar = new lfu();
        a = lfuVar;
        jkp.I(lfu.class, lfuVar);
    }

    private lfu() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဃ\u0001\u0006ဈ\u0003\u0007᠌\u0004\bဃ\u0005", new Object[]{"b", "c", "d", "e", "f", lgb.b, "g"});
        }
        if (i2 == 3) {
            return new lfu();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lfu.class);
        }
        throw null;
    }
}
