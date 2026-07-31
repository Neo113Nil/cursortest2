package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzjd;

/* compiled from: com.android.billingclient:billing@@8.3.0 */
/* loaded from: classes2.dex */
final class zzdh {
    public static BillingResult zza(Bundle bundle, String str, int i, zzcz zzczVar, int i2) {
        if (!bundle.containsKey("BILLING_RESULT")) {
            com.google.android.gms.internal.play_billing.zzc.zzo(str, "delegateToBackendAsync does not contain a billing result in the response");
            zzjd zzjdVar = zzjd.MISSING_BILLING_RESULT_IN_DELEGATE_TO_BACKEND_RESPONSE;
            BillingResult billingResult = zzdc.zzh;
            zzde.zza(zzjdVar, billingResult, zzczVar, i, i2);
            return billingResult;
        }
        try {
            byte[] byteArray = bundle.getByteArray("BILLING_RESULT");
            if (byteArray == null) {
                throw new Exception("Billing result is null");
            }
            com.google.android.gms.internal.play_billing.zzdw zzc = com.google.android.gms.internal.play_billing.zzdw.zzc(byteArray);
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(zzc.zza());
            newBuilder.setDebugMessage(zzc.zze());
            BillingResult build = newBuilder.build();
            if (build.getResponseCode() != 0) {
                zzde.zza(zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY, build, zzczVar, i, i2);
                return build;
            }
            if (bundle.containsKey("RESPONSE_DATA")) {
                return build;
            }
            com.google.android.gms.internal.play_billing.zzc.zzo(str, "delegateToBackendAsync returned a bundle with neither an error nor response data");
            zzjd zzjdVar2 = zzjd.MISSING_RESPONSE_DATA_IN_DELEGATE_TO_BACKEND_RESPONSE;
            BillingResult billingResult2 = zzdc.zzh;
            zzde.zza(zzjdVar2, billingResult2, zzczVar, i, i2);
            return billingResult2;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzc.zzp(str, "Failed parsing BillingResult.", e);
            zzjd zzjdVar3 = zzjd.ERROR_DECODING_DELEGATE_TO_BACKEND_BILLING_RESULT;
            BillingResult billingResult3 = zzdc.zzh;
            zzde.zzb(zzjdVar3, billingResult3, zzczVar, i, i2, zzcy.zza(e));
            return billingResult3;
        }
    }
}
