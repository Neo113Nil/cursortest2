package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
/* loaded from: classes2.dex */
public final class zzbq {
    private final zzdr zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();

    zzbq(zzdr zzdrVar, Executor executor) {
        this.zza = zzdrVar;
        this.zzb = executor;
    }

    final /* synthetic */ void zza(zzbe zzbeVar) {
        final AtomicReference atomicReference = this.zzd;
        zzbeVar.zzb(new UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbi
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                atomicReference.set(consentForm);
            }
        }, new UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbj
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(FormError formError) {
                Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(formError.getMessage())));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.consent_sdk.zzay, java.lang.Object] */
    public final void zzb(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        zzct.zza();
        zzbs zzbsVar = (zzbs) this.zzc.get();
        if (zzbsVar == null) {
            onConsentFormLoadFailureListener.onConsentFormLoadFailure(new zzi(3, "No available form can be built.").zza());
            return;
        }
        ?? zzb = this.zza.zzb();
        zzb.zza(zzbsVar);
        zzb.zzb().zza().zzb(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.consent_sdk.zzay, java.lang.Object] */
    public final void zzc() {
        zzbs zzbsVar = (zzbs) this.zzc.get();
        if (zzbsVar == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        ?? zzb = this.zza.zzb();
        zzb.zza(zzbsVar);
        final zzbe zza = zzb.zzb().zza();
        zza.zza = true;
        zzct.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbk
            @Override // java.lang.Runnable
            public final void run() {
                zzbq.this.zza(zza);
            }
        });
    }

    public final void zzd(zzbs zzbsVar) {
        this.zzc.set(zzbsVar);
    }

    public final void zze(Activity activity, final ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        zzct.zza();
        zzl zzb = zzc.zza(activity).zzb();
        if (zzb == null) {
            zzct.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbl
                @Override // java.lang.Runnable
                public final void run() {
                    ConsentForm.OnConsentFormDismissedListener.this.onConsentFormDismissed(new zzi(1, "No consentInformation.").zza());
                }
            });
            return;
        }
        if (!zzb.isConsentFormAvailable() && zzb.getPrivacyOptionsRequirementStatus() != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            zzct.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbm
                @Override // java.lang.Runnable
                public final void run() {
                    ConsentForm.OnConsentFormDismissedListener.this.onConsentFormDismissed(new zzi(3, "No valid response received yet.").zza());
                }
            });
            zzb.zza(activity);
        } else {
            if (zzb.getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
                zzct.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbn
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConsentForm.OnConsentFormDismissedListener.this.onConsentFormDismissed(new zzi(3, "Privacy options form is not required.").zza());
                    }
                });
                return;
            }
            ConsentForm consentForm = (ConsentForm) this.zzd.get();
            if (consentForm == null) {
                zzct.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbo
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConsentForm.OnConsentFormDismissedListener.this.onConsentFormDismissed(new zzi(3, "Privacy options form is being loading. Please try again later.").zza());
                    }
                });
            } else {
                consentForm.show(activity, onConsentFormDismissedListener);
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbp
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbq.this.zzc();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        return this.zzc.get() != null;
    }
}
