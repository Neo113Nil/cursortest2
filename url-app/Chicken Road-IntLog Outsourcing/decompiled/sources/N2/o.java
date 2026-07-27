package N2;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class o extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2110a;

    /* renamed from: b, reason: collision with root package name */
    public int f2111b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G4.l f2112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(G4.l lVar, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.f2112c = lVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f2110a = obj;
        this.f2111b |= Integer.MIN_VALUE;
        return this.f2112c.b(null, this);
    }
}
