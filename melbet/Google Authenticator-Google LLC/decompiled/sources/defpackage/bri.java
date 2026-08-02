package defpackage;

import android.widget.AutoCompleteTextView;
import android.widget.Button;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bri {
    public static final hkh a = hkh.l("com/google/android/apps/authenticator2/enterkey/EnterKeyFragmentPeer");
    public final bre b;
    public final gbi c;
    public final bxa d;
    public final brh e = new brh(this);
    public final brn f;

    public bri(bre breVar, brn brnVar, gbi gbiVar, bxa bxaVar) {
        this.b = breVar;
        this.f = brnVar;
        this.c = gbiVar;
        this.d = bxaVar;
    }

    public static AutoCompleteTextView a(bd bdVar) {
        return (AutoCompleteTextView) bdVar.J().findViewById(R.id.dropdown_menu_text_view);
    }

    public static Button b(bd bdVar) {
        return (Button) bdVar.J().findViewById(R.id.enter_key_add_button);
    }

    public static TextInputEditText c(bd bdVar) {
        return (TextInputEditText) bdVar.J().findViewById(R.id.otp_name);
    }

    public static TextInputEditText d(bd bdVar) {
        return (TextInputEditText) bdVar.J().findViewById(R.id.otp_secret_key);
    }

    public static TextInputLayout e(bd bdVar) {
        return (TextInputLayout) bdVar.J().findViewById(R.id.otp_name_input_layout);
    }

    public static TextInputLayout f(bd bdVar) {
        return (TextInputLayout) bdVar.J().findViewById(R.id.otp_secret_key_input_layout);
    }

    public static final String g(bd bdVar) {
        return d(bdVar).getText().toString().toUpperCase(Locale.ROOT).replace(" ", "").replace("\t", "").replace("\n", "");
    }
}
