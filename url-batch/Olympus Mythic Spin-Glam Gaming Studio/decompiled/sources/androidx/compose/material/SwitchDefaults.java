package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* compiled from: Switch.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jy\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/SwitchDefaults;", "", "()V", "colors", "Landroidx/compose/material/SwitchColors;", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedTrackAlpha", "", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedTrackAlpha", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "colors-SQMK_m0", "(JJFJJFJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SwitchColors;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwitchDefaults {
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();

    private SwitchDefaults() {
    }

    /* renamed from: colors-SQMK_m0, reason: not valid java name */
    public final SwitchColors m1000colorsSQMK_m0(long j, long j2, float f, long j3, long j4, float f2, long j5, long j6, long j7, long j8, Composer composer, int i, int i2, int i3) {
        long j9;
        long j10;
        float f3;
        long j11;
        long j12;
        int i4;
        long j13;
        composer.startReplaceableGroup(-1032127534);
        long m799getSecondaryVariant0d7_KjU = (i3 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m799getSecondaryVariant0d7_KjU() : j;
        long j14 = (i3 & 2) != 0 ? m799getSecondaryVariant0d7_KjU : j2;
        float f4 = (i3 & 4) != 0 ? 0.54f : f;
        long m800getSurface0d7_KjU = (i3 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m800getSurface0d7_KjU() : j3;
        long m795getOnSurface0d7_KjU = (i3 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU() : j4;
        float f5 = (i3 & 32) != 0 ? 0.38f : f2;
        if ((i3 & 64) != 0) {
            j9 = m799getSecondaryVariant0d7_KjU;
            j10 = ColorKt.m1467compositeOverOWjLjI(Color.m1445copywmQWz5c$default(m799getSecondaryVariant0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m800getSurface0d7_KjU());
        } else {
            j9 = m799getSecondaryVariant0d7_KjU;
            j10 = j5;
        }
        if ((i3 & 128) != 0) {
            f3 = f5;
            j11 = ColorKt.m1467compositeOverOWjLjI(Color.m1445copywmQWz5c$default(j14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m800getSurface0d7_KjU());
        } else {
            f3 = f5;
            j11 = j6;
        }
        if ((i3 & 256) != 0) {
            j12 = j10;
            i4 = 6;
            j13 = ColorKt.m1467compositeOverOWjLjI(Color.m1445copywmQWz5c$default(m800getSurface0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m800getSurface0d7_KjU());
        } else {
            j12 = j10;
            i4 = 6;
            j13 = j7;
        }
        DefaultSwitchColors defaultSwitchColors = new DefaultSwitchColors(j9, Color.m1445copywmQWz5c$default(j14, f4, 0.0f, 0.0f, 0.0f, 14, null), m800getSurface0d7_KjU, Color.m1445copywmQWz5c$default(m795getOnSurface0d7_KjU, f3, 0.0f, 0.0f, 0.0f, 14, null), j12, Color.m1445copywmQWz5c$default(j11, f4, 0.0f, 0.0f, 0.0f, 14, null), j13, Color.m1445copywmQWz5c$default((i3 & 512) != 0 ? ColorKt.m1467compositeOverOWjLjI(Color.m1445copywmQWz5c$default(m795getOnSurface0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, i4), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m800getSurface0d7_KjU()) : j8, f3, 0.0f, 0.0f, 0.0f, 14, null), null);
        composer.endReplaceableGroup();
        return defaultSwitchColors;
    }
}
