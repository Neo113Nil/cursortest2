package I;

/* loaded from: classes.dex */
public final class L0 extends S.z {

    /* renamed from: c, reason: collision with root package name */
    public long f2162c;

    public L0(long j3) {
        this.f2162c = j3;
    }

    @Override // S.z
    public final void a(S.z zVar) {
        Z1.i.d(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f2162c = ((L0) zVar).f2162c;
    }

    @Override // S.z
    public final S.z b() {
        return new L0(this.f2162c);
    }
}
