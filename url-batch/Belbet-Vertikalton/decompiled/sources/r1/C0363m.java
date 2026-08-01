package r1;

/* renamed from: r1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0363m extends j1.i implements i1.p {

    /* renamed from: c, reason: collision with root package name */
    public static final C0363m f4082c = new C0363m(2, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final C0363m f4083d = new C0363m(2, 1);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4084b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0363m(int i, int i2) {
        super(i);
        this.f4084b = i2;
    }

    @Override // i1.p
    public final Object d(Object obj, Object obj2) {
        switch (this.f4084b) {
            case 0:
                return ((a1.i) obj).B((a1.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
            default:
                return ((a1.i) obj).B((a1.g) obj2);
        }
    }
}
