package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.cache.SynchronizedDataCache;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m extends SynchronizedDataCache {

    /* renamed from: d, reason: collision with root package name */
    public static final long f8755d = 200;

    /* renamed from: e, reason: collision with root package name */
    public static final long f8756e = 50;

    /* renamed from: a, reason: collision with root package name */
    public final l f8757a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f8753b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c, reason: collision with root package name */
    public static final long f8754c = TimeUnit.MINUTES.toMillis(2);
    public static final List<String> f = Arrays.asList("gps", "network");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m() {
        this(r1, r2, 2 * r2);
        l lVar = new l(f8754c);
        long j3 = f8753b;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean shouldUpdate(Location location) {
        if (f.contains(location.getProvider())) {
            return this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData() || a(location, (Location) this.mCachedData.getData(), this.f8757a.f8752a, 200L);
        }
        return false;
    }

    public m(l lVar, long j3, long j4) {
        super(j3, j4, "location");
        this.f8757a = lVar;
    }

    public static boolean a(Location location, Location location2, long j3, long j4) {
        boolean equals;
        if (location2 == null) {
            return true;
        }
        if (location == null) {
            return false;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > j3;
        boolean z2 = time < (-j3);
        boolean z3 = time > 0;
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = ((long) accuracy) > j4;
        String provider = location.getProvider();
        String provider2 = location2.getProvider();
        if (provider == null) {
            equals = provider2 == null;
        } else {
            equals = provider.equals(provider2);
        }
        if (z5) {
            return true;
        }
        if (!z3 || z4) {
            return z3 && !z6 && equals;
        }
        return true;
    }
}
