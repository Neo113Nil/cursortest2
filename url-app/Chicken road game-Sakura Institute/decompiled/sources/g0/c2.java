package g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c2 extends q0.w {

    /* renamed from: c, reason: collision with root package name */
    public int f3699c;

    public c2(int i7) {
        this.f3699c = i7;
    }

    @Override // q0.w
    public final void a(q0.w wVar) {
        r6.k.d(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f3699c = ((c2) wVar).f3699c;
    }

    @Override // q0.w
    public final q0.w b() {
        return new c2(this.f3699c);
    }
}
