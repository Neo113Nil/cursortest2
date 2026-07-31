package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.intl.AndroidLocale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import androidx.core.text.TextUtilsCompat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aP\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a+\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0016\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"ActualParagraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "resolveTextDirectionHeuristics", "", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "resolveTextDirectionHeuristics-9GRLPo0", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AndroidParagraphIntrinsics_androidKt {
    /* renamed from: resolveTextDirectionHeuristics-9GRLPo0, reason: not valid java name */
    public static final int m2393resolveTextDirectionHeuristics9GRLPo0(TextDirection textDirection, LocaleList localeList) {
        Locale locale;
        int value = textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m2459getContents_7Xco();
        TextDirection.Companion companion = TextDirection.INSTANCE;
        if (TextDirection.m2455equalsimpl0(value, companion.m2460getContentOrLtrs_7Xco())) {
            return 2;
        }
        if (!TextDirection.m2455equalsimpl0(value, companion.m2461getContentOrRtls_7Xco())) {
            if (TextDirection.m2455equalsimpl0(value, companion.m2462getLtrs_7Xco())) {
                return 0;
            }
            if (TextDirection.m2455equalsimpl0(value, companion.m2463getRtls_7Xco())) {
                return 1;
            }
            if (TextDirection.m2455equalsimpl0(value, companion.m2459getContents_7Xco())) {
                if (localeList == null || (locale = ((AndroidLocale) localeList.get(0).getPlatformLocale()).getJavaLocale()) == null) {
                    locale = Locale.getDefault();
                }
                int layoutDirectionFromLocale = TextUtilsCompat.getLayoutDirectionFromLocale(locale);
                if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                    return 2;
                }
            } else {
                throw new IllegalStateException("Invalid TextDirection.");
            }
        }
        return 3;
    }

    public static final ParagraphIntrinsics ActualParagraphIntrinsics(String text, TextStyle style, List spanStyles, List placeholders, Density density, FontFamily.Resolver fontFamilyResolver) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        return new AndroidParagraphIntrinsics(text, style, spanStyles, placeholders, fontFamilyResolver, density);
    }
}
