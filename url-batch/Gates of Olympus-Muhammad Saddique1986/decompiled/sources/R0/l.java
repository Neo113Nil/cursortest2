package R0;

import java.util.List;
import r0.InterfaceC0885G;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;

/* loaded from: classes.dex */
public final class l implements InterfaceC0885G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f4099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O0.k f4100b;

    public l(A a3, O0.k kVar) {
        this.f4099a = a3;
        this.f4100b = kVar;
    }

    @Override // r0.InterfaceC0885G
    public final InterfaceC0886H f(InterfaceC0887I interfaceC0887I, List list, long j3) {
        this.f4099a.setParentLayoutDirection(this.f4100b);
        return interfaceC0887I.i0(0, 0, S1.v.f4321d, C0215d.f4071h);
    }
}
