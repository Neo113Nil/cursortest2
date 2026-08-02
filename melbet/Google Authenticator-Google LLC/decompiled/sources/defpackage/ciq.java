package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ciq extends cms implements cmw {
    private static final bxm k;
    private static final ow l = new ow(null);
    private static final ox m;

    static {
        cil cilVar = new cil();
        m = cilVar;
        k = new bxm("GoogleAuth.API", cilVar);
    }

    public ciq(Context context) {
        super(context, null, k, cmk.a, cmr.a);
    }

    public static final void e(Status status, Object obj, bst bstVar) {
        if (status.c()) {
            bstVar.c(obj);
        } else if (o(status)) {
            bstVar.b(new IOException(status.a()));
        } else {
            bstVar.b(status.h == null ? new chw(status) : new cig(status));
        }
    }

    public static final void f(Status status, Object obj, bst bstVar) {
        if (status.c()) {
            bstVar.c(obj);
        } else if (o(status)) {
            bstVar.b(new IOException(status.a()));
        } else {
            PendingIntent pendingIntent = status.h;
            bstVar.b(pendingIntent == null ? new chh(status.a()) : UserRecoverableAuthException.a(status.a(), ow.q(pendingIntent)));
        }
    }

    private static final boolean o(Status status) {
        switch (status.f) {
            case 8:
            case 49500:
            case 49508:
            case 49528:
            case 49531:
                return true;
            default:
                return false;
        }
    }

    public final ddi a(chx chxVar) {
        cpa cpaVar = new cpa();
        cpaVar.b = new cli[]{chg.h};
        cpaVar.a = new cik(this, chxVar, 2);
        cpaVar.c = 1683;
        return super.i(0, cpaVar.a());
    }

    public final ddi b(chy chyVar) {
        cpa cpaVar = new cpa();
        cpaVar.b = new cli[]{chg.h};
        cpaVar.a = new cik(this, chyVar, 0);
        cpaVar.c = 1676;
        return super.i(0, cpaVar.a());
    }

    public final ddi c(cib cibVar) {
        cpa cpaVar = new cpa();
        cpaVar.b = new cli[]{new cli("google_auth_api", -1, 1L, false)};
        cpaVar.a = new cik(this, cibVar, 3);
        cpaVar.c = 1680;
        return super.i(0, cpaVar.a());
    }

    public final ddi d(cie cieVar) {
        cpa cpaVar = new cpa();
        cpaVar.b = new cli[]{chg.h};
        cpaVar.a = new cik(this, cieVar, 1);
        cpaVar.c = 1682;
        return super.i(0, cpaVar.a());
    }
}
