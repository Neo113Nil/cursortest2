package V;

import D0.AbstractC0070h;
import android.view.autofill.AutofillManager;
import u0.C1123s;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final C1123s f4544a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4545b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f4546c;

    public a(C1123s c1123s, f fVar) {
        this.f4544a = c1123s;
        this.f4545b = fVar;
        AutofillManager h3 = AbstractC0070h.h(c1123s.getContext().getSystemService(AbstractC0070h.k()));
        if (h3 == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f4546c = h3;
        c1123s.setImportantForAutofill(1);
    }
}
