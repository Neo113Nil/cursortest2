package com.squareup.cash.transfers.screens;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.transfers.screens.BalanceBasedAutoReloadConfirmationScreen;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.blockers.BalanceBasedAddCashPreferenceBlocker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes8.dex */
public abstract class BalanceBasedAutoReloadConfirmationExtKt {
    public static final BalanceBasedAutoReloadConfirmationScreen.ConfirmationData.AmountSelectionConfig asConfig(BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig amountSelectionConfig, Boolean bool) {
        Money money = amountSelectionConfig.initial_amount;
        if (money == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return null;
        }
        CurrencyCode currencyCode = money.currency_code;
        String requireNotBlank = requireNotBlank(amountSelectionConfig.title);
        Money money2 = amountSelectionConfig.amount_custom_min;
        if (money2 == null) {
            money2 = new Money((Long) 0L, currencyCode, 4);
        }
        Money money3 = amountSelectionConfig.amount_custom_max;
        if (money3 == null) {
            money3 = new Money((Long) 9999999L, currencyCode, 4);
        }
        CurrencyCode currencyCode2 = CurrencyCode.USD;
        return new BalanceBasedAutoReloadConfirmationScreen.ConfirmationData.AmountSelectionConfig(requireNotBlank, money, money2, money3, new Money((Long) 2000L, currencyCode2, 4), new Money((Long) 2000L, currencyCode2, 4), Intrinsics.areEqual(bool, Boolean.TRUE));
    }

    public static final BalanceBasedAutoReloadConfirmationScreen asScreen(BalanceBasedAddCashPreferenceBlocker balanceBasedAddCashPreferenceBlocker, BlockersData blockersData) {
        balanceBasedAddCashPreferenceBlocker.getClass();
        BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig amountSelectionConfig = balanceBasedAddCashPreferenceBlocker.minimum_balance_config;
        if (amountSelectionConfig == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return null;
        }
        BalanceBasedAddCashPreferenceBlocker.AmountSelectionConfig amountSelectionConfig2 = balanceBasedAddCashPreferenceBlocker.increment_config;
        if (amountSelectionConfig2 == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return null;
        }
        Instrument instrument = amountSelectionConfig.debit_card;
        if (instrument == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return null;
        }
        BalanceBasedAddCashPreferenceBlocker.AutoOpen autoOpen = balanceBasedAddCashPreferenceBlocker.auto_open;
        BalanceBasedAddCashPreferenceBlocker.AutoOpen.AutoOpenMinimumBalance autoOpenMinimumBalance = autoOpen instanceof BalanceBasedAddCashPreferenceBlocker.AutoOpen.AutoOpenMinimumBalance ? (BalanceBasedAddCashPreferenceBlocker.AutoOpen.AutoOpenMinimumBalance) autoOpen : null;
        Boolean valueOf = autoOpenMinimumBalance != null ? Boolean.valueOf(autoOpenMinimumBalance.getValue()) : null;
        BalanceBasedAddCashPreferenceBlocker.AutoOpen autoOpen2 = balanceBasedAddCashPreferenceBlocker.auto_open;
        BalanceBasedAddCashPreferenceBlocker.AutoOpen.AutoOpenIncrementConfig autoOpenIncrementConfig = autoOpen2 instanceof BalanceBasedAddCashPreferenceBlocker.AutoOpen.AutoOpenIncrementConfig ? (BalanceBasedAddCashPreferenceBlocker.AutoOpen.AutoOpenIncrementConfig) autoOpen2 : null;
        return new BalanceBasedAutoReloadConfirmationScreen(blockersData, new BalanceBasedAutoReloadConfirmationScreen.ConfirmationData(requireNotBlank(balanceBasedAddCashPreferenceBlocker.title), requireNotBlank(balanceBasedAddCashPreferenceBlocker.subtitle), asConfig(amountSelectionConfig, valueOf), asConfig(amountSelectionConfig2, autoOpenIncrementConfig != null ? Boolean.valueOf(autoOpenIncrementConfig.getValue()) : null), requireNotBlank(balanceBasedAddCashPreferenceBlocker.cta_button_label), new BalanceBasedAutoReloadConfirmationScreen.ConfirmationData.FundingSource(requireNotBlank(amountSelectionConfig.instrument_details), instrument.bank_name, instrument)));
    }

    public static final String requireNotBlank(String str) {
        if (str == null || StringsKt.isBlank(str)) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
        return null;
    }
}
