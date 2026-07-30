package M0;

/* renamed from: M0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058p extends F0.j implements E0.p {

    /* renamed from: g, reason: collision with root package name */
    public static final C0058p f679g = new C0058p(2, 0);

    /* renamed from: h, reason: collision with root package name */
    public static final C0058p f680h = new C0058p(2, 1);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f681f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0058p(int i2, int i3) {
        super(i2);
        this.f681f = i3;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        switch (this.f681f) {
            case 0:
                return ((w0.i) obj).k((w0.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((w0.i) obj).k((w0.g) obj2);
        }
    }
}
