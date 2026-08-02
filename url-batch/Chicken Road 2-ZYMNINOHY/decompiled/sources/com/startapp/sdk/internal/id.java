package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class id implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ld f7096b;

    public id(ld ldVar, String str) {
        this.f7096b = ldVar;
        this.f7095a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ld ldVar = this.f7096b;
        String str = this.f7095a;
        ldVar.getClass();
        ldVar.f7232r = System.currentTimeMillis();
        ldVar.f7231q.put(ldVar.f7221e, Float.valueOf((r2 - ldVar.f7232r) / 1000.0f));
        ldVar.f7231q.put(str, Float.valueOf(-1.0f));
        ldVar.f7221e = str;
    }
}
