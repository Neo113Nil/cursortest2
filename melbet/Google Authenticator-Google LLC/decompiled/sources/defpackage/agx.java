package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agx extends agd {
    public static final agh a = new agw(0);
    public final qz b = new qz(null);
    public boolean c = false;

    public final void a() {
        this.c = false;
    }

    public final agu b() {
        return (agu) ra.a(this.b, 54321);
    }

    @Override // defpackage.agd
    protected final void c() {
        qz qzVar = this.b;
        int b = qzVar.b();
        for (int i = 0; i < b; i++) {
            ((agu) qzVar.c(i)).m();
        }
        int i2 = qzVar.d;
        Object[] objArr = qzVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        qzVar.d = 0;
        qzVar.a = false;
    }
}
