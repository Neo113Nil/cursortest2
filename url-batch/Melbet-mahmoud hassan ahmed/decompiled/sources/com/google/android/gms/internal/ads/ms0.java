package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
final class ms0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f8695f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f8696g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f8697h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f8698i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ ts0 f8699j;

    ms0(ts0 ts0Var, String str, String str2, int i7, int i8, boolean z6) {
        this.f8699j = ts0Var;
        this.f8695f = str;
        this.f8696g = str2;
        this.f8697h = i7;
        this.f8698i = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f8695f);
        hashMap.put("cachedSrc", this.f8696g);
        hashMap.put("bytesLoaded", Integer.toString(this.f8697h));
        hashMap.put("totalBytes", Integer.toString(this.f8698i));
        hashMap.put("cacheReady", "0");
        ts0.f(this.f8699j, "onPrecacheEvent", hashMap);
    }
}
