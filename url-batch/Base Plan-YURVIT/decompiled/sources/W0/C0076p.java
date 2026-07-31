package W0;

/* renamed from: W0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0076p extends P0.i implements O0.p {

    /* renamed from: g, reason: collision with root package name */
    public static final C0076p f966g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0076p f967h;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f968f;

    static {
        int i2 = 2;
        f966g = new C0076p(i2, 0);
        f967h = new C0076p(i2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0076p(int i2, int i3) {
        super(i2);
        this.f968f = i3;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        switch (this.f968f) {
            case 0:
                return ((G0.i) obj).j((G0.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((G0.i) obj).j((G0.g) obj2);
        }
    }
}
