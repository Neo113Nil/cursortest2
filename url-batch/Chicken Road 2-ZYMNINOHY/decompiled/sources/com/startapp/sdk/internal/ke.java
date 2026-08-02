package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class ke implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gj f7187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7188b;

    public ke(gj gjVar, String str) {
        this.f7187a = gjVar;
        this.f7188b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gj gjVar = this.f7187a;
        String str = this.f7188b;
        me meVar = gjVar.f7024a;
        if (meVar != null) {
            meVar.a(str);
        }
    }
}
