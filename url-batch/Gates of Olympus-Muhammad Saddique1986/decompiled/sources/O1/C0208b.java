package O1;

import I.InterfaceC0142c0;
import e2.InterfaceC0422a;

/* renamed from: O1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0208b implements InterfaceC0422a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3781f;

    public /* synthetic */ C0208b(InterfaceC0142c0 interfaceC0142c0, InterfaceC0142c0 interfaceC0142c02, int i3) {
        this.f3779d = i3;
        this.f3780e = interfaceC0142c0;
        this.f3781f = interfaceC0142c02;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f3779d) {
            case 0:
                this.f3780e.setValue(null);
                this.f3781f.setValue(Boolean.TRUE);
                break;
            default:
                this.f3780e.setValue(null);
                this.f3781f.setValue(Boolean.FALSE);
                break;
        }
        return R1.y.f4171a;
    }
}
