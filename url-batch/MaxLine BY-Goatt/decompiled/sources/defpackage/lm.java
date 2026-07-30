package defpackage;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lm extends AutofillManager$AutofillCallback {
    public static final lm a = new lm();

    public final void a(t6 t6Var) {
        t6Var.c.registerCallback(this);
    }

    public final void b(t6 t6Var) {
        t6Var.c.unregisterCallback(this);
    }

    public final void onAutofillEvent(View view, int i, int i2) {
        super.onAutofillEvent(view, i, i2);
        Log.d("Autofill Status", i2 != 1 ? i2 != 2 ? i2 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
