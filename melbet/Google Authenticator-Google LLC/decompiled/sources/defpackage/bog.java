package defpackage;

import com.google.android.apps.authenticator2.Authenticator_Application;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bog extends gll {
    private boolean d = false;
    private final jqo e = new jqo(new kee(this));

    @Override // defpackage.glk
    public final jqo a() {
        return this.e;
    }

    @Override // defpackage.glk, defpackage.jrr
    public final /* synthetic */ jrq b() {
        return this.e;
    }

    @Override // defpackage.gll, android.app.Application
    public void onCreate() {
        if (!this.d) {
            this.d = true;
            Authenticator_Application authenticator_Application = (Authenticator_Application) this;
            bnl bnlVar = (bnl) C();
            authenticator_Application.a = (gva) bnlVar.bJ.b();
            authenticator_Application.b = bnlVar.kV;
        }
        super.onCreate();
    }
}
