package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l2 extends w0.w {

    /* renamed from: c, reason: collision with root package name */
    public long f5014c;

    public l2(long j7, long j8) {
        super(j7);
        this.f5014c = j8;
    }

    @Override // w0.w
    public final void a(w0.w wVar) {
        q6.i.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f5014c = ((l2) wVar).f5014c;
    }

    @Override // w0.w
    public final w0.w b(long j7) {
        return new l2(j7, this.f5014c);
    }
}
