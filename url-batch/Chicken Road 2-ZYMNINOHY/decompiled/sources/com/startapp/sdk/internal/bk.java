package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class bk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk f6726b;

    public bk(dk dkVar, String str) {
        this.f6726b = dkVar;
        this.f6725a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6726b.f6826d.a(this.f6725a);
    }
}
