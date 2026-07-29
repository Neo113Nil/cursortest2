package com.ironsource.b.d;

/* compiled from: IronSourceLogger.java */
/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    int f6761a;

    /* renamed from: b, reason: collision with root package name */
    private String f6762b;

    /* compiled from: IronSourceLogger.java */
    public enum a {
        API,
        ADAPTER_API,
        CALLBACK,
        ADAPTER_CALLBACK,
        NETWORK,
        INTERNAL,
        NATIVE,
        EVENT
    }

    public abstract void a(a aVar, String str, int i);

    public abstract void a(a aVar, String str, Throwable th);

    c(String str) {
        this.f6762b = str;
        this.f6761a = 0;
    }

    c(String str, int i) {
        this.f6762b = str;
        this.f6761a = i;
    }

    String a() {
        return this.f6762b;
    }

    int b() {
        return this.f6761a;
    }

    public void a(int i) {
        this.f6761a = i;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        return this.f6762b != null && this.f6762b.equals(((c) obj).f6762b);
    }
}
