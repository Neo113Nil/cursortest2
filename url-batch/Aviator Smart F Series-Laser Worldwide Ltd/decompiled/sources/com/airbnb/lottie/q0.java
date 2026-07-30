package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class q0 {
    public static Executor EXECUTOR = Executors.newCachedThreadPool();
    private final Set<k0> failureListeners;
    private final Handler handler;

    @Nullable
    private volatile o0 result;
    private final Set<k0> successListeners;

    private class a extends FutureTask {
        a(Callable<o0> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                q0.this.setResult((o0) get());
            } catch (InterruptedException | ExecutionException e8) {
                q0.this.setResult(new o0(e8));
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public q0(Callable<o0> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyListeners$0() {
        o0 o0Var = this.result;
        if (o0Var == null) {
            return;
        }
        if (o0Var.getValue() != null) {
            notifySuccessListeners(o0Var.getValue());
        } else {
            notifyFailureListeners(o0Var.getException());
        }
    }

    private synchronized void notifyFailureListeners(Throwable th) {
        ArrayList arrayList = new ArrayList(this.failureListeners);
        if (arrayList.isEmpty()) {
            com.airbnb.lottie.utils.f.warning("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((k0) it.next()).onResult(th);
        }
    }

    private void notifyListeners() {
        this.handler.post(new Runnable() { // from class: com.airbnb.lottie.p0
            @Override // java.lang.Runnable
            public final void run() {
                q0.this.lambda$notifyListeners$0();
            }
        });
    }

    private synchronized void notifySuccessListeners(Object obj) {
        Iterator it = new ArrayList(this.successListeners).iterator();
        while (it.hasNext()) {
            ((k0) it.next()).onResult(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(@Nullable o0 o0Var) {
        if (this.result != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.result = o0Var;
        notifyListeners();
    }

    public synchronized q0 addFailureListener(k0 k0Var) {
        try {
            o0 o0Var = this.result;
            if (o0Var != null && o0Var.getException() != null) {
                k0Var.onResult(o0Var.getException());
            }
            this.failureListeners.add(k0Var);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized q0 addListener(k0 k0Var) {
        try {
            o0 o0Var = this.result;
            if (o0Var != null && o0Var.getValue() != null) {
                k0Var.onResult(o0Var.getValue());
            }
            this.successListeners.add(k0Var);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized q0 removeFailureListener(k0 k0Var) {
        this.failureListeners.remove(k0Var);
        return this;
    }

    public synchronized q0 removeListener(k0 k0Var) {
        this.successListeners.remove(k0Var);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    q0(Callable<o0> callable, boolean z7) {
        this.successListeners = new LinkedHashSet(1);
        this.failureListeners = new LinkedHashSet(1);
        this.handler = new Handler(Looper.getMainLooper());
        this.result = null;
        if (!z7) {
            EXECUTOR.execute(new a(callable));
            return;
        }
        try {
            setResult(callable.call());
        } catch (Throwable th) {
            setResult(new o0(th));
        }
    }
}
