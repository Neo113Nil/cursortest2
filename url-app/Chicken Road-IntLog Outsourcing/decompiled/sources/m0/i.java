package m0;

import F4.p;
import F4.q;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements D.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11112b;

    public /* synthetic */ i(int i2, Object obj) {
        this.f11111a = i2;
        this.f11112b = obj;
    }

    @Override // D.a
    public final void accept(Object obj) {
        switch (this.f11111a) {
            case 0:
                ((p) ((q) this.f11112b)).h((k) obj);
                break;
            default:
                ((w2.m) this.f11112b).setWindowInfoListenerDisplayFeatures((k) obj);
                break;
        }
    }
}
