package I;

import h1.C0438i;
import n2.InterfaceC0701g;

/* loaded from: classes.dex */
public final class S0 implements InterfaceC0701g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0112o0 f2196e;

    public /* synthetic */ S0(C0112o0 c0112o0, int i3) {
        this.f2195d = i3;
        this.f2196e = c0112o0;
    }

    @Override // n2.InterfaceC0701g
    public final Object emit(Object obj, P1.d dVar) {
        switch (this.f2195d) {
            case 0:
                this.f2196e.setValue(obj);
                break;
            case 1:
                this.f2196e.setValue(obj);
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                this.f2196e.setValue(obj);
                break;
            default:
                this.f2196e.setValue(obj);
                break;
        }
        return L1.z.f2729a;
    }
}
