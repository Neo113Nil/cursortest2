package defpackage;

import android.graphics.Typeface;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class y {
    public static /* synthetic */ Typeface.CustomFallbackBuilder c(FontFamily fontFamily) {
        return new Typeface.CustomFallbackBuilder(fontFamily);
    }

    public static /* bridge */ /* synthetic */ ColorStateListDrawable d(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* synthetic */ FontFamily.Builder g(Font font) {
        return new FontFamily.Builder(font);
    }

    public static /* synthetic */ void k() {
    }

    public static /* bridge */ /* synthetic */ boolean r(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }

    public static /* synthetic */ FontFamily.Builder v(Font font) {
        return new FontFamily.Builder(font);
    }

    public static /* synthetic */ void x() {
    }
}
