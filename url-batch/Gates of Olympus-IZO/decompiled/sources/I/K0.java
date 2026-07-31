package I;

/* loaded from: classes.dex */
public final class K0 extends S.z {

    /* renamed from: c, reason: collision with root package name */
    public int f2158c;

    public K0(int i3) {
        this.f2158c = i3;
    }

    @Override // S.z
    public final void a(S.z zVar) {
        Z1.i.d(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f2158c = ((K0) zVar).f2158c;
    }

    @Override // S.z
    public final S.z b() {
        return new K0(this.f2158c);
    }
}
