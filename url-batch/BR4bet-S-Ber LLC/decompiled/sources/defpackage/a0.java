package defpackage;

import android.graphics.Typeface;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a0 {
    public static /* synthetic */ Typeface.CustomFallbackBuilder e(FontFamily fontFamily) {
        return new Typeface.CustomFallbackBuilder(fontFamily);
    }

    public static /* bridge */ /* synthetic */ ColorStateListDrawable f(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* synthetic */ FontFamily.Builder h(Font font) {
        return new FontFamily.Builder(font);
    }

    public static /* synthetic */ void l() {
    }

    public static /* bridge */ /* synthetic */ boolean s(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }

    public static /* synthetic */ FontFamily.Builder w(Font font) {
        return new FontFamily.Builder(font);
    }
}
