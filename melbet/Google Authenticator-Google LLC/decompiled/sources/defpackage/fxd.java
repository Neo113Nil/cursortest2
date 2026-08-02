package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fxd extends jkp implements jlm {
    public static final fxd a;
    public int b;
    public jli d = jli.a;
    private byte e = 2;
    public int c = 1;

    static {
        fxd fxdVar = new fxd();
        a = fxdVar;
        jkp.I(fxd.class, fxdVar);
    }

    private fxd() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u0001င\u0000\u0002в", new Object[]{"b", "c", "d", new ikk(jmr.INT32, 0, jmr.MESSAGE, fxf.a)});
        }
        if (i2 == 3) {
            return new fxd();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(fxd.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final jli b() {
        jli jliVar = this.d;
        if (!jliVar.b) {
            this.d = jliVar.a();
        }
        return this.d;
    }
}
