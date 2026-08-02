package dev.chrisbanes.haze;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.ULong;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class HazeStyle {
    public static final HazeStyle Unspecified = new HazeStyle(0, EmptyList.INSTANCE, 29);
    public final long backgroundColor;
    public final float blurRadius;
    public final HazeTint fallbackTint;
    public final float noiseFactor;
    public final List tints;

    public HazeStyle(long j, List list, int i) {
        this((i & 1) != 0 ? Color.Unspecified : j, list, (i & 4) != 0 ? Float.NaN : 24.0f, -1.0f, HazeTint.Unspecified);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HazeStyle)) {
            return false;
        }
        HazeStyle hazeStyle = (HazeStyle) obj;
        return Color.m676equalsimpl0(this.backgroundColor, hazeStyle.backgroundColor) && Intrinsics.areEqual(this.tints, hazeStyle.tints) && Dp.m1037equalsimpl0(this.blurRadius, hazeStyle.blurRadius) && Float.compare(this.noiseFactor, hazeStyle.noiseFactor) == 0 && Intrinsics.areEqual(this.fallbackTint, hazeStyle.fallbackTint);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return this.fallbackTint.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.noiseFactor, CameraState$Type$EnumUnboxingLocalUtility.m(this.blurRadius, Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.backgroundColor) * 31, 31, this.tints), 31), 31);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.backgroundColor);
        String m1038toStringimpl = Dp.m1038toStringimpl(this.blurRadius);
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("HazeStyle(backgroundColor=", m682toStringimpl, ", tints=", ", blurRadius=", this.tints);
        m.append(m1038toStringimpl);
        m.append(", noiseFactor=");
        m.append(this.noiseFactor);
        m.append(", fallbackTint=");
        m.append(this.fallbackTint);
        m.append(")");
        return m.toString();
    }

    public HazeStyle(long j, List list, float f, float f2, HazeTint hazeTint) {
        list.getClass();
        hazeTint.getClass();
        this.backgroundColor = j;
        this.tints = list;
        this.blurRadius = f;
        this.noiseFactor = f2;
        this.fallbackTint = hazeTint;
    }
}
