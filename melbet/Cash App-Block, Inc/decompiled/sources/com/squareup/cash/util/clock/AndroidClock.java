package com.squareup.cash.util.clock;

import android.os.SystemClock;
import dev.zacsweers.metro.internal.Factory;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AndroidClock {
    public final /* synthetic */ int $r8$classId;

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new AndroidClock(0);
        }
    }

    public /* synthetic */ AndroidClock(int i) {
        this.$r8$classId = i;
    }

    public static TimeZone getTimeZoneOrDefault(String str) {
        String str2;
        String[] availableIDs = TimeZone.getAvailableIDs();
        availableIDs.getClass();
        int length = availableIDs.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str2 = null;
                break;
            }
            str2 = availableIDs[i];
            if (Intrinsics.areEqual(str2, str)) {
                break;
            }
            i++;
        }
        if (str2 == null) {
            TimeZone timeZone = TimeZone.getDefault();
            timeZone.getClass();
            return timeZone;
        }
        TimeZone timeZone2 = TimeZone.getTimeZone(str2);
        timeZone2.getClass();
        return timeZone2;
    }

    public final long elapsedRealtime() {
        switch (this.$r8$classId) {
            case 0:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }

    public final long millis() {
        switch (this.$r8$classId) {
        }
        return System.currentTimeMillis();
    }

    /* renamed from: nanoTime-eFsXEgE, reason: not valid java name */
    public final long m3790nanoTimeeFsXEgE() {
        switch (this.$r8$classId) {
        }
        return System.nanoTime();
    }

    public final TimeZone timeZone() {
        switch (this.$r8$classId) {
            case 0:
                TimeZone timeZone = TimeZone.getDefault();
                String id = timeZone.getID();
                return Intrinsics.areEqual(id, "America/Costa_Rica") ? getTimeZoneOrDefault("America/Belize") : Intrinsics.areEqual(id, "America/Santo_Domingo") ? getTimeZoneOrDefault("America/Puerto_Rico") : timeZone;
            default:
                return TimeZone.getDefault();
        }
    }
}
