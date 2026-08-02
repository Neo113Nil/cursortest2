package com.squareup.cash.userjourneys.tracker;

import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class UserJourneysModule$Companion$ProvideCdfJourneyMapMetroFactory implements Factory {
    public static final UserJourneysModule$Companion$ProvideCdfJourneyMapMetroFactory INSTANCE = new UserJourneysModule$Companion$ProvideCdfJourneyMapMetroFactory();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return RealCdfJourneyMap.INSTANCE;
    }
}
