package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlaceholderExtensions.android.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"!\u0010\u0015\u001a\u00020\u000b*\u00020\u00108BX\u0082\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"!\u0010\u001b\u001a\u00020\u000b*\u00020\u00168BX\u0082\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroid/text/Spannable;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "", "setPlaceholders", "(Landroid/text/Spannable;Ljava/util/List;Landroidx/compose/ui/unit/Density;)V", "placeholder", "", "start", "end", "setPlaceholder", "(Landroid/text/Spannable;Landroidx/compose/ui/text/Placeholder;IILandroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/unit/TextUnit;", "getSpanUnit--R2X_6o", "(J)I", "getSpanUnit--R2X_6o$annotations", "(J)V", "spanUnit", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "getSpanVerticalAlign-do9X-Gg", "(I)I", "getSpanVerticalAlign-do9X-Gg$annotations", "(I)V", "spanVerticalAlign", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PlaceholderExtensions_androidKt {
    public static final void setPlaceholders(Spannable spannable, List placeholders, Density density) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        int size = placeholders.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range range = (AnnotatedString.Range) placeholders.get(i);
            setPlaceholder(spannable, (Placeholder) range.getItem(), range.getStart(), range.getEnd(), density);
        }
    }

    private static final void setPlaceholder(Spannable spannable, Placeholder placeholder, int i, int i2, Density density) {
        SpannableExtensions_androidKt.setSpan(spannable, new PlaceholderSpan(TextUnit.m2579getValueimpl(placeholder.getWidth()), m2400getSpanUnitR2X_6o(placeholder.getWidth()), TextUnit.m2579getValueimpl(placeholder.getHeight()), m2400getSpanUnitR2X_6o(placeholder.getHeight()), density.getFontScale() * density.getDensity(), m2401getSpanVerticalAligndo9XGg(placeholder.getPlaceholderVerticalAlign())), i, i2);
    }

    /* renamed from: getSpanUnit--R2X_6o, reason: not valid java name */
    private static final int m2400getSpanUnitR2X_6o(long j) {
        long m2578getTypeUIouoOA = TextUnit.m2578getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m2592equalsimpl0(m2578getTypeUIouoOA, companion.m2597getSpUIouoOA())) {
            return 0;
        }
        return TextUnitType.m2592equalsimpl0(m2578getTypeUIouoOA, companion.m2596getEmUIouoOA()) ? 1 : 2;
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg, reason: not valid java name */
    private static final int m2401getSpanVerticalAligndo9XGg(int i) {
        PlaceholderVerticalAlign.Companion companion = PlaceholderVerticalAlign.INSTANCE;
        if (PlaceholderVerticalAlign.m2200equalsimpl0(i, companion.m2204getAboveBaselineJ6kI3mc())) {
            return 0;
        }
        if (PlaceholderVerticalAlign.m2200equalsimpl0(i, companion.m2210getTopJ6kI3mc())) {
            return 1;
        }
        if (PlaceholderVerticalAlign.m2200equalsimpl0(i, companion.m2205getBottomJ6kI3mc())) {
            return 2;
        }
        if (PlaceholderVerticalAlign.m2200equalsimpl0(i, companion.m2206getCenterJ6kI3mc())) {
            return 3;
        }
        if (PlaceholderVerticalAlign.m2200equalsimpl0(i, companion.m2209getTextTopJ6kI3mc())) {
            return 4;
        }
        if (PlaceholderVerticalAlign.m2200equalsimpl0(i, companion.m2207getTextBottomJ6kI3mc())) {
            return 5;
        }
        if (PlaceholderVerticalAlign.m2200equalsimpl0(i, companion.m2208getTextCenterJ6kI3mc())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
    }
}
