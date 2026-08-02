package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class id implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ld f3970b;

    public id(ld ldVar, String str) {
        this.f3970b = ldVar;
        this.f3969a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ld ldVar = this.f3970b;
        String str = this.f3969a;
        ldVar.getClass();
        ldVar.f4104r = System.currentTimeMillis();
        ldVar.f4103q.put(ldVar.f4093e, Float.valueOf((r2 - ldVar.f4104r) / 1000.0f));
        ldVar.f4103q.put(str, Float.valueOf(-1.0f));
        ldVar.f4093e = str;
    }
}
