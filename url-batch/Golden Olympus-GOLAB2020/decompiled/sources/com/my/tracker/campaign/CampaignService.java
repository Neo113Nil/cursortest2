package com.my.tracker.campaign;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.my.tracker.obfuscated.AbstractC1658m;
import com.my.tracker.obfuscated.AbstractC1708y2;
import com.my.tracker.obfuscated.C1675q0;

/* loaded from: classes2.dex */
public final class CampaignService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        AbstractC1708y2.a("CampaignService: onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        AbstractC1708y2.a("CampaignService: onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        final Runnable runnable = new Runnable() { // from class: com.my.tracker.campaign.a
            @Override // java.lang.Runnable
            public final void run() {
                CampaignService.this.stopSelf();
            }
        };
        if (intent != null) {
            final String stringExtra = intent.getStringExtra("referrer");
            if (!TextUtils.isEmpty(stringExtra)) {
                AbstractC1658m.a(new Runnable() { // from class: com.my.tracker.campaign.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        CampaignService.this.a(stringExtra, runnable);
                    }
                });
                return super.onStartCommand(null, i4, i5);
            }
        }
        AbstractC1658m.a(runnable);
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        C1675q0.a(str, this, runnable);
    }
}
