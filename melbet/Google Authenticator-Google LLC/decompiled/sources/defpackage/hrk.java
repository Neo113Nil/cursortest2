package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hrk extends jkp implements jlm {
    public static final hrk a;
    private byte c = 2;
    public jkx b = jlu.a;

    static {
        hrk hrkVar = new hrk();
        a = hrkVar;
        jkp.I(hrk.class, hrkVar);
    }

    private hrk() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", hrl.class});
        }
        if (i2 == 3) {
            return new hrk();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(hrk.class);
        }
        this.c = obj == null ? (byte) 0 : (byte) 1;
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
