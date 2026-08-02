package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ftc {
    private static final hkh a = hkh.l("com/google/apps/tiktok/account/api/controller/AccountIntents");

    public static void a(Intent intent, frv frvVar) {
        int i = frvVar.a;
        hoq.x(i != -1);
        intent.putExtra("account_id", i);
        intent.putExtra("$tiktok$account_id_owned", true);
    }

    public static frv b(Intent intent) {
        int intExtra = intent.getIntExtra("account_id", -1);
        if (intExtra != -1 && !intent.getBooleanExtra("$tiktok$account_id_owned", false)) {
            ((hkf) ((hkf) a.f()).i("com/google/apps/tiktok/account/api/controller/AccountIntents", "getAccount", 117, "AccountIntents.java")).s("AccountId was manually propagated. Use AccountIntents instead.");
        }
        if (intExtra != -1) {
            return frv.a(intExtra);
        }
        return null;
    }
}
