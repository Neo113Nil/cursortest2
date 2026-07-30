package com.google.android.gms.tasks;

import com.appsflyer.internal.e;
import defpackage.en;
import defpackage.if1;
import defpackage.lr0;
import defpackage.mr0;
import defpackage.qr0;
import defpackage.zu1;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class Task<TResult> {
    public void a(Executor executor, lr0 lr0Var) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public void b(Executor executor, OnCompleteListener onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract zu1 c(Executor executor, mr0 mr0Var);

    public abstract zu1 d(e eVar);

    public abstract zu1 e(Executor executor, qr0 qr0Var);

    public Task f(Executor executor, en enVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public Task g(Executor executor, en enVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception getException();

    public abstract TResult getResult();

    public abstract Object h();

    public abstract boolean i();

    public abstract boolean isSuccessful();

    public abstract boolean j();

    public Task k(Executor executor, if1 if1Var) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
