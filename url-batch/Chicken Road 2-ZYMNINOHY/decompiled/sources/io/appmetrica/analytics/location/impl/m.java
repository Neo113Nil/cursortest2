package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.cache.SynchronizedDataCache;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m extends SynchronizedDataCache {

    /* renamed from: d, reason: collision with root package name */
    public static final long f13149d = 200;

    /* renamed from: e, reason: collision with root package name */
    public static final long f13150e = 50;

    /* renamed from: a, reason: collision with root package name */
    public final l f13152a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f13147b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c, reason: collision with root package name */
    public static final long f13148c = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: f, reason: collision with root package name */
    public static final List<String> f13151f = Arrays.asList("gps", "network");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m() {
        this(r1, r2, 2 * r2);
        l lVar = new l(f13148c);
        long j4 = f13147b;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean shouldUpdate(Location location) {
        if (f13151f.contains(location.getProvider())) {
            return this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData() || a(location, (Location) this.mCachedData.getData(), this.f13152a.f13146a, 200L);
        }
        return false;
    }

    public m(l lVar, long j4, long j5) {
        super(j4, j5, "location");
        this.f13152a = lVar;
    }

    public static boolean a(Location location, Location location2, long j4, long j5) {
        boolean equals;
        if (location2 == null) {
            return true;
        }
        if (location == null) {
            return false;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > j4;
        boolean z4 = time < (-j4);
        boolean z5 = time > 0;
        if (z) {
            return true;
        }
        if (z4) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z6 = accuracy > 0;
        boolean z7 = accuracy < 0;
        boolean z8 = ((long) accuracy) > j5;
        String provider = location.getProvider();
        String provider2 = location2.getProvider();
        if (provider == null) {
            equals = provider2 == null;
        } else {
            equals = provider.equals(provider2);
        }
        if (z7) {
            return true;
        }
        if (!z5 || z6) {
            return z5 && !z8 && equals;
        }
        return true;
    }
}
