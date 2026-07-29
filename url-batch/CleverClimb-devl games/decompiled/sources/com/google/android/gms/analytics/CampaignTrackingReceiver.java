package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzdd;
import com.tapjoy.TapjoyConstants;

@VisibleForTesting
/* loaded from: classes.dex */
public class CampaignTrackingReceiver extends BroadcastReceiver {
    private static Boolean zzqo;

    public static boolean zza(Context context) {
        Preconditions.checkNotNull(context);
        if (zzqo != null) {
            return zzqo.booleanValue();
        }
        boolean zza = zzdd.zza(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        zzqo = Boolean.valueOf(zza);
        return zza;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        zzat zzc = zzat.zzc(context);
        zzcm zzbu = zzc.zzbu();
        if (intent == null) {
            zzbu.zzt("CampaignTrackingReceiver received null intent");
            return;
        }
        String stringExtra = intent.getStringExtra(TapjoyConstants.TJC_REFERRER);
        String action = intent.getAction();
        zzbu.zza("CampaignTrackingReceiver received", action);
        if (!"com.android.vending.INSTALL_REFERRER".equals(action) || TextUtils.isEmpty(stringExtra)) {
            zzbu.zzt("CampaignTrackingReceiver received unexpected intent without referrer extra");
            return;
        }
        zza(context, stringExtra);
        int zzdu = zzbu.zzdu();
        if (stringExtra.length() > zzdu) {
            zzbu.zzc("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(stringExtra.length()), Integer.valueOf(zzdu));
            stringExtra = stringExtra.substring(0, zzdu);
        }
        zzc.zzby().zza(stringExtra, (Runnable) new zzc(this, goAsync()));
    }

    protected void zza(Context context, String str) {
    }
}
