package I;

/* loaded from: classes.dex */
public final class I0 extends S.A {

    /* renamed from: c, reason: collision with root package name */
    public float f2711c;

    public I0(float f3) {
        this.f2711c = f3;
    }

    @Override // S.A
    public final void a(S.A a3) {
        f2.j.d(a3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f2711c = ((I0) a3).f2711c;
    }

    @Override // S.A
    public final S.A b() {
        return new I0(this.f2711c);
    }
}
