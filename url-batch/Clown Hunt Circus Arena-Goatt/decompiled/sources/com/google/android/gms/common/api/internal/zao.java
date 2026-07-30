package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
final class zao implements Runnable {
    final /* synthetic */ zap zaa;
    private final zam zab;

    zao(zap zapVar, zam zamVar) {
        Objects.requireNonNull(zapVar);
        this.zaa = zapVar;
        this.zab = zamVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zap zapVar = this.zaa;
        if (zapVar.zaa) {
            zam zamVar = this.zab;
            ConnectionResult zab = zamVar.zab();
            int errorCode = zab.getErrorCode();
            GoogleApiAvailability googleApiAvailability = zapVar.zac;
            if (!googleApiAvailability.zaj(errorCode)) {
                String valueOf = String.valueOf(zab);
                String.valueOf(valueOf);
                Log.w("BaseLifecycleHelper", "Not showing dialog since ConnectionResult is not user-facing: ".concat(String.valueOf(valueOf)));
                zapVar.zah(zab, zamVar.zaa());
                return;
            }
            if (zab.hasResolution()) {
                zapVar.mLifecycleFragment.startActivityForResult(GoogleApiActivity.zaa(zapVar.getActivity(), (PendingIntent) Preconditions.checkNotNull(zab.getResolution()), zamVar.zaa(), false), 1);
                return;
            }
            if (googleApiAvailability.getErrorResolutionIntent(zapVar.getActivity(), zab.getErrorCode(), null) != null) {
                googleApiAvailability.zab(zapVar.getActivity(), zapVar.mLifecycleFragment, zab.getErrorCode(), 2, zapVar);
                googleApiAvailability.zae(zapVar.getActivity().getApplicationContext(), zab, true);
            } else {
                if (zab.getErrorCode() != 18) {
                    zapVar.zah(zab, zamVar.zaa());
                    return;
                }
                googleApiAvailability.zag(zapVar.getActivity().getApplicationContext(), new zan(this, googleApiAvailability.zaf(zapVar.getActivity(), zapVar)));
                googleApiAvailability.zae(zapVar.getActivity().getApplicationContext(), zab, true);
            }
        }
    }
}
