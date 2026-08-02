package comsquareupcashexchangedatadb;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.protos.common.CurrencyCode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Exchange_data {
    public final CurrencyCode base_currency_code;
    public final CurrencyCode quote_currency_code;
    public final List rates;
    public final long timestamp;

    public Exchange_data(CurrencyCode currencyCode, CurrencyCode currencyCode2, List list, long j) {
        currencyCode.getClass();
        currencyCode2.getClass();
        list.getClass();
        this.base_currency_code = currencyCode;
        this.quote_currency_code = currencyCode2;
        this.rates = list;
        this.timestamp = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Exchange_data)) {
            return false;
        }
        Exchange_data exchange_data = (Exchange_data) obj;
        return this.base_currency_code == exchange_data.base_currency_code && this.quote_currency_code == exchange_data.quote_currency_code && Intrinsics.areEqual(this.rates, exchange_data.rates) && this.timestamp == exchange_data.timestamp;
    }

    public final int hashCode() {
        return Long.hashCode(this.timestamp) + Recorder$$ExternalSyntheticOutline2.m((this.quote_currency_code.hashCode() + (this.base_currency_code.hashCode() * 31)) * 31, 31, this.rates);
    }

    public final String toString() {
        return "Exchange_data(base_currency_code=" + this.base_currency_code + ", quote_currency_code=" + this.quote_currency_code + ", rates=" + this.rates + ", timestamp=" + this.timestamp + ")";
    }
}
