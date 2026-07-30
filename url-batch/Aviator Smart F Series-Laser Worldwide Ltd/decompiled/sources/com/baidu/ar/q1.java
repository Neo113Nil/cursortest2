package com.baidu.ar;

import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.callback.IError;
import com.baidu.ar.content.IRequestCallback;

/* loaded from: classes.dex */
public class q1<T> extends e0<T, T> {

    /* renamed from: i, reason: collision with root package name */
    public IRequestCallback<T> f2969i;

    public q1(IRequestCallback<T> iRequestCallback) {
        this.f2969i = iRequestCallback;
    }

    @Override // com.baidu.ar.e0
    public void a(int i8, String str, IError iError) {
        IRequestCallback<T> iRequestCallback = this.f2969i;
        if (iRequestCallback != null) {
            iRequestCallback.onFail(i8, str);
        }
    }

    @Override // com.baidu.ar.e0
    public void b() {
    }

    @Override // com.baidu.ar.e0
    public void a(T t7, ICallbackWith<T> iCallbackWith, IError iError) {
        IRequestCallback<T> iRequestCallback = this.f2969i;
        if (iRequestCallback != null) {
            iRequestCallback.onResponse(t7);
        }
    }
}
