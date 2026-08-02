package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class jd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7153b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7154c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ld f7155d;

    public jd(ld ldVar, String str, boolean z, String str2) {
        this.f7155d = ldVar;
        this.f7152a = str;
        this.f7153b = z;
        this.f7154c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7155d.a(this.f7152a, this.f7154c, this.f7153b);
    }
}
