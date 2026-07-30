package p1;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class x extends d1.i implements c1.p {

    /* renamed from: d, reason: collision with root package name */
    public static final x f1078d;

    /* renamed from: e, reason: collision with root package name */
    public static final x f1079e;

    /* renamed from: f, reason: collision with root package name */
    public static final x f1080f;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1081c;

    static {
        int i2 = 2;
        f1078d = new x(i2, 0);
        f1079e = new x(i2, 1);
        f1080f = new x(i2, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i2, int i3) {
        super(i2);
        this.f1081c = i3;
    }

    @Override // c1.p
    public final Object g(Object obj, Object obj2) {
        switch (this.f1081c) {
            case 0:
                return obj;
            case 1:
                if (obj == null) {
                    return null;
                }
                f0.l.a();
                return null;
            default:
                return (z) obj;
        }
    }
}
