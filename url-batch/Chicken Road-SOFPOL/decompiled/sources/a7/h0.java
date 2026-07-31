package a7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h0 extends j0 {

    /* renamed from: f, reason: collision with root package name */
    public final h f262f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l0 f263g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(l0 l0Var, long j7, h hVar) {
        super(j7);
        this.f263g = l0Var;
        this.f262f = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f262f.E(this.f263g);
    }

    @Override // a7.j0
    public final String toString() {
        return super.toString() + this.f262f;
    }
}
