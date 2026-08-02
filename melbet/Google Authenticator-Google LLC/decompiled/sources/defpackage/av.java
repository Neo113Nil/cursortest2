package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class av extends oc {
    final /* synthetic */ AtomicReference a;

    public av(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.oc
    public final void a() {
        throw null;
    }

    @Override // defpackage.oc
    public final void b(Object obj) {
        oc ocVar = (oc) this.a.get();
        if (ocVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        ocVar.b(obj);
    }
}
