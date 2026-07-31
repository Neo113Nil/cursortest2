package com.yandex.mobile.ads.impl;

import android.location.Location;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class es0 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f25406a = TimeUnit.MINUTES.toMillis(2);

    public static boolean a(@NotNull Location updatedLocation, @Nullable Location location) {
        Intrinsics.checkNotNullParameter(updatedLocation, "updatedLocation");
        if (location != null) {
            long time = updatedLocation.getTime() - location.getTime();
            long j4 = f25406a;
            boolean z4 = time > j4;
            boolean z5 = time < (-j4);
            boolean z6 = time > 0;
            int accuracy = (int) (updatedLocation.getAccuracy() - location.getAccuracy());
            boolean z7 = accuracy > 0;
            boolean z8 = accuracy < 0;
            boolean z9 = ((long) accuracy) > 200;
            boolean areEqual = Intrinsics.areEqual(updatedLocation.getProvider(), location.getProvider());
            if (!z4 && (z5 || (!z8 && ((!z6 || z7) && (!z6 || z9 || !areEqual))))) {
                return false;
            }
        }
        return true;
    }
}
