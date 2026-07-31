package com.huawei.hms.iap.task;

import android.app.Activity;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;
import java.util.concurrent.Executor;
import z0.f;
import z0.g;
import z0.i;

/* loaded from: classes.dex */
public class IapFailureTask<T extends Result> extends i {

    /* renamed from: a, reason: collision with root package name */
    private int f14267a;

    /* renamed from: b, reason: collision with root package name */
    private String f14268b;

    public IapFailureTask() {
        this(-1, "context weak ref is recycled");
    }

    public i addOnFailureListener(Activity activity, f fVar) {
        addOnFailureListener(fVar);
        return this;
    }

    public i addOnSuccessListener(Activity activity, g gVar) {
        addOnSuccessListener(gVar);
        return this;
    }

    @Override // z0.i
    public Exception getException() {
        return null;
    }

    @Override // z0.i
    public T getResult() {
        return null;
    }

    /* renamed from: getResultThrowException, reason: merged with bridge method [inline-methods] */
    public <E extends Throwable> T m17getResultThrowException(Class<E> cls) {
        return null;
    }

    public boolean isCanceled() {
        return false;
    }

    public boolean isComplete() {
        return true;
    }

    @Override // z0.i
    public boolean isSuccessful() {
        return false;
    }

    public IapFailureTask(int i4, String str) {
        this.f14267a = i4;
        this.f14268b = str;
    }

    public i addOnFailureListener(Executor executor, f fVar) {
        addOnFailureListener(fVar);
        return this;
    }

    public i addOnSuccessListener(Executor executor, g gVar) {
        addOnSuccessListener(gVar);
        return this;
    }

    @Override // z0.i
    public i addOnFailureListener(f fVar) {
        if (fVar == null) {
            return this;
        }
        fVar.onFailure(new IapApiException(new Status(this.f14267a, this.f14268b)));
        return this;
    }

    @Override // z0.i
    public i addOnSuccessListener(g gVar) {
        return this;
    }
}
