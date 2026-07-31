package i3;

import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.view.WindowInsets;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* bridge */ /* synthetic */ ColorStateListDrawable g(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* synthetic */ WindowInsets.Builder i() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder j(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* bridge */ /* synthetic */ boolean s(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }
}
