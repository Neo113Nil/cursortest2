package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agw implements agh {
    private final /* synthetic */ int a;

    public agw(int i) {
        this.a = i;
    }

    @Override // defpackage.agh
    public final agd a(Class cls) {
        int i = this.a;
        if (i == 0) {
            return new agx();
        }
        if (i == 1) {
            return new ca(true);
        }
        hoq.y(gmx.class.equals(cls), "This ViewModelProvider.Factory only supports LifecycleMemoizingObserver.");
        return new gmx();
    }

    @Override // defpackage.agh
    public final /* synthetic */ agd b(Class cls, ago agoVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? a(cls) : new ca(true) : new agx();
    }

    @Override // defpackage.agh
    public final /* synthetic */ agd c(ktj ktjVar, ago agoVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? yk.c(this, ktjVar, agoVar) : yk.c(this, ktjVar, agoVar) : yk.c(this, ktjVar, agoVar);
    }
}
