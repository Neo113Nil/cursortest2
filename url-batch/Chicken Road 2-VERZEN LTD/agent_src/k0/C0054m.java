package k0;

/* renamed from: k0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0054m extends e0.i implements d0.p {

    /* renamed from: d, reason: collision with root package name */
    public static final C0054m f875d = new C0054m(2, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final C0054m f876e = new C0054m(2, 1);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f877c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0054m(int i2, int i3) {
        super(i2);
        this.f877c = i3;
    }

    @Override // d0.p
    public final Object e(Object obj, Object obj2) {
        switch (this.f877c) {
            case 0:
                return ((W.i) obj).c((W.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
            default:
                return ((W.i) obj).c((W.g) obj2);
        }
    }
}
