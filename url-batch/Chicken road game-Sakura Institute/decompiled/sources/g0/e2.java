package g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e2 extends q0.w {

    /* renamed from: c, reason: collision with root package name */
    public Object f3720c;

    public e2(Object obj) {
        this.f3720c = obj;
    }

    @Override // q0.w
    public final void a(q0.w wVar) {
        r6.k.d(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f3720c = ((e2) wVar).f3720c;
    }

    @Override // q0.w
    public final q0.w b() {
        return new e2(this.f3720c);
    }
}
