package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.AbstractC2713io;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;

/* loaded from: classes3.dex */
public class AdRevenue {
    public final String adNetwork;
    public final String adPlacementId;
    public final String adPlacementName;

    @NonNull
    public final BigDecimal adRevenue;
    public final AdType adType;
    public final String adUnitId;
    public final String adUnitName;

    @NonNull
    public final Currency currency;
    public final Map<String, String> payload;
    public final String precision;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final BigDecimal f36770a;

        /* renamed from: b, reason: collision with root package name */
        private final Currency f36771b;

        /* renamed from: c, reason: collision with root package name */
        private AdType f36772c;

        /* renamed from: d, reason: collision with root package name */
        private String f36773d;

        /* renamed from: e, reason: collision with root package name */
        private String f36774e;

        /* renamed from: f, reason: collision with root package name */
        private String f36775f;

        /* renamed from: g, reason: collision with root package name */
        private String f36776g;

        /* renamed from: h, reason: collision with root package name */
        private String f36777h;

        /* renamed from: i, reason: collision with root package name */
        private String f36778i;

        /* renamed from: j, reason: collision with root package name */
        private Map f36779j;

        /* synthetic */ Builder(BigDecimal bigDecimal, Currency currency, int i4) {
            this(bigDecimal, currency);
        }

        public AdRevenue build() {
            return new AdRevenue(this.f36770a, this.f36771b, this.f36772c, this.f36773d, this.f36774e, this.f36775f, this.f36776g, this.f36777h, this.f36778i, this.f36779j, 0);
        }

        public Builder withAdNetwork(String str) {
            this.f36773d = str;
            return this;
        }

        public Builder withAdPlacementId(String str) {
            this.f36776g = str;
            return this;
        }

        public Builder withAdPlacementName(String str) {
            this.f36777h = str;
            return this;
        }

        public Builder withAdType(AdType adType) {
            this.f36772c = adType;
            return this;
        }

        public Builder withAdUnitId(String str) {
            this.f36774e = str;
            return this;
        }

        public Builder withAdUnitName(String str) {
            this.f36775f = str;
            return this;
        }

        public Builder withPayload(Map<String, String> map) {
            this.f36779j = map == null ? null : CollectionUtils.copyOf(map);
            return this;
        }

        public Builder withPrecision(String str) {
            this.f36778i = str;
            return this;
        }

        private Builder(BigDecimal bigDecimal, Currency currency) {
            this.f36770a = bigDecimal;
            this.f36771b = currency;
        }
    }

    /* synthetic */ AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i4) {
        this(bigDecimal, currency, adType, str, str2, str3, str4, str5, str6, map);
    }

    public static Builder newBuilder(@NonNull BigDecimal bigDecimal, @NonNull Currency currency) {
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

    public static Builder newBuilder(long j4, @NonNull Currency currency) {
        return new Builder(AbstractC2713io.a(j4), currency, 0);
    }

    public static Builder newBuilder(double d4, @NonNull Currency currency) {
        return new Builder(new BigDecimal(AbstractC2713io.a(d4)), currency, 0);
    }
}
