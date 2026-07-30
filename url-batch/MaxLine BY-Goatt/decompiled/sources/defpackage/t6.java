package defpackage;

import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class t6 implements hm {
    public final t7 a;
    public final om b;
    public final AutofillManager c;
    public final AutofillId d;

    public t6(t7 t7Var, om omVar) {
        this.a = t7Var;
        this.b = omVar;
        AutofillManager autofillManager = (AutofillManager) t7Var.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            lh.g("Autofill service could not be located.");
            throw null;
        }
        this.c = autofillManager;
        t7Var.setImportantForAutofill(1);
        mm k = th2.k(t7Var);
        AutofillId autofillId = k != null ? (AutofillId) k.a : null;
        if (autofillId == null) {
            throw q40.f("Required value was null.");
        }
        this.d = autofillId;
    }
}
