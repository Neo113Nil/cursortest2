package com.android.billingclient.api;

/* loaded from: classes.dex */
public final class BillingResult {
    private int zza;
    private int zzb;
    private String zzc;

    public static class Builder {
        private int zza;
        private int zzb = 0;
        private String zzc = "";

        private Builder() {
        }

        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.zza = this.zza;
            billingResult.zzb = this.zzb;
            billingResult.zzc = this.zzc;
            return billingResult;
        }

        public Builder setDebugMessage(String str) {
            this.zzc = str;
            return this;
        }

        public Builder setOnPurchasesUpdatedSubResponseCode(int i4) {
            this.zzb = i4;
            return this;
        }

        public Builder setResponseCode(int i4) {
            this.zza = i4;
            return this;
        }

        /* synthetic */ Builder(zzdb zzdbVar) {
        }
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public String getDebugMessage() {
        return this.zzc;
    }

    public int getOnPurchasesUpdatedSubResponseCode() {
        return this.zzb;
    }

    public int getResponseCode() {
        return this.zza;
    }

    public String toString() {
        return "Response Code: " + com.google.android.gms.internal.play_billing.zzc.zzl(this.zza) + ", Debug Message: " + this.zzc;
    }
}
