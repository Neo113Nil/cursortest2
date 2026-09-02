package D;

import k.InterfaceC0041a;
import v.C0108k;

/* renamed from: D.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0018t implements InterfaceC0041a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f109b;

    public /* synthetic */ C0018t(int i2, Object obj) {
        this.f108a = i2;
        this.f109b = obj;
    }

    @Override // k.InterfaceC0041a
    public final void accept(Object obj) {
        switch (this.f108a) {
            case 0:
                ((y) this.f109b).setWindowInfoListenerDisplayFeatures((C0108k) obj);
                break;
            default:
                ((m0.q) ((m0.r) this.f109b)).h((C0108k) obj);
                break;
        }
    }
}
