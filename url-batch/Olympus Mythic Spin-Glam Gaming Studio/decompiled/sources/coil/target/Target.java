package coil.target;

import android.graphics.drawable.Drawable;

/* compiled from: Target.kt */
/* loaded from: classes13.dex */
public interface Target {

    /* compiled from: Target.kt */
    public static final class DefaultImpls {
        public static void onError(Target target, Drawable drawable) {
        }

        public static void onStart(Target target, Drawable drawable) {
        }

        public static void onSuccess(Target target, Drawable drawable) {
        }
    }

    void onError(Drawable drawable);

    void onStart(Drawable drawable);

    void onSuccess(Drawable drawable);
}
