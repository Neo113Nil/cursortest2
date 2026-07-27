package A1;

import G.C0205j0;
import G.InterfaceC0191c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import z1.AbstractC1366J;
import z1.C1377c;
import z1.C1381g;
import z1.EnumC1375a;
import z1.EnumC1387m;

/* loaded from: classes.dex */
public final /* synthetic */ class N implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f506d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f507e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f508i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f509j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f510k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f511l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f512m;

    public /* synthetic */ N(String str, Function0 function0, InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, InterfaceC0191c0 interfaceC0191c03, InterfaceC0191c0 interfaceC0191c04) {
        this.f512m = str;
        this.f507e = function0;
        this.f508i = interfaceC0191c0;
        this.f509j = interfaceC0191c02;
        this.f510k = interfaceC0191c03;
        this.f511l = interfaceC0191c04;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function0 function0 = this.f507e;
        Object obj = this.f512m;
        InterfaceC0191c0 interfaceC0191c0 = this.f511l;
        InterfaceC0191c0 interfaceC0191c02 = this.f510k;
        InterfaceC0191c0 interfaceC0191c03 = this.f509j;
        InterfaceC0191c0 interfaceC0191c04 = this.f508i;
        switch (this.f506d) {
            case 0:
                Q.v vVar = AbstractC1366J.f11817c;
                String a4 = AbstractC1366J.a();
                C0205j0 c0205j0 = AbstractC0071n0.f634a;
                vVar.add(new C1381g(a4, (String) obj, (EnumC1387m) interfaceC0191c04.getValue(), kotlin.text.t.f((String) interfaceC0191c03.getValue()), (EnumC1375a) interfaceC0191c02.getValue(), ((Boolean) interfaceC0191c0.getValue()).booleanValue(), ""));
                AbstractC1366J.b();
                function0.invoke();
                break;
            default:
                Integer f4 = kotlin.text.t.f((String) interfaceC0191c04.getValue());
                int intValue = f4 != null ? f4.intValue() : 0;
                Integer f5 = kotlin.text.t.f((String) interfaceC0191c03.getValue());
                int intValue2 = f5 != null ? f5.intValue() : 2012;
                if (!kotlin.text.y.x((String) interfaceC0191c02.getValue()) && !kotlin.text.y.x((String) interfaceC0191c0.getValue())) {
                    AbstractC1366J.f11818d.add(new C1377c(AbstractC1366J.a(), kotlin.text.y.M((String) interfaceC0191c02.getValue()).toString(), intValue, kotlin.text.y.M((String) interfaceC0191c0.getValue()).toString(), intValue2, ((Boolean) ((InterfaceC0191c0) obj).getValue()).booleanValue(), ""));
                    AbstractC1366J.b();
                    function0.invoke();
                }
                break;
        }
        return Unit.f7487a;
    }

    public /* synthetic */ N(Function0 function0, InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, InterfaceC0191c0 interfaceC0191c03, InterfaceC0191c0 interfaceC0191c04, InterfaceC0191c0 interfaceC0191c05) {
        this.f507e = function0;
        this.f508i = interfaceC0191c0;
        this.f509j = interfaceC0191c02;
        this.f510k = interfaceC0191c03;
        this.f511l = interfaceC0191c04;
        this.f512m = interfaceC0191c05;
    }
}
