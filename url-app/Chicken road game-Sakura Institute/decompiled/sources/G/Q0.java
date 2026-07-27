package G;

import Z2.InterfaceC0331g;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class Q0 implements InterfaceC0331g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0215o0 f2745e;

    public /* synthetic */ Q0(C0215o0 c0215o0, int i2) {
        this.f2744d = i2;
        this.f2745e = c0215o0;
    }

    @Override // Z2.InterfaceC0331g
    public final Object d(Object obj, C2.a aVar) {
        switch (this.f2744d) {
            case 0:
                this.f2745e.setValue(obj);
                break;
            default:
                this.f2745e.setValue(obj);
                break;
        }
        return Unit.f7487a;
    }
}
