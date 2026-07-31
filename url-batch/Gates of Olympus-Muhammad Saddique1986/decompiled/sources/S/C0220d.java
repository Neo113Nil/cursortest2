package S;

import I.Y;
import e2.InterfaceC0424c;

/* renamed from: S.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220d extends C0221e {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0220d(int i3, n nVar) {
        super(i3, nVar, null, r2);
        InterfaceC0424c interfaceC0424c;
        synchronized (p.f4241b) {
            ?? r12 = p.f4247h;
            f2.j.f(r12, "<this>");
            interfaceC0424c = (InterfaceC0424c) (r12.size() == 1 ? r12.get(0) : null);
            interfaceC0424c = interfaceC0424c == null ? new C0217a(0, r12) : interfaceC0424c;
        }
    }

    @Override // S.C0221e
    public final C0221e B(InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2) {
        return (C0221e) ((i) p.f(new Y(1, new C0218b(interfaceC0424c, interfaceC0424c2, 0))));
    }

    @Override // S.C0221e, S.i
    public final void c() {
        synchronized (p.f4241b) {
            int i3 = this.f4219d;
            if (i3 >= 0) {
                p.u(i3);
                this.f4219d = -1;
            }
        }
    }

    @Override // S.C0221e, S.i
    public final void k() {
        u.g();
        throw null;
    }

    @Override // S.C0221e, S.i
    public final void l() {
        u.g();
        throw null;
    }

    @Override // S.C0221e, S.i
    public final void m() {
        p.a();
    }

    @Override // S.C0221e, S.i
    public final i t(InterfaceC0424c interfaceC0424c) {
        return (i) p.f(new Y(1, new C0219c(0, interfaceC0424c)));
    }

    @Override // S.C0221e
    public final u v() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
