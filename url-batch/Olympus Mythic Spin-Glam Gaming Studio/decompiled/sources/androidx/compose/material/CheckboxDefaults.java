package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

/* compiled from: Checkbox.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JG\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/material/CheckboxDefaults;", "", "()V", "colors", "Landroidx/compose/material/CheckboxColors;", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedColor", "checkmarkColor", "disabledColor", "disabledIndeterminateColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/CheckboxColors;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckboxDefaults {
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final CheckboxColors m765colorszjMxDiM(long j, long j2, long j3, long j4, long j5, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(469524104);
        long m798getSecondary0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m798getSecondary0d7_KjU() : j;
        long m1445copywmQWz5c$default = (i2 & 2) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m800getSurface0d7_KjU = (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m800getSurface0d7_KjU() : j3;
        long m1445copywmQWz5c$default2 = (i2 & 8) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long m1445copywmQWz5c$default3 = (i2 & 16) != 0 ? Color.m1445copywmQWz5c$default(m798getSecondary0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        Object[] objArr = {Color.m1441boximpl(m798getSecondary0d7_KjU), Color.m1441boximpl(m1445copywmQWz5c$default), Color.m1441boximpl(m800getSurface0d7_KjU), Color.m1441boximpl(m1445copywmQWz5c$default2), Color.m1441boximpl(m1445copywmQWz5c$default3)};
        composer.startReplaceableGroup(-568225417);
        boolean z = false;
        for (int i3 = 0; i3 < 5; i3++) {
            z |= composer.changed(objArr[i3]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new DefaultCheckboxColors(m800getSurface0d7_KjU, Color.m1445copywmQWz5c$default(m800getSurface0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), m798getSecondary0d7_KjU, Color.m1445copywmQWz5c$default(m798getSecondary0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), m1445copywmQWz5c$default2, Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), m1445copywmQWz5c$default3, m798getSecondary0d7_KjU, m1445copywmQWz5c$default, m1445copywmQWz5c$default2, m1445copywmQWz5c$default3, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultCheckboxColors defaultCheckboxColors = (DefaultCheckboxColors) rememberedValue;
        composer.endReplaceableGroup();
        return defaultCheckboxColors;
    }
}
