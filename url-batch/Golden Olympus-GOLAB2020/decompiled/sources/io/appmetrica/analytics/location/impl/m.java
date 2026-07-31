package io.appmetrica.analytics.location.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.appmetrica.analytics.coreutils.internal.cache.SynchronizedDataCache;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class m extends SynchronizedDataCache {

    /* renamed from: d, reason: collision with root package name */
    public static final long f40451d = 200;

    /* renamed from: e, reason: collision with root package name */
    public static final long f40452e = 50;

    /* renamed from: a, reason: collision with root package name */
    public final l f40454a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f40449b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c, reason: collision with root package name */
    public static final long f40450c = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: f, reason: collision with root package name */
    public static final List<String> f40453f = Arrays.asList("gps", "network");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m() {
        this(r1, r2, 2 * r2);
        l lVar = new l(f40450c);
        long j4 = f40449b;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean shouldUpdate(@NonNull Location location) {
        if (f40453f.contains(location.getProvider())) {
            return this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData() || a(location, (Location) this.mCachedData.getData(), this.f40454a.f40448a, 200L);
        }
        return false;
    }

    public m(l lVar, long j4, long j5) {
        super(j4, j5, FirebaseAnalytics.Param.LOCATION);
        this.f40454a = lVar;
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
        boolean z4 = time > j4;
        boolean z5 = time < (-j4);
        boolean z6 = time > 0;
        if (z4) {
            return true;
        }
        if (z5) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z7 = accuracy > 0;
        boolean z8 = accuracy < 0;
        boolean z9 = ((long) accuracy) > j5;
        String provider = location.getProvider();
        String provider2 = location2.getProvider();
        if (provider == null) {
            equals = provider2 == null;
        } else {
            equals = provider.equals(provider2);
        }
        if (z8) {
            return true;
        }
        if (!z6 || z7) {
            return z6 && !z9 && equals;
        }
        return true;
    }
}
