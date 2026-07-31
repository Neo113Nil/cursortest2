package I;

/* loaded from: classes.dex */
public final class L0 extends S.A {

    /* renamed from: c, reason: collision with root package name */
    public Object f2723c;

    public L0(Object obj) {
        this.f2723c = obj;
    }

    @Override // S.A
    public final void a(S.A a3) {
        f2.j.d(a3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f2723c = ((L0) a3).f2723c;
    }

    @Override // S.A
    public final S.A b() {
        return new L0(this.f2723c);
    }
}
