package defpackage;

import android.app.PictureInPictureUiState;
import android.os.Build;
import android.text.StaticLayout;
import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class sf0 {
    public static final void a(StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }

    public static nm1 b(PictureInPictureUiState pictureInPictureUiState) {
        pictureInPictureUiState.getClass();
        int i = Build.VERSION.SDK_INT;
        int i2 = 8;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            return new nm1(i2);
        }
        if (i < 31) {
            return new nm1(i2);
        }
        pictureInPictureUiState.isStashed();
        return new nm1(i2);
    }

    public static void c(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static void d(EditorInfo editorInfo, boolean z) {
        editorInfo.setStylusHandwritingEnabled(z);
    }
}
