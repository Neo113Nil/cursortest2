package B1;

import Z2.InterfaceC0330f;
import Z2.InterfaceC0331g;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class G implements InterfaceC0330f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0330f f958e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I f959i;

    public /* synthetic */ G(InterfaceC0330f interfaceC0330f, I i2, int i4) {
        this.f957d = i4;
        this.f958e = interfaceC0330f;
        this.f959i = i2;
    }

    @Override // Z2.InterfaceC0330f
    public final Object e(InterfaceC0331g interfaceC0331g, C2.a aVar) {
        switch (this.f957d) {
            case 0:
                Object e4 = this.f958e.e(new F(interfaceC0331g, this.f959i, 0), aVar);
                if (e4 != D2.a.f2163d) {
                    break;
                }
                break;
            default:
                Object e5 = this.f958e.e(new F(interfaceC0331g, this.f959i, 1), aVar);
                if (e5 != D2.a.f2163d) {
                    break;
                }
                break;
        }
        return Unit.f7487a;
    }
}
