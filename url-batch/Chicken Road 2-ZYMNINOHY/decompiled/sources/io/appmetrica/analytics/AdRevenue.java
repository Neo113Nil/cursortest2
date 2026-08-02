package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.AbstractC0779lo;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;

/* loaded from: classes.dex */
public class AdRevenue {
    public final String adNetwork;
    public final String adPlacementId;
    public final String adPlacementName;
    public final BigDecimal adRevenue;
    public final AdType adType;
    public final String adUnitId;
    public final String adUnitName;
    public final Currency currency;
    public final Map<String, String> payload;
    public final String precision;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final BigDecimal f9325a;

        /* renamed from: b, reason: collision with root package name */
        private final Currency f9326b;

        /* renamed from: c, reason: collision with root package name */
        private AdType f9327c;

        /* renamed from: d, reason: collision with root package name */
        private String f9328d;

        /* renamed from: e, reason: collision with root package name */
        private String f9329e;

        /* renamed from: f, reason: collision with root package name */
        private String f9330f;

        /* renamed from: g, reason: collision with root package name */
        private String f9331g;

        /* renamed from: h, reason: collision with root package name */
        private String f9332h;

        /* renamed from: i, reason: collision with root package name */
        private String f9333i;

        /* renamed from: j, reason: collision with root package name */
        private Map f9334j;

        public /* synthetic */ Builder(BigDecimal bigDecimal, Currency currency, int i4) {
            this(bigDecimal, currency);
        }

        public AdRevenue build() {
            return new AdRevenue(this.f9325a, this.f9326b, this.f9327c, this.f9328d, this.f9329e, this.f9330f, this.f9331g, this.f9332h, this.f9333i, this.f9334j, 0);
        }

        public Builder withAdNetwork(String str) {
            this.f9328d = str;
            return this;
        }

        public Builder withAdPlacementId(String str) {
            this.f9331g = str;
            return this;
        }

        public Builder withAdPlacementName(String str) {
            this.f9332h = str;
            return this;
        }

        public Builder withAdType(AdType adType) {
            this.f9327c = adType;
            return this;
        }

        public Builder withAdUnitId(String str) {
            this.f9329e = str;
            return this;
        }

        public Builder withAdUnitName(String str) {
            this.f9330f = str;
            return this;
        }

        public Builder withPayload(Map<String, String> map) {
            this.f9334j = map == null ? null : CollectionUtils.copyOf(map);
            return this;
        }

        public Builder withPrecision(String str) {
            this.f9333i = str;
            return this;
        }

        private Builder(BigDecimal bigDecimal, Currency currency) {
            this.f9325a = bigDecimal;
            this.f9326b = currency;
        }
    }

    public /* synthetic */ AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i4) {
        this(bigDecimal, currency, adType, str, str2, str3, str4, str5, str6, map);
    }

    public static Builder newBuilder(BigDecimal bigDecimal, Currency currency) {
        return new Builder(bigDecimal, currency, 0);
    }

    private AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.adRevenue = bigDecimal;
        this.currency = currency;
        this.adType = adType;
        this.adNetwork = str;
        this.adUnitId = str2;
        this.adUnitName = str3;
        this.adPlacementId = str4;
        this.adPlacementName = str5;
        this.precision = str6;
        this.payload = map == null ? null : CollectionUtils.unmodifiableMapCopy(map);
    }

    public static Builder newBuilder(long j4, Currency currency) {
        return new Builder(AbstractC0779lo.a(j4), currency, 0);
    }

    public static Builder newBuilder(double d4, Currency currency) {
        return new Builder(new BigDecimal(AbstractC0779lo.a(d4)), currency, 0);
    }
}
