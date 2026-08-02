package com.squareup.cash.ui.util;

import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;

/* loaded from: classes6.dex */
public final class BalanceAnimator {
    public BalanceAnimator(LocalizedMoneyFormatter.Factory factory) {
        factory.create(MoneyFormatterConfig.STANDARD);
    }
}
