package p1;

import P1.i;
import k2.C0547t;
import k2.InterfaceC0550w;
import k2.X;

/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762a implements AutoCloseable, InterfaceC0550w {

    /* renamed from: d, reason: collision with root package name */
    public final i f6754d;

    public C0762a(i iVar) {
        Z1.i.f(iVar, "coroutineContext");
        this.f6754d = iVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        X x3 = (X) this.f6754d.k(C0547t.f5390e);
        if (x3 != null) {
            x3.a(null);
        }
    }

    @Override // k2.InterfaceC0550w
    public final i u() {
        return this.f6754d;
    }
}
