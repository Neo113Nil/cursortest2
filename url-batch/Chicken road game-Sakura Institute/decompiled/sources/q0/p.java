package q0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends w {

    /* renamed from: c, reason: collision with root package name */
    public k0.c f7437c;

    /* renamed from: d, reason: collision with root package name */
    public int f7438d;

    /* renamed from: e, reason: collision with root package name */
    public int f7439e;

    public p(k0.c cVar) {
        this.f7437c = cVar;
    }

    @Override // q0.w
    public final void a(w wVar) {
        synchronized (r.f7441a) {
            r6.k.d(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
            this.f7437c = ((p) wVar).f7437c;
            this.f7438d = ((p) wVar).f7438d;
            this.f7439e = ((p) wVar).f7439e;
        }
    }

    @Override // q0.w
    public final w b() {
        return new p(this.f7437c);
    }
}
