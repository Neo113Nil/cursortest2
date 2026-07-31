package G;

import e2.InterfaceC0422a;
import m.i0;

/* loaded from: classes.dex */
public final class u extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0 f2038f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(i0 i0Var, int i3) {
        super(0);
        this.f2037e = i3;
        this.f2038f = i0Var;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f2037e) {
            case 0:
                return Boolean.valueOf(((Number) this.f2038f.f6815m.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) this.f2038f.f6815m.getValue()).floatValue() > 0.0f);
        }
    }
}
