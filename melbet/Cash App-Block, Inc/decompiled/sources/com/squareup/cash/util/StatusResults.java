package com.squareup.cash.util;

import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.StatusResult;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes6.dex */
public abstract class StatusResults {
    public static final StatusResult replaceTemplateArgs(StatusResult statusResult, Money money, LocalizedMoneyFormatter.Factory factory) {
        statusResult.getClass();
        if (money == null) {
            return statusResult;
        }
        String format2 = factory.create(MoneyFormatterConfig.COMPACT).format(money);
        String str = statusResult.text;
        String replace$default = str != null ? StringsKt__StringsJVMKt.replace$default(str, "{{amount}}", format2) : null;
        String str2 = statusResult.promo_text;
        return StatusResult.copy$default(statusResult, replace$default, null, null, str2 != null ? StringsKt__StringsJVMKt.replace$default(str2, "{{amount}}", format2) : null, null, null, null, null, null, null, 32733);
    }
}
