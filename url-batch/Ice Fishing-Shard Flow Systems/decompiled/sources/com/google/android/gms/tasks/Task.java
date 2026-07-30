package com.google.android.gms.tasks;

import K1.a;
import K1.c;
import K1.d;
import K1.g;
import K1.p;
import com.appsflyer.internal.e;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class Task<TResult> {
    public void a(Executor executor, c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public void b(Executor executor, OnCompleteListener onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract p c(Executor executor, d dVar);

    public abstract p d(e eVar);

    public abstract p e(Executor executor, K1.e eVar);

    public Task f(Executor executor, a aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public Task g(Executor executor, a aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception getException();

    public abstract TResult getResult();

    public abstract Object h();

    public abstract boolean i();

    public abstract boolean isSuccessful();

    public abstract boolean j();

    public Task k(Executor executor, g gVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
