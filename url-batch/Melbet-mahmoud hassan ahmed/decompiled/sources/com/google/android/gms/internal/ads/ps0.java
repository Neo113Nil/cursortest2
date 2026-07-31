package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
final class ps0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f10358f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f10359g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f10360h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f10361i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ long f10362j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ long f10363k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ boolean f10364l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ int f10365m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ int f10366n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ ts0 f10367o;

    ps0(ts0 ts0Var, String str, String str2, int i7, int i8, long j7, long j8, boolean z6, int i9, int i10) {
        this.f10367o = ts0Var;
        this.f10358f = str;
        this.f10359g = str2;
        this.f10360h = i7;
        this.f10361i = i8;
        this.f10362j = j7;
        this.f10363k = j8;
        this.f10364l = z6;
        this.f10365m = i9;
        this.f10366n = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f10358f);
        hashMap.put("cachedSrc", this.f10359g);
        hashMap.put("bytesLoaded", Integer.toString(this.f10360h));
        hashMap.put("totalBytes", Integer.toString(this.f10361i));
        hashMap.put("bufferedDuration", Long.toString(this.f10362j));
        hashMap.put("totalDuration", Long.toString(this.f10363k));
        hashMap.put("cacheReady", true != this.f10364l ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f10365m));
        hashMap.put("playerPreparedCount", Integer.toString(this.f10366n));
        ts0.f(this.f10367o, "onPrecacheEvent", hashMap);
    }
}
