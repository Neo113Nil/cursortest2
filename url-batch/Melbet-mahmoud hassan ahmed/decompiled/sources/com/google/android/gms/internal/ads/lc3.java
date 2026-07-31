package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class lc3<V> implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    oc3<V> f7933f;

    lc3(oc3<V> oc3Var) {
        this.f7933f = oc3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
    
        r1 = ((com.google.android.gms.internal.ads.oc3) r0).f9607m;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        cc3<? extends V> cc3Var;
        ScheduledFuture scheduledFuture;
        oc3<V> oc3Var = this.f7933f;
        if (oc3Var == null || cc3Var == null) {
            return;
        }
        this.f7933f = null;
        if (cc3Var.isDone()) {
            oc3Var.y(cc3Var);
            return;
        }
        try {
            scheduledFuture = ((oc3) oc3Var).f9608n;
            ((oc3) oc3Var).f9608n = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        StringBuilder sb = new StringBuilder(75);
                        sb.append("Timed out");
                        sb.append(" (timeout delayed by ");
                        sb.append(abs);
                        sb.append(" ms after scheduled time)");
                        str = sb.toString();
                    }
                } catch (Throwable th) {
                    oc3Var.x(new nc3(str, null));
                    throw th;
                }
            }
            String obj = cc3Var.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 2 + obj.length());
            sb2.append(str);
            sb2.append(": ");
            sb2.append(obj);
            oc3Var.x(new nc3(sb2.toString(), null));
        } finally {
            cc3Var.cancel(true);
        }
    }
}
