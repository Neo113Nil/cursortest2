package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j2 extends w0.w {

    /* renamed from: c, reason: collision with root package name */
    public float f4978c;

    public j2(long j7, float f6) {
        super(j7);
        this.f4978c = f6;
    }

    @Override // w0.w
    public final void a(w0.w wVar) {
        q6.i.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f4978c = ((j2) wVar).f4978c;
    }

    @Override // w0.w
    public final w0.w b(long j7) {
        return new j2(j7, this.f4978c);
    }
}
