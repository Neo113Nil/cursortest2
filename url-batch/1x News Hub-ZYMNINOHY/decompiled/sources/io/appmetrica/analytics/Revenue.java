package io.appmetrica.analytics;

import io.appmetrica.analytics.impl.C0570ie;
import io.appmetrica.analytics.impl.Gn;
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
        private static final Gn f5169g = new Gn(new C0570ie("revenue currency"));

        /* renamed from: a, reason: collision with root package name */
        final long f5170a;

        /* renamed from: b, reason: collision with root package name */
        final Currency f5171b;

        /* renamed from: c, reason: collision with root package name */
        Integer f5172c;

        /* renamed from: d, reason: collision with root package name */
        String f5173d;

        /* renamed from: e, reason: collision with root package name */
        String f5174e;
        Receipt f;

        public /* synthetic */ Builder(long j3, Currency currency, int i3) {
            this(j3, currency);
        }

        public Revenue build() {
            return new Revenue(this, 0);
        }

        public Builder withPayload(String str) {
            this.f5174e = str;
            return this;
        }

        public Builder withProductID(String str) {
            this.f5173d = str;
            return this;
        }

        public Builder withQuantity(Integer num) {
            this.f5172c = num;
            return this;
        }

        public Builder withReceipt(Receipt receipt) {
            this.f = receipt;
            return this;
        }

        private Builder(long j3, Currency currency) {
            f5169g.a(currency);
            this.f5170a = j3;
            this.f5171b = currency;
        }
    }

    public static class Receipt {
        public final String data;
        public final String signature;

        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            private String f5175a;

            /* renamed from: b, reason: collision with root package name */
            private String f5176b;

            public /* synthetic */ Builder(int i3) {
                this();
            }

            public Receipt build() {
                return new Receipt(this, 0);
            }

            public Builder withData(String str) {
                this.f5175a = str;
                return this;
            }

            public Builder withSignature(String str) {
                this.f5176b = str;
                return this;
            }

            private Builder() {
            }
        }

        public /* synthetic */ Receipt(Builder builder, int i3) {
            this(builder);
        }

        public static Builder newBuilder() {
            return new Builder(0);
        }

        private Receipt(Builder builder) {
            this.data = builder.f5175a;
            this.signature = builder.f5176b;
        }
    }

    public /* synthetic */ Revenue(Builder builder, int i3) {
        this(builder);
    }

    public static Builder newBuilder(long j3, Currency currency) {
        return new Builder(j3, currency, 0);
    }

    private Revenue(Builder builder) {
        this.priceMicros = builder.f5170a;
        this.currency = builder.f5171b;
        this.quantity = builder.f5172c;
        this.productID = builder.f5173d;
        this.payload = builder.f5174e;
        this.receipt = builder.f;
    }
}
