package defpackage;

import android.view.View;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class en0 {
    public static float a(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    public static void b(View view, float f) {
        view.setTransitionAlpha(f);
    }
}
