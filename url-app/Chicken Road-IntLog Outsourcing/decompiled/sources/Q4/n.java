package Q4;

import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: f, reason: collision with root package name */
    public static final n f2542f = new n(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final n f2543g = new n(0, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final n f2544h = new n(0, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final n f2545i = new n(0, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final n f2546j = new n(0, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final n f2547k = new n(0, 5);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2548e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i2, int i3) {
        super(i2);
        this.f2548e = i3;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        switch (this.f2548e) {
            case 0:
                return D.f2497b;
            case 1:
                return w.f2562b;
            case 2:
                return t.f2559b;
            case 3:
                return A.f2495b;
            case 4:
                return g.f2509b;
            default:
                return w.f2561a;
        }
    }
}
