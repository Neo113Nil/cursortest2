package w0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t extends w {

    /* renamed from: c, reason: collision with root package name */
    public q0.c f7568c;

    /* renamed from: d, reason: collision with root package name */
    public int f7569d;

    /* renamed from: e, reason: collision with root package name */
    public int f7570e;

    public t(long j7, q0.c cVar) {
        super(j7);
        this.f7568c = cVar;
    }

    @Override // w0.w
    public final void a(w wVar) {
        synchronized (q.f7547a) {
            q6.i.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f7568c = ((t) wVar).f7568c;
            this.f7569d = ((t) wVar).f7569d;
            this.f7570e = ((t) wVar).f7570e;
        }
    }

    @Override // w0.w
    public final w b(long j7) {
        return new t(j7, this.f7568c);
    }
}
