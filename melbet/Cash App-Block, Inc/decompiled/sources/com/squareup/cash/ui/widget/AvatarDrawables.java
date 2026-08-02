package com.squareup.cash.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import androidx.camera.core.AspectRatio;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public abstract class AvatarDrawables {
    public static final void PredictiveBackHandler(boolean z, Function2 function2, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1818896922);
        int i2 = (gapComposer.changed(z) ? 4 : 2) | i | (gapComposer.changedInstance(function2) ? 32 : 16);
        if ((i2 & 19) == 18 && gapComposer.getSkipping()) {
            gapComposer.skipToGroupEnd();
        } else {
            AspectRatio.PredictiveBackHandler(z, function2, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderDefaults$$ExternalSyntheticLambda0(z, function2, i, 3);
        }
    }

    public static ShapeDrawable createBackgroundDrawable$ui(Context context, int i, StackedAvatarViewModel.Avatar.Shape shape) {
        float f;
        Shape roundRectShape;
        context.getClass();
        shape.getClass();
        if (shape instanceof StackedAvatarViewModel.Avatar.Shape.Circle) {
            roundRectShape = new OvalShape();
        } else {
            if (!(shape instanceof StackedAvatarViewModel.Avatar.Shape.RoundedRectangle)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            StackedAvatarViewModel.Avatar.Shape.RoundedRectangle.CornerRadiusSize cornerRadiusSize = ((StackedAvatarViewModel.Avatar.Shape.RoundedRectangle) shape).cornerRadiusSize;
            Resources resources = context.getResources();
            resources.getClass();
            cornerRadiusSize.getClass();
            int ordinal = cornerRadiusSize.ordinal();
            if (ordinal == 0) {
                f = RecyclerView.DECELERATION_RATE;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                f = resources.getDimension(R.dimen.avatar_rounded_rectangle_corner_radius);
            }
            float[] fArr = new float[8];
            for (int i2 = 0; i2 < 8; i2++) {
                fArr[i2] = f;
            }
            roundRectShape = new RoundRectShape(fArr, null, null);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
        shapeDrawable.setTint(i);
        shapeDrawable.setIntrinsicWidth(-1);
        shapeDrawable.setIntrinsicHeight(-1);
        return shapeDrawable;
    }

    public static Drawable createUnknownAvatarPlaceholder$ui(Context context, ThemeInfo themeInfo, Drawable drawable, int i, StackedAvatarViewModel.Avatar avatar) {
        Integer forTheme;
        Integer forTheme2;
        ColorPalette colorPalette = themeInfo.colorPalette;
        context.getClass();
        if (drawable != null) {
            return drawable;
        }
        Typeface font = ResourcesCompat.getFont(context, R.font.cashsans_medium);
        ColorModel colorModel = avatar.placeholderFillColor;
        int intValue = (colorModel == null || (forTheme2 = DimensionKt.forTheme(colorModel, themeInfo)) == null) ? colorPalette.placeholderBackground : forTheme2.intValue();
        ColorModel colorModel2 = avatar.placeholderTintColor;
        int intValue2 = (colorModel2 == null || (forTheme = DimensionKt.forTheme(colorModel2, themeInfo)) == null) ? colorPalette.primaryButtonTint : forTheme.intValue();
        font.getClass();
        AvatarPlaceholder avatarPlaceholder = new AvatarPlaceholder(intValue, intValue2, i, font, PlatformKt.getDrawableCompat(context, R.drawable.avatar_generic, null));
        StackedAvatarViewModel.Avatar.Shape shape = avatar.shape;
        if (shape instanceof StackedAvatarViewModel.Avatar.Shape.Circle) {
            return avatarPlaceholder;
        }
        if (shape instanceof StackedAvatarViewModel.Avatar.Shape.RoundedRectangle) {
            avatarPlaceholder.setAccentColor(0);
            return new LayerDrawable(new Drawable[]{createBackgroundDrawable$ui(context, colorPalette.placeholderBackground, shape), avatarPlaceholder});
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewBitcoin.deepLinkSpecs;
    }
}
