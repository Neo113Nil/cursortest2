package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class bk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk f3619b;

    public bk(dk dkVar, String str) {
        this.f3619b = dkVar;
        this.f3618a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3619b.f3712d.a(this.f3618a);
    }
}
