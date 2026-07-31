package V;

import android.view.autofill.AutofillManager;
import u0.C0997t;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final C0997t f3341a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3342b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f3343c;

    public a(C0997t c0997t, f fVar) {
        this.f3341a = c0997t;
        this.f3342b = fVar;
        AutofillManager h3 = C0.e.h(c0997t.getContext().getSystemService(C0.e.k()));
        if (h3 == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f3343c = h3;
        c0997t.setImportantForAutofill(1);
    }
}
