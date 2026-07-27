package A1;

import G.InterfaceC0191c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class O0 implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f522e;

    public /* synthetic */ O0(int i2, InterfaceC0191c0 interfaceC0191c0) {
        this.f521d = i2;
        this.f522e = interfaceC0191c0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f521d) {
            case 0:
                this.f522e.setValue(Boolean.FALSE);
                break;
            case 1:
                R0.b(this.f522e, false);
                break;
            case 2:
                R0.b(this.f522e, true);
                break;
            default:
                R0.b(this.f522e, false);
                break;
        }
        return Unit.f7487a;
    }
}
