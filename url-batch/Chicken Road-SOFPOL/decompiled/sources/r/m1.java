package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class m1 implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1 f6364e;

    public /* synthetic */ m1(l1 l1Var, int i) {
        this.f6363d = i;
        this.f6364e = l1Var;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f6363d) {
            case 0:
                return new n1(this.f6364e, 0);
            default:
                return new n1(this.f6364e, 1);
        }
    }
}
