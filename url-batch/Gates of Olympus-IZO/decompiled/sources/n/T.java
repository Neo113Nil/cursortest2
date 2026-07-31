package n;

/* loaded from: classes.dex */
public final class T extends Z1.j implements Y1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final T f6031f = new T(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final T f6032g = new T(0, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6033e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(int i3, int i4) {
        super(i3);
        this.f6033e = i4;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f6033e) {
            case 0:
                return C0632C.f5985a;
            default:
                return new c0();
        }
    }
}
