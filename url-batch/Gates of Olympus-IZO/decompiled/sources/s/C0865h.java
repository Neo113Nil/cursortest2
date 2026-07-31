package s;

import I.C0089d;
import I.C0113p;
import u.InterfaceC0953v;

/* renamed from: s.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0865h extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7366e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7367f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7368g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7369h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0953v f7370i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0865h(InterfaceC0953v interfaceC0953v, int i3, Object obj, int i4, int i5) {
        super(2);
        this.f7366e = i5;
        this.f7370i = interfaceC0953v;
        this.f7367f = i3;
        this.f7368g = obj;
        this.f7369h = i4;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        int i3 = this.f7366e;
        C0113p c0113p = (C0113p) obj;
        ((Number) obj2).intValue();
        switch (i3) {
            case 0:
                int T2 = C0089d.T(this.f7369h | 1);
                ((C0866i) this.f7370i).e(this.f7367f, this.f7368g, c0113p, T2);
                break;
            default:
                int T3 = C0089d.T(this.f7369h | 1);
                ((t.h) this.f7370i).e(this.f7367f, this.f7368g, c0113p, T3);
                break;
        }
        return L1.z.f2729a;
    }
}
