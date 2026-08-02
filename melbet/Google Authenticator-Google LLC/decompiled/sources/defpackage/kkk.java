package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kkk implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ kkw b;
    final /* synthetic */ boolean c;
    final /* synthetic */ Future d;
    final /* synthetic */ boolean e;
    final /* synthetic */ Future f;
    final /* synthetic */ kky g;

    public kkk(kky kkyVar, Collection collection, kkw kkwVar, boolean z, Future future, boolean z2, Future future2) {
        this.a = collection;
        this.b = kkwVar;
        this.c = z;
        this.d = future;
        this.e = z2;
        this.f = future2;
        this.g = kkyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kbq kbqVar;
        for (kkw kkwVar : this.a) {
            if (kkwVar != this.b) {
                kkwVar.a.n(kky.c);
            }
        }
        if (this.c) {
            Future future = this.d;
            if (future != null) {
                future.cancel(false);
            }
            if (!this.e) {
                kky kkyVar = this.g;
                if (kkyVar.u.decrementAndGet() == Integer.MIN_VALUE) {
                    kkyVar.h.execute(new kkh(this, 2));
                }
            }
        }
        Future future2 = this.f;
        if (future2 != null) {
            future2.cancel(false);
        }
        kky kkyVar2 = this.g;
        kip kipVar = kkyVar2.E.b.z;
        synchronized (kipVar.a) {
            kipVar.b.remove(kkyVar2);
            if (kipVar.b.isEmpty()) {
                kbqVar = kipVar.c;
                kipVar.b = new HashSet();
            } else {
                kbqVar = null;
            }
        }
        if (kbqVar != null) {
            kipVar.d.y.e(kbqVar);
        }
    }
}
