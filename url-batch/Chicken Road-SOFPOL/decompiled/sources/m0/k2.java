package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k2 extends w0.w {

    /* renamed from: c, reason: collision with root package name */
    public int f4997c;

    public k2(int i, long j7) {
        super(j7);
        this.f4997c = i;
    }

    @Override // w0.w
    public final void a(w0.w wVar) {
        q6.i.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f4997c = ((k2) wVar).f4997c;
    }

    @Override // w0.w
    public final w0.w b(long j7) {
        return new k2(this.f4997c, j7);
    }
}
