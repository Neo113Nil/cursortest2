package z;

import e2.InterfaceC0424c;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1237a extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final C1237a f10428f = new C1237a(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C1237a f10429g = new C1237a(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C1237a f10430h = new C1237a(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10431e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1237a(int i3, int i4) {
        super(i3);
        this.f10431e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final /* synthetic */ Object n(Object obj) {
        switch (this.f10431e) {
            case 0:
                ((Number) obj).longValue();
                break;
            case 1:
                break;
            default:
                int i3 = ((I0.l) obj).f3070a;
                break;
        }
        return R1.y.f4171a;
    }
}
