package defpackage;

import com.google.android.gms.people.contactssync.DeviceContactsSyncClient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dah implements coq {
    private final /* synthetic */ int a;

    public dah(int i) {
        this.a = i;
    }

    @Override // defpackage.coq
    public final /* synthetic */ void a(Object obj) {
        int i = this.a;
        if (i == 0) {
            ((cym) obj).a();
        } else if (i != 1) {
            ((dec) obj).a();
        } else {
            ((DeviceContactsSyncClient.SyncSettingUpdatedListener) obj).onDeviceContactsSyncSettingUpdated();
        }
    }
}
