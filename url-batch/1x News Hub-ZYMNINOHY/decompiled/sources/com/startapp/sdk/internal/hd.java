package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class hd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3935a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ld f3936b;

    public hd(ld ldVar, String str) {
        this.f3936b = ldVar;
        this.f3935a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ld ldVar = this.f3936b;
        String str = this.f3935a;
        if (!ldVar.f4095h) {
            ldVar.f4104r = System.currentTimeMillis();
            ldVar.f4103q.put(str, Float.valueOf(-1.0f));
            ldVar.f4092d.postDelayed(ldVar.f4105s, ldVar.f4096i);
            ldVar.f4095h = true;
        }
        ldVar.f4102p = false;
        ldVar.a();
    }
}
