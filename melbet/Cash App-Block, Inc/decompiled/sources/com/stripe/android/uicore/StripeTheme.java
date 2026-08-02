package com.stripe.android.uicore;

/* loaded from: classes8.dex */
public abstract class StripeTheme {
    public static final StripeColors colorsLightMutable;
    public static final IconStyle iconStyle;
    public static final SectionStyle sectionStyle;
    public static final StripeShapes shapesMutable;
    public static final FormInsets textFieldInsets;
    public static final StripeTypography typographyMutable;

    static {
        StripeColors stripeColors = StripeThemeDefaults.colorsDark;
        colorsLightMutable = StripeThemeDefaults.colorsLight;
        shapesMutable = StripeThemeDefaults.shapes;
        typographyMutable = StripeThemeDefaults.typography;
        textFieldInsets = StripeThemeDefaults.textFieldInsets;
        sectionStyle = StripeThemeDefaults.sectionStyle;
        iconStyle = StripeThemeDefaults.iconStyle;
    }
}
