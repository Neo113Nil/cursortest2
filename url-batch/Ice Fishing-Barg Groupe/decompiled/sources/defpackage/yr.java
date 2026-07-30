package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.graphics.Insets;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import defpackage.iq1;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class yr {
    public static final void OPXfSBeufaJ8(Activity activity, iq1.PxuCJdSBwIXG pxuCJdSBwIXG) {
        activity.registerActivityLifecycleCallbacks(pxuCJdSBwIXG);
    }

    public static ContentCaptureSession PxuCJdSBwIXG(View view) {
        return view.getContentCaptureSession();
    }

    public static void RAsUl2FVSrh6(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static ViewStructure TSizfFm2Yiuu(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    public static void Y1f8riQaR6yg(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static void a92UlCVFR9N8(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    public static void dgRBjINgWbAK(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void e9gEMXR7LXtO(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    public static AutofillId lS5Rgt96tfkO(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    public static Insets rtx2ld2ELZv4(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void wdg6QnbFHrFF(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void x50lh2ztY7Y5(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
