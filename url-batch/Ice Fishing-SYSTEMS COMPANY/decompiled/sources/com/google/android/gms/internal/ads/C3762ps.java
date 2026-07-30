package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.ps, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3762ps {

    /* renamed from: a, reason: collision with root package name */
    public final J3.a f33524a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33525b;

    /* renamed from: c, reason: collision with root package name */
    public final S2.a f33526c;

    public C3762ps(J3.a aVar, long j9, S2.a aVar2) {
        this.f33524a = aVar;
        this.f33526c = aVar2;
        aVar2.getClass();
        this.f33525b = SystemClock.elapsedRealtime() + j9;
    }
}
