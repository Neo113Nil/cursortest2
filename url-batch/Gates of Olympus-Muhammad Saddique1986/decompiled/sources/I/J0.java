package I;

/* loaded from: classes.dex */
public final class J0 extends S.A {

    /* renamed from: c, reason: collision with root package name */
    public int f2713c;

    public J0(int i3) {
        this.f2713c = i3;
    }

    @Override // S.A
    public final void a(S.A a3) {
        f2.j.d(a3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f2713c = ((J0) a3).f2713c;
    }

    @Override // S.A
    public final S.A b() {
        return new J0(this.f2713c);
    }
}
