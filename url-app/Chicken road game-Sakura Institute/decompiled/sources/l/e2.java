package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e2 implements z1 {

    /* renamed from: f, reason: collision with root package name */
    public final int f5471f;

    public e2(int i7) {
        this.f5471f = i7;
    }

    @Override // l.y1
    public final q e(long j8, q qVar, q qVar2, q qVar3) {
        return j8 < ((long) this.f5471f) * 1000000 ? qVar : qVar2;
    }

    @Override // l.z1
    public final int j() {
        return this.f5471f;
    }

    @Override // l.z1
    public final int k() {
        return 0;
    }

    @Override // l.y1
    public final q f(long j8, q qVar, q qVar2, q qVar3) {
        return qVar3;
    }
}
