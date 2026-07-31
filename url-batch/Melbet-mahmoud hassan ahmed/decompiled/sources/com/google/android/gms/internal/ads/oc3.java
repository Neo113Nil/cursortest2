package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class oc3<V> extends hb3<V> {

    /* renamed from: m, reason: collision with root package name */
    private cc3<V> f9607m;

    /* renamed from: n, reason: collision with root package name */
    private ScheduledFuture<?> f9608n;

    private oc3(cc3<V> cc3Var) {
        Objects.requireNonNull(cc3Var);
        this.f9607m = cc3Var;
    }

    static <V> cc3<V> G(cc3<V> cc3Var, long j7, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        oc3 oc3Var = new oc3(cc3Var);
        lc3 lc3Var = new lc3(oc3Var);
        oc3Var.f9608n = scheduledExecutorService.schedule(lc3Var, j7, timeUnit);
        cc3Var.b(lc3Var, fb3.INSTANCE);
        return oc3Var;
    }

    @Override // com.google.android.gms.internal.ads.ga3
    protected final String i() {
        cc3<V> cc3Var = this.f9607m;
        ScheduledFuture<?> scheduledFuture = this.f9608n;
        if (cc3Var == null) {
            return null;
        }
        String obj = cc3Var.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 14);
        sb.append("inputFuture=[");
        sb.append(obj);
        sb.append("]");
        String sb2 = sb.toString();
        if (scheduledFuture == null) {
            return sb2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder(sb2.length() + 43);
        sb3.append(sb2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.ads.ga3
    protected final void j() {
        u(this.f9607m);
        ScheduledFuture<?> scheduledFuture = this.f9608n;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f9607m = null;
        this.f9608n = null;
    }
}
