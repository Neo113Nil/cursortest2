package I;

/* loaded from: classes.dex */
public final class M0 extends S.z {

    /* renamed from: c, reason: collision with root package name */
    public Object f2168c;

    public M0(Object obj) {
        this.f2168c = obj;
    }

    @Override // S.z
    public final void a(S.z zVar) {
        Z1.i.d(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f2168c = ((M0) zVar).f2168c;
    }

    @Override // S.z
    public final S.z b() {
        return new M0(this.f2168c);
    }
}
