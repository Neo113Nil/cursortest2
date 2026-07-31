package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class gl2 implements ij2<hl2> {

    /* renamed from: a, reason: collision with root package name */
    final ScheduledExecutorService f5679a;

    /* renamed from: b, reason: collision with root package name */
    final Context f5680b;

    /* renamed from: c, reason: collision with root package name */
    final dh0 f5681c;

    public gl2(dh0 dh0Var, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.f5681c = dh0Var;
        this.f5679a = scheduledExecutorService;
        this.f5680b = context;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<hl2> a() {
        return rb3.m(rb3.o(rb3.i(new Bundle()), ((Long) sw.c().b(m10.F2)).longValue(), TimeUnit.MILLISECONDS, this.f5679a), new e43() { // from class: com.google.android.gms.internal.ads.fl2
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                return new hl2((Bundle) obj);
            }
        }, wo0.f13894a);
    }
}
