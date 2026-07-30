package L;

import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public abstract class e {
    public static void a(NestedScrollView nestedScrollView, float f7) {
        try {
            nestedScrollView.setFrameContentVelocity(f7);
        } catch (LinkageError unused) {
        }
    }
}
