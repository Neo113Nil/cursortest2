package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class qc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f391a;
    public final /* synthetic */ tc b;

    public qc(tc tcVar, String str) {
        this.b = tcVar;
        this.f391a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.b;
        String str = this.f391a;
        tcVar.r = System.currentTimeMillis();
        tcVar.q.put(tcVar.e, Float.valueOf((r2 - tcVar.r) / 1000.0f));
        tcVar.q.put(str, Float.valueOf(-1.0f));
        tcVar.e = str;
    }
}
