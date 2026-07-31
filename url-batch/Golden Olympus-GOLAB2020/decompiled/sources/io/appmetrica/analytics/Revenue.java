package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Bn;
import io.appmetrica.analytics.impl.C2911qe;
import java.util.Currency;

/* loaded from: classes3.dex */
public class Revenue {

    @NonNull
    public final Currency currency;
    public final String payload;
    public final long priceMicros;
    public final String productID;
    public final Integer quantity;
    public final Receipt receipt;

    public static class Builder {

        /* renamed from: g, reason: collision with root package name */
        private static final Bn f36852g = new Bn(new C2911qe("revenue currency"));

        /* renamed from: a, reason: collision with root package name */
        final long f36853a;

        /* renamed from: b, reason: collision with root package name */
        final Currency f36854b;

        /* renamed from: c, reason: collision with root package name */
        Integer f36855c;

        /* renamed from: d, reason: collision with root package name */
        String f36856d;

        /* renamed from: e, reason: collision with root package name */
        String f36857e;

        /* renamed from: f, reason: collision with root package name */
        Receipt f36858f;

        /* synthetic */ Builder(long j4, Currency currency, int i4) {
            this(j4, currency);
        }

        @NonNull
        public Revenue build() {
            return new Revenue(this, 0);
        }

        @NonNull
        public Builder withPayload(String str) {
            this.f36857e = str;
            return this;
        }

        @NonNull
        public Builder withProductID(String str) {
            this.f36856d = str;
            return this;
        }

        @NonNull
        public Builder withQuantity(Integer num) {
            this.f36855c = num;
            return this;
        }

        @NonNull
        public Builder withReceipt(Receipt receipt) {
            this.f36858f = receipt;
            return this;
        }

        private Builder(long j4, Currency currency) {
            f36852g.a(currency);
            this.f36853a = j4;
            this.f36854b = currency;
        }
    }

    public static class Receipt {
        public final String data;
        public final String signature;

        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            private String f36859a;

            /* renamed from: b, reason: collision with root package name */
            private String f36860b;

            /* synthetic */ Builder(int i4) {
                this();
            }

            @NonNull
            public Receipt build() {
                return new Receipt(this, 0);
            }

            @NonNull
            public Builder withData(String str) {
                this.f36859a = str;
                return this;
            }

            @NonNull
            public Builder withSignature(String str) {
                this.f36860b = str;
                return this;
            }

            private Builder() {
            }
        }

        /* synthetic */ Receipt(Builder builder, int i4) {
            this(builder);
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(0);
        }

        private Receipt(Builder builder) {
            this.data = builder.f36859a;
            this.signature = builder.f36860b;
        }
    }

    /* synthetic */ Revenue(Builder builder, int i4) {
        this(builder);
    }

    @NonNull
    public static Builder newBuilder(long j4, @NonNull Currency currency) {
        return new Builder(j4, currency, 0);
    }

    private Revenue(Builder builder) {
        this.priceMicros = builder.f36853a;
        this.currency = builder.f36854b;
        this.quantity = builder.f36855c;
        this.productID = builder.f36856d;
        this.payload = builder.f36857e;
        this.receipt = builder.f36858f;
    }
}
