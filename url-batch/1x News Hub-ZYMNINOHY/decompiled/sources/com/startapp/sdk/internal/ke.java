package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class ke implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gj f4059a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4060b;

    public ke(gj gjVar, String str) {
        this.f4059a = gjVar;
        this.f4060b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gj gjVar = this.f4059a;
        String str = this.f4060b;
        me meVar = gjVar.f3901a;
        if (meVar != null) {
            meVar.a(str);
        }
    }
}
