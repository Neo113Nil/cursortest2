package w1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends q6.j implements p6.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f7589f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i) {
        super(0);
        this.f7588e = i;
        this.f7589f = cVar;
    }

    @Override // p6.a
    public final Object b() {
        switch (this.f7588e) {
            case 0:
                this.f7589f.u0();
                break;
            default:
                c cVar = this.f7589f;
                y0.k kVar = cVar.f7604r;
                q6.i.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                ((v1.c) kVar).c(cVar);
                break;
        }
        return c6.m.f1757a;
    }
}
