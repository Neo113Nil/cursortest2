package pl.droidsonroids.gif;

/* loaded from: classes2.dex */
public final class b extends f {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f39857u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f39858v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, c cVar2, int i) {
        super(cVar2);
        this.f39858v = cVar;
        this.f39857u = i;
    }

    @Override // pl.droidsonroids.gif.f
    public final void a() {
        c cVar = this.f39858v;
        int i = this.f39857u;
        cVar.f39875z.q(cVar.f39874y, i);
        this.f39877n.f39864F.sendEmptyMessageAtTime(-1, 0L);
    }
}
