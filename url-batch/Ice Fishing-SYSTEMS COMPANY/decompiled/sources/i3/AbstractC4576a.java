package i3;

import android.R;
import com.icefishing.icefishingliveapp.C5284R;

/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4576a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f38292a = {R.attr.maxWidth, R.attr.maxHeight, R.attr.elevation, C5284R.attr.backgroundTint, C5284R.attr.behavior_draggable, C5284R.attr.behavior_expandedOffset, C5284R.attr.behavior_fitToContents, C5284R.attr.behavior_halfExpandedRatio, C5284R.attr.behavior_hideable, C5284R.attr.behavior_peekHeight, C5284R.attr.behavior_saveFlags, C5284R.attr.behavior_significantVelocityThreshold, C5284R.attr.behavior_skipCollapsed, C5284R.attr.gestureInsetBottomIgnored, C5284R.attr.marginLeftSystemWindowInsets, C5284R.attr.marginRightSystemWindowInsets, C5284R.attr.marginTopSystemWindowInsets, C5284R.attr.paddingBottomSystemWindowInsets, C5284R.attr.paddingLeftSystemWindowInsets, C5284R.attr.paddingRightSystemWindowInsets, C5284R.attr.paddingTopSystemWindowInsets, C5284R.attr.shapeAppearance, C5284R.attr.shapeAppearanceOverlay, C5284R.attr.shouldRemoveExpandedCorners};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f38293b = {C5284R.attr.carousel_alignment, C5284R.attr.carousel_backwardTransition, C5284R.attr.carousel_emptyViewsBehavior, C5284R.attr.carousel_firstView, C5284R.attr.carousel_forwardTransition, C5284R.attr.carousel_infinite, C5284R.attr.carousel_nextState, C5284R.attr.carousel_previousState, C5284R.attr.carousel_touchUpMode, C5284R.attr.carousel_touchUp_dampeningFactor, C5284R.attr.carousel_touchUp_velocityThreshold};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f38294c = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.ellipsize, R.attr.maxWidth, R.attr.text, R.attr.checkable, C5284R.attr.checkedIcon, C5284R.attr.checkedIconEnabled, C5284R.attr.checkedIconTint, C5284R.attr.checkedIconVisible, C5284R.attr.chipBackgroundColor, C5284R.attr.chipCornerRadius, C5284R.attr.chipEndPadding, C5284R.attr.chipIcon, C5284R.attr.chipIconEnabled, C5284R.attr.chipIconSize, C5284R.attr.chipIconTint, C5284R.attr.chipIconVisible, C5284R.attr.chipMinHeight, C5284R.attr.chipMinTouchTargetSize, C5284R.attr.chipStartPadding, C5284R.attr.chipStrokeColor, C5284R.attr.chipStrokeWidth, C5284R.attr.chipSurfaceColor, C5284R.attr.closeIcon, C5284R.attr.closeIconEnabled, C5284R.attr.closeIconEndPadding, C5284R.attr.closeIconSize, C5284R.attr.closeIconStartPadding, C5284R.attr.closeIconTint, C5284R.attr.closeIconVisible, C5284R.attr.ensureMinTouchTargetSize, C5284R.attr.hideMotionSpec, C5284R.attr.iconEndPadding, C5284R.attr.iconStartPadding, C5284R.attr.rippleColor, C5284R.attr.shapeAppearance, C5284R.attr.shapeAppearanceOverlay, C5284R.attr.showMotionSpec, C5284R.attr.textEndPadding, C5284R.attr.textStartPadding};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f38295d = {C5284R.attr.clockFaceBackgroundColor, C5284R.attr.clockNumberTextColor};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f38296e = {C5284R.attr.clockHandColor, C5284R.attr.materialCircleRadius, C5284R.attr.selectorSize};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f38297f = {C5284R.attr.behavior_autoHide, C5284R.attr.behavior_autoShrink};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f38298g = {C5284R.attr.behavior_autoHide};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f38299h = {R.attr.foreground, R.attr.foregroundGravity, C5284R.attr.foregroundInsidePadding};
    public static final int[] i = {R.attr.inputType, R.attr.popupElevation, C5284R.attr.dropDownBackgroundTint, C5284R.attr.simpleItemLayout, C5284R.attr.simpleItemSelectedColor, C5284R.attr.simpleItemSelectedRippleColor, C5284R.attr.simpleItems};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f38300j = {R.attr.background, R.attr.insetLeft, R.attr.insetRight, R.attr.insetTop, R.attr.insetBottom, R.attr.checkable, C5284R.attr.backgroundTint, C5284R.attr.backgroundTintMode, C5284R.attr.cornerRadius, C5284R.attr.elevation, C5284R.attr.icon, C5284R.attr.iconGravity, C5284R.attr.iconPadding, C5284R.attr.iconSize, C5284R.attr.iconTint, C5284R.attr.iconTintMode, C5284R.attr.rippleColor, C5284R.attr.shapeAppearance, C5284R.attr.shapeAppearanceOverlay, C5284R.attr.strokeColor, C5284R.attr.strokeWidth, C5284R.attr.toggleCheckedStateOnClick};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f38301k = {R.attr.enabled, C5284R.attr.checkedButton, C5284R.attr.selectionRequired, C5284R.attr.singleSelection};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f38302l = {R.attr.windowFullscreen, C5284R.attr.backgroundTint, C5284R.attr.dayInvalidStyle, C5284R.attr.daySelectedStyle, C5284R.attr.dayStyle, C5284R.attr.dayTodayStyle, C5284R.attr.nestedScrollable, C5284R.attr.rangeFillColor, C5284R.attr.yearSelectedStyle, C5284R.attr.yearStyle, C5284R.attr.yearTodayStyle};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f38303m = {R.attr.insetLeft, R.attr.insetRight, R.attr.insetTop, R.attr.insetBottom, C5284R.attr.itemFillColor, C5284R.attr.itemShapeAppearance, C5284R.attr.itemShapeAppearanceOverlay, C5284R.attr.itemStrokeColor, C5284R.attr.itemStrokeWidth, C5284R.attr.itemTextColor};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f38304n = {R.attr.button, C5284R.attr.buttonCompat, C5284R.attr.buttonIcon, C5284R.attr.buttonIconTint, C5284R.attr.buttonIconTintMode, C5284R.attr.buttonTint, C5284R.attr.centerIfNoTextEnabled, C5284R.attr.checkedState, C5284R.attr.errorAccessibilityLabel, C5284R.attr.errorShown, C5284R.attr.useMaterialThemeColors};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f38305o = {C5284R.attr.buttonTint, C5284R.attr.useMaterialThemeColors};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f38306p = {C5284R.attr.shapeAppearance, C5284R.attr.shapeAppearanceOverlay};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f38307q = {R.attr.letterSpacing, R.attr.lineHeight, C5284R.attr.lineHeight};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f38308r = {R.attr.textAppearance, R.attr.lineHeight, C5284R.attr.lineHeight};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f38309s = {C5284R.attr.logoAdjustViewBounds, C5284R.attr.logoScaleType, C5284R.attr.navigationIconTint, C5284R.attr.subtitleCentered, C5284R.attr.titleCentered};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f38310t = {C5284R.attr.materialCircleRadius};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f38311u = {C5284R.attr.behavior_overlapTop};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f38312v = {C5284R.attr.cornerFamily, C5284R.attr.cornerFamilyBottomLeft, C5284R.attr.cornerFamilyBottomRight, C5284R.attr.cornerFamilyTopLeft, C5284R.attr.cornerFamilyTopRight, C5284R.attr.cornerSize, C5284R.attr.cornerSizeBottomLeft, C5284R.attr.cornerSizeBottomRight, C5284R.attr.cornerSizeTopLeft, C5284R.attr.cornerSizeTopRight};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f38313w = {R.attr.maxWidth, R.attr.maxHeight, R.attr.elevation, C5284R.attr.backgroundTint, C5284R.attr.behavior_draggable, C5284R.attr.coplanarSiblingViewId, C5284R.attr.shapeAppearance, C5284R.attr.shapeAppearanceOverlay};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f38314x = {R.attr.maxWidth, C5284R.attr.actionTextColorAlpha, C5284R.attr.animationMode, C5284R.attr.backgroundOverlayColorAlpha, C5284R.attr.backgroundTint, C5284R.attr.backgroundTintMode, C5284R.attr.elevation, C5284R.attr.maxActionInlineWidth, C5284R.attr.shapeAppearance, C5284R.attr.shapeAppearanceOverlay};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f38315y = {R.attr.textSize, R.attr.typeface, R.attr.textStyle, R.attr.textColor, R.attr.textColorHint, R.attr.textColorLink, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.fontFamily, R.attr.textFontWeight, C5284R.attr.fontFamily, C5284R.attr.fontVariationSettings, C5284R.attr.textAllCaps, C5284R.attr.textLocale};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f38316z = {C5284R.attr.textInputLayoutFocusedRectEnabled};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f38290A = {R.attr.enabled, R.attr.textColorHint, R.attr.maxWidth, R.attr.minWidth, R.attr.hint, R.attr.maxEms, R.attr.minEms, C5284R.attr.boxBackgroundColor, C5284R.attr.boxBackgroundMode, C5284R.attr.boxCollapsedPaddingTop, C5284R.attr.boxCornerRadiusBottomEnd, C5284R.attr.boxCornerRadiusBottomStart, C5284R.attr.boxCornerRadiusTopEnd, C5284R.attr.boxCornerRadiusTopStart, C5284R.attr.boxStrokeColor, C5284R.attr.boxStrokeErrorColor, C5284R.attr.boxStrokeWidth, C5284R.attr.boxStrokeWidthFocused, C5284R.attr.counterEnabled, C5284R.attr.counterMaxLength, C5284R.attr.counterOverflowTextAppearance, C5284R.attr.counterOverflowTextColor, C5284R.attr.counterTextAppearance, C5284R.attr.counterTextColor, C5284R.attr.cursorColor, C5284R.attr.cursorErrorColor, C5284R.attr.endIconCheckable, C5284R.attr.endIconContentDescription, C5284R.attr.endIconDrawable, C5284R.attr.endIconMinSize, C5284R.attr.endIconMode, C5284R.attr.endIconScaleType, C5284R.attr.endIconTint, C5284R.attr.endIconTintMode, C5284R.attr.errorAccessibilityLiveRegion, C5284R.attr.errorContentDescription, C5284R.attr.errorEnabled, C5284R.attr.errorIconDrawable, C5284R.attr.errorIconTint, C5284R.attr.errorIconTintMode, C5284R.attr.errorTextAppearance, C5284R.attr.errorTextColor, C5284R.attr.expandedHintEnabled, C5284R.attr.helperText, C5284R.attr.helperTextEnabled, C5284R.attr.helperTextTextAppearance, C5284R.attr.helperTextTextColor, C5284R.attr.hintAnimationEnabled, C5284R.attr.hintEnabled, C5284R.attr.hintTextAppearance, C5284R.attr.hintTextColor, C5284R.attr.passwordToggleContentDescription, C5284R.attr.passwordToggleDrawable, C5284R.attr.passwordToggleEnabled, C5284R.attr.passwordToggleTint, C5284R.attr.passwordToggleTintMode, C5284R.attr.placeholderText, C5284R.attr.placeholderTextAppearance, C5284R.attr.placeholderTextColor, C5284R.attr.prefixText, C5284R.attr.prefixTextAppearance, C5284R.attr.prefixTextColor, C5284R.attr.shapeAppearance, C5284R.attr.shapeAppearanceOverlay, C5284R.attr.startIconCheckable, C5284R.attr.startIconContentDescription, C5284R.attr.startIconDrawable, C5284R.attr.startIconMinSize, C5284R.attr.startIconScaleType, C5284R.attr.startIconTint, C5284R.attr.startIconTintMode, C5284R.attr.suffixText, C5284R.attr.suffixTextAppearance, C5284R.attr.suffixTextColor};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f38291B = {R.attr.textAppearance, C5284R.attr.enforceMaterialTheme, C5284R.attr.enforceTextAppearance};
}
