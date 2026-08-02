package com.google.android.libraries.performance.primes.metrics.storage;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageStats;
import defpackage.eiu;
import defpackage.hkf;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class PackageStatsCapture$PackageStatsCallback extends IPackageStatsObserver.Stub {
    private final Semaphore a = new Semaphore(1);
    private volatile PackageStats b;

    private PackageStatsCapture$PackageStatsCallback() {
    }

    public void onGetStatsCompleted(PackageStats packageStats, boolean z) {
        if (z) {
            ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsCallback", "onGetStatsCompleted", 50, "PackageStatsCapture.java")).u("Success getting PackageStats: %s", packageStats);
            this.b = packageStats;
        } else {
            ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsCallback", "onGetStatsCompleted", 53, "PackageStatsCapture.java")).s("Failure getting PackageStats");
        }
        this.a.release();
    }
}
