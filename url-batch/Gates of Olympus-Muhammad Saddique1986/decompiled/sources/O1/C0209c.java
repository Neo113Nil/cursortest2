package O1;

import I.InterfaceC0142c0;
import e2.InterfaceC0422a;

/* renamed from: O1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0209c implements InterfaceC0422a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3783e;

    public /* synthetic */ C0209c(InterfaceC0142c0 interfaceC0142c0, int i3) {
        this.f3782d = i3;
        this.f3783e = interfaceC0142c0;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f3782d) {
            case 0:
                this.f3783e.setValue(Boolean.FALSE);
                break;
            case 1:
                this.f3783e.setValue(Boolean.TRUE);
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                this.f3783e.setValue(Boolean.FALSE);
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                this.f3783e.setValue(Boolean.TRUE);
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                this.f3783e.setValue(Boolean.TRUE);
                break;
            default:
                this.f3783e.setValue(Boolean.FALSE);
                break;
        }
        return R1.y.f4171a;
    }
}
