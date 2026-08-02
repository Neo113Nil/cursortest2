package com.stripe.android.uicore;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.material.Colors;
import androidx.compose.ui.graphics.Color;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes8.dex */
public final class StripeColors {
    public final long appBarIcon;
    public final long component;
    public final long componentBorder;
    public final long componentDivider;
    public final Colors materialColors;
    public final long onComponent;
    public final long placeholderText;
    public final long subtitle;
    public final long textCursor;

    public StripeColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, Colors colors) {
        this.component = j;
        this.componentBorder = j2;
        this.componentDivider = j3;
        this.onComponent = j4;
        this.subtitle = j5;
        this.textCursor = j6;
        this.placeholderText = j7;
        this.appBarIcon = j8;
        this.materialColors = colors;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StripeColors) {
            StripeColors stripeColors = (StripeColors) obj;
            return Color.m676equalsimpl0(this.component, stripeColors.component) && Color.m676equalsimpl0(this.componentBorder, stripeColors.componentBorder) && Color.m676equalsimpl0(this.componentDivider, stripeColors.componentDivider) && Color.m676equalsimpl0(this.onComponent, stripeColors.onComponent) && Color.m676equalsimpl0(this.subtitle, stripeColors.subtitle) && Color.m676equalsimpl0(this.textCursor, stripeColors.textCursor) && Color.m676equalsimpl0(this.placeholderText, stripeColors.placeholderText) && Color.m676equalsimpl0(this.appBarIcon, stripeColors.appBarIcon) && this.materialColors == stripeColors.materialColors;
        }
        return false;
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return this.materialColors.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.component) * 31, 31, this.componentBorder), 31, this.componentDivider), 31, this.onComponent), 31, this.subtitle), 31, this.textCursor), 31, this.placeholderText), 31, this.appBarIcon);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.component);
        String m682toStringimpl2 = Color.m682toStringimpl(this.componentBorder);
        String m682toStringimpl3 = Color.m682toStringimpl(this.componentDivider);
        String m682toStringimpl4 = Color.m682toStringimpl(this.onComponent);
        String m682toStringimpl5 = Color.m682toStringimpl(this.subtitle);
        String m682toStringimpl6 = Color.m682toStringimpl(this.textCursor);
        String m682toStringimpl7 = Color.m682toStringimpl(this.placeholderText);
        String m682toStringimpl8 = Color.m682toStringimpl(this.appBarIcon);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StripeColors(component=", m682toStringimpl, ", componentBorder=", m682toStringimpl2, ", componentDivider=");
        Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl3, ", onComponent=", m682toStringimpl4, ", subtitle=");
        Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl5, ", textCursor=", m682toStringimpl6, ", placeholderText=");
        Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl7, ", appBarIcon=", m682toStringimpl8, ", materialColors=");
        m.append(this.materialColors);
        m.append(")");
        return m.toString();
    }
}
