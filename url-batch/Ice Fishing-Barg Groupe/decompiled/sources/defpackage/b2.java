package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class b2 {
    public static /* synthetic */ ScrollCaptureTarget OPXfSBeufaJ8(r1 r1Var, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(r1Var, rect, point, scrollCaptureCallback);
    }

    public static /* synthetic */ void XL4ISE6Oc65B() {
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse gPXPFXrUH4XX(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* synthetic */ ViewTranslationRequest.Builder r3s1LDPKFs1S(AutofillId autofillId, long j) {
        return new ViewTranslationRequest.Builder(autofillId, j);
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession rtx2ld2ELZv4(Object obj) {
        return (ScrollCaptureSession) obj;
    }
}
