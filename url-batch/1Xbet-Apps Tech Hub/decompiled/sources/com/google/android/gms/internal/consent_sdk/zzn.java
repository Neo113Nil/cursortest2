package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
/* loaded from: classes2.dex */
final class zzn {
    private final Application zza;
    private final zza zzb;
    private final zzas zzc;

    zzn(Application application, zza zzaVar, zzas zzasVar) {
        this.zza = application;
        this.zzb = zzaVar;
        this.zzc = zzasVar;
    }

    final zzck zzd(Activity activity, ConsentRequestParameters consentRequestParameters) throws zzi {
        ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
        if (consentDebugSettings == null) {
            consentDebugSettings = new ConsentDebugSettings.Builder(this.zza).build();
        }
        return zzp.zza(new zzp(this, activity, consentDebugSettings, consentRequestParameters, null));
    }
}
