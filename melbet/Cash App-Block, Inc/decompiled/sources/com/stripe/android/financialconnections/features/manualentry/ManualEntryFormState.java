package com.stripe.android.financialconnections.features.manualentry;

import com.squareup.cash.R;
import kotlin.text.CharsKt__CharKt;
import kotlin.text.Regex;

/* loaded from: classes8.dex */
public final class ManualEntryFormState {
    public final String account;
    public final String accountConfirm;
    public final String routing;

    public ManualEntryFormState(String str, String str2, String str3) {
        this.routing = str;
        this.account = str2;
        this.accountConfirm = str3;
    }

    public final Integer getAccountConfirmError() {
        String str;
        String str2 = this.account;
        if (str2 != null && (str = this.accountConfirm) != null) {
            str2.getClass();
            str.getClass();
            if ((str2.length() == 0 ? Integer.valueOf(R.string.stripe_validation_account_required) : str2.length() > 17 ? Integer.valueOf(R.string.stripe_validation_account_too_long) : null) == null && !str2.equals(str)) {
                return Integer.valueOf(R.string.stripe_validation_account_confirm_mismatch);
            }
        }
        return null;
    }

    public final Integer getAccountError() {
        String str = this.account;
        if (str == null) {
            return null;
        }
        str.getClass();
        if (str.length() == 0) {
            return Integer.valueOf(R.string.stripe_validation_account_required);
        }
        if (str.length() > 17) {
            return Integer.valueOf(R.string.stripe_validation_account_too_long);
        }
        return null;
    }

    public final Integer getRoutingError() {
        String str = this.routing;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return Integer.valueOf(R.string.stripe_validation_routing_required);
        }
        if (str.length() != 9) {
            return Integer.valueOf(R.string.stripe_validation_routing_too_short);
        }
        if (new Regex("^\\d{9}$").matches(str)) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                int i4 = i3 + 1;
                int digitToInt = CharsKt__CharKt.digitToInt(str.charAt(i));
                int i5 = 3;
                int i6 = i3 % 3;
                if (i6 != 0) {
                    i5 = 1;
                    if (i6 == 1) {
                        i5 = 7;
                    }
                }
                i2 += i5 * digitToInt;
                i++;
                i3 = i4;
            }
            if (i2 % 10 == 0) {
                return null;
            }
        }
        return Integer.valueOf(R.string.stripe_validation_no_us_routing);
    }
}
