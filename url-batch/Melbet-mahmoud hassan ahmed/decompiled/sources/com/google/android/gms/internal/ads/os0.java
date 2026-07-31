package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
final class os0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f9805f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f9806g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ long f9807h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ long f9808i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ long f9809j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ long f9810k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ long f9811l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ boolean f9812m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ int f9813n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ int f9814o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ ts0 f9815p;

    os0(ts0 ts0Var, String str, String str2, long j7, long j8, long j9, long j10, long j11, boolean z6, int i7, int i8) {
        this.f9815p = ts0Var;
        this.f9805f = str;
        this.f9806g = str2;
        this.f9807h = j7;
        this.f9808i = j8;
        this.f9809j = j9;
        this.f9810k = j10;
        this.f9811l = j11;
        this.f9812m = z6;
        this.f9813n = i7;
        this.f9814o = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f9805f);
        hashMap.put("cachedSrc", this.f9806g);
        hashMap.put("bufferedDuration", Long.toString(this.f9807h));
        hashMap.put("totalDuration", Long.toString(this.f9808i));
        if (((Boolean) sw.c().b(m10.f8290r1)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.f9809j));
            hashMap.put("qoeCachedBytes", Long.toString(this.f9810k));
            hashMap.put("totalBytes", Long.toString(this.f9811l));
            hashMap.put("reportTime", Long.toString(y2.t.a().b()));
        }
        hashMap.put("cacheReady", true != this.f9812m ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f9813n));
        hashMap.put("playerPreparedCount", Integer.toString(this.f9814o));
        ts0.f(this.f9815p, "onPrecacheEvent", hashMap);
    }
}
