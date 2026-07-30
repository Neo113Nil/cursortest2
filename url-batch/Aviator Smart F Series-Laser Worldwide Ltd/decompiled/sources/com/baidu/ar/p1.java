package com.baidu.ar;

import com.baidu.ar.callback.ICallback;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.callback.IError;

/* loaded from: classes.dex */
public class p1<T> extends e0<T, T> {

    /* renamed from: i, reason: collision with root package name */
    public ICallback f2927i;

    /* renamed from: j, reason: collision with root package name */
    public IError f2928j;

    public p1(ICallback iCallback, IError iError) {
        this.f2927i = iCallback;
        this.f2928j = iError;
    }

    @Override // com.baidu.ar.e0
    public void a(int i8, String str, IError iError) {
        IError iError2 = this.f2928j;
        if (iError2 != null) {
            iError2.onError(i8, str, null);
        }
    }

    @Override // com.baidu.ar.e0
    public void b() {
    }

    @Override // com.baidu.ar.e0
    public void a(T t7, ICallbackWith<T> iCallbackWith, IError iError) {
        ICallback iCallback = this.f2927i;
        if (iCallback != null) {
            iCallback.run();
        }
    }
}
