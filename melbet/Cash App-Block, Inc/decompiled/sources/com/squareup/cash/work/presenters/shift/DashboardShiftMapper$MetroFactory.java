package com.squareup.cash.work.presenters.shift;

import androidx.emoji2.text.MetadataRepo;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.RealDrawerOpener$MetroFactory;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.data.real.RealShiftTimeFormatter;
import com.squareup.cash.work.presenters.shift.data.ClockInStateResolver;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import io.noties.markwon.MarkwonConfiguration;

/* loaded from: classes.dex */
public final class DashboardShiftMapper$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId = 0;
    public final LambdaProvider clock;
    public final Provider clockInStateResolver;
    public final Provider shiftTimeFormatter;
    public final LambdaProvider stringManager;

    public DashboardShiftMapper$MetroFactory(LambdaProvider lambdaProvider, ShiftsAnalytics.MetroFactory metroFactory, RealDrawerOpener$MetroFactory realDrawerOpener$MetroFactory, LambdaProvider lambdaProvider2) {
        this.stringManager = lambdaProvider;
        this.shiftTimeFormatter = metroFactory;
        this.clockInStateResolver = realDrawerOpener$MetroFactory;
        this.clock = lambdaProvider2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Provider provider = this.clockInStateResolver;
        LambdaProvider lambdaProvider = this.clock;
        Provider provider2 = this.shiftTimeFormatter;
        LambdaProvider lambdaProvider2 = this.stringManager;
        switch (i) {
            case 0:
                AndroidStringManager androidStringManager = (AndroidStringManager) lambdaProvider2.lambda.invoke();
                RealShiftTimeFormatter realShiftTimeFormatter = (RealShiftTimeFormatter) provider2.invoke();
                ClockInStateResolver clockInStateResolver = (ClockInStateResolver) provider.invoke();
                AndroidClock androidClock = (AndroidClock) lambdaProvider.lambda.invoke();
                androidStringManager.getClass();
                realShiftTimeFormatter.getClass();
                clockInStateResolver.getClass();
                androidClock.getClass();
                return new MarkwonConfiguration(androidStringManager, realShiftTimeFormatter, clockInStateResolver, androidClock);
            default:
                RealLocaleManager realLocaleManager = (RealLocaleManager) lambdaProvider2.lambda.invoke();
                RealShiftTimeFormatter realShiftTimeFormatter2 = (RealShiftTimeFormatter) provider2.invoke();
                AndroidStringManager androidStringManager2 = (AndroidStringManager) lambdaProvider.lambda.invoke();
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider.invoke();
                realLocaleManager.getClass();
                realShiftTimeFormatter2.getClass();
                androidStringManager2.getClass();
                factory.getClass();
                return new MetadataRepo(realLocaleManager, realShiftTimeFormatter2, androidStringManager2, factory);
        }
    }

    public DashboardShiftMapper$MetroFactory(LambdaProvider lambdaProvider, ShiftsAnalytics.MetroFactory metroFactory, LambdaProvider lambdaProvider2, RealMessageSigner.MetroFactory metroFactory2) {
        this.stringManager = lambdaProvider;
        this.shiftTimeFormatter = metroFactory;
        this.clock = lambdaProvider2;
        this.clockInStateResolver = metroFactory2;
    }
}
