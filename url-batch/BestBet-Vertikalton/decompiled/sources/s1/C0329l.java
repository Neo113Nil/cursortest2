package s1;

/* renamed from: s1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329l extends k1.f implements j1.p {

    /* renamed from: c, reason: collision with root package name */
    public static final C0329l f4054c = new C0329l(2, 0);
    public static final C0329l d = new C0329l(2, 1);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4055b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0329l(int i, int i2) {
        super(i);
        this.f4055b = i2;
    }

    @Override // j1.p
    public final Object d(Object obj, Object obj2) {
        switch (this.f4055b) {
            case 0:
                return ((b1.j) obj).j((b1.h) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
            default:
                return ((b1.j) obj).j((b1.h) obj2);
        }
    }
}
