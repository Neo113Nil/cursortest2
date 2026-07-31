package G;

import I.C0167p;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class q extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f2024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f2025g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(long j3, InterfaceC0426e interfaceC0426e, int i3) {
        super(2);
        this.f2023e = i3;
        this.f2024f = j3;
        this.f2025g = interfaceC0426e;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f2023e) {
            case 0:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
                    c0167p.L();
                } else {
                    z.c(this.f2024f, this.f2025g, c0167p, 0);
                }
                break;
            default:
                C0167p c0167p2 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p2.x()) {
                    c0167p2.L();
                } else {
                    z.c(this.f2024f, this.f2025g, c0167p2, 0);
                }
                break;
        }
        return R1.y.f4171a;
    }
}
