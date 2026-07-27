package G4;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class m extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1085a;

    /* renamed from: b, reason: collision with root package name */
    public int f1086b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B0.l f1087c;

    /* renamed from: d, reason: collision with root package name */
    public N2.m f1088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(B0.l lVar, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.f1087c = lVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1085a = obj;
        this.f1086b |= Integer.MIN_VALUE;
        return this.f1087c.i(null, this);
    }
}
