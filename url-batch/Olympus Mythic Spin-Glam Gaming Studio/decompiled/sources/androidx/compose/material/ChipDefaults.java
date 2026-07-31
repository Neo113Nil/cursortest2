package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* compiled from: Chip.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJo\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR \u0010\u001f\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR \u0010!\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/material/ChipDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "leadingIconContentColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconContentColor", "Landroidx/compose/material/ChipColors;", "chipColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ChipColors;", "chipColors", "leadingIconColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "Landroidx/compose/material/SelectableChipColors;", "filterChipColors-J08w3-E", "(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/SelectableChipColors;", "filterChipColors", "Landroidx/compose/ui/unit/Dp;", "MinHeight", "F", "getMinHeight-D9Ej5fM", "()F", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "LeadingIconSize", "getLeadingIconSize-D9Ej5fM", "SelectedIconSize", "getSelectedIconSize-D9Ej5fM", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalMaterialApi
/* loaded from: classes3.dex */
public final class ChipDefaults {
    public static final ChipDefaults INSTANCE = new ChipDefaults();
    private static final float MinHeight = Dp.m2507constructorimpl(32);
    private static final float OutlinedBorderSize = Dp.m2507constructorimpl(1);
    private static final float LeadingIconSize = Dp.m2507constructorimpl(20);
    private static final float SelectedIconSize = Dp.m2507constructorimpl(18);

    private ChipDefaults() {
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m783getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: chipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m781chipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long j7;
        long j8;
        composer.startReplaceableGroup(1838505436);
        if ((i2 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j7 = ColorKt.m1467compositeOverOWjLjI(Color.m1445copywmQWz5c$default(materialTheme.getColors(composer, 6).m795getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m800getSurface0d7_KjU());
        } else {
            j7 = j;
        }
        long m1445copywmQWz5c$default = (i2 & 2) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m1445copywmQWz5c$default2 = (i2 & 4) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        if ((i2 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            j8 = ColorKt.m1467compositeOverOWjLjI(Color.m1445copywmQWz5c$default(materialTheme2.getColors(composer, 6).m795getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.getColors(composer, 6).m800getSurface0d7_KjU());
        } else {
            j8 = j4;
        }
        DefaultChipColors defaultChipColors = new DefaultChipColors(j7, m1445copywmQWz5c$default, m1445copywmQWz5c$default2, j8, (i2 & 16) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j5, (i2 & 32) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j6, null);
        composer.endReplaceableGroup();
        return defaultChipColors;
    }

    /* renamed from: filterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m782filterChipColorsJ08w3E(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, Composer composer, int i, int i2) {
        long j10;
        long j11;
        composer.startReplaceableGroup(830140629);
        if ((i2 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j10 = ColorKt.m1467compositeOverOWjLjI(Color.m1445copywmQWz5c$default(materialTheme.getColors(composer, 6).m795getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m800getSurface0d7_KjU());
        } else {
            j10 = j;
        }
        long m1445copywmQWz5c$default = (i2 & 2) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m1445copywmQWz5c$default2 = (i2 & 4) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        if ((i2 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            j11 = ColorKt.m1467compositeOverOWjLjI(Color.m1445copywmQWz5c$default(materialTheme2.getColors(composer, 6).m795getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.getColors(composer, 6).m800getSurface0d7_KjU());
        } else {
            j11 = j4;
        }
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(j10, m1445copywmQWz5c$default, m1445copywmQWz5c$default2, j11, (i2 & 16) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j5, (i2 & 32) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j6, (i2 & 64) != 0 ? ColorKt.m1467compositeOverOWjLjI(Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), j10) : j7, (i2 & 128) != 0 ? ColorKt.m1467compositeOverOWjLjI(Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), m1445copywmQWz5c$default) : j8, (i2 & 256) != 0 ? ColorKt.m1467compositeOverOWjLjI(Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), m1445copywmQWz5c$default2) : j9, null);
        composer.endReplaceableGroup();
        return defaultSelectableChipColors;
    }
}
