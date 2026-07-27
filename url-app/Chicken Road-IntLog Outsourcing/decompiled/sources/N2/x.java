package N2;

import M.C0090t;
import k4.InterfaceC1218d;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class x extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2148a;

    /* renamed from: b, reason: collision with root package name */
    public int f2149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0090t f2150c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C0090t c0090t, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.f2150c = c0090t;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f2148a = obj;
        this.f2149b |= Integer.MIN_VALUE;
        return this.f2150c.b(null, this);
    }
}
