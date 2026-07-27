package A1;

import G.InterfaceC0191c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import z1.C1377c;

/* loaded from: classes.dex */
public final class I0 implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q.v f478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f479e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1377c f480i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f481j;

    public I0(Q.v vVar, int i2, C1377c c1377c, InterfaceC0191c0 interfaceC0191c0) {
        this.f478d = vVar;
        this.f479e = i2;
        this.f480i = c1377c;
        this.f481j = interfaceC0191c0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f478d.set(this.f479e, this.f480i.f11851a);
        this.f481j.setValue(null);
        return Unit.f7487a;
    }
}
