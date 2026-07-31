package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.TextFieldColorsWithIcons;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: ExposedDropdownMenu.kt */
@Immutable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0003\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\t\u0010\fJ0\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000fJ \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u001d\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001d\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u001d\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001d\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u001d\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b \u0010\u001cR\u001d\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u001d\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u001d\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u001d\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u001d\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u001d\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u001d\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u001d\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b&\u0010\u001cR\u001d\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u001d\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001d\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b(\u0010\u001cR\u001d\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b)\u0010\u001cR\u001d\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b*\u0010\u001cR\u001d\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b+\u0010\u001cR\u001d\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u001d\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b,\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/material/DefaultTextFieldForExposedDropdownMenusColors;", "Landroidx/compose/material/TextFieldColorsWithIcons;", "", "enabled", "isError", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "leadingIconColor", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "trailingIconColor", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "indicatorColor", "backgroundColor", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "placeholderColor", "error", "labelColor", "textColor", "cursorColor", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "disabledTextColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "errorIndicatorColor", "disabledIndicatorColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "disabledPlaceholderColor", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
final class DefaultTextFieldForExposedDropdownMenusColors implements TextFieldColorsWithIcons {
    private final long backgroundColor;
    private final long cursorColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorTrailingIconColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long focusedTrailingIconColor;
    private final long leadingIconColor;
    private final long placeholderColor;
    private final long textColor;
    private final long trailingIconColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;

    @Override // androidx.compose.material.TextFieldColorsWithIcons
    public State leadingIconColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        return TextFieldColorsWithIcons.DefaultImpls.leadingIconColor(this, z, z2, interactionSource, composer, i);
    }

    @Override // androidx.compose.material.TextFieldColors
    public State leadingIconColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-776179197);
        if (!z) {
            j = this.disabledLeadingIconColor;
        } else if (z2) {
            j = this.errorLeadingIconColor;
        } else {
            j = this.leadingIconColor;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1441boximpl(j), composer, 0);
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State trailingIconColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1665901393);
        if (!z) {
            j = this.disabledTrailingIconColor;
        } else if (z2) {
            j = this.errorTrailingIconColor;
        } else {
            j = this.trailingIconColor;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1441boximpl(j), composer, 0);
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColorsWithIcons
    public State trailingIconColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(79259602);
        State collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledTrailingIconColor;
        } else if (z2) {
            j = this.errorTrailingIconColor;
        } else {
            j = m835trailingIconColor$lambda0(collectIsFocusedAsState) ? this.focusedTrailingIconColor : this.trailingIconColor;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1441boximpl(j), composer, 0);
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State indicatorColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        State rememberUpdatedState;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(476110356);
        State collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledIndicatorColor;
        } else if (z2) {
            j = this.errorIndicatorColor;
        } else {
            j = m833indicatorColor$lambda1(collectIsFocusedAsState) ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(182314778);
            rememberUpdatedState = SingleValueAnimationKt.m92animateColorAsStateKTwxG1Y(j2, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, composer, 48, 4);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(182314883);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1441boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State backgroundColor(boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(-28962788);
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1441boximpl(this.backgroundColor), composer, 0);
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State placeholderColor(boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(1742462291);
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1441boximpl(z ? this.placeholderColor : this.disabledPlaceholderColor), composer, 0);
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State labelColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-1749156593);
        State collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.disabledLabelColor;
        } else if (z2) {
            j = this.errorLabelColor;
        } else {
            j = m834labelColor$lambda2(collectIsFocusedAsState) ? this.focusedLabelColor : this.unfocusedLabelColor;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1441boximpl(j), composer, 0);
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State textColor(boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(394526077);
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1441boximpl(z ? this.textColor : this.disabledTextColor), composer, 0);
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State cursorColor(boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(-930693132);
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1441boximpl(z ? this.errorCursorColor : this.cursorColor), composer, 0);
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(DefaultTextFieldForExposedDropdownMenusColors.class), Reflection.getOrCreateKotlinClass(other.getClass()))) {
            return false;
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = (DefaultTextFieldForExposedDropdownMenusColors) other;
        return Color.m1447equalsimpl0(this.textColor, defaultTextFieldForExposedDropdownMenusColors.textColor) && Color.m1447equalsimpl0(this.disabledTextColor, defaultTextFieldForExposedDropdownMenusColors.disabledTextColor) && Color.m1447equalsimpl0(this.cursorColor, defaultTextFieldForExposedDropdownMenusColors.cursorColor) && Color.m1447equalsimpl0(this.errorCursorColor, defaultTextFieldForExposedDropdownMenusColors.errorCursorColor) && Color.m1447equalsimpl0(this.focusedIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.focusedIndicatorColor) && Color.m1447equalsimpl0(this.unfocusedIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.unfocusedIndicatorColor) && Color.m1447equalsimpl0(this.errorIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.errorIndicatorColor) && Color.m1447equalsimpl0(this.disabledIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.disabledIndicatorColor) && Color.m1447equalsimpl0(this.leadingIconColor, defaultTextFieldForExposedDropdownMenusColors.leadingIconColor) && Color.m1447equalsimpl0(this.disabledLeadingIconColor, defaultTextFieldForExposedDropdownMenusColors.disabledLeadingIconColor) && Color.m1447equalsimpl0(this.errorLeadingIconColor, defaultTextFieldForExposedDropdownMenusColors.errorLeadingIconColor) && Color.m1447equalsimpl0(this.trailingIconColor, defaultTextFieldForExposedDropdownMenusColors.trailingIconColor) && Color.m1447equalsimpl0(this.focusedTrailingIconColor, defaultTextFieldForExposedDropdownMenusColors.focusedTrailingIconColor) && Color.m1447equalsimpl0(this.disabledTrailingIconColor, defaultTextFieldForExposedDropdownMenusColors.disabledTrailingIconColor) && Color.m1447equalsimpl0(this.errorTrailingIconColor, defaultTextFieldForExposedDropdownMenusColors.errorTrailingIconColor) && Color.m1447equalsimpl0(this.backgroundColor, defaultTextFieldForExposedDropdownMenusColors.backgroundColor) && Color.m1447equalsimpl0(this.focusedLabelColor, defaultTextFieldForExposedDropdownMenusColors.focusedLabelColor) && Color.m1447equalsimpl0(this.unfocusedLabelColor, defaultTextFieldForExposedDropdownMenusColors.unfocusedLabelColor) && Color.m1447equalsimpl0(this.disabledLabelColor, defaultTextFieldForExposedDropdownMenusColors.disabledLabelColor) && Color.m1447equalsimpl0(this.errorLabelColor, defaultTextFieldForExposedDropdownMenusColors.errorLabelColor) && Color.m1447equalsimpl0(this.placeholderColor, defaultTextFieldForExposedDropdownMenusColors.placeholderColor) && Color.m1447equalsimpl0(this.disabledPlaceholderColor, defaultTextFieldForExposedDropdownMenusColors.disabledPlaceholderColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((Color.m1453hashCodeimpl(this.textColor) * 31) + Color.m1453hashCodeimpl(this.disabledTextColor)) * 31) + Color.m1453hashCodeimpl(this.cursorColor)) * 31) + Color.m1453hashCodeimpl(this.errorCursorColor)) * 31) + Color.m1453hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m1453hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m1453hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m1453hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m1453hashCodeimpl(this.leadingIconColor)) * 31) + Color.m1453hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m1453hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m1453hashCodeimpl(this.trailingIconColor)) * 31) + Color.m1453hashCodeimpl(this.focusedTrailingIconColor)) * 31) + Color.m1453hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m1453hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m1453hashCodeimpl(this.backgroundColor)) * 31) + Color.m1453hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m1453hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m1453hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m1453hashCodeimpl(this.errorLabelColor)) * 31) + Color.m1453hashCodeimpl(this.placeholderColor)) * 31) + Color.m1453hashCodeimpl(this.disabledPlaceholderColor);
    }

    /* renamed from: trailingIconColor$lambda-0, reason: not valid java name */
    private static final boolean m835trailingIconColor$lambda0(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: indicatorColor$lambda-1, reason: not valid java name */
    private static final boolean m833indicatorColor$lambda1(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: labelColor$lambda-2, reason: not valid java name */
    private static final boolean m834labelColor$lambda2(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }
}
