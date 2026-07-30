package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Pg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2723Pg implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f27004A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f27005B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C2842Wg f27006C;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f27007n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f27008u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f27009v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f27010w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f27011x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f27012y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f27013z;

    public RunnableC2723Pg(C2842Wg c2842Wg, String str, String str2, int i, int i4, long j9, long j10, boolean z8, int i9, int i10) {
        this.f27007n = str;
        this.f27008u = str2;
        this.f27009v = i;
        this.f27010w = i4;
        this.f27011x = j9;
        this.f27012y = j10;
        this.f27013z = z8;
        this.f27004A = i9;
        this.f27005B = i10;
        this.f27006C = c2842Wg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f27007n);
        hashMap.put("cachedSrc", this.f27008u);
        hashMap.put("bytesLoaded", Integer.toString(this.f27009v));
        hashMap.put("totalBytes", Integer.toString(this.f27010w));
        hashMap.put("bufferedDuration", Long.toString(this.f27011x));
        hashMap.put("totalDuration", Long.toString(this.f27012y));
        hashMap.put("cacheReady", true != this.f27013z ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f27004A));
        hashMap.put("playerPreparedCount", Integer.toString(this.f27005B));
        this.f27006C.n(hashMap);
    }
}
