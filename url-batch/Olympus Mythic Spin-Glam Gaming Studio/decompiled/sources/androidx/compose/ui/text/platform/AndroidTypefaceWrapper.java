package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidTypefaceWrapper.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001J-\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTypefaceWrapper;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "synthesis", "Landroid/graphics/Typeface;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "getNativeTypeface", "typeface", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidTypefaceWrapper implements AndroidTypeface {
    private final Typeface typeface;

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo2390getNativeTypefacePYhJU0U(FontWeight fontWeight, int fontStyle, int synthesis) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return this.typeface;
    }
}
