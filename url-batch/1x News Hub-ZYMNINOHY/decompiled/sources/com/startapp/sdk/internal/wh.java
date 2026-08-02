package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class wh extends d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ de f4698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4699b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yh f4700c;

    public wh(yh yhVar, de deVar, long j3) {
        this.f4700c = yhVar;
        this.f4698a = deVar;
        this.f4699b = j3;
    }

    @Override // com.startapp.sdk.internal.d3
    public final void a(za zaVar) {
        yh yhVar = this.f4700c;
        int abs = Math.abs(Arrays.hashCode(this.f4698a.f3695a));
        long j3 = this.f4699b;
        synchronized (yhVar) {
            yhVar.f4818b.put(Integer.valueOf(abs), yhVar.f4819c.scheduleAtFixedRate(zaVar, j3, j3, TimeUnit.MILLISECONDS));
        }
    }
}
