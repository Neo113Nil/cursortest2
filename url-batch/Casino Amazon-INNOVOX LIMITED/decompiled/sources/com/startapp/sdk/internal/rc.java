package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class rc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f403a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ tc d;

    public rc(tc tcVar, String str, boolean z, String str2) {
        this.d = tcVar;
        this.f403a = str;
        this.b = z;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a(this.f403a, this.c, this.b);
    }
}
