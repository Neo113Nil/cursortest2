package com.google.android.gms.tasks;

import com.appsflyer.internal.e;
import java.util.concurrent.Executor;
import w7.a;
import w7.b;
import w7.c;
import w7.d;
import w7.f;
import w7.n;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class Task<TResult> {
    public void a(Executor executor, b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public void b(Executor executor, OnCompleteListener onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract n c(Executor executor, c cVar);

    public abstract n d(e eVar);

    public abstract n e(Executor executor, d dVar);

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

    public Task k(Executor executor, f fVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
