package com.stripe.android.uicore.elements;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes8.dex */
public final class OTPElementColors {
    public final long background;
    public final long placeholder;
    public final long selectedBackground;
    public final long selectedBorder;
    public final long unselectedBorder;

    public OTPElementColors(long j, long j2, long j3, long j4, long j5) {
        this.selectedBorder = j;
        this.placeholder = j2;
        this.background = j3;
        this.selectedBackground = j4;
        this.unselectedBorder = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OTPElementColors)) {
            return false;
        }
        OTPElementColors oTPElementColors = (OTPElementColors) obj;
        return Color.m676equalsimpl0(this.selectedBorder, oTPElementColors.selectedBorder) && Color.m676equalsimpl0(this.placeholder, oTPElementColors.placeholder) && Color.m676equalsimpl0(this.background, oTPElementColors.background) && Color.m676equalsimpl0(this.selectedBackground, oTPElementColors.selectedBackground) && Color.m676equalsimpl0(this.unselectedBorder, oTPElementColors.unselectedBorder);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.unselectedBorder) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.selectedBorder) * 31, 31, this.placeholder), 31, this.background), 31, this.selectedBackground);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.selectedBorder);
        String m682toStringimpl2 = Color.m682toStringimpl(this.placeholder);
        String m682toStringimpl3 = Color.m682toStringimpl(this.background);
        String m682toStringimpl4 = Color.m682toStringimpl(this.selectedBackground);
        String m682toStringimpl5 = Color.m682toStringimpl(this.unselectedBorder);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OTPElementColors(selectedBorder=", m682toStringimpl, ", placeholder=", m682toStringimpl2, ", background=");
        Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl3, ", selectedBackground=", m682toStringimpl4, ", unselectedBorder=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m682toStringimpl5, ")");
    }
}
