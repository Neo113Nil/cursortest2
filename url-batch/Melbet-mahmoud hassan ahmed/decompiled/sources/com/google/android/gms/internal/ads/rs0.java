package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
final class rs0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f11406f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f11407g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ long f11408h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ ts0 f11409i;

    rs0(ts0 ts0Var, String str, String str2, long j7) {
        this.f11409i = ts0Var;
        this.f11406f = str;
        this.f11407g = str2;
        this.f11408h = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f11406f);
        hashMap.put("cachedSrc", this.f11407g);
        hashMap.put("totalDuration", Long.toString(this.f11408h));
        ts0.f(this.f11409i, "onPrecacheEvent", hashMap);
    }
}
