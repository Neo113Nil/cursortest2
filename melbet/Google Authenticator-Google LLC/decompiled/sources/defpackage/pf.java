package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pf implements aec {
    private final WeakReference a;

    public pf(pq pqVar) {
        this.a = new WeakReference(pqVar);
    }

    @Override // defpackage.aec
    public final void b(aer aerVar) {
        WeakReference weakReference = this.a;
        if (weakReference.get() != null) {
            ((pq) weakReference.get()).z = null;
        }
    }

    @Override // defpackage.aec
    public final /* synthetic */ void a(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void bJ(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void d(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void e(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void f(aer aerVar) {
    }
}
