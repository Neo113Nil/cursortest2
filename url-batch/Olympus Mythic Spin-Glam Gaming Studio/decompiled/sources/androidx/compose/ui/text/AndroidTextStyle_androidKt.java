package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidTextStyle.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/PlatformSpanStyle;", "spanStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "paragraphStyle", "Landroidx/compose/ui/text/PlatformTextStyle;", "createPlatformTextStyle", "(Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/text/PlatformParagraphStyle;)Landroidx/compose/ui/text/PlatformTextStyle;", "start", "stop", "", "fraction", "lerp", "(Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/PlatformParagraphStyle;F)Landroidx/compose/ui/text/PlatformParagraphStyle;", "(Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/text/PlatformSpanStyle;F)Landroidx/compose/ui/text/PlatformSpanStyle;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidTextStyle_androidKt {
    public static final PlatformSpanStyle lerp(PlatformSpanStyle start, PlatformSpanStyle stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return start;
    }

    public static final PlatformTextStyle createPlatformTextStyle(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        return new PlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    public static final PlatformParagraphStyle lerp(PlatformParagraphStyle start, PlatformParagraphStyle stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return start.getIncludeFontPadding() == stop.getIncludeFontPadding() ? start : new PlatformParagraphStyle(((Boolean) SpanStyleKt.lerpDiscrete(Boolean.valueOf(start.getIncludeFontPadding()), Boolean.valueOf(stop.getIncludeFontPadding()), f)).booleanValue());
    }
}
