package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zziw;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzaa extends BroadcastReceiver {
    final /* synthetic */ zzab zza;
    private boolean zzb;
    private final boolean zzc;

    zzaa(zzab zzabVar, boolean z4) {
        Objects.requireNonNull(zzabVar);
        this.zza = zzabVar;
        this.zzc = z4;
    }

    private final void zzd(Bundle bundle, BillingResult billingResult, int i4, zzjk zzjkVar, long j4, boolean z4) {
        zzcz zzczVar;
        zzcz zzczVar2;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                zzczVar2 = this.zza.zzf;
                zzczVar2.zzd(zziw.zzc(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j4, z4);
            } else {
                zzczVar = this.zza.zzf;
                zzczVar.zzd(zzcy.zzb(zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i4, billingResult, null, zzjkVar), j4, z4);
            }
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c4;
        BillingResult zzi;
        PurchasesUpdatedListener purchasesUpdatedListener;
        zzcz zzczVar;
        zzb zzbVar;
        zzcz zzczVar2;
        PurchasesUpdatedListener purchasesUpdatedListener2;
        UserChoiceBillingListener userChoiceBillingListener;
        DeveloperProvidedBillingListener developerProvidedBillingListener;
        zzb zzbVar2;
        DeveloperProvidedBillingListener developerProvidedBillingListener2;
        zzcz zzczVar3;
        UserChoiceBillingListener userChoiceBillingListener2;
        zzcz zzczVar4;
        PurchasesUpdatedListener purchasesUpdatedListener3;
        UserChoiceBillingListener userChoiceBillingListener3;
        DeveloperProvidedBillingListener developerProvidedBillingListener3;
        zzcz zzczVar5;
        PurchasesUpdatedListener purchasesUpdatedListener4;
        PurchasesUpdatedListener purchasesUpdatedListener5;
        int intValue;
        zzcz zzczVar6;
        PurchasesUpdatedListener purchasesUpdatedListener6;
        PurchasesUpdatedListener purchasesUpdatedListener7;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode == -1484087650) {
            if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
                c4 = 0;
            }
            c4 = 65535;
        } else if (hashCode != -337612916) {
            if (hashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                c4 = 2;
            }
            c4 = 65535;
        } else {
            if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                c4 = 1;
            }
            c4 = 65535;
        }
        zzjk zzjkVar = c4 != 0 ? c4 != 1 ? c4 != 2 ? zzjk.BROADCAST_ACTION_UNSPECIFIED : zzjk.ALTERNATIVE_BILLING_ACTION : zzjk.LOCAL_PURCHASES_UPDATED_ACTION : zzjk.PURCHASES_UPDATED_ACTION;
        zzjk zzjkVar2 = zzjk.LOCAL_PURCHASES_UPDATED_ACTION;
        int i4 = (zzjkVar.equals(zzjkVar2) || zzjkVar.equals(zzjk.ALTERNATIVE_BILLING_ACTION)) ? 2 : zzjkVar.equals(zzjk.PURCHASES_UPDATED_ACTION) ? 32 : 1;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingBroadcastManager", "Bundle is null.");
            zzab zzabVar = this.zza;
            zzczVar6 = zzabVar.zzf;
            zzjd zzjdVar = zzjd.NULL_BUNDLE_IN_BROADCAST_RECEIVER;
            BillingResult billingResult = zzdc.zzh;
            zzczVar6.zza(zzcy.zzb(zzjdVar, i4, billingResult, null, zzjkVar));
            purchasesUpdatedListener6 = zzabVar.zzb;
            if (purchasesUpdatedListener6 != null) {
                purchasesUpdatedListener7 = zzabVar.zzb;
                purchasesUpdatedListener7.onPurchasesUpdated(billingResult, null);
                return;
            }
            return;
        }
        if (i4 == 2) {
            int i5 = com.google.android.gms.internal.play_billing.zzc.zza;
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(com.google.android.gms.internal.play_billing.zzc.zzb(intent.getExtras(), "BillingBroadcastManager"));
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingBroadcastManager", "Unexpected null bundle received!");
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingBroadcastManager", "getOnPurchasesUpdatedSubResponseCodeFromBundle() got null response code, assuming OK");
                } else if (obj instanceof Integer) {
                    intValue = ((Integer) obj).intValue();
                    newBuilder.setOnPurchasesUpdatedSubResponseCode(intValue);
                    newBuilder.setDebugMessage(com.google.android.gms.internal.play_billing.zzc.zzk(intent.getExtras(), "BillingBroadcastManager"));
                    zzi = newBuilder.build();
                } else {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                }
            }
            intValue = 0;
            newBuilder.setOnPurchasesUpdatedSubResponseCode(intValue);
            newBuilder.setDebugMessage(com.google.android.gms.internal.play_billing.zzc.zzk(intent.getExtras(), "BillingBroadcastManager"));
            zzi = newBuilder.build();
        } else {
            zzi = com.google.android.gms.internal.play_billing.zzc.zzi(intent, "BillingBroadcastManager");
        }
        long j4 = extras.getLong("billingClientTransactionId", 0L);
        boolean z4 = extras.getBoolean("wasServiceAutoReconnected", false);
        if (zzjkVar.equals(zzjk.PURCHASES_UPDATED_ACTION) || zzjkVar.equals(zzjkVar2)) {
            BillingResult billingResult2 = zzi;
            zzjk zzjkVar3 = zzjkVar;
            List<Purchase> zzm = com.google.android.gms.internal.play_billing.zzc.zzm(extras);
            if (billingResult2.getResponseCode() == 0) {
                zzczVar = this.zza.zzf;
                zzczVar.zzh(zzcy.zzc(i4, zzjkVar3), j4, z4);
            } else {
                zzd(extras, billingResult2, i4, zzjkVar3, j4, z4);
            }
            purchasesUpdatedListener = this.zza.zzb;
            purchasesUpdatedListener.onPurchasesUpdated(billingResult2, zzm);
            return;
        }
        if (zzjkVar.equals(zzjk.ALTERNATIVE_BILLING_ACTION)) {
            if (zzi.getResponseCode() != 0) {
                BillingResult billingResult3 = zzi;
                zzd(extras, billingResult3, i4, zzjkVar, j4, z4);
                purchasesUpdatedListener5 = this.zza.zzb;
                purchasesUpdatedListener5.onPurchasesUpdated(billingResult3, com.google.android.gms.internal.play_billing.zzbw.zzk());
                return;
            }
            zzjk zzjkVar4 = zzjkVar;
            zzab zzabVar2 = this.zza;
            zzbVar = zzabVar2.zzc;
            if (zzbVar == null) {
                userChoiceBillingListener3 = zzabVar2.zzd;
                if (userChoiceBillingListener3 == null) {
                    developerProvidedBillingListener3 = zzabVar2.zze;
                    if (developerProvidedBillingListener3 == null) {
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingBroadcastManager", "No valid alternative billing listener is registered.");
                        zzczVar5 = zzabVar2.zzf;
                        zzjd zzjdVar2 = zzjd.NULL_DEVELOPER_MANAGED_BILLING_LISTENER;
                        BillingResult billingResult4 = zzdc.zzh;
                        zzczVar5.zzd(zzcy.zzb(zzjdVar2, i4, billingResult4, null, zzjkVar4), j4, z4);
                        purchasesUpdatedListener4 = zzabVar2.zzb;
                        purchasesUpdatedListener4.onPurchasesUpdated(billingResult4, com.google.android.gms.internal.play_billing.zzbw.zzk());
                        return;
                    }
                }
            }
            String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string == null) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                zzczVar4 = zzabVar2.zzf;
                zzjd zzjdVar3 = zzjd.MISSING_ALTERNATIVE_BILLING_USER_CHOICE_DATA;
                BillingResult billingResult5 = zzdc.zzh;
                zzczVar4.zzd(zzcy.zzb(zzjdVar3, i4, billingResult5, null, zzjkVar4), j4, z4);
                purchasesUpdatedListener3 = zzabVar2.zzb;
                purchasesUpdatedListener3.onPurchasesUpdated(billingResult5, com.google.android.gms.internal.play_billing.zzbw.zzk());
                return;
            }
            try {
                userChoiceBillingListener = zzabVar2.zzd;
                if (userChoiceBillingListener != null) {
                    UserChoiceDetails userChoiceDetails = new UserChoiceDetails(string);
                    userChoiceBillingListener2 = zzabVar2.zzd;
                    userChoiceBillingListener2.userSelectedAlternativeBilling(userChoiceDetails);
                } else {
                    developerProvidedBillingListener = zzabVar2.zze;
                    if (developerProvidedBillingListener != null) {
                        DeveloperProvidedBillingDetails developerProvidedBillingDetails = new DeveloperProvidedBillingDetails(string);
                        developerProvidedBillingListener2 = zzabVar2.zze;
                        developerProvidedBillingListener2.onUserSelectedDeveloperBilling(developerProvidedBillingDetails);
                    } else {
                        JSONArray optJSONArray = new JSONObject(string).optJSONArray("products");
                        ArrayList arrayList = new ArrayList();
                        if (optJSONArray != null) {
                            for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(i6);
                                if (optJSONObject != null) {
                                    arrayList.add(new zzc(optJSONObject, null));
                                }
                            }
                        }
                        zzbVar2 = zzabVar2.zzc;
                        zzbVar2.zza();
                    }
                }
                zzczVar3 = this.zza.zzf;
                zzczVar3.zzh(zzcy.zzc(i4, zzjkVar4), j4, z4);
            } catch (JSONException unused) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingBroadcastManager", String.format("Error when parsing invalid user choice data: [%s]", string));
                zzab zzabVar3 = this.zza;
                zzczVar2 = zzabVar3.zzf;
                zzjd zzjdVar4 = zzjd.INVALID_ALTERNATIVE_BILLING_USER_CHOICE_DATA;
                BillingResult billingResult6 = zzdc.zzh;
                zzczVar2.zzd(zzcy.zzb(zzjdVar4, i4, billingResult6, null, zzjkVar4), j4, z4);
                purchasesUpdatedListener2 = zzabVar3.zzb;
                purchasesUpdatedListener2.onPurchasesUpdated(billingResult6, com.google.android.gms.internal.play_billing.zzbw.zzk());
            }
        }
    }

    public final synchronized void zza(Context context, IntentFilter intentFilter) {
        try {
            if (this.zzb) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.zzc ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.zzb = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(Context context, IntentFilter intentFilter, String str) {
        zzaa zzaaVar;
        try {
            try {
                if (this.zzb) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    zzaaVar = this;
                    context.registerReceiver(zzaaVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.zzc ? 4 : 2);
                } else {
                    zzaaVar = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                zzaaVar.zzb = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void zzc(Context context) {
        if (!this.zzb) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.zzb = false;
        }
    }
}
