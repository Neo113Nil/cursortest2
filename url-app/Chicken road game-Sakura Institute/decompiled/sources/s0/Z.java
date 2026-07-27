package s0;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public static final Z f10159a = new Z();

    public final float a(ViewConfiguration viewConfiguration) {
        int scaledHandwritingGestureLineMargin;
        scaledHandwritingGestureLineMargin = viewConfiguration.getScaledHandwritingGestureLineMargin();
        return scaledHandwritingGestureLineMargin;
    }

    public final float b(ViewConfiguration viewConfiguration) {
        int scaledHandwritingSlop;
        scaledHandwritingSlop = viewConfiguration.getScaledHandwritingSlop();
        return scaledHandwritingSlop;
    }
}
