package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbpo;
import com.google.android.gms.internal.ads.zzbti;
import com.google.android.gms.internal.ads.zzcbn;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class NotificationHandlerActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.NotificationHandlerActivity";

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzbti zzm = zzay.zza().zzm(this, new zzbpo());
            if (zzm == null) {
                zzcbn.zzg("OfflineUtils is null");
            } else {
                zzm.zze(getIntent());
            }
        } catch (RemoteException e) {
            zzcbn.zzg("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        finish();
    }
}
