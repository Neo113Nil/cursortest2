package androidx.compose.material;

import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import io.appmetrica.analytics.impl.M2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MaterialTextSelectionColors.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/Colors;", "colors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "rememberTextSelectionColors", "(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "Landroidx/compose/ui/graphics/Color;", "selectionColor", "textColor", "backgroundColor", "calculateSelectionBackgroundColor-ysEtTa8", "(JJJ)J", "calculateSelectionBackgroundColor", "", "binarySearchForAccessibleSelectionColorAlpha-ysEtTa8", "(JJJ)F", "binarySearchForAccessibleSelectionColorAlpha", "selectionColorAlpha", "calculateContrastRatio-nb2GgbA", "(JFJJ)F", "calculateContrastRatio", "foreground", M2.g, "calculateContrastRatio--OWjLjI", "(JJ)F", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MaterialTextSelectionColorsKt {
    public static final SelectionColors rememberTextSelectionColors(Colors colors, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        composer.startReplaceableGroup(-721696685);
        long m796getPrimary0d7_KjU = colors.m796getPrimary0d7_KjU();
        long m789getBackground0d7_KjU = colors.m789getBackground0d7_KjU();
        composer.startReplaceableGroup(35572910);
        long m813contentColorFor4WTKRHQ = ColorsKt.m813contentColorFor4WTKRHQ(colors, m789getBackground0d7_KjU);
        if (m813contentColorFor4WTKRHQ == Color.INSTANCE.m1461getUnspecified0d7_KjU()) {
            m813contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).getValue();
        }
        long j = m813contentColorFor4WTKRHQ;
        composer.endReplaceableGroup();
        long m1445copywmQWz5c$default = Color.m1445copywmQWz5c$default(j, ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        Color m1441boximpl = Color.m1441boximpl(m796getPrimary0d7_KjU);
        Color m1441boximpl2 = Color.m1441boximpl(m789getBackground0d7_KjU);
        Color m1441boximpl3 = Color.m1441boximpl(m1445copywmQWz5c$default);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(m1441boximpl) | composer.changed(m1441boximpl2) | composer.changed(m1441boximpl3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new SelectionColors(colors.m796getPrimary0d7_KjU(), m895calculateSelectionBackgroundColorysEtTa8(m796getPrimary0d7_KjU, m1445copywmQWz5c$default, m789getBackground0d7_KjU), null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SelectionColors selectionColors = (SelectionColors) rememberedValue;
        composer.endReplaceableGroup();
        return selectionColors;
    }

    /* renamed from: calculateSelectionBackgroundColor-ysEtTa8, reason: not valid java name */
    public static final long m895calculateSelectionBackgroundColorysEtTa8(long j, long j2, long j3) {
        float m892binarySearchForAccessibleSelectionColorAlphaysEtTa8;
        float m894calculateContrastRationb2GgbA = m894calculateContrastRationb2GgbA(j, 0.4f, j2, j3);
        float m894calculateContrastRationb2GgbA2 = m894calculateContrastRationb2GgbA(j, 0.2f, j2, j3);
        if (m894calculateContrastRationb2GgbA >= 4.5f) {
            m892binarySearchForAccessibleSelectionColorAlphaysEtTa8 = 0.4f;
        } else {
            m892binarySearchForAccessibleSelectionColorAlphaysEtTa8 = m894calculateContrastRationb2GgbA2 < 4.5f ? 0.2f : m892binarySearchForAccessibleSelectionColorAlphaysEtTa8(j, j2, j3);
        }
        return Color.m1445copywmQWz5c$default(j, m892binarySearchForAccessibleSelectionColorAlphaysEtTa8, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* renamed from: binarySearchForAccessibleSelectionColorAlpha-ysEtTa8, reason: not valid java name */
    private static final float m892binarySearchForAccessibleSelectionColorAlphaysEtTa8(long j, long j2, long j3) {
        float f = 0.2f;
        float f2 = 0.4f;
        float f3 = 0.4f;
        for (int i = 0; i < 7; i++) {
            float m894calculateContrastRationb2GgbA = (m894calculateContrastRationb2GgbA(j, f2, j2, j3) / 4.5f) - 1.0f;
            if (0.0f <= m894calculateContrastRationb2GgbA && m894calculateContrastRationb2GgbA <= 0.01f) {
                break;
            }
            if (m894calculateContrastRationb2GgbA < 0.0f) {
                f3 = f2;
            } else {
                f = f2;
            }
            f2 = (f3 + f) / 2.0f;
        }
        return f2;
    }

    /* renamed from: calculateContrastRatio-nb2GgbA, reason: not valid java name */
    private static final float m894calculateContrastRationb2GgbA(long j, float f, long j2, long j3) {
        long m1467compositeOverOWjLjI = ColorKt.m1467compositeOverOWjLjI(Color.m1445copywmQWz5c$default(j, f, 0.0f, 0.0f, 0.0f, 14, null), j3);
        return m893calculateContrastRatioOWjLjI(ColorKt.m1467compositeOverOWjLjI(j2, m1467compositeOverOWjLjI), m1467compositeOverOWjLjI);
    }

    /* renamed from: calculateContrastRatio--OWjLjI, reason: not valid java name */
    public static final float m893calculateContrastRatioOWjLjI(long j, long j2) {
        float m1470luminance8_81llA = ColorKt.m1470luminance8_81llA(j) + 0.05f;
        float m1470luminance8_81llA2 = ColorKt.m1470luminance8_81llA(j2) + 0.05f;
        return Math.max(m1470luminance8_81llA, m1470luminance8_81llA2) / Math.min(m1470luminance8_81llA, m1470luminance8_81llA2);
    }
}
