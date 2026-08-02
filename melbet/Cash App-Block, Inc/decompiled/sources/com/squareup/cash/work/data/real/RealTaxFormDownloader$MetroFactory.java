package com.squareup.cash.work.data.real;

import app.cash.onboarding.global.countries.RealCountryOnboardingConfigRepo;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.timestampformatter.impl.RealTimestampFormatter$Factory$Impl;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.work.presenters.pay.PayHistoryListViewModelMapper;
import com.squareup.scannerview.TextSetter;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class RealTaxFormDownloader$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final LambdaProvider baseUrl;
    public final Provider fileDownloader;
    public final LambdaProvider ioDispatcher;

    public RealTaxFormDownloader$MetroFactory(RealFileDownloader.MetroFactory metroFactory, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2) {
        this.$r8$classId = 0;
        this.fileDownloader = metroFactory;
        this.baseUrl = lambdaProvider;
        this.ioDispatcher = lambdaProvider2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Provider provider = this.fileDownloader;
        LambdaProvider lambdaProvider = this.ioDispatcher;
        LambdaProvider lambdaProvider2 = this.baseUrl;
        switch (i) {
            case 0:
                RealFileDownloader realFileDownloader = (RealFileDownloader) provider.invoke();
                String str = (String) lambdaProvider2.lambda.invoke();
                CoroutineContext coroutineContext = (CoroutineContext) lambdaProvider.lambda.invoke();
                realFileDownloader.getClass();
                str.getClass();
                coroutineContext.getClass();
                return new TextSetter(realFileDownloader, str, coroutineContext);
            case 1:
                AndroidStringManager androidStringManager = (AndroidStringManager) lambdaProvider2.lambda.invoke();
                RealLocaleManager realLocaleManager = (RealLocaleManager) lambdaProvider.lambda.invoke();
                RealCountryOnboardingConfigRepo realCountryOnboardingConfigRepo = (RealCountryOnboardingConfigRepo) provider.invoke();
                androidStringManager.getClass();
                realLocaleManager.getClass();
                realCountryOnboardingConfigRepo.getClass();
                return new Instrument$Adapter(androidStringManager, realLocaleManager, realCountryOnboardingConfigRepo);
            case 2:
                AndroidAccessibilityManager androidAccessibilityManager = (AndroidAccessibilityManager) lambdaProvider2.lambda.invoke();
                AndroidStringManager androidStringManager2 = (AndroidStringManager) lambdaProvider.lambda.invoke();
                RealTimestampFormatter$Factory$Impl realTimestampFormatter$Factory$Impl = (RealTimestampFormatter$Factory$Impl) provider.invoke();
                androidAccessibilityManager.getClass();
                androidStringManager2.getClass();
                realTimestampFormatter$Factory$Impl.getClass();
                return new TextSetter(androidAccessibilityManager, androidStringManager2, realTimestampFormatter$Factory$Impl);
            default:
                AndroidStringManager androidStringManager3 = (AndroidStringManager) lambdaProvider2.lambda.invoke();
                AndroidClock androidClock = (AndroidClock) lambdaProvider.lambda.invoke();
                RealShiftTimeFormatter realShiftTimeFormatter = (RealShiftTimeFormatter) provider.invoke();
                androidStringManager3.getClass();
                androidClock.getClass();
                realShiftTimeFormatter.getClass();
                return new PayHistoryListViewModelMapper(androidStringManager3, androidClock, realShiftTimeFormatter);
        }
    }

    public /* synthetic */ RealTaxFormDownloader$MetroFactory(LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, Factory factory, int i) {
        this.$r8$classId = i;
        this.baseUrl = lambdaProvider;
        this.ioDispatcher = lambdaProvider2;
        this.fileDownloader = factory;
    }
}
