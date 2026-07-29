package com.android.volley;

import com.android.volley.b;

/* compiled from: Response.java */
/* loaded from: classes.dex */
public class n<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f2303a;

    /* renamed from: b, reason: collision with root package name */
    public final b.a f2304b;

    /* renamed from: c, reason: collision with root package name */
    public final s f2305c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2306d;

    /* compiled from: Response.java */
    public interface a {
        void onErrorResponse(s sVar);
    }

    /* compiled from: Response.java */
    public interface b<T> {
        void onResponse(T t);
    }

    public static <T> n<T> a(T t, b.a aVar) {
        return new n<>(t, aVar);
    }

    public static <T> n<T> a(s sVar) {
        return new n<>(sVar);
    }

    public boolean a() {
        return this.f2305c == null;
    }

    private n(T t, b.a aVar) {
        this.f2306d = false;
        this.f2303a = t;
        this.f2304b = aVar;
        this.f2305c = null;
    }

    private n(s sVar) {
        this.f2306d = false;
        this.f2303a = null;
        this.f2304b = null;
        this.f2305c = sVar;
    }
}
