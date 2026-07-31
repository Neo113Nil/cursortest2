package s1;

import V1.i;
import f2.j;
import q2.C0832t;
import q2.InterfaceC0835w;
import q2.X;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0963a implements AutoCloseable, InterfaceC0835w {

    /* renamed from: d, reason: collision with root package name */
    public final i f8352d;

    public C0963a(i iVar) {
        j.f(iVar, "coroutineContext");
        this.f8352d = iVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        X x3 = (X) this.f8352d.v(C0832t.f7929e);
        if (x3 != null) {
            x3.a(null);
        }
    }

    @Override // q2.InterfaceC0835w
    public final i q() {
        return this.f8352d;
    }
}
