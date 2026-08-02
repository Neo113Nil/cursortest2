package com.squareup.cash.taptopay.presenters;

import app.cash.badging.backend.RealBadger2;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class TapToPayPaymentRequestPresenter$MetroFactory {
    public final DoubleCheck clientRouteParser;
    public final Provider moneyFormatterFactory;
    public final Provider routerFactory;
    public final Provider tapToPayAnalyticsHelper;
    public final Provider tapToPayRepository;

    public TapToPayPaymentRequestPresenter$MetroFactory(InstanceFactory instanceFactory, RealKeyStoreProvider.MetroFactory metroFactory, DoubleCheck doubleCheck, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, DoubleCheck doubleCheck2) {
        this.routerFactory = instanceFactory;
        this.moneyFormatterFactory = metroFactory;
        this.tapToPayAnalyticsHelper = doubleCheck;
        this.tapToPayRepository = broadwayModule$ProvideBroadwayMetroFactory;
        this.clientRouteParser = doubleCheck2;
    }

    public TapToPayPaymentRequestPresenter$MetroFactory(InstanceFactory instanceFactory, DoubleCheck doubleCheck, RealMessageSigner.MetroFactory metroFactory, DoubleCheck doubleCheck2, RealBadger2.MetroFactory metroFactory2) {
        this.routerFactory = instanceFactory;
        this.clientRouteParser = doubleCheck;
        this.moneyFormatterFactory = metroFactory;
        this.tapToPayAnalyticsHelper = doubleCheck2;
        this.tapToPayRepository = metroFactory2;
    }
}
