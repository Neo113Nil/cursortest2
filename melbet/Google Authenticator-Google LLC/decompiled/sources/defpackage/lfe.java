package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfe extends jkp implements jlm {
    public static final lfe a;
    public jkx b;
    public jkx c;
    private byte d = 2;

    static {
        lfe lfeVar = new lfe();
        a = lfeVar;
        jkp.I(lfe.class, lfeVar);
    }

    private lfe() {
        jlu jluVar = jlu.a;
        this.b = jluVar;
        this.c = jluVar;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0001\u0001Л\u0003\u001b", new Object[]{"b", lfd.class, "c", lfg.class});
        }
        if (i2 == 3) {
            return new lfe();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lfe.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final void b() {
        jkx jkxVar = this.b;
        if (jkxVar.c()) {
            return;
        }
        this.b = jkp.A(jkxVar);
    }
}
