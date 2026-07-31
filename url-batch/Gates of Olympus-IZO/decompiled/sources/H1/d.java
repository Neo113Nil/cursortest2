package H1;

import I.C0089d;
import I.C0113p;
import L1.z;
import M1.B;
import a.AbstractC0157a;
import h1.C0438i;
import r.InterfaceC0796H;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Y1.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1860g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1861h;

    public /* synthetic */ d(y yVar, Y1.c cVar, InterfaceC0796H interfaceC0796H, int i3) {
        this.f1857d = 1;
        this.f1858e = yVar;
        this.f1860g = cVar;
        this.f1861h = interfaceC0796H;
        this.f1859f = i3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        int i3 = this.f1857d;
        C0113p c0113p = (C0113p) obj;
        ((Integer) obj2).intValue();
        switch (i3) {
            case 0:
                AbstractC0157a.d((String) this.f1860g, (y) this.f1858e, (Y1.a) this.f1861h, c0113p, C0089d.T(this.f1859f | 1));
                break;
            case 1:
                B.d((y) this.f1858e, (Y1.c) this.f1860g, (InterfaceC0796H) this.f1861h, c0113p, C0089d.T(this.f1859f | 1));
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                B.h((J1.k) this.f1860g, (Y1.c) this.f1858e, (InterfaceC0796H) this.f1861h, c0113p, C0089d.T(this.f1859f | 1));
                break;
            default:
                B.g((com.gates.olympus.miruv.data.b) this.f1860g, (Y1.a) this.f1861h, (Y1.a) this.f1858e, c0113p, C0089d.T(this.f1859f | 1));
                break;
        }
        return z.f2729a;
    }

    public /* synthetic */ d(com.gates.olympus.miruv.data.b bVar, Y1.a aVar, Y1.a aVar2, int i3) {
        this.f1857d = 3;
        this.f1860g = bVar;
        this.f1861h = aVar;
        this.f1858e = aVar2;
        this.f1859f = i3;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i3, int i4) {
        this.f1857d = i4;
        this.f1860g = obj;
        this.f1858e = obj2;
        this.f1861h = obj3;
        this.f1859f = i3;
    }
}
