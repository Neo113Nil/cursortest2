package com.stripe.android.uicore;

import androidx.compose.material.Colors;
import androidx.compose.material.ColorsKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.room.Room;

/* loaded from: classes8.dex */
public abstract class StripeThemeDefaults {
    public static final StripeColors colorsDark;
    public static final StripeColors colorsLight;
    public static final IconStyle iconStyle;
    public static final SectionStyle sectionStyle;
    public static final StripeShapes shapes;
    public static final FormInsets textFieldInsets;
    public static final StripeTypography typography;

    static {
        long j = Color.White;
        long Color = ColorKt.Color(863533184);
        long Color2 = ColorKt.Color(863533184);
        long j2 = Color.Black;
        long Color3 = ColorKt.Color(2566914048L);
        long Color4 = ColorKt.Color(2570861635L);
        long Color5 = ColorKt.Color(2566914048L);
        long Color6 = ColorKt.Color(4278221567L);
        long j3 = Color.Red;
        Colors m489lightColors2qZNXz8$default = ColorsKt.m489lightColors2qZNXz8$default(Color6, j, j3, j2, 2974);
        colorsLight = new StripeColors(j, Color, Color2, j2, Color3, j2, Color4, Color5, m489lightColors2qZNXz8$default);
        long j4 = Color.DarkGray;
        long Color7 = ColorKt.Color(4286085248L);
        long Color8 = ColorKt.Color(4286085248L);
        long Color9 = ColorKt.Color(2583691263L);
        long Color10 = ColorKt.Color(1644167167);
        long Color11 = ColorKt.Color(4278219988L);
        long Color12 = ColorKt.Color(4281216558L);
        long Color13 = ColorKt.Color(4281794739L);
        long Color14 = ColorKt.Color(4278442694L);
        Colors colors = new Colors(Color11, Color13, Color14, Color14, ColorKt.Color(4279374354L), Color12, j3, j2, j2, j, j, j2, false);
        colorsDark = new StripeColors(j4, Color7, Color8, j, Color9, j, Color10, j, colors);
        shapes = new StripeShapes(6.0f, 6.0f, 1.0f);
        typography = new StripeTypography(FontWeight.Normal.weight, FontWeight.Medium.weight, FontWeight.Bold.weight, Room.getSp(9), Room.getSp(12), Room.getSp(13), Room.getSp(14), Room.getSp(16), Room.getSp(20));
        m489lightColors2qZNXz8$default.m485getPrimary0d7_KjU();
        int i = Color.$r8$clinit;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = StripeThemeKt.LocalColors;
        colors.m485getPrimary0d7_KjU();
        m489lightColors2qZNXz8$default.m485getPrimary0d7_KjU();
        colors.m485getPrimary0d7_KjU();
        m489lightColors2qZNXz8$default.m485getPrimary0d7_KjU();
        colors.m485getPrimary0d7_KjU();
        textFieldInsets = new FormInsets(16.0f, 20.0f, 12.0f, 10.0f);
        sectionStyle = SectionStyle.Bordered;
        iconStyle = IconStyle.Filled;
    }
}
