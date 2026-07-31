package z0;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h extends AutofillManager$AutofillCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final h f9111a = new h();

    public final void onAutofillEvent(View view, int i, int i8) {
        super.onAutofillEvent(view, i, i8);
        Log.d("Autofill Status", i8 != 1 ? i8 != 2 ? i8 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
