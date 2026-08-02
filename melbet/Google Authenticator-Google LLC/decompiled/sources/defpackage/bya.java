package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bya {
    public static final hkh a = hkh.l("com/google/android/apps/authenticator2/migration/exports/ExportFragmentPeer");
    public final bxx b;
    public final Context c;
    public final bxa d;
    public final gez e;
    public final gfy f;
    public her g;
    public boolean h;
    public hel i;
    public final brn j;

    public bya(Context context, bxx bxxVar, brn brnVar, byk bykVar, bxa bxaVar, gez gezVar) {
        this.c = context;
        this.b = bxxVar;
        this.j = brnVar;
        this.d = bxaVar;
        this.e = gezVar;
        hhs hhsVar = new hhs(null);
        hhsVar.d(bykVar);
        this.f = hhsVar.c();
    }

    public static RecyclerView a(bxx bxxVar) {
        return (RecyclerView) bxxVar.J().findViewById(R.id.otps_for_transfer_recycler_view);
    }

    public static Button b(bxx bxxVar) {
        return (Button) bxxVar.J().findViewById(R.id.next_button);
    }

    public final void c() {
        fhm fhmVar = new fhm(this.b.y(), R.style.ThemeOverlay_GoogleMaterial3_MaterialAlertDialog_Centered);
        fhmVar.s(R.string.no_codes);
        fhmVar.l(R.string.no_codes_to_migrate);
        fhmVar.q(R.string.ok, new ahu(this, 5));
        fhmVar.j(R.drawable.warning_error_color);
        fhmVar.i();
        this.h = true;
    }
}
