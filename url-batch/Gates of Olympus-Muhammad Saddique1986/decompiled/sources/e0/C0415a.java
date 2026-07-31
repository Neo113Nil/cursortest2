package e0;

import R1.y;
import b0.C0352v;
import d0.C0406g;
import d0.InterfaceC0403d;
import e2.InterfaceC0424c;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0415a extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0415a f5691f = new C0415a(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0415a f5692g = new C0415a(1, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5693e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0415a(int i3, int i4) {
        super(i3);
        this.f5693e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f5693e) {
            case 0:
                break;
            default:
                r1.F(C0352v.f5438f, 0L, (r17 & 4) != 0 ? InterfaceC0403d.j0(((InterfaceC0403d) obj).d(), 0L) : 0L, 1.0f, C0406g.f5653a, null, (r17 & 64) != 0 ? 3 : 0);
                break;
        }
        return y.f4171a;
    }
}
