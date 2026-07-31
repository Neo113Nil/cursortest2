package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes3.dex */
public final class QueryPurchaseHistoryParams {
    private final String zza;

    /* compiled from: com.android.billingclient:billing@@7.1.1 */
    public static class Builder {
        private String zza;

        private Builder() {
            throw null;
        }

        /* synthetic */ Builder(zzda zzdaVar) {
        }

        @NonNull
        public QueryPurchaseHistoryParams build() {
            if (this.zza != null) {
                return new QueryPurchaseHistoryParams(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        @NonNull
        public Builder setProductType(@NonNull String str) {
            this.zza = str;
            return this;
        }
    }

    /* synthetic */ QueryPurchaseHistoryParams(Builder builder, zzda zzdaVar) {
        this.zza = builder.zza;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public final String zza() {
        return this.zza;
    }
}
