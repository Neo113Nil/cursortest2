package defpackage;

import android.content.Context;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class boo {
    public static final hkh a = hkh.l("com/google/android/apps/authenticator2/addfirstotp/AddFirstOtpFragmentPeer");
    public final bok b;
    public final frv c;
    public final gbi d;
    public final bxa e;
    public final jey f;
    public final hvl g;
    public di i;
    public bpc j;
    public final kt l;
    public final brn m;
    private final Context n;
    public final bon h = new bon(this);
    public boolean k = false;

    public boo(Context context, frv frvVar, bok bokVar, gbi gbiVar, jey jeyVar, bxa bxaVar, brn brnVar, kt ktVar, hvl hvlVar) {
        this.n = context;
        this.c = frvVar;
        this.b = bokVar;
        this.d = gbiVar;
        this.f = jeyVar;
        this.e = bxaVar;
        this.m = brnVar;
        this.l = ktVar;
        this.g = hvlVar;
    }

    public final void a() {
        fhm fhmVar = new fhm(this.n, R.style.ThemeOverlay_GoogleMaterial3_MaterialAlertDialog_Centered);
        fhmVar.s(R.string.error);
        fhmVar.l(R.string.error_qr_message);
        fhmVar.q(R.string.error_qr_ok, new ahu(this, 2));
        fhmVar.j(R.drawable.warning_error_color);
        fhmVar.i();
        this.k = true;
    }
}
