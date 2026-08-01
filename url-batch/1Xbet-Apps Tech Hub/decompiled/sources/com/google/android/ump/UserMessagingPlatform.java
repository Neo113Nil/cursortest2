package com.google.android.ump;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zzbq;
import com.google.android.gms.internal.consent_sdk.zzc;
import com.google.android.gms.internal.consent_sdk.zzct;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
/* loaded from: classes3.dex */
public final class UserMessagingPlatform {

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public interface OnConsentFormLoadFailureListener {
        void onConsentFormLoadFailure(FormError formError);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    public interface OnConsentFormLoadSuccessListener {
        void onConsentFormLoadSuccess(ConsentForm consentForm);
    }

    private UserMessagingPlatform() {
    }

    public static ConsentInformation getConsentInformation(Context context) {
        return zzc.zza(context).zzb();
    }

    public static void loadAndShowConsentFormIfRequired(final Activity activity, final ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        if (zzc.zza(activity).zzb().canRequestAds()) {
            onConsentFormDismissedListener.onConsentFormDismissed(null);
            return;
        }
        zzbq zzc = zzc.zza(activity).zzc();
        zzct.zza();
        OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener = new OnConsentFormLoadSuccessListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbg
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                consentForm.show(activity, onConsentFormDismissedListener);
            }
        };
        onConsentFormDismissedListener.getClass();
        zzc.zzb(onConsentFormLoadSuccessListener, new OnConsentFormLoadFailureListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbh
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(FormError formError) {
                ConsentForm.OnConsentFormDismissedListener.this.onConsentFormDismissed(formError);
            }
        });
    }

    public static void loadConsentForm(Context context, OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        zzc.zza(context).zzc().zzb(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener);
    }

    public static void showPrivacyOptionsForm(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        zzc.zza(activity).zzc().zze(activity, onConsentFormDismissedListener);
    }
}
