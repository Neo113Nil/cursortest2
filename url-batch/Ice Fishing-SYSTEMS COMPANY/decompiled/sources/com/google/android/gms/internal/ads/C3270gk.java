package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.ads.gk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3270gk {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f31098a;

    public C3270gk(C2953au c2953au) {
        AtomicLong atomicLong = new AtomicLong();
        this.f31098a = atomicLong;
        atomicLong.set(((C3226fu) c2953au.f29348a.f26393u).f30917u.get());
    }

    public final void a(long j9) {
        this.f31098a.set(j9);
    }
}
