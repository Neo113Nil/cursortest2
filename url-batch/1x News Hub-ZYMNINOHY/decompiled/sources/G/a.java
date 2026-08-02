package G;

import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static void b(EditorInfo editorInfo) {
        editorInfo.setStylusHandwritingEnabled(true);
    }
}
