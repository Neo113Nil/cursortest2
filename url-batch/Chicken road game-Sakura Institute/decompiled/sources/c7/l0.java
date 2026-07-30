package c7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l0 extends n0 {

    /* renamed from: h, reason: collision with root package name */
    public final h f1713h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p0 f1714i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(p0 p0Var, long j8, h hVar) {
        super(j8);
        this.f1714i = p0Var;
        this.f1713h = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1713h.C(this.f1714i);
    }

    @Override // c7.n0
    public final String toString() {
        return super.toString() + this.f1713h;
    }
}
