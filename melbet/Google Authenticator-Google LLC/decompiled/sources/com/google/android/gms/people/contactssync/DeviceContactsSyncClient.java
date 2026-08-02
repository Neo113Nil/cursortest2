package com.google.android.gms.people.contactssync;

import android.content.Context;
import android.content.Intent;
import defpackage.cmw;
import defpackage.ddi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface DeviceContactsSyncClient extends cmw {

    /* compiled from: PG */
    public interface SyncSettingUpdatedListener {
        void onDeviceContactsSyncSettingUpdated();
    }

    Intent createGoogleContactsSyncSettingsIntent(Context context, String str);

    ddi getDeviceContactsSyncSetting();

    ddi launchDeviceContactsSyncSettingActivity(Context context);

    ddi registerSyncSettingUpdatedListener(SyncSettingUpdatedListener syncSettingUpdatedListener);

    ddi unregisterSyncSettingUpdatedListener(SyncSettingUpdatedListener syncSettingUpdatedListener);
}
