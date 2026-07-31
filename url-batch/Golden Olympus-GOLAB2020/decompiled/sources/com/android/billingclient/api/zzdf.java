package com.android.billingclient.api;

/* loaded from: classes.dex */
enum zzdf {
    GET_BILLING_CONFIG("getBillingConfig", 29),
    IS_BILLING_PROGRAM_AVAILABLE_ASYNC("isIndirectBillingProgramAvailable", 33),
    CREATE_BILLING_PROGRAM_REPORTING_DETAILS_ASYNC("createIndirectBillingReportingDetails", 35);

    private final String zze;
    private final int zzf;

    zzdf(String str, int i4) {
        this.zze = str;
        this.zzf = i4;
    }

    final String zza() {
        return this.zze;
    }

    final int zzb() {
        return this.zzf;
    }
}
