package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbpo;
import com.google.android.gms.internal.ads.zzcbn;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public class AdService extends IntentService {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdService";

    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        try {
            zzay.zza().zzm(this, new zzbpo()).zze(intent);
        } catch (RemoteException e) {
            zzcbn.zzg("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
