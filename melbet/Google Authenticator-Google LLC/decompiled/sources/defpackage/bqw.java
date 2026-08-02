package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import com.google.android.apps.authenticator2.R;
import com.google.android.apps.authenticator2.editotp.AccountView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bqw {
    public static final hkh a = hkh.l("com/google/android/apps/authenticator2/editotp/EditOtpFragmentPeer");
    public final frv b;
    public final bqs c;
    public final bxa d;
    public final gbi e;
    public final gez f;
    public final Context g;
    public final gfy h;
    public final String i;
    public final hvl j;
    public final bqv k;
    public final bqt l;
    public List m;
    public hel n;
    public bpc o;
    public fuf p;
    public fuf q;
    public int r;
    public AccountView s;
    public final fde t;
    public final ldt u;
    public final brn v;

    public bqw(String str, frv frvVar, Context context, bqs bqsVar, ldt ldtVar, bxa bxaVar, fde fdeVar, gbi gbiVar, gez gezVar, brn brnVar, bpz bpzVar, hvl hvlVar) {
        this.i = str;
        this.b = frvVar;
        this.g = context;
        this.c = bqsVar;
        this.u = ldtVar;
        this.d = bxaVar;
        this.t = fdeVar;
        this.e = gbiVar;
        this.f = gezVar;
        this.j = hvlVar;
        this.v = brnVar;
        hhs hhsVar = new hhs(null);
        hhsVar.d(bpzVar);
        this.h = hhsVar.c();
        this.k = new bqv(this);
        this.l = new bqt(this);
    }

    public static RecyclerView a(bqs bqsVar) {
        return (RecyclerView) bqsVar.J().findViewById(R.id.accounts_recycler_view);
    }

    public static Button b(bqs bqsVar) {
        return (Button) bqsVar.J().findViewById(R.id.edit_account_save);
    }

    public static TextInputEditText c(bqs bqsVar) {
        return (TextInputEditText) bqsVar.J().findViewById(R.id.rename_edittext);
    }

    public static TextInputLayout d(bqs bqsVar) {
        return (TextInputLayout) bqsVar.J().findViewById(R.id.rename_edittext_input_layout);
    }
}
