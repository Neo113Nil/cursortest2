package com.stripe.android.financialconnections.features.accountpicker;

import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AccountPickerState$ViewEffect$OpenUrl {
    public final long id;
    public final String url;

    public AccountPickerState$ViewEffect$OpenUrl(String str, long j) {
        str.getClass();
        this.url = str;
        this.id = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountPickerState$ViewEffect$OpenUrl)) {
            return false;
        }
        AccountPickerState$ViewEffect$OpenUrl accountPickerState$ViewEffect$OpenUrl = (AccountPickerState$ViewEffect$OpenUrl) obj;
        return Intrinsics.areEqual(this.url, accountPickerState$ViewEffect$OpenUrl.url) && this.id == accountPickerState$ViewEffect$OpenUrl.id;
    }

    public final int hashCode() {
        return Long.hashCode(this.id) + (this.url.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("OpenUrl(url=", this.url, ", id=", this.id);
        m.append(")");
        return m.toString();
    }
}
