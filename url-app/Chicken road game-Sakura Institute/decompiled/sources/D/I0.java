package D;

/* loaded from: classes.dex */
public final /* synthetic */ class I0 extends M2.w {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1337n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I0(int i2, int i4, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i2);
        this.f1337n = i4;
    }

    @Override // S2.c
    public final Object get() {
        switch (this.f1337n) {
            case 0:
                return ((G.X0) this.f3591e).getValue();
            case 1:
                return this.f3591e.getClass().getSimpleName();
            default:
                return ((G.X0) this.f3591e).getValue();
        }
    }
}
