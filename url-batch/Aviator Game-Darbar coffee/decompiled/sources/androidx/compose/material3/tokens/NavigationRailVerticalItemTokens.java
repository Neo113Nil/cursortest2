package androidx.compose.material3.tokens;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* compiled from: NavigationRailVerticalItemTokens.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0013\u0010\u000f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/tokens/NavigationRailVerticalItemTokens;", "", "<init>", "()V", "ActiveIndicatorHeight", "Landroidx/compose/ui/unit/Dp;", "getActiveIndicatorHeight-D9Ej5fM", "()F", "F", "ActiveIndicatorWidth", "getActiveIndicatorWidth-D9Ej5fM", "IconLabelSpace", "getIconLabelSpace-D9Ej5fM", "LeadingSpace", "getLeadingSpace-D9Ej5fM", "TrailingSpace", "getTrailingSpace-D9Ej5fM", "LabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "material3"}, k = 1, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class NavigationRailVerticalItemTokens {
    public static final int $stable = 0;
    public static final NavigationRailVerticalItemTokens INSTANCE = new NavigationRailVerticalItemTokens();
    private static final float ActiveIndicatorHeight = Dp.m7522constructorimpl(32.0f);
    private static final float ActiveIndicatorWidth = Dp.m7522constructorimpl(56.0f);
    private static final float IconLabelSpace = Dp.m7522constructorimpl(4.0f);
    private static final float LeadingSpace = Dp.m7522constructorimpl(16.0f);
    private static final float TrailingSpace = Dp.m7522constructorimpl(16.0f);
    private static final TypographyKeyTokens LabelTextFont = TypographyKeyTokens.LabelMedium;

    private NavigationRailVerticalItemTokens() {
    }

    /* renamed from: getActiveIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m3576getActiveIndicatorHeightD9Ej5fM() {
        return ActiveIndicatorHeight;
    }

    /* renamed from: getActiveIndicatorWidth-D9Ej5fM, reason: not valid java name */
    public final float m3577getActiveIndicatorWidthD9Ej5fM() {
        return ActiveIndicatorWidth;
    }

    /* renamed from: getIconLabelSpace-D9Ej5fM, reason: not valid java name */
    public final float m3578getIconLabelSpaceD9Ej5fM() {
        return IconLabelSpace;
    }

    /* renamed from: getLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3579getLeadingSpaceD9Ej5fM() {
        return LeadingSpace;
    }

    /* renamed from: getTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m3580getTrailingSpaceD9Ej5fM() {
        return TrailingSpace;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }
}
