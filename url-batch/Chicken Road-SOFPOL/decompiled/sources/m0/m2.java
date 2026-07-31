package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m2 extends w0.w {

    /* renamed from: c, reason: collision with root package name */
    public Object f5018c;

    public m2(long j7, Object obj) {
        super(j7);
        this.f5018c = obj;
    }

    @Override // w0.w
    public final void a(w0.w wVar) {
        q6.i.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f5018c = ((m2) wVar).f5018c;
    }

    @Override // w0.w
    public final w0.w b(long j7) {
        return new m2(w0.m.k().g(), this.f5018c);
    }
}
