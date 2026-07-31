package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* compiled from: Slider.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jy\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/SliderDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "thumbColor", "disabledThumbColor", "activeTrackColor", "inactiveTrackColor", "disabledActiveTrackColor", "disabledInactiveTrackColor", "activeTickColor", "inactiveTickColor", "disabledActiveTickColor", "disabledInactiveTickColor", "Landroidx/compose/material/SliderColors;", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SliderColors;", "colors", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SliderDefaults {
    public static final SliderDefaults INSTANCE = new SliderDefaults();

    private SliderDefaults() {
    }

    /* renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m960colorsq0g_0yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Composer composer, int i, int i2, int i3) {
        long j11;
        composer.startReplaceableGroup(436017687);
        long m796getPrimary0d7_KjU = (i3 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m796getPrimary0d7_KjU() : j;
        if ((i3 & 2) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j11 = ColorKt.m1467compositeOverOWjLjI(Color.m1445copywmQWz5c$default(materialTheme.getColors(composer, 6).m795getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m800getSurface0d7_KjU());
        } else {
            j11 = j2;
        }
        long m796getPrimary0d7_KjU2 = (i3 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m796getPrimary0d7_KjU() : j3;
        long m1445copywmQWz5c$default = (i3 & 8) != 0 ? Color.m1445copywmQWz5c$default(m796getPrimary0d7_KjU2, 0.24f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long m1445copywmQWz5c$default2 = (i3 & 16) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long m1445copywmQWz5c$default3 = (i3 & 32) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default2, 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m1445copywmQWz5c$default4 = (i3 & 64) != 0 ? Color.m1445copywmQWz5c$default(ColorsKt.m814contentColorForek8zF_U(m796getPrimary0d7_KjU2, composer, (i >> 6) & 14), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        DefaultSliderColors defaultSliderColors = new DefaultSliderColors(m796getPrimary0d7_KjU, j11, m796getPrimary0d7_KjU2, m1445copywmQWz5c$default, m1445copywmQWz5c$default2, m1445copywmQWz5c$default3, m1445copywmQWz5c$default4, (i3 & 128) != 0 ? Color.m1445copywmQWz5c$default(m796getPrimary0d7_KjU2, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j8, (i3 & 256) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default4, 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j9, (i3 & 512) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default3, 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j10, null);
        composer.endReplaceableGroup();
        return defaultSliderColors;
    }
}
