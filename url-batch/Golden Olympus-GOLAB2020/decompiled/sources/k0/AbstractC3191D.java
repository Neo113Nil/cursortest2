package k0;

import android.view.View;

/* renamed from: k0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3191D extends M {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f40872c = true;

    AbstractC3191D() {
    }

    @Override // k0.M
    public float b(View view) {
        float transitionAlpha;
        if (f40872c) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f40872c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // k0.M
    public void e(View view, float f4) {
        if (f40872c) {
            try {
                view.setTransitionAlpha(f4);
                return;
            } catch (NoSuchMethodError unused) {
                f40872c = false;
            }
        }
        view.setAlpha(f4);
    }

    @Override // k0.M
    public void a(View view) {
    }

    @Override // k0.M
    public void c(View view) {
    }
}
