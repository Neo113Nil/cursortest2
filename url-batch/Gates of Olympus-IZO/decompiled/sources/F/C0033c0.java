package F;

import I.C0089d;
import I.C0113p;
import f.AbstractC0382a;
import f2.InterfaceC0388c;
import u.C0925G;

/* renamed from: F.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033c0 extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1208e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1209f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1210g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1211h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1212i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Y1.e f1213j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0033c0(Object obj, Object obj2, Object obj3, Y1.e eVar, int i3, int i4) {
        super(2);
        this.f1208e = i4;
        this.f1210g = obj;
        this.f1211h = obj2;
        this.f1212i = obj3;
        this.f1213j = eVar;
        this.f1209f = i3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f1208e) {
            case 0:
                ((Number) obj2).intValue();
                int T2 = C0089d.T(this.f1209f | 1);
                Q.a aVar = (Q.a) this.f1213j;
                AbstractC0035d0.a((J) this.f1210g, (O0) this.f1211h, (a1) this.f1212i, aVar, (C0113p) obj, T2);
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC0382a.a((InterfaceC0388c) this.f1210g, (U.l) this.f1211h, (C0925G) this.f1212i, this.f1213j, (C0113p) obj, C0089d.T(this.f1209f | 1));
                break;
        }
        return L1.z.f2729a;
    }
}
