package A0;

import p6.q;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements H.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f72b;

    public /* synthetic */ i(int i2, Object obj) {
        this.f71a = i2;
        this.f72b = obj;
    }

    @Override // H.a
    public final void accept(Object obj) {
        switch (this.f71a) {
            case 0:
                ((p6.p) ((q) this.f72b)).i((l) obj);
                break;
            default:
                ((h4.p) this.f72b).setWindowInfoListenerDisplayFeatures((l) obj);
                break;
        }
    }
}
