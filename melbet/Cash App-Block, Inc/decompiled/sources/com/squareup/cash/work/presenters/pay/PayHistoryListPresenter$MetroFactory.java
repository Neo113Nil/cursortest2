package com.squareup.cash.work.presenters.pay;

import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.data.real.RealTaxFormDownloader$MetroFactory;
import com.squareup.cash.work.presenters.shift.DashboardShiftMapper$MetroFactory;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;

/* loaded from: classes.dex */
public final class PayHistoryListPresenter$MetroFactory {
    public final Provider payHistoryListViewModelMapper;
    public final DoubleCheck payrollJsonService;
    public final DoubleCheck selectedMerchantDataProvider;
    public final DoubleCheck selectedMerchantProvider;
    public final Provider sellerCardViewModelProducer;
    public final Provider shiftsAnalytics;
    public final Provider stringManager;

    public PayHistoryListPresenter$MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, ShiftsAnalytics.MetroFactory metroFactory, RealTaxFormDownloader$MetroFactory realTaxFormDownloader$MetroFactory, ShiftsAnalytics.MetroFactory metroFactory2) {
        this.stringManager = lambdaProvider;
        this.payrollJsonService = doubleCheck;
        this.selectedMerchantProvider = doubleCheck2;
        this.selectedMerchantDataProvider = doubleCheck3;
        this.sellerCardViewModelProducer = metroFactory;
        this.payHistoryListViewModelMapper = realTaxFormDownloader$MetroFactory;
        this.shiftsAnalytics = metroFactory2;
    }

    public PayHistoryListPresenter$MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory2, DashboardShiftMapper$MetroFactory dashboardShiftMapper$MetroFactory, ShiftsAnalytics.MetroFactory metroFactory) {
        this.payrollJsonService = doubleCheck;
        this.selectedMerchantProvider = doubleCheck2;
        this.selectedMerchantDataProvider = doubleCheck3;
        this.sellerCardViewModelProducer = walletUiFactory$MetroFactory;
        this.shiftsAnalytics = walletUiFactory$MetroFactory2;
        this.stringManager = dashboardShiftMapper$MetroFactory;
        this.payHistoryListViewModelMapper = metroFactory;
    }
}
