package z0;

import R1.y;
import e2.InterfaceC0424c;

/* renamed from: z0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1262d extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final C1262d f10523f = new C1262d(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C1262d f10524g = new C1262d(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C1262d f10525h = new C1262d(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10526e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1262d(int i3, int i4) {
        super(i3);
        this.f10526e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f10526e) {
            case 0:
                ((Number) obj).longValue();
                return y.f4171a;
            case 1:
                return Integer.valueOf(((k) obj).f10544b);
            default:
                return Integer.valueOf(((k) obj).f10545c.a());
        }
    }
}
