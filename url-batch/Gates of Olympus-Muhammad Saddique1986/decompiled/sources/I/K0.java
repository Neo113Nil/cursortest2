package I;

/* loaded from: classes.dex */
public final class K0 extends S.A {

    /* renamed from: c, reason: collision with root package name */
    public long f2717c;

    public K0(long j3) {
        this.f2717c = j3;
    }

    @Override // S.A
    public final void a(S.A a3) {
        f2.j.d(a3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f2717c = ((K0) a3).f2717c;
    }

    @Override // S.A
    public final S.A b() {
        return new K0(this.f2717c);
    }
}
