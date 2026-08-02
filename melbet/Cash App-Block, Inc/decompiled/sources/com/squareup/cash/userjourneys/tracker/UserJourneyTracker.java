package com.squareup.cash.userjourneys.tracker;

import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes.dex */
public interface UserJourneyTracker {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long defaultTimeout;

        static {
            Duration.Companion companion = Duration.Companion;
            defaultTimeout = DurationKt.toDuration(10, DurationUnit.MINUTES);
        }
    }

    /* renamed from: startJourney-crs4WS4$default, reason: not valid java name */
    static void m3788startJourneycrs4WS4$default(UserJourneyTracker userJourneyTracker, UserJourney$Name userJourney$Name) {
        Companion.getClass();
        long j = Companion.defaultTimeout;
        RealUserJourneyTracker realUserJourneyTracker = (RealUserJourneyTracker) userJourneyTracker;
        realUserJourneyTracker.getClass();
        userJourney$Name.getClass();
        realUserJourneyTracker.m3787startJourneytmZmOBY(userJourney$Name, j, null, null, false);
    }
}
