package o1;

/* renamed from: o1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293l extends g1.g implements f1.p {

    /* renamed from: c, reason: collision with root package name */
    public static final C0293l f3351c = new C0293l(2, 0);
    public static final C0293l d = new C0293l(2, 1);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3352b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0293l(int i, int i2) {
        super(i);
        this.f3352b = i2;
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        switch (this.f3352b) {
            case 0:
                return ((X0.i) obj).k((X0.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
            default:
                return ((X0.i) obj).k((X0.g) obj2);
        }
    }
}
