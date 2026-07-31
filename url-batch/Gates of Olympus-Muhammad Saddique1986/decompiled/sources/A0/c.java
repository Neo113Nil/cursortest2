package A0;

import e2.InterfaceC0424c;
import t0.o0;

/* loaded from: classes.dex */
public final class c extends U.p implements o0 {

    /* renamed from: q, reason: collision with root package name */
    public boolean f92q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f93r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0424c f94s;

    public c(boolean z3, boolean z4, InterfaceC0424c interfaceC0424c) {
        this.f92q = z3;
        this.f93r = z4;
        this.f94s = interfaceC0424c;
    }

    @Override // t0.o0
    public final boolean O() {
        return this.f93r;
    }

    @Override // t0.o0
    public final boolean R() {
        return this.f92q;
    }

    @Override // t0.o0
    public final void j(i iVar) {
        this.f94s.n(iVar);
    }
}
