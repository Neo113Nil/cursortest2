package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eku extends eko {
    public final List b = new CopyOnWriteArrayList();

    @Override // defpackage.eko
    public final void g(eik eikVar) {
        ((hkf) ((hkf) eiu.a.d()).i("com/google/android/libraries/performance/primes/foreground/ForegroundTracker$ForegroundSignalMultiplexer", "emitBackgroundSignal", 195, "ForegroundTracker.java")).s("App transition to background");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ekq) it.next()).g(eikVar);
        }
    }

    @Override // defpackage.eko
    public final void j(eik eikVar) {
        ((hkf) ((hkf) eiu.a.d()).i("com/google/android/libraries/performance/primes/foreground/ForegroundTracker$ForegroundSignalMultiplexer", "emitForegroundSignal", 187, "ForegroundTracker.java")).s("App transition to foreground");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ekq) it.next()).j(eikVar);
        }
    }
}
