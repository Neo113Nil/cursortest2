package G;

import b0.O;
import e2.InterfaceC0424c;
import m.i0;

/* loaded from: classes.dex */
public final class r extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0 f2027f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(i0 i0Var, int i3) {
        super(1);
        this.f2026e = i3;
        this.f2027f = i0Var;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f2026e) {
            case 0:
                ((O) obj).b(((Number) this.f2027f.f6815m.getValue()).floatValue());
                break;
            case 1:
                ((O) obj).b(((Number) this.f2027f.f6815m.getValue()).floatValue());
                break;
            default:
                ((O) obj).b(((Number) this.f2027f.f6815m.getValue()).floatValue());
                break;
        }
        return R1.y.f4171a;
    }
}
