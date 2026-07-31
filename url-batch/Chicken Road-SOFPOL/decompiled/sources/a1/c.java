package a1;

import android.content.ClipData;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.fonts.Font;
import android.view.ContentInfo;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import x1.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* synthetic */ Font.Builder e(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ ContentInfo.Builder h(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo j(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession l(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ ScrollCaptureTarget m(t tVar, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(tVar, rect, point, scrollCaptureCallback);
    }

    public static /* synthetic */ ViewTranslationRequest.Builder q(AutofillId autofillId, long j7) {
        return new ViewTranslationRequest.Builder(autofillId, j7);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse s(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* synthetic */ void u() {
    }
}
