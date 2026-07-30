package k1;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class m extends d1.i implements c1.p {

    /* renamed from: d, reason: collision with root package name */
    public static final m f692d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f693e;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f694c;

    static {
        int i2 = 2;
        f692d = new m(i2, 0);
        f693e = new m(i2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i2, int i3) {
        super(i2);
        this.f694c = i3;
    }

    @Override // c1.p
    public final Object g(Object obj, Object obj2) {
        switch (this.f694c) {
            case 0:
                return ((v0.h) obj).h((v0.f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
            default:
                return ((v0.h) obj).h((v0.f) obj2);
        }
    }
}
