package W;

import Y0.o;
import Y0.p;
import x.InterfaceC0249a;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC0249a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f893a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f894b;

    public /* synthetic */ i(int i2, Object obj) {
        this.f893a = i2;
        this.f894b = obj;
    }

    @Override // x.InterfaceC0249a
    public final void accept(Object obj) {
        switch (this.f893a) {
            case 0:
                ((o) ((p) this.f894b)).l((k) obj);
                break;
            default:
                ((k0.o) this.f894b).setWindowInfoListenerDisplayFeatures((k) obj);
                break;
        }
    }
}
