package t;

/* loaded from: classes.dex */
public final class f extends Z1.j implements Y1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final f f7581f = new f(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final f f7582g = new f(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7583e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i3, int i4) {
        super(i3);
        this.f7583e = i4;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f7583e) {
            case 0:
                ((Number) obj2).intValue();
                return new C0892b(1);
            default:
                y yVar = (y) obj2;
                return M1.m.c0(Integer.valueOf(yVar.f7689b.f7452b.g()), Integer.valueOf(yVar.f7689b.f7453c.g()));
        }
    }
}
