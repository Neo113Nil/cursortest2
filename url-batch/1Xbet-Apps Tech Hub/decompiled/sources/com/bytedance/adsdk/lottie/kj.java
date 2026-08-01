package com.bytedance.adsdk.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* compiled from: LottieTask.java */
/* loaded from: classes.dex */
public class kj<T> {
    public static Executor pvs = Executors.newCachedThreadPool();
    private final Handler Jd;
    private volatile qh<T> NB;
    private final Set<Wyp<T>> icD;
    private final Set<Wyp<Throwable>> vG;

    public kj(Callable<qh<T>> callable) {
        this(callable, false);
    }

    kj(Callable<qh<T>> callable, boolean z) {
        this.icD = new LinkedHashSet(1);
        this.vG = new LinkedHashSet(1);
        this.Jd = new Handler(Looper.getMainLooper());
        this.NB = null;
        if (z) {
            try {
                pvs((qh) callable.call());
                return;
            } catch (Throwable th) {
                pvs((qh) new qh<>(th));
                return;
            }
        }
        pvs.execute(new pvs(callable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(qh<T> qhVar) {
        if (this.NB != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.NB = qhVar;
        pvs();
    }

    public synchronized kj<T> pvs(Wyp<T> wyp) {
        qh<T> qhVar = this.NB;
        if (qhVar != null && qhVar.pvs() != null) {
            wyp.pvs(qhVar.pvs());
        }
        this.icD.add(wyp);
        return this;
    }

    public synchronized kj<T> icD(Wyp<T> wyp) {
        this.icD.remove(wyp);
        return this;
    }

    public synchronized kj<T> vG(Wyp<Throwable> wyp) {
        qh<T> qhVar = this.NB;
        if (qhVar != null && qhVar.icD() != null) {
            wyp.pvs(qhVar.icD());
        }
        this.vG.add(wyp);
        return this;
    }

    public synchronized kj<T> Jd(Wyp<Throwable> wyp) {
        this.vG.remove(wyp);
        return this;
    }

    private void pvs() {
        this.Jd.post(new Runnable() { // from class: com.bytedance.adsdk.lottie.kj.1
            @Override // java.lang.Runnable
            public void run() {
                qh qhVar = kj.this.NB;
                if (qhVar == null) {
                    return;
                }
                if (qhVar.pvs() != null) {
                    kj.this.pvs((kj) qhVar.pvs());
                } else {
                    kj.this.pvs(qhVar.icD());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void pvs(T t) {
        Iterator it = new ArrayList(this.icD).iterator();
        while (it.hasNext()) {
            ((Wyp) it.next()).pvs(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void pvs(Throwable th) {
        ArrayList arrayList = new ArrayList(this.vG);
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Wyp) it.next()).pvs(th);
        }
    }

    /* compiled from: LottieTask.java */
    private class pvs extends FutureTask<qh<T>> {
        pvs(Callable<qh<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                kj.this.pvs((qh) get());
            } catch (InterruptedException | ExecutionException e) {
                kj.this.pvs(new qh(e));
            }
        }
    }
}
