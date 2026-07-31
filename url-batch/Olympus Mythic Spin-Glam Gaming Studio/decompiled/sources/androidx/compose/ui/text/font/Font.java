package androidx.compose.ui.text.font;

import androidx.compose.ui.text.ExperimentalTextApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceFontFamilyNameFont.kt */
@ExperimentalTextApi
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/font/DeviceFontFamilyNameFont;", "Landroidx/compose/ui/text/font/AndroidFont;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/font/DeviceFontFamilyName;", "familyName", "Ljava/lang/String;", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "style", "I", "getStyle-_-LCdwA", "Landroid/graphics/Typeface;", "resolvedTypeface", "Landroid/graphics/Typeface;", "getResolvedTypeface", "()Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.font.DeviceFontFamilyNameFont, reason: from toString */
/* loaded from: classes6.dex */
final class Font extends AndroidFont {
    private final String familyName;
    private final android.graphics.Typeface resolvedTypeface;
    private final int style;
    private final FontWeight weight;

    @Override // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA, reason: from getter */
    public int getStyle() {
        return this.style;
    }

    public final android.graphics.Typeface getResolvedTypeface() {
        return this.resolvedTypeface;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(Font.class, other != null ? other.getClass() : null)) {
            return false;
        }
        if (other != null) {
            Font font = (Font) other;
            return DeviceFontFamilyName.m2283equalsimpl0(this.familyName, font.familyName) && Intrinsics.areEqual(getWeight(), font.getWeight()) && FontStyle.m2302equalsimpl0(getStyle(), font.getStyle());
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.text.font.DeviceFontFamilyNameFont");
    }

    public int hashCode() {
        return (((DeviceFontFamilyName.m2284hashCodeimpl(this.familyName) * 31) + getWeight().hashCode()) * 31) + FontStyle.m2303hashCodeimpl(getStyle());
    }

    public String toString() {
        return "Font(familyName=\"" + ((Object) DeviceFontFamilyName.m2285toStringimpl(this.familyName)) + "\", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m2304toStringimpl(getStyle())) + ')';
    }
}
