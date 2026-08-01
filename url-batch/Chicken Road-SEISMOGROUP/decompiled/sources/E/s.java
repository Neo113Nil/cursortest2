package E;

import k.InterfaceC0039a;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements InterfaceC0039a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f184b;

    public /* synthetic */ s(int i2, Object obj) {
        this.f183a = i2;
        this.f184b = obj;
    }

    @Override // k.InterfaceC0039a
    public final void accept(Object obj) {
        switch (this.f183a) {
            case 0:
                ((v) this.f184b).setWindowInfoListenerDisplayFeatures((u.k) obj);
                break;
            default:
                ((m0.q) ((m0.r) this.f184b)).h((u.k) obj);
                break;
        }
    }
}
