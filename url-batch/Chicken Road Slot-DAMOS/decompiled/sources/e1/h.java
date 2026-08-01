package e1;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends AutofillManager$AutofillCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final h f3782a = new h();

    public final void onAutofillEvent(View view, int i3, int i10) {
        super.onAutofillEvent(view, i3, i10);
        Log.d("Autofill Status", i10 != 1 ? i10 != 2 ? i10 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
