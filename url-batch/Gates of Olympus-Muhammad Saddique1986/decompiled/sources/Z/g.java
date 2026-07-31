package Z;

import R1.y;
import e2.InterfaceC0422a;

/* loaded from: classes.dex */
public final class g extends f2.k implements InterfaceC0422a {

    /* renamed from: f, reason: collision with root package name */
    public static final g f4675f = new g(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final g f4676g = new g(0, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4677e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i3, int i4) {
        super(i3);
        this.f4677e = i4;
    }

    @Override // e2.InterfaceC0422a
    public final /* bridge */ /* synthetic */ Object b() {
        switch (this.f4677e) {
            case 0:
                return Boolean.FALSE;
            default:
                return y.f4171a;
        }
    }
}
