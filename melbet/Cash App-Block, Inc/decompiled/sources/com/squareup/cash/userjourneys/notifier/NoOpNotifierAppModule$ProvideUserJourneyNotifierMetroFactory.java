package com.squareup.cash.userjourneys.notifier;

import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class NoOpNotifierAppModule$ProvideUserJourneyNotifierMetroFactory implements Factory {
    public static final NoOpNotifierAppModule$ProvideUserJourneyNotifierMetroFactory INSTANCE = new NoOpNotifierAppModule$ProvideUserJourneyNotifierMetroFactory();

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        return NoOpUserJourneyNotifier.INSTANCE;
    }
}
