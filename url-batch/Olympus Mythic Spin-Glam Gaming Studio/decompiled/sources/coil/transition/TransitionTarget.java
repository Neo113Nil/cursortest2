package coil.transition;

import android.graphics.drawable.Drawable;
import coil.target.Target;

/* compiled from: TransitionTarget.kt */
/* loaded from: classes15.dex */
public interface TransitionTarget extends Target {

    /* compiled from: TransitionTarget.kt */
    public static final class DefaultImpls {
        public static void onError(TransitionTarget transitionTarget, Drawable drawable) {
            Target.DefaultImpls.onError(transitionTarget, drawable);
        }

        public static void onStart(TransitionTarget transitionTarget, Drawable drawable) {
            Target.DefaultImpls.onStart(transitionTarget, drawable);
        }

        public static void onSuccess(TransitionTarget transitionTarget, Drawable drawable) {
            Target.DefaultImpls.onSuccess(transitionTarget, drawable);
        }
    }
}
