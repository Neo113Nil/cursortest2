package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gw extends hw {
    public final ni1 g;

    public gw(long j, ni1 ni1Var) {
        super(j);
        this.g = ni1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.run();
    }

    @Override // defpackage.hw
    public final String toString() {
        return super.toString() + this.g;
    }
}
