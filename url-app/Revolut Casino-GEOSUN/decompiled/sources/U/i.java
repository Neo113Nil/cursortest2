package U;

import O0.o;
import O0.p;
import c0.r;
import v.InterfaceC0248a;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC0248a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1016b;

    public /* synthetic */ i(int i2, Object obj) {
        this.f1015a = i2;
        this.f1016b = obj;
    }

    @Override // v.InterfaceC0248a
    public final void accept(Object obj) {
        switch (this.f1015a) {
            case 0:
                ((o) ((p) this.f1016b)).l((k) obj);
                break;
            default:
                ((r) this.f1016b).setWindowInfoListenerDisplayFeatures((k) obj);
                break;
        }
    }
}
