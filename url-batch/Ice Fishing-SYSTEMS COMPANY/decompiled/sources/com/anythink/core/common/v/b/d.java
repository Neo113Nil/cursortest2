package com.anythink.core.common.v.b;

/* loaded from: classes.dex */
public abstract class d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final int f16873d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f16874e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f16875f = 3;

    /* renamed from: h, reason: collision with root package name */
    protected e f16879h;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f16878g = true;
    protected int i = 1;

    /* renamed from: a, reason: collision with root package name */
    private long f16876a = 0;

    /* renamed from: b, reason: collision with root package name */
    private String f16877b = "anythink_default_thread";

    private String c() {
        return this.f16877b;
    }

    public abstract void a();

    public final void a(long j9) {
        this.f16876a = j9;
    }

    public final long b() {
        return this.f16876a;
    }

    @Override // java.lang.Runnable
    public void run() {
        Thread.currentThread().setName(this.f16877b);
        a();
    }

    private void a(e eVar) {
        this.f16879h = eVar;
    }

    public final void a(String str) {
        this.f16877b = str;
    }
}
