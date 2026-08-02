package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ejf extends jkp implements jlm {
    public static final ejf a;
    public int b;
    public long c;
    public jmh d;
    private byte f = 2;
    public jkx e = jlu.a;

    static {
        ejf ejfVar = new ejf();
        a = ejfVar;
        jkp.I(ejf.class, ejfVar);
    }

    private ejf() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ဂ\u0000\u0002ဉ\u0001\u0004Л", new Object[]{"b", "c", "d", "e", ejb.class});
        }
        if (i2 == 3) {
            return new ejf();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ejf.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final void b() {
        jkx jkxVar = this.e;
        if (jkxVar.c()) {
            return;
        }
        this.e = jkp.A(jkxVar);
    }
}
