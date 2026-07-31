package H1;

import I.C0089d;
import I.C0113p;
import L1.z;
import a.AbstractC0157a;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Y1.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1863e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1864f;

    public /* synthetic */ e(Object obj, int i3, int i4) {
        this.f1862d = i4;
        this.f1863e = obj;
        this.f1864f = i3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        C0113p c0113p = (C0113p) obj;
        Integer num = (Integer) obj2;
        switch (this.f1862d) {
            case 0:
                num.getClass();
                AbstractC0157a.b((String) this.f1863e, c0113p, C0089d.T(this.f1864f | 1));
                break;
            case 1:
                num.getClass();
                AbstractC0157a.e((String) this.f1863e, c0113p, C0089d.T(this.f1864f | 1));
                break;
            default:
                num.intValue();
                E1.j.a((com.gates.olympus.miruv.data.e) this.f1863e, c0113p, C0089d.T(this.f1864f | 1));
                break;
        }
        return z.f2729a;
    }
}
