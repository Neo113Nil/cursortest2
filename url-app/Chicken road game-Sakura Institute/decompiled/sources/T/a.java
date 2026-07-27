package T;

import android.view.autofill.AutofillManager;
import s0.C1166s;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final C1166s f4027a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4028b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f4029c;

    public a(C1166s c1166s, f fVar) {
        this.f4027a = c1166s;
        this.f4028b = fVar;
        AutofillManager autofillManager = (AutofillManager) c1166s.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f4029c = autofillManager;
        c1166s.setImportantForAutofill(1);
    }
}
