package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* compiled from: Button.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0018R\u001d\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010$\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010&R \u0010'\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010&R \u0010)\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010&R \u0010+\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010&R \u0010-\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b-\u0010\u001d\u001a\u0004\b.\u0010&R\u001d\u0010/\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b/\u0010\u001dR\u0017\u00100\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u0010#R\u0011\u00105\u001a\u0002028G¢\u0006\u0006\u001a\u0004\b3\u00104\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/material/ButtonDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "disabledElevation", "hoveredElevation", "focusedElevation", "Landroidx/compose/material/ButtonElevation;", "elevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "elevation", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "disabledBackgroundColor", "disabledContentColor", "Landroidx/compose/material/ButtonColors;", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "buttonColors", "outlinedButtonColors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "outlinedButtonColors", "textButtonColors-RGew2ao", "textButtonColors", "ButtonHorizontalPadding", "F", "ButtonVerticalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "MinWidth", "getMinWidth-D9Ej5fM", "()F", "MinHeight", "getMinHeight-D9Ej5fM", "IconSize", "getIconSize-D9Ej5fM", "IconSpacing", "getIconSpacing-D9Ej5fM", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "TextButtonHorizontalPadding", "TextButtonContentPadding", "getTextButtonContentPadding", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedBorder", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;
    private static final PaddingValues ContentPadding;
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    private static final float OutlinedBorderSize;
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    static {
        float m2507constructorimpl = Dp.m2507constructorimpl(16);
        ButtonHorizontalPadding = m2507constructorimpl;
        float f = 8;
        float m2507constructorimpl2 = Dp.m2507constructorimpl(f);
        ButtonVerticalPadding = m2507constructorimpl2;
        PaddingValues m332PaddingValuesa9UjIt4 = PaddingKt.m332PaddingValuesa9UjIt4(m2507constructorimpl, m2507constructorimpl2, m2507constructorimpl, m2507constructorimpl2);
        ContentPadding = m332PaddingValuesa9UjIt4;
        MinWidth = Dp.m2507constructorimpl(64);
        MinHeight = Dp.m2507constructorimpl(36);
        IconSize = Dp.m2507constructorimpl(18);
        IconSpacing = Dp.m2507constructorimpl(f);
        OutlinedBorderSize = Dp.m2507constructorimpl(1);
        float m2507constructorimpl3 = Dp.m2507constructorimpl(f);
        TextButtonHorizontalPadding = m2507constructorimpl3;
        TextButtonContentPadding = PaddingKt.m332PaddingValuesa9UjIt4(m2507constructorimpl3, m332PaddingValuesa9UjIt4.getTop(), m2507constructorimpl3, m332PaddingValuesa9UjIt4.getBottom());
    }

    /* renamed from: elevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m757elevationR_JCAzs(float f, float f2, float f3, float f4, float f5, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-737170518);
        if ((i2 & 1) != 0) {
            f = Dp.m2507constructorimpl(2);
        }
        float f6 = f;
        if ((i2 & 2) != 0) {
            f2 = Dp.m2507constructorimpl(8);
        }
        float f7 = f2;
        if ((i2 & 4) != 0) {
            f3 = Dp.m2507constructorimpl(0);
        }
        float f8 = f3;
        if ((i2 & 8) != 0) {
            f4 = Dp.m2507constructorimpl(4);
        }
        float f9 = f4;
        if ((i2 & 16) != 0) {
            f5 = Dp.m2507constructorimpl(4);
        }
        float f10 = f5;
        Object[] objArr = {Dp.m2505boximpl(f6), Dp.m2505boximpl(f7), Dp.m2505boximpl(f8), Dp.m2505boximpl(f9), Dp.m2505boximpl(f10)};
        composer.startReplaceableGroup(-568225417);
        boolean z = false;
        for (int i3 = 0; i3 < 5; i3++) {
            z |= composer.changed(objArr[i3]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new DefaultButtonElevation(f6, f7, f8, f9, f10, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultButtonElevation defaultButtonElevation = (DefaultButtonElevation) rememberedValue;
        composer.endReplaceableGroup();
        return defaultButtonElevation;
    }

    private ButtonDefaults() {
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m759getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m758getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m756buttonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long j5;
        composer.startReplaceableGroup(1870371134);
        long m796getPrimary0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m796getPrimary0d7_KjU() : j;
        long m814contentColorForek8zF_U = (i2 & 2) != 0 ? ColorsKt.m814contentColorForek8zF_U(m796getPrimary0d7_KjU, composer, i & 14) : j2;
        if ((i2 & 4) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j5 = ColorKt.m1467compositeOverOWjLjI(Color.m1445copywmQWz5c$default(materialTheme.getColors(composer, 6).m795getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m800getSurface0d7_KjU());
        } else {
            j5 = j3;
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(m796getPrimary0d7_KjU, m814contentColorForek8zF_U, j5, (i2 & 8) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4, null);
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    /* renamed from: outlinedButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m760outlinedButtonColorsRGew2ao(long j, long j2, long j3, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-2124406093);
        long m800getSurface0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m800getSurface0d7_KjU() : j;
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(m800getSurface0d7_KjU, (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m796getPrimary0d7_KjU() : j2, m800getSurface0d7_KjU, (i2 & 4) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3, null);
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    /* renamed from: textButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m761textButtonColorsRGew2ao(long j, long j2, long j3, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(182742216);
        long m1460getTransparent0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m1460getTransparent0d7_KjU() : j;
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(m1460getTransparent0d7_KjU, (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m796getPrimary0d7_KjU() : j2, m1460getTransparent0d7_KjU, (i2 & 4) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3, null);
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    public final BorderStroke getOutlinedBorder(Composer composer, int i) {
        composer.startReplaceableGroup(-2091313033);
        BorderStroke m167BorderStrokecXLIe8U = BorderStrokeKt.m167BorderStrokecXLIe8U(OutlinedBorderSize, Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        composer.endReplaceableGroup();
        return m167BorderStrokecXLIe8U;
    }

    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }
}
