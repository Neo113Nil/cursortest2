package com.android.volley;

/* compiled from: VolleyError.java */
/* loaded from: classes.dex */
public class s extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final i f2307a;

    /* renamed from: b, reason: collision with root package name */
    private long f2308b;

    public s() {
        this.f2307a = null;
    }

    public s(i iVar) {
        this.f2307a = iVar;
    }

    public s(Throwable th) {
        super(th);
        this.f2307a = null;
    }

    void a(long j) {
        this.f2308b = j;
    }
}
