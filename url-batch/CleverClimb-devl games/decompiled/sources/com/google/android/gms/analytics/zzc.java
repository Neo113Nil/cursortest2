package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;

/* loaded from: classes.dex */
final class zzc implements Runnable {
    private final /* synthetic */ BroadcastReceiver.PendingResult zzqp;

    zzc(CampaignTrackingReceiver campaignTrackingReceiver, BroadcastReceiver.PendingResult pendingResult) {
        this.zzqp = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzqp != null) {
            this.zzqp.finish();
        }
    }
}
