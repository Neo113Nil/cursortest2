package a0;

import a1.p;
import m0.q;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements z.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1277b;

    public /* synthetic */ i(int i2, Object obj) {
        this.f1276a = i2;
        this.f1277b = obj;
    }

    @Override // z.a
    public final void accept(Object obj) {
        switch (this.f1276a) {
            case 0:
                ((a1.o) ((p) this.f1277b)).g((k) obj);
                break;
            default:
                ((q) this.f1277b).setWindowInfoListenerDisplayFeatures((k) obj);
                break;
        }
    }
}
