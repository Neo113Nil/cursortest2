package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cze extends cza {
    final /* synthetic */ bst a;

    public cze(bst bstVar) {
        this.a = bstVar;
    }

    @Override // defpackage.cza
    public final void b(Status status, czn cznVar, cmn cmnVar) {
        if (!status.c()) {
            ox.s(status, null, this.a, cmnVar);
            return;
        }
        int i = cznVar.c;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = (i == 3 || i == 5) ? 3 : 0;
            }
        }
        ox.s(status, new DeviceContactsSyncSetting(i2, i2 == 3 ? new Account(cznVar.a, "com.google") : null), this.a, cmnVar);
    }
}
