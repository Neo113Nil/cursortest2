package I;

/* loaded from: classes.dex */
public final class J0 extends S.z {

    /* renamed from: c, reason: collision with root package name */
    public float f2156c;

    public J0(float f3) {
        this.f2156c = f3;
    }

    @Override // S.z
    public final void a(S.z zVar) {
        Z1.i.d(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f2156c = ((J0) zVar).f2156c;
    }

    @Override // S.z
    public final S.z b() {
        return new J0(this.f2156c);
    }
}
