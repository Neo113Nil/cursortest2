package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.AbstractC0709no;
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
        private final BigDecimal f5095a;

        /* renamed from: b, reason: collision with root package name */
        private final Currency f5096b;

        /* renamed from: c, reason: collision with root package name */
        private AdType f5097c;

        /* renamed from: d, reason: collision with root package name */
        private String f5098d;

        /* renamed from: e, reason: collision with root package name */
        private String f5099e;
        private String f;

        /* renamed from: g, reason: collision with root package name */
        private String f5100g;

        /* renamed from: h, reason: collision with root package name */
        private String f5101h;

        /* renamed from: i, reason: collision with root package name */
        private String f5102i;

        /* renamed from: j, reason: collision with root package name */
        private Map f5103j;

        public /* synthetic */ Builder(BigDecimal bigDecimal, Currency currency, int i3) {
            this(bigDecimal, currency);
        }

        public AdRevenue build() {
            return new AdRevenue(this.f5095a, this.f5096b, this.f5097c, this.f5098d, this.f5099e, this.f, this.f5100g, this.f5101h, this.f5102i, this.f5103j, 0);
        }

        public Builder withAdNetwork(String str) {
            this.f5098d = str;
            return this;
        }

        public Builder withAdPlacementId(String str) {
            this.f5100g = str;
            return this;
        }

        public Builder withAdPlacementName(String str) {
            this.f5101h = str;
            return this;
        }

        public Builder withAdType(AdType adType) {
            this.f5097c = adType;
            return this;
        }

        public Builder withAdUnitId(String str) {
            this.f5099e = str;
            return this;
        }

        public Builder withAdUnitName(String str) {
            this.f = str;
            return this;
        }

        public Builder withPayload(Map<String, String> map) {
            this.f5103j = map == null ? null : CollectionUtils.copyOf(map);
            return this;
        }

        public Builder withPrecision(String str) {
            this.f5102i = str;
            return this;
        }

        private Builder(BigDecimal bigDecimal, Currency currency) {
            this.f5095a = bigDecimal;
            this.f5096b = currency;
        }
    }

    public /* synthetic */ AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i3) {
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

    public static Builder newBuilder(long j3, Currency currency) {
        return new Builder(AbstractC0709no.a(j3), currency, 0);
    }

    public static Builder newBuilder(double d3, Currency currency) {
        return new Builder(new BigDecimal(AbstractC0709no.a(d3)), currency, 0);
    }
}
