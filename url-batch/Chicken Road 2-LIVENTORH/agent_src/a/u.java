package a;

import android.graphics.Typeface;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract /* synthetic */ class u {
    public static /* synthetic */ Typeface.CustomFallbackBuilder d(FontFamily fontFamily) {
        return new Typeface.CustomFallbackBuilder(fontFamily);
    }

    public static /* bridge */ /* synthetic */ ColorStateListDrawable f(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* synthetic */ FontFamily.Builder i(Font font) {
        return new FontFamily.Builder(font);
    }

    public static /* synthetic */ void l() {
    }

    public static /* bridge */ /* synthetic */ boolean v(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }

    public static /* synthetic */ void y() {
    }
}
