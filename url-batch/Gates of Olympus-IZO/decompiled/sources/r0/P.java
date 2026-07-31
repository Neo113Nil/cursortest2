package r0;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final T f7130a;

    /* renamed from: b, reason: collision with root package name */
    public w f7131b;

    /* renamed from: c, reason: collision with root package name */
    public final O f7132c = new O(this, 2);

    /* renamed from: d, reason: collision with root package name */
    public final O f7133d = new O(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final O f7134e = new O(this, 1);

    public P(T t3) {
        this.f7130a = t3;
    }

    public final w a() {
        w wVar = this.f7131b;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
