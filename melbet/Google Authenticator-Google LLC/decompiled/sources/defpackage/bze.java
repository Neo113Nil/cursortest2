package defpackage;

import android.content.Context;
import android.widget.Button;
import com.google.android.apps.authenticator2.R;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bze {
    public static final hkh a = hkh.l("com/google/android/apps/authenticator2/migration/imports/ImportFragmentPeer");
    public final Context b;
    public final bza c;
    public final bxa d;
    public final jey e;
    public final gbi f;
    public final jkd g;
    public final hvl i;
    public final brn l;
    public final bzb h = new bzb(this);
    public final bzc k = new bzc(this);
    public final Map j = new TreeMap();

    public bze(Context context, bza bzaVar, bxa bxaVar, jey jeyVar, brn brnVar, gbi gbiVar, jkd jkdVar, hvl hvlVar) {
        this.b = context;
        this.c = bzaVar;
        this.d = bxaVar;
        this.e = jeyVar;
        this.l = brnVar;
        this.f = gbiVar;
        this.g = jkdVar;
        this.i = hvlVar;
    }

    public static Button a(bza bzaVar) {
        return (Button) bzaVar.J().findViewById(R.id.scan_qr_code_button);
    }

    public final void b(CharSequence charSequence) {
        bza bzaVar = this.c;
        fpm n = fpm.n(bzaVar.J(), charSequence, -1);
        n.l(a(bzaVar));
        n.g();
    }
}
