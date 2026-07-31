package androidx.core.view.contentcapture;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.List;

/* loaded from: classes3.dex */
public class ContentCaptureSessionCompat {
    private final Object mWrappedObj;

    public ContentCaptureSession toContentCaptureSession() {
        return ContentCaptureSessionCompat$$ExternalSyntheticApiModelOutline0.m(this.mWrappedObj);
    }

    @RequiresApi
    private static class Api34Impl {
        @DoNotInline
        static void notifyViewsAppeared(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    @RequiresApi
    private static class Api29Impl {
        @DoNotInline
        static void notifyViewsDisappeared(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }

        @DoNotInline
        static void notifyViewAppeared(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        @DoNotInline
        static ViewStructure newViewStructure(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        @DoNotInline
        static ViewStructure newVirtualViewStructure(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        @DoNotInline
        static AutofillId newAutofillId(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        @DoNotInline
        public static void notifyViewTextChanged(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }
    }

    @RequiresApi
    private static class Api23Impl {
        @DoNotInline
        static Bundle getExtras(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }
}
