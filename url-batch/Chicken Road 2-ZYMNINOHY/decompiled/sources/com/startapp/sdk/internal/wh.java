package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class wh extends d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ de f7844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f7845b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yh f7846c;

    public wh(yh yhVar, de deVar, long j4) {
        this.f7846c = yhVar;
        this.f7844a = deVar;
        this.f7845b = j4;
    }

    @Override // com.startapp.sdk.internal.d3
    public final void a(za zaVar) {
        yh yhVar = this.f7846c;
        int abs = Math.abs(Arrays.hashCode(this.f7844a.f6809a));
        long j4 = this.f7845b;
        synchronized (yhVar) {
            yhVar.f7966b.put(Integer.valueOf(abs), yhVar.f7967c.scheduleAtFixedRate(zaVar, j4, j4, TimeUnit.MILLISECONDS));
        }
    }
}
