package com.bytedance.adsdk.fs;

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

/* loaded from: classes13.dex */
public class mw<T> {
    public static Executor zmn = Executors.newCachedThreadPool();
    private volatile klz<T> btk;
    private final Handler fb;
    private final Set<rc<T>> fs;
    private final Set<rc<Throwable>> zn;

    public mw(Callable<klz<T>> callable) {
        this(callable, false);
    }

    mw(Callable<klz<T>> callable, boolean z) {
        this.fs = new LinkedHashSet(1);
        this.zn = new LinkedHashSet(1);
        this.fb = new Handler(Looper.getMainLooper());
        this.btk = null;
        if (z) {
            try {
                zmn((klz) callable.call());
                return;
            } catch (Throwable th) {
                zmn((klz) new klz<>(th));
                return;
            }
        }
        zmn.execute(new zmn(callable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(klz<T> klzVar) {
        if (this.btk != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.btk = klzVar;
        zmn();
    }

    public synchronized mw<T> zmn(rc<T> rcVar) {
        try {
            klz<T> klzVar = this.btk;
            if (klzVar != null && klzVar.zmn() != null) {
                rcVar.zmn(klzVar.zmn());
            }
            this.fs.add(rcVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized mw<T> fs(rc<T> rcVar) {
        this.fs.remove(rcVar);
        return this;
    }

    public synchronized mw<T> zn(rc<Throwable> rcVar) {
        try {
            klz<T> klzVar = this.btk;
            if (klzVar != null && klzVar.fs() != null) {
                rcVar.zmn(klzVar.fs());
            }
            this.zn.add(rcVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized mw<T> fb(rc<Throwable> rcVar) {
        this.zn.remove(rcVar);
        return this;
    }

    private void zmn() {
        this.fb.post(new Runnable() { // from class: com.bytedance.adsdk.fs.mw.1
            @Override // java.lang.Runnable
            public void run() {
                klz klzVar = mw.this.btk;
                if (klzVar == null) {
                    return;
                }
                if (klzVar.zmn() != null) {
                    mw.this.zmn((mw) klzVar.zmn());
                } else {
                    mw.this.zmn(klzVar.fs());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void zmn(T t) {
        Iterator it = new ArrayList(this.fs).iterator();
        while (it.hasNext()) {
            ((rc) it.next()).zmn(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void zmn(Throwable th) {
        ArrayList arrayList = new ArrayList(this.zn);
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((rc) it.next()).zmn(th);
        }
    }

    private class zmn extends FutureTask<klz<T>> {
        zmn(Callable<klz<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                mw.this.zmn((klz) get());
            } catch (InterruptedException | ExecutionException e) {
                mw.this.zmn(new klz(e));
            }
        }
    }
}
