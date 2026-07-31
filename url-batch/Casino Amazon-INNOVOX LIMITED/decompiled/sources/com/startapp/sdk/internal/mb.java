package com.startapp.sdk.internal;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class mb {
    public static final AtomicBoolean e = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final Context f335a;
    public final pa b;
    public final pa c;
    public final c7 d;

    public mb(Context context, pa paVar, pa paVar2, c7 c7Var) {
        this.f335a = context;
        this.b = paVar;
        this.c = paVar2;
        this.d = c7Var;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 30 && e.compareAndSet(false, true)) {
            v7 v7Var = (v7) this.b.a();
            v7Var.f464a.post(new Runnable() { // from class: com.startapp.sdk.internal.mb$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    mb.this.b();
                }
            });
        }
    }

    public final void b() {
        String description;
        ComponentInfoEventConfig componentInfoEventConfig;
        try {
            ActivityManager activityManager = (ActivityManager) this.f335a.getSystemService("activity");
            if (activityManager == null) {
                return;
            }
            List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.isEmpty()) {
                return;
            }
            long j = ((af) this.c.a()).getLong("memoryLimiterLastExitTimestamp", 0L);
            long j2 = j;
            for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
                long timestamp = applicationExitInfo.getTimestamp();
                if (timestamp > j) {
                    if (timestamp > j2) {
                        j2 = timestamp;
                    }
                    if (applicationExitInfo.getReason() == 13 && (description = applicationExitInfo.getDescription()) != null && description.contains("MemoryLimiter:AnonSwap") && (componentInfoEventConfig = (ComponentInfoEventConfig) this.d.call()) != null && componentInfoEventConfig.a(1L)) {
                        n8 n8Var = new n8(o8.d);
                        n8Var.d = "memoryLimiterKill";
                        n8Var.e = applicationExitInfo.getDescription();
                        n8Var.a();
                    }
                }
            }
            if (j2 > j) {
                ((af) this.c.a()).edit().putLong("memoryLimiterLastExitTimestamp", j2).apply();
            }
        } catch (Throwable unused) {
        }
    }
}
