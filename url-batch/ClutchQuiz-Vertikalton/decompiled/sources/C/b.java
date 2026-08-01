package C;

import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ ColorStateListDrawable d(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* synthetic */ WindowInsets.Builder g() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder h(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* bridge */ /* synthetic */ boolean q(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }
}
