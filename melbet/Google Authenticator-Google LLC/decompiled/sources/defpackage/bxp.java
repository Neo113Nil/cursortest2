package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bxp extends ox {
    final /* synthetic */ gva a;
    final /* synthetic */ frv b;
    final /* synthetic */ bxq c;

    public bxp(bxq bxqVar, gva gvaVar, frv frvVar) {
        this.a = gvaVar;
        this.b = frvVar;
        this.c = bxqVar;
    }

    @Override // defpackage.ox
    public final void b(int i, CharSequence charSequence) {
        if (i == 11) {
            gtt f = this.a.f("NoScreenLockAvailable", 42);
            try {
                this.c.a(bxx.a(this.b), "ExportFragment");
                f.close();
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.ox
    public final void h(bsh bshVar) {
        gtt f = this.a.f("SuccessfulAuthenticationOnOtpMigration", 43);
        try {
            ((hkf) ((hkf) bxq.a.e()).i("com/google/android/apps/authenticator2/migration/MigrationNavigationFragmentPeer$1", "onAuthenticationSucceeded", 98, "MigrationNavigationFragmentPeer.java")).s("OTPs will be exported");
            this.c.a(bxx.a(this.b), "ExportFragment");
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
