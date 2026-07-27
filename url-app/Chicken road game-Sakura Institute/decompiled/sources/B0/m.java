package B0;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* loaded from: classes.dex */
public abstract /* synthetic */ class m {
    public static /* bridge */ /* synthetic */ ScrollCaptureSession d(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ ScrollCaptureTarget e(View view, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(view, rect, point, scrollCaptureCallback);
    }

    public static /* synthetic */ ViewTranslationRequest.Builder i(AutofillId autofillId, long j4) {
        return new ViewTranslationRequest.Builder(autofillId, j4);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse k(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* synthetic */ void m() {
    }
}
