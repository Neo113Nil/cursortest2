package com.squareup.cash.tax.presenters;

import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class TaxTooltipPresenter$MetroFactory {
    public final LambdaProvider stringManager;
    public final Provider taxDesktopTooltipPreference;

    public /* synthetic */ TaxTooltipPresenter$MetroFactory(LambdaProvider lambdaProvider, Factory factory) {
        this.stringManager = lambdaProvider;
        this.taxDesktopTooltipPreference = factory;
    }

    public /* synthetic */ TaxTooltipPresenter$MetroFactory(Provider provider, LambdaProvider lambdaProvider) {
        this.taxDesktopTooltipPreference = provider;
        this.stringManager = lambdaProvider;
    }
}
