package dev.chrisbanes.haze;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class HazeTint {
    public final int blendMode;
    public final Brush brush;
    public final long color;
    public static final HazeTint Unspecified = new HazeTint(Color.Unspecified, 3, null);
    public static final int DefaultBlendMode = 3;

    public HazeTint(long j, int i, Brush brush) {
        this.color = j;
        this.blendMode = i;
        this.brush = brush;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HazeTint)) {
            return false;
        }
        HazeTint hazeTint = (HazeTint) obj;
        return Color.m676equalsimpl0(this.color, hazeTint.color) && this.blendMode == hazeTint.blendMode && Intrinsics.areEqual(this.brush, hazeTint.brush);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blendMode, Long.hashCode(this.color) * 31, 31);
        Brush brush = this.brush;
        return m + (brush == null ? 0 : brush.hashCode());
    }

    public final boolean isSpecified() {
        return (this.color == 16 && this.brush == null) ? false : true;
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HazeTint(color=", Color.m682toStringimpl(this.color), ", blendMode=", BlendMode.m669toStringimpl(this.blendMode), ", brush=");
        m.append(this.brush);
        m.append(")");
        return m.toString();
    }

    public HazeTint(long j) {
        this(j, DefaultBlendMode, null);
    }
}
