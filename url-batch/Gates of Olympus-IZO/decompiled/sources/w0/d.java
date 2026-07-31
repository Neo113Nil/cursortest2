package w0;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import b0.AbstractC0290w;
import e2.AbstractC0381e;
import java.util.Objects;
import u0.AbstractC0994r0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8575a;

    /* renamed from: b, reason: collision with root package name */
    public final View f8576b;

    public d(ContentCaptureSession contentCaptureSession, View view) {
        this.f8575a = contentCaptureSession;
        this.f8576b = view;
    }

    public final AutofillId a(long j3) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession c3 = AbstractC0994r0.c(this.f8575a);
        M.e C = AbstractC0381e.C(this.f8576b);
        Objects.requireNonNull(C);
        return b.a(c3, AbstractC0290w.f(C.f2736a), j3);
    }
}
