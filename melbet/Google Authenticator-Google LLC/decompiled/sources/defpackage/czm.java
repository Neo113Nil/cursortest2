package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.people.contactssync.TetheredSyncClient;
import com.google.android.gms.people.contactssync.model.TetheredContactsSyncRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czm extends cms implements TetheredSyncClient {
    private static final bxm k;
    private static final ow l = new ow(null);
    private static final ox m;

    static {
        czk czkVar = new czk();
        m = czkVar;
        k = new bxm("People.API", czkVar);
    }

    public czm(Activity activity) {
        super(activity, activity, k, cmk.a, cmr.a);
    }

    @Override // com.google.android.gms.people.contactssync.TetheredSyncClient
    public final ddi triggerTetheredContactsSync(TetheredContactsSyncRequest tetheredContactsSyncRequest) {
        cpa cpaVar = new cpa();
        cpaVar.b = new cli[]{cyj.E};
        cpaVar.c = 2753;
        cpaVar.a = new czj(tetheredContactsSyncRequest, 0);
        return super.i(0, cpaVar.a());
    }

    public czm(Context context) {
        super(context, null, k, cmk.a, cmr.a);
    }
}
