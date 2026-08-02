package defpackage;

import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bxq {
    public static final hkh a = hkh.l("com/google/android/apps/authenticator2/migration/MigrationNavigationFragmentPeer");
    public final bxo b;
    public final by c;
    public final frv d;
    public bzk e;
    public final ox f;
    public final brn g;

    public bxq(bxo bxoVar, frv frvVar, gva gvaVar) {
        this.b = bxoVar;
        this.d = frvVar;
        this.c = bxoVar.F();
        bxp bxpVar = new bxp(this, gvaVar, frvVar);
        this.f = bxpVar;
        this.g = new brn(bxoVar, bxpVar);
    }

    public final void a(bd bdVar, String str) {
        ae aeVar = new ae(this.c);
        aeVar.m(R.id.navigation_fragment_layout, bdVar, str);
        aeVar.c();
    }
}
