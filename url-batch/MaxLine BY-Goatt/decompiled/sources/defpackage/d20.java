package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d20 {
    public final Object a;
    public final View b;

    public d20(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession b = ey.b(this.a);
            mm k = th2.k(this.b);
            Objects.requireNonNull(k);
            b.notifyViewsDisappeared(lh.a(k.a), new long[]{Long.MIN_VALUE});
        }
    }

    public final AutofillId b(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession b = ey.b(this.a);
        mm k = th2.k(this.b);
        Objects.requireNonNull(k);
        return b.newAutofillId(lh.a(k.a), j);
    }

    public final ot2 c(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new ot2(9, ey.b(this.a).newVirtualViewStructure(autofillId, j));
        }
        return null;
    }

    public final void d(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            ey.b(this.a).notifyViewAppeared(viewStructure);
        }
    }

    public final void e(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            ey.b(this.a).notifyViewDisappeared(autofillId);
        }
    }

    public final void f(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            ((ContentCaptureSession) this.a).notifyViewTextChanged(autofillId, str);
        }
    }
}
