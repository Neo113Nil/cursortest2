package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fsi extends agd {
    public fss a;
    public boolean b;
    public boolean c;
    public final fsh d;

    public fsi(afr afrVar, koe koeVar) {
        afrVar.getClass();
        final boolean booleanValue = ((Boolean) ((gzp) ((jrx) koeVar).a).d(false)).booleanValue();
        fsh fshVar = new fsh();
        this.d = fshVar;
        Bundle bundle = (Bundle) afrVar.b("tiktok_account_controller_saved_instance_state");
        fshVar.a = bundle;
        if (bundle != null) {
            this.c = true;
            jll c = imi.c(bundle, "state_latest_operation", fss.a, jkd.a());
            c.getClass();
            b((fss) c);
            this.b = bundle.getBoolean("state_pending_op");
        }
        afrVar.c("tiktok_account_controller_saved_instance_state", new amd() { // from class: fsg
            @Override // defpackage.amd
            public final Bundle a() {
                Bundle bundle2 = new Bundle();
                fsi fsiVar = fsi.this;
                bundle2.putBoolean("state_pending_op", fsiVar.b);
                imi.d(bundle2, "state_latest_operation", fsiVar.a());
                bundle2.putBoolean("tiktok_accounts_disabled", booleanValue);
                return bundle2;
            }
        });
    }

    public final fss a() {
        fss fssVar = this.a;
        if (fssVar != null) {
            return fssVar;
        }
        ksp.a("latestOperation");
        return null;
    }

    public final void b(fss fssVar) {
        fssVar.getClass();
        this.a = fssVar;
    }
}
