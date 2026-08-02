package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class jd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4026c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ld f4027d;

    public jd(ld ldVar, String str, boolean z, String str2) {
        this.f4027d = ldVar;
        this.f4024a = str;
        this.f4025b = z;
        this.f4026c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4027d.a(this.f4024a, this.f4026c, this.f4025b);
    }
}
