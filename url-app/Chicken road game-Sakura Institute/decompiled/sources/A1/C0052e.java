package A1;

import G.C0205j0;
import G.InterfaceC0191c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z1.AbstractC1366J;
import z1.C1372P;
import z1.C1379e;
import z1.EnumC1388n;

/* renamed from: A1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0052e implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f586e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f587i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f588j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f589k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f590l;

    public /* synthetic */ C0052e(Object obj, Object obj2, InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, InterfaceC0191c0 interfaceC0191c03, int i2) {
        this.f585d = i2;
        this.f590l = obj;
        this.f586e = obj2;
        this.f587i = interfaceC0191c0;
        this.f588j = interfaceC0191c02;
        this.f589k = interfaceC0191c03;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC0191c0 interfaceC0191c0 = this.f589k;
        Object obj = this.f586e;
        InterfaceC0191c0 interfaceC0191c02 = this.f588j;
        Object obj2 = this.f590l;
        InterfaceC0191c0 interfaceC0191c03 = this.f587i;
        switch (this.f585d) {
            case 0:
                if (!kotlin.text.y.x((String) interfaceC0191c03.getValue()) && !kotlin.text.y.x((String) interfaceC0191c02.getValue())) {
                    AbstractC1366J.f11825k.add(new C1379e(AbstractC1366J.a(), (String) obj2, kotlin.text.y.M((String) interfaceC0191c03.getValue()).toString(), kotlin.text.y.M((String) interfaceC0191c02.getValue()).toString(), kotlin.text.y.M((String) interfaceC0191c0.getValue()).toString()));
                    AbstractC1366J.b();
                    ((Function0) obj).invoke();
                    break;
                } else {
                    break;
                }
                break;
            case 1:
                C0205j0 c0205j0 = AbstractC0071n0.f634a;
                if (!kotlin.text.y.x((String) interfaceC0191c03.getValue()) && !kotlin.text.y.x((String) interfaceC0191c02.getValue())) {
                    Q.v vVar = AbstractC1366J.f11816b;
                    String a4 = AbstractC1366J.a();
                    String obj3 = kotlin.text.y.M((String) interfaceC0191c03.getValue()).toString();
                    String str = (String) interfaceC0191c0.getValue();
                    Intrinsics.checkNotNullExpressionValue(str, "access$CreateTournamentDialog$lambda$23(...)");
                    vVar.add(new C1372P(a4, obj3, str, kotlin.text.y.M((String) interfaceC0191c02.getValue()).toString(), (EnumC1388n) ((InterfaceC0191c0) obj2).getValue(), ""));
                    AbstractC1366J.b();
                    ((Function0) obj).invoke();
                }
                break;
            default:
                if (((Long) interfaceC0191c03.getValue()) == null) {
                    interfaceC0191c03.setValue(Long.valueOf(System.currentTimeMillis()));
                    Q.v vVar2 = (Q.v) obj2;
                    vVar2.clear();
                    int intValue = ((Number) interfaceC0191c02.getValue()).intValue();
                    for (int i2 = 0; i2 < intValue; i2++) {
                        vVar2.add(null);
                    }
                    Q.v vVar3 = (Q.v) obj;
                    vVar3.clear();
                    int intValue2 = ((Number) interfaceC0191c02.getValue()).intValue();
                    for (int i4 = 0; i4 < intValue2; i4++) {
                        vVar3.add(null);
                    }
                    interfaceC0191c0.setValue(0L);
                } else {
                    interfaceC0191c03.setValue(null);
                }
                break;
        }
        return Unit.f7487a;
    }

    public /* synthetic */ C0052e(Function0 function0, InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, InterfaceC0191c0 interfaceC0191c03, InterfaceC0191c0 interfaceC0191c04) {
        this.f585d = 1;
        this.f586e = function0;
        this.f587i = interfaceC0191c0;
        this.f588j = interfaceC0191c02;
        this.f589k = interfaceC0191c03;
        this.f590l = interfaceC0191c04;
    }
}
