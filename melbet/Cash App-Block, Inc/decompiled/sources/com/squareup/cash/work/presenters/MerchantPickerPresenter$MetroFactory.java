package com.squareup.cash.work.presenters;

import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;

/* loaded from: classes.dex */
public final class MerchantPickerPresenter$MetroFactory {
    public final DoubleCheck merchantRepository;
    public final DoubleCheck selectedMerchantProvider;
    public final DoubleCheck selectedMerchantSetter;
    public final Provider sellerCardViewModelProducer;

    public MerchantPickerPresenter$MetroFactory(DoubleCheck doubleCheck, RealSessionFlags.MetroFactory metroFactory, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3) {
        this.selectedMerchantProvider = doubleCheck;
        this.sellerCardViewModelProducer = metroFactory;
        this.selectedMerchantSetter = doubleCheck2;
        this.merchantRepository = doubleCheck3;
    }

    public MerchantPickerPresenter$MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, ShiftsAnalytics.MetroFactory metroFactory) {
        this.selectedMerchantProvider = doubleCheck;
        this.selectedMerchantSetter = doubleCheck2;
        this.merchantRepository = doubleCheck3;
        this.sellerCardViewModelProducer = metroFactory;
    }
}
