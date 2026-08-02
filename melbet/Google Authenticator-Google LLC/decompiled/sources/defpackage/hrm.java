package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hrm extends jkp implements jlm {
    public static final hrm a;
    public int b;
    public Object d;
    public hrj e;
    public int c = 0;
    private byte g = 2;
    public jkx f = jlu.a;

    static {
        hrm hrmVar = new hrm();
        a = hrmVar;
        jkp.I(hrm.class, hrmVar);
    }

    private hrm() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᔉ\u0000\u0002Л\u0004м\u0000", new Object[]{"d", "c", "b", "e", "f", hrj.class, hrk.class});
        }
        if (i2 == 3) {
            return new hrm();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(hrm.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final void b() {
        jkx jkxVar = this.f;
        if (jkxVar.c()) {
            return;
        }
        this.f = jkp.A(jkxVar);
    }
}
