package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class eko {
    public int a = 1;

    public abstract void g(eik eikVar);

    public abstract void j(eik eikVar);

    public final void k(eik eikVar) {
        if (this.a == 3) {
            ((hkf) ((hkf) eiu.a.d()).i("com/google/android/libraries/performance/primes/foreground/AbstractForegroundSignalAdapter", "observeBackgroundSignal", 42, "AbstractForegroundSignalAdapter.java")).s("Already in the background, not transitioning");
        } else {
            this.a = 3;
            g(eikVar);
        }
    }

    public final void l(eik eikVar) {
        if (this.a == 2) {
            ((hkf) ((hkf) eiu.a.d()).i("com/google/android/libraries/performance/primes/foreground/AbstractForegroundSignalAdapter", "observeForegroundSignal", 31, "AbstractForegroundSignalAdapter.java")).s("Already in the foreground, not transitioning");
        } else {
            this.a = 2;
            j(eikVar);
        }
    }
}
