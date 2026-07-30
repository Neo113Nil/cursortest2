package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Og, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2706Og implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ boolean f26719A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f26720B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ int f26721C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ AbstractC2791Tg f26722D;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f26723n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f26724u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f26725v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f26726w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f26727x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f26728y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f26729z;

    public RunnableC2706Og(AbstractC2791Tg abstractC2791Tg, String str, String str2, long j9, long j10, long j11, long j12, long j13, boolean z8, int i, int i4) {
        this.f26723n = str;
        this.f26724u = str2;
        this.f26725v = j9;
        this.f26726w = j10;
        this.f26727x = j11;
        this.f26728y = j12;
        this.f26729z = j13;
        this.f26719A = z8;
        this.f26720B = i;
        this.f26721C = i4;
        Objects.requireNonNull(abstractC2791Tg);
        this.f26722D = abstractC2791Tg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f26723n);
        hashMap.put("cachedSrc", this.f26724u);
        hashMap.put("bufferedDuration", Long.toString(this.f26725v));
        hashMap.put("totalDuration", Long.toString(this.f26726w));
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31828x2)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.f26727x));
            hashMap.put("qoeCachedBytes", Long.toString(this.f26728y));
            hashMap.put("totalBytes", Long.toString(this.f26729z));
            p2.j.f39798C.f39810k.getClass();
            hashMap.put("reportTime", Long.toString(System.currentTimeMillis()));
        }
        hashMap.put("cacheReady", true != this.f26719A ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f26720B));
        hashMap.put("playerPreparedCount", Integer.toString(this.f26721C));
        this.f26722D.n(hashMap);
    }
}
