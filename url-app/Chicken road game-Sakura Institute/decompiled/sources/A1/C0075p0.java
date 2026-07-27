package A1;

import G.InterfaceC0191c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;

/* renamed from: A1.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0075p0 implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f645d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f646e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f647i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f648j;

    public /* synthetic */ C0075p0(int i2, InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02) {
        this.f646e = i2;
        this.f647i = interfaceC0191c0;
        this.f648j = interfaceC0191c02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f645d) {
            case 0:
                if (((Long) this.f647i.getValue()) == null) {
                    ((InterfaceC0191c0) this.f648j).setValue(Integer.valueOf(this.f646e));
                }
                break;
            default:
                InterfaceC0191c0 interfaceC0191c0 = this.f647i;
                if (((Long) interfaceC0191c0.getValue()) != null) {
                    Q.v vVar = (Q.v) this.f648j;
                    int i2 = this.f646e;
                    if (C1403G.s(i2, vVar) == null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        Long l4 = (Long) interfaceC0191c0.getValue();
                        Intrinsics.c(l4);
                        vVar.set(i2, Long.valueOf(currentTimeMillis - l4.longValue()));
                    }
                }
                break;
        }
        return Unit.f7487a;
    }

    public /* synthetic */ C0075p0(int i2, InterfaceC0191c0 interfaceC0191c0, Q.v vVar) {
        this.f648j = vVar;
        this.f646e = i2;
        this.f647i = interfaceC0191c0;
    }
}
