package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.ad0;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.qw;

/* loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(@RecentlyNonNull Intent intent) {
        try {
            qw.a().g(this, new ad0()).R0(intent);
        } catch (RemoteException e7) {
            io0.d("RemoteException calling handleNotificationIntent: ".concat(e7.toString()));
        }
    }
}
