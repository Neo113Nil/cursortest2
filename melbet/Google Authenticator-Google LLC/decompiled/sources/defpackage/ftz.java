package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ftz extends agd {
    public fty a;
    public boolean b;
    public final boolean c;

    public ftz(afr afrVar) {
        afrVar.getClass();
        fty ftyVar = ftx.a;
        this.a = ftyVar;
        fao.c();
        Bundle bundle = (Bundle) afrVar.b("tiktok_activity_account_state_saved_instance_state");
        if (bundle != null) {
            this.c = true;
            Bundle bundle2 = bundle.getBundle("state_account_state_bundle");
            if (bundle2 == null) {
                throw new IllegalStateException("Failed to get the CurrentViewModel.State bundle from saved state");
            }
            int i = bundle2.getInt("state_account_state_type", 0);
            if (i != 0) {
                if (i == 1) {
                    ftyVar = ftv.a;
                } else if (i == 2) {
                    int i2 = bundle2.getInt("state_account_id", -1);
                    jll b = imi.b(bundle2, "state_account_info", ful.a, jkd.a());
                    b.getClass();
                    ftyVar = new ftw(i2, (ful) b);
                } else {
                    if (i != 3) {
                        throw new IllegalStateException(a.ai(i, "unknown type value ", " during unparcelling"));
                    }
                    ftyVar = ftu.a;
                }
            }
            this.a = ftyVar;
            this.b = bundle.getBoolean("tiktok_accounts_disabled");
        } else {
            this.c = false;
        }
        afrVar.c("tiktok_activity_account_state_saved_instance_state", new bn(this, 5));
    }
}
