package g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b2 extends q0.w {

    /* renamed from: c, reason: collision with root package name */
    public float f3694c;

    public b2(float f9) {
        this.f3694c = f9;
    }

    @Override // q0.w
    public final void a(q0.w wVar) {
        r6.k.d(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f3694c = ((b2) wVar).f3694c;
    }

    @Override // q0.w
    public final q0.w b() {
        return new b2(this.f3694c);
    }
}
