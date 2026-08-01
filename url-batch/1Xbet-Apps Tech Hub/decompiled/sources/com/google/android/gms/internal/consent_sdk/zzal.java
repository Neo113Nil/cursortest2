package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
/* loaded from: classes2.dex */
final class zzal {
    private Application zza;

    private zzal() {
    }

    /* synthetic */ zzal(zzak zzakVar) {
    }

    public final zzc zza() {
        zzdq.zzb(this.zza, Application.class);
        return new zzaj(this.zza, null);
    }

    public final zzal zzb(Application application) {
        application.getClass();
        this.zza = application;
        return this;
    }
}
