package y;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputMethodManager;
import java.util.Objects;
import r1.z0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9722a;

    /* renamed from: b, reason: collision with root package name */
    public final View f9723b;

    public p(View view) {
        this.f9723b = view;
        this.f9722a = d6.a.c(d6.h.f2616g, new z0(12, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d6.g, java.lang.Object] */
    public InputMethodManager a() {
        return (InputMethodManager) this.f9722a.getValue();
    }

    public AutofillId b(long j8) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession g9 = l1.f.g(this.f9722a);
        c3.h j9 = v1.g.j(this.f9723b);
        Objects.requireNonNull(j9);
        return v1.b.a(g9, t0.d.i(j9.f1653a), j8);
    }

    public p(ContentCaptureSession contentCaptureSession, View view) {
        this.f9722a = contentCaptureSession;
        this.f9723b = view;
    }
}
