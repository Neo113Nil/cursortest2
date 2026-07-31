package S;

/* loaded from: classes.dex */
public final class s extends z {

    /* renamed from: c, reason: collision with root package name */
    public M.c f3245c;

    /* renamed from: d, reason: collision with root package name */
    public int f3246d;

    /* renamed from: e, reason: collision with root package name */
    public int f3247e;

    public s(M.c cVar) {
        this.f3245c = cVar;
    }

    @Override // S.z
    public final void a(z zVar) {
        synchronized (u.f3249a) {
            Z1.i.d(zVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
            this.f3245c = ((s) zVar).f3245c;
            this.f3246d = ((s) zVar).f3246d;
            this.f3247e = ((s) zVar).f3247e;
        }
    }

    @Override // S.z
    public final z b() {
        return new s(this.f3245c);
    }
}
