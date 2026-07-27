package N2;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class q extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2118a;

    /* renamed from: b, reason: collision with root package name */
    public int f2119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f2120c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m mVar, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.f2120c = mVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f2118a = obj;
        this.f2119b |= Integer.MIN_VALUE;
        return this.f2120c.b(null, this);
    }
}
