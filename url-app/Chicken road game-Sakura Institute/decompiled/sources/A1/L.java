package A1;

import G.InterfaceC0191c0;
import java.text.SimpleDateFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import z1.AbstractC1366J;
import z1.C1377c;
import z1.C1389o;
import z1.C1391q;

/* loaded from: classes.dex */
public final class L implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f493d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1377c f494e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f495i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f496j;

    public L(C1377c c1377c, InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02) {
        this.f494e = c1377c;
        this.f495i = interfaceC0191c0;
        this.f496j = interfaceC0191c02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.f496j;
        Object obj2 = this.f495i;
        C1377c c1377c = this.f494e;
        switch (this.f493d) {
            case 0:
                ((C1391q) obj2).f11905c.add(new C1389o(c1377c.f11851a));
                AbstractC1366J.b();
                ((Function0) obj).invoke();
                break;
            default:
                String str = c1377c.f11851a;
                SimpleDateFormat simpleDateFormat = R0.f534a;
                ((InterfaceC0191c0) obj2).setValue(str);
                R0.b((InterfaceC0191c0) obj, false);
                break;
        }
        return Unit.f7487a;
    }

    public L(C1391q c1391q, C1377c c1377c, Function0 function0) {
        this.f495i = c1391q;
        this.f494e = c1377c;
        this.f496j = function0;
    }
}
