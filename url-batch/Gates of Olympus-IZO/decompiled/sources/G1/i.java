package G1;

import I.C0089d;
import I.C0113p;
import L1.z;
import a.AbstractC0157a;
import h1.C0438i;
import r.InterfaceC0796H;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Y1.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1549e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1550f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1551g;

    public /* synthetic */ i(int i3, int i4, Object obj, Object obj2) {
        this.f1548d = i4;
        this.f1550f = obj;
        this.f1551g = obj2;
        this.f1549e = i3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        int i3 = this.f1548d;
        C0113p c0113p = (C0113p) obj;
        ((Integer) obj2).intValue();
        switch (i3) {
            case 0:
                I2.l.d((r) this.f1550f, (InterfaceC0796H) this.f1551g, c0113p, C0089d.T(this.f1549e | 1));
                break;
            case 1:
                AbstractC0157a.c((String) this.f1550f, (String) this.f1551g, c0113p, C0089d.T(this.f1549e | 1));
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                I2.d.e((I1.m) this.f1550f, (InterfaceC0796H) this.f1551g, c0113p, C0089d.T(this.f1549e | 1));
                break;
            default:
                I2.d.d((I1.c) this.f1550f, (Y1.a) this.f1551g, c0113p, C0089d.T(this.f1549e | 1));
                break;
        }
        return z.f2729a;
    }
}
