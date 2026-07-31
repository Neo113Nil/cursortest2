package S;

/* loaded from: classes.dex */
public final class r extends A {

    /* renamed from: c, reason: collision with root package name */
    public M.c f4251c;

    /* renamed from: d, reason: collision with root package name */
    public int f4252d;

    /* renamed from: e, reason: collision with root package name */
    public int f4253e;

    public r(M.c cVar) {
        this.f4251c = cVar;
    }

    @Override // S.A
    public final void a(A a3) {
        synchronized (u.f4258a) {
            f2.j.d(a3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
            this.f4251c = ((r) a3).f4251c;
            this.f4252d = ((r) a3).f4252d;
            this.f4253e = ((r) a3).f4253e;
        }
    }

    @Override // S.A
    public final A b() {
        return new r(this.f4251c);
    }
}
