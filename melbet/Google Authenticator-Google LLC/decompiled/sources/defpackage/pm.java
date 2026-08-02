package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pm implements Runnable {
    private final /* synthetic */ int a;
    private final Object b;

    public pm(pn pnVar, int i) {
        this.a = i;
        this.b = new WeakReference(pnVar);
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            WeakReference weakReference = (WeakReference) this.b;
            if (weakReference.get() != null) {
                ((pq) weakReference.get()).j = false;
                return;
            }
            return;
        }
        if (i == 1) {
            WeakReference weakReference2 = (WeakReference) this.b;
            if (weakReference2.get() != null) {
                ((pn) weakReference2.get()).r();
                return;
            }
            return;
        }
        ?? r3 = this.b;
        if (i != 2) {
            try {
                r3.run();
                return;
            } catch (Exception e) {
                ow.r("Executor", "Background execution failure.", e);
                return;
            }
        }
        WeakReference weakReference3 = (WeakReference) r3;
        if (weakReference3.get() != null) {
            ((pq) weakReference3.get()).k = false;
        }
    }

    public pm(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    public pm(pq pqVar, int i) {
        this.a = i;
        this.b = new WeakReference(pqVar);
    }

    public pm(pq pqVar, int i, byte[] bArr) {
        this.a = i;
        this.b = new WeakReference(pqVar);
    }
}
