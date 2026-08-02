package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.people.contactssync.DeviceContactsSyncClient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czi extends cms implements DeviceContactsSyncClient {
    private static final bxm k;
    private static final ow l = new ow(null);
    private static final ox m;

    static {
        czd czdVar = new czd();
        m = czdVar;
        k = new bxm("People.API", czdVar);
    }

    public czi(Activity activity) {
        super(activity, activity, k, cmk.a, cmr.a);
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final Intent createGoogleContactsSyncSettingsIntent(Context context, String str) {
        oy.au(context, "Please provide a non-null context");
        Intent intent = new Intent("com.google.android.gms.people.sync.coreui.ContactsSyncCoreActivity").setPackage(context.getPackageName());
        if (str != null) {
            intent.putExtra("authAccount", str);
        }
        return intent;
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final ddi getDeviceContactsSyncSetting() {
        cpa cpaVar = new cpa();
        cpaVar.b = new cli[]{cyj.v};
        cpaVar.a = new czc(2);
        cpaVar.c = 2731;
        return super.i(0, cpaVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final ddi launchDeviceContactsSyncSettingActivity(Context context) {
        oy.au(context, "Please provide a non-null context");
        cpa cpaVar = new cpa();
        cpaVar.b = new cli[]{cyj.v};
        cpaVar.a = new ciu(context, 20);
        cpaVar.c = 2733;
        return super.i(0, cpaVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final ddi registerSyncSettingUpdatedListener(DeviceContactsSyncClient.SyncSettingUpdatedListener syncSettingUpdatedListener) {
        cme m2 = m(syncSettingUpdatedListener, "dataChangedListenerKey");
        czj czjVar = new czj(m2, 1);
        czc czcVar = new czc(0);
        cow cowVar = new cow();
        cowVar.f = m2;
        cowVar.a = czjVar;
        cowVar.b = czcVar;
        cowVar.c = new cli[]{cyj.u};
        cowVar.e = 2729;
        return n(cowVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final ddi unregisterSyncSettingUpdatedListener(DeviceContactsSyncClient.SyncSettingUpdatedListener syncSettingUpdatedListener) {
        return j(ox.p(syncSettingUpdatedListener, "dataChangedListenerKey"), 2730);
    }

    public czi(Context context) {
        super(context, null, k, cmk.a, cmr.a);
    }
}
