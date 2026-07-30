package com.google.android.gms.internal.fido;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.fido.u2f.U2fPendingIntent;

/* loaded from: classes3.dex */
public final class zzab implements U2fPendingIntent {
    private final PendingIntent zza;

    public zzab(PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }

    @Override // com.google.android.gms.fido.u2f.U2fPendingIntent
    public final boolean hasPendingIntent() {
        return this.zza != null;
    }

    @Override // com.google.android.gms.fido.u2f.U2fPendingIntent
    public final void launchPendingIntent(Activity activity, int i8) {
        PendingIntent pendingIntent = this.zza;
        if (pendingIntent == null) {
            throw new IllegalStateException("No PendingIntent available");
        }
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i8, null, 0, 0, 0);
    }
}
