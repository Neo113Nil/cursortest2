package m;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f6118a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f6119b = new int[0];

    static {
        new Rect();
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 29 || i3 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f6118a);
        } else {
            drawable.setState(f6119b);
        }
        drawable.setState(state);
    }

    public static PorterDuff.Mode b(int i3, PorterDuff.Mode mode) {
        if (i3 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i3 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i3 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i3) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
