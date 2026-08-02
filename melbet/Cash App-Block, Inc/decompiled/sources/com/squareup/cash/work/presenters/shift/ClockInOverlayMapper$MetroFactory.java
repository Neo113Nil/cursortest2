package com.squareup.cash.work.presenters.shift;

import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.localization.RealLocaleAssetProvider$MetroFactory;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.RealDrawerOpener$MetroFactory;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.data.real.RealLastClockedInInfoUseCase;
import com.squareup.cash.work.data.real.RealShiftTimeFormatter;
import com.squareup.cash.work.presenters.shift.data.ClockInStateResolver;
import com.squareup.cash.work.presenters.shift.geofence.GeofenceStateResolver;
import dev.chrisbanes.haze.Pool;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import io.noties.markwon.MarkwonConfiguration;

/* loaded from: classes.dex */
public final class ClockInOverlayMapper$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId = 0;
    public final Provider clockInStateResolver;
    public final Provider moneyFormatterFactory;
    public final Provider shiftTimeFormatter;
    public final LambdaProvider stringManager;
    public final Provider wageCalculator;

    public ClockInOverlayMapper$MetroFactory(RealMessageSigner.MetroFactory metroFactory, LambdaProvider lambdaProvider, ShiftsAnalytics.MetroFactory metroFactory2, RealDrawerOpener$MetroFactory realDrawerOpener$MetroFactory, RealLocaleAssetProvider$MetroFactory realLocaleAssetProvider$MetroFactory) {
        this.moneyFormatterFactory = metroFactory;
        this.stringManager = lambdaProvider;
        this.shiftTimeFormatter = metroFactory2;
        this.clockInStateResolver = realDrawerOpener$MetroFactory;
        this.wageCalculator = realLocaleAssetProvider$MetroFactory;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Provider provider = this.wageCalculator;
        Provider provider2 = this.clockInStateResolver;
        Provider provider3 = this.shiftTimeFormatter;
        Provider provider4 = this.moneyFormatterFactory;
        LambdaProvider lambdaProvider = this.stringManager;
        switch (i) {
            case 0:
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider4.invoke();
                AndroidStringManager androidStringManager = (AndroidStringManager) lambdaProvider.lambda.invoke();
                RealShiftTimeFormatter realShiftTimeFormatter = (RealShiftTimeFormatter) provider3.invoke();
                ClockInStateResolver clockInStateResolver = (ClockInStateResolver) provider2.invoke();
                Pool pool = (Pool) ((RealLocaleAssetProvider$MetroFactory) provider).invoke();
                factory.getClass();
                androidStringManager.getClass();
                realShiftTimeFormatter.getClass();
                clockInStateResolver.getClass();
                return new MarkwonConfiguration(factory, androidStringManager, realShiftTimeFormatter, clockInStateResolver, pool);
            default:
                AndroidStringManager androidStringManager2 = (AndroidStringManager) lambdaProvider.lambda.invoke();
                RealShiftTimeFormatter realShiftTimeFormatter2 = (RealShiftTimeFormatter) provider4.invoke();
                ClockInStateResolver clockInStateResolver2 = (ClockInStateResolver) provider3.invoke();
                RealLastClockedInInfoUseCase realLastClockedInInfoUseCase = (RealLastClockedInInfoUseCase) provider2.invoke();
                GeofenceStateResolver geofenceStateResolver = (GeofenceStateResolver) provider.invoke();
                androidStringManager2.getClass();
                realShiftTimeFormatter2.getClass();
                clockInStateResolver2.getClass();
                realLastClockedInInfoUseCase.getClass();
                geofenceStateResolver.getClass();
                return new MarkwonConfiguration(androidStringManager2, realShiftTimeFormatter2, clockInStateResolver2, realLastClockedInInfoUseCase, geofenceStateResolver);
        }
    }

    public ClockInOverlayMapper$MetroFactory(LambdaProvider lambdaProvider, ShiftsAnalytics.MetroFactory metroFactory, RealDrawerOpener$MetroFactory realDrawerOpener$MetroFactory, RealDrawerOpener$MetroFactory realDrawerOpener$MetroFactory2, RealDrawerOpener$MetroFactory realDrawerOpener$MetroFactory3) {
        this.stringManager = lambdaProvider;
        this.moneyFormatterFactory = metroFactory;
        this.shiftTimeFormatter = realDrawerOpener$MetroFactory;
        this.clockInStateResolver = realDrawerOpener$MetroFactory2;
        this.wageCalculator = realDrawerOpener$MetroFactory3;
    }
}
