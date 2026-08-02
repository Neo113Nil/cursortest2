package io.appmetrica.analytics;

import io.appmetrica.analytics.impl.C0511be;
import io.appmetrica.analytics.impl.En;
import java.util.Currency;

/* loaded from: classes.dex */
public class Revenue {
    public final Currency currency;
    public final String payload;
    public final long priceMicros;
    public final String productID;
    public final Integer quantity;
    public final Receipt receipt;

    public static class Builder {

        /* renamed from: g, reason: collision with root package name */
        private static final En f9403g = new En(new C0511be("revenue currency"));

        /* renamed from: a, reason: collision with root package name */
        final long f9404a;

        /* renamed from: b, reason: collision with root package name */
        final Currency f9405b;

        /* renamed from: c, reason: collision with root package name */
        Integer f9406c;

        /* renamed from: d, reason: collision with root package name */
        String f9407d;

        /* renamed from: e, reason: collision with root package name */
        String f9408e;

        /* renamed from: f, reason: collision with root package name */
        Receipt f9409f;

        public /* synthetic */ Builder(long j4, Currency currency, int i4) {
            this(j4, currency);
        }

        public Revenue build() {
            return new Revenue(this, 0);
        }

        public Builder withPayload(String str) {
            this.f9408e = str;
            return this;
        }

        public Builder withProductID(String str) {
            this.f9407d = str;
            return this;
        }

        public Builder withQuantity(Integer num) {
            this.f9406c = num;
            return this;
        }

        public Builder withReceipt(Receipt receipt) {
            this.f9409f = receipt;
            return this;
        }

        private Builder(long j4, Currency currency) {
            f9403g.a(currency);
            this.f9404a = j4;
            this.f9405b = currency;
        }
    }

    public static class Receipt {
        public final String data;
        public final String signature;

        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            private String f9410a;

            /* renamed from: b, reason: collision with root package name */
            private String f9411b;

            public /* synthetic */ Builder(int i4) {
                this();
            }

            public Receipt build() {
                return new Receipt(this, 0);
            }

            public Builder withData(String str) {
                this.f9410a = str;
                return this;
            }

            public Builder withSignature(String str) {
                this.f9411b = str;
                return this;
            }

            private Builder() {
            }
        }

        public /* synthetic */ Receipt(Builder builder, int i4) {
            this(builder);
        }

        public static Builder newBuilder() {
            return new Builder(0);
        }

        private Receipt(Builder builder) {
            this.data = builder.f9410a;
            this.signature = builder.f9411b;
        }
    }

    public /* synthetic */ Revenue(Builder builder, int i4) {
        this(builder);
    }

    public static Builder newBuilder(long j4, Currency currency) {
        return new Builder(j4, currency, 0);
    }

    private Revenue(Builder builder) {
        this.priceMicros = builder.f9404a;
        this.currency = builder.f9405b;
        this.quantity = builder.f9406c;
        this.productID = builder.f9407d;
        this.payload = builder.f9408e;
        this.receipt = builder.f9409f;
    }
}
