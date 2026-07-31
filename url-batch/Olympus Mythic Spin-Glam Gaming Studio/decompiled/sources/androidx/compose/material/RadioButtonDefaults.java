package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

/* compiled from: RadioButton.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/material/RadioButtonDefaults;", "", "()V", "colors", "Landroidx/compose/material/RadioButtonColors;", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "unselectedColor", "disabledColor", "colors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/RadioButtonColors;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadioButtonDefaults {
    public static final RadioButtonDefaults INSTANCE = new RadioButtonDefaults();

    private RadioButtonDefaults() {
    }

    /* renamed from: colors-RGew2ao, reason: not valid java name */
    public final RadioButtonColors m955colorsRGew2ao(long j, long j2, long j3, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1370708026);
        long m798getSecondary0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m798getSecondary0d7_KjU() : j;
        long m1445copywmQWz5c$default = (i2 & 2) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m1445copywmQWz5c$default2 = (i2 & 4) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        Color m1441boximpl = Color.m1441boximpl(m798getSecondary0d7_KjU);
        Color m1441boximpl2 = Color.m1441boximpl(m1445copywmQWz5c$default);
        Color m1441boximpl3 = Color.m1441boximpl(m1445copywmQWz5c$default2);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(m1441boximpl) | composer.changed(m1441boximpl2) | composer.changed(m1441boximpl3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new DefaultRadioButtonColors(m798getSecondary0d7_KjU, m1445copywmQWz5c$default, m1445copywmQWz5c$default2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultRadioButtonColors defaultRadioButtonColors = (DefaultRadioButtonColors) rememberedValue;
        composer.endReplaceableGroup();
        return defaultRadioButtonColors;
    }
}
