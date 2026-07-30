package g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d2 extends q0.w {

    /* renamed from: c, reason: collision with root package name */
    public long f3715c;

    public d2(long j8) {
        this.f3715c = j8;
    }

    @Override // q0.w
    public final void a(q0.w wVar) {
        r6.k.d(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f3715c = ((d2) wVar).f3715c;
    }

    @Override // q0.w
    public final q0.w b() {
        return new d2(this.f3715c);
    }
}
