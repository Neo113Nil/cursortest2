package com.baidu.mapapi.http.wrapper;

/* loaded from: classes2.dex */
public class Response<T> {

    /* renamed from: a, reason: collision with root package name */
    private T f5502a;

    /* renamed from: b, reason: collision with root package name */
    private Throwable f5503b;

    public Response() {
    }

    public T getData() {
        return this.f5502a;
    }

    public Throwable getE() {
        return this.f5503b;
    }

    public void setData(T t7) {
        this.f5502a = t7;
    }

    public void setE(Throwable th) {
        this.f5503b = th;
    }

    public Response(T t7, Throwable th) {
        this.f5502a = t7;
        this.f5503b = th;
    }
}
