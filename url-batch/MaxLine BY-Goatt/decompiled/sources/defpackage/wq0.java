package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wq0 extends b4 {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ w3 b;

    public wq0(AtomicReference atomicReference, w3 w3Var) {
        this.a = atomicReference;
        this.b = w3Var;
    }

    @Override // defpackage.b4
    public final w3 a() {
        return this.b;
    }

    @Override // defpackage.b4
    public final void b(Object obj) {
        b4 b4Var = (b4) this.a.get();
        if (b4Var != null) {
            b4Var.b(obj);
        } else {
            lh.g("Operation cannot be started before fragment is in created state");
        }
    }

    @Override // defpackage.b4
    public final void c() {
        b4 b4Var = (b4) this.a.getAndSet(null);
        if (b4Var != null) {
            b4Var.c();
        }
    }
}
