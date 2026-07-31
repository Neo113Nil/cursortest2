package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
final class qs0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f10816f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f10817g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f10818h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ ts0 f10819i;

    qs0(ts0 ts0Var, String str, String str2, int i7) {
        this.f10819i = ts0Var;
        this.f10816f = str;
        this.f10817g = str2;
        this.f10818h = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f10816f);
        hashMap.put("cachedSrc", this.f10817g);
        hashMap.put("totalBytes", Integer.toString(this.f10818h));
        ts0.f(this.f10819i, "onPrecacheEvent", hashMap);
    }
}
