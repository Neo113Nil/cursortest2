package com.baidu.mapapi.http.wrapper;

import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class AsyncResponse<T> {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f5469a = com.baidu.mapapi.a.a();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f5470b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5471c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5472d = false;

    /* renamed from: e, reason: collision with root package name */
    private Callback<T> f5473e;

    /* renamed from: f, reason: collision with root package name */
    private T f5474f;

    /* renamed from: g, reason: collision with root package name */
    private Throwable f5475g;

    public interface Callback<T> {
        void onFailed(Throwable th);

        void onSuccess(T t7);
    }

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AsyncResponse f5476a;

        a(AsyncResponse asyncResponse) {
            this.f5476a = asyncResponse;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f5476a) {
                try {
                    if (this.f5476a.f5470b && !this.f5476a.f5472d) {
                        if (this.f5476a.f5471c) {
                            this.f5476a.f5473e.onSuccess(this.f5476a.f5474f);
                        } else {
                            this.f5476a.f5473e.onFailed(this.f5476a.f5475g);
                        }
                        this.f5476a.f5472d = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AsyncResponse f5478a;

        b(AsyncResponse asyncResponse) {
            this.f5478a = asyncResponse;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f5478a) {
                try {
                    if (this.f5478a.f5473e != null && !this.f5478a.f5472d) {
                        this.f5478a.f5473e.onSuccess(this.f5478a.f5474f);
                        this.f5478a.f5472d = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AsyncResponse f5480a;

        c(AsyncResponse asyncResponse) {
            this.f5480a = asyncResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f5480a) {
                try {
                    if (this.f5480a.f5473e != null && !this.f5480a.f5472d) {
                        this.f5480a.f5473e.onFailed(this.f5480a.f5475g);
                        this.f5480a.f5472d = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setCallback(Callback<T> callback) {
        this.f5473e = callback;
        f5469a.submit(new a(this));
    }

    protected void a(T t7) {
        synchronized (this) {
            this.f5474f = t7;
            this.f5470b = true;
            this.f5471c = true;
        }
        f5469a.submit(new b(this));
    }

    protected void a(Throwable th) {
        synchronized (this) {
            this.f5475g = th;
            this.f5470b = true;
        }
        f5469a.submit(new c(this));
    }
}
