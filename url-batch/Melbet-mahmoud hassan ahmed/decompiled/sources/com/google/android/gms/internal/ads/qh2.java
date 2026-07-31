package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.hj2;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class qh2<S extends hj2> implements ij2<S> {

    /* renamed from: a, reason: collision with root package name */
    private final ij2<S> f10685a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10686b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f10687c;

    public qh2(ij2<S> ij2Var, long j7, ScheduledExecutorService scheduledExecutorService) {
        this.f10685a = ij2Var;
        this.f10686b = j7;
        this.f10687c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<S> a() {
        cc3<S> a7 = this.f10685a.a();
        long j7 = this.f10686b;
        if (j7 > 0) {
            a7 = rb3.o(a7, j7, TimeUnit.MILLISECONDS, this.f10687c);
        }
        return rb3.g(a7, Throwable.class, new xa3() { // from class: com.google.android.gms.internal.ads.ph2
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return rb3.i(null);
            }
        }, wo0.f13899f);
    }
}
