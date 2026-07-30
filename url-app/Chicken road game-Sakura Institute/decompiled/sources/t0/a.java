package t0;

import android.view.autofill.AutofillManager;
import s1.r;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final r f8729a;

    /* renamed from: b, reason: collision with root package name */
    public final g f8730b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f8731c;

    public a(r rVar, g gVar) {
        this.f8729a = rVar;
        this.f8730b = gVar;
        AutofillManager e9 = b2.g.e(rVar.getContext().getSystemService(b2.g.i()));
        if (e9 == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f8731c = e9;
        rVar.setImportantForAutofill(1);
    }
}
