package k0;

import android.view.View;

/* loaded from: classes.dex */
abstract class I extends G {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f40875f = true;

    I() {
    }

    @Override // k0.M
    public void d(View view, int i4, int i5, int i6, int i7) {
        if (f40875f) {
            try {
                view.setLeftTopRightBottom(i4, i5, i6, i7);
            } catch (NoSuchMethodError unused) {
                f40875f = false;
            }
        }
    }
}
