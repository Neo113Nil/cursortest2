package com.squareup.cash.ui;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes7.dex */
public final class BannerColors {
    public final long alertIconColor;
    public final long backgroundColor;
    public final long chevronIconColor;
    public final long contentColor;

    public BannerColors(long j, long j2, long j3, long j4) {
        this.backgroundColor = j;
        this.contentColor = j2;
        this.alertIconColor = j3;
        this.chevronIconColor = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerColors)) {
            return false;
        }
        BannerColors bannerColors = (BannerColors) obj;
        return Color.m676equalsimpl0(this.backgroundColor, bannerColors.backgroundColor) && Color.m676equalsimpl0(this.contentColor, bannerColors.contentColor) && Color.m676equalsimpl0(this.alertIconColor, bannerColors.alertIconColor) && Color.m676equalsimpl0(this.chevronIconColor, bannerColors.chevronIconColor);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.chevronIconColor) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.backgroundColor) * 31, 31, this.contentColor), 31, this.alertIconColor);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.backgroundColor);
        String m682toStringimpl2 = Color.m682toStringimpl(this.contentColor);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BannerColors(backgroundColor=", m682toStringimpl, ", contentColor=", m682toStringimpl2, ", alertIconColor="), Color.m682toStringimpl(this.alertIconColor), ", chevronIconColor=", Color.m682toStringimpl(this.chevronIconColor), ")");
    }
}
