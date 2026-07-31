package N1;

import I.C0143d;
import I.C0167p;
import R1.y;
import e2.InterfaceC0426e;
import h2.AbstractC0508a;
import r.InterfaceC0849K;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC0426e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f3565e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3566f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3567g;

    public /* synthetic */ a(int i3, int i4, Object obj, String str) {
        this.f3564d = i4;
        this.f3565e = str;
        this.f3567g = obj;
        this.f3566f = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0167p c0167p = (C0167p) obj;
        Integer num = (Integer) obj2;
        switch (this.f3564d) {
            case 0:
                num.getClass();
                AbstractC0508a.d(this.f3565e, (InterfaceC0849K) this.f3567g, c0167p, C0143d.U(this.f3566f | 1));
                break;
            default:
                num.intValue();
                AbstractC0508a.f(this.f3565e, (String) this.f3567g, c0167p, C0143d.U(this.f3566f | 1));
                break;
        }
        return y.f4171a;
    }
}
