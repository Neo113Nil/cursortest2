package M;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;

/* renamed from: M.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089s extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1747a;

    /* renamed from: b, reason: collision with root package name */
    public int f1748b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0090t f1749c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0089s(C0090t c0090t, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.f1749c = c0090t;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1747a = obj;
        this.f1748b |= Integer.MIN_VALUE;
        return this.f1749c.b(null, this);
    }
}
