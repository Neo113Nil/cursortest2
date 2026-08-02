package com.squareup.cash.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.ColorKt;
import androidx.emoji2.text.MetadataRepo;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import coil3.Image_androidKt;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import coil3.size.DimensionKt;
import coil3.transform.CircleCropTransformation;
import coil3.transform.RoundedCornersTransformation;
import coil3.transform.Transformation;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.mooncake.themes.Theme;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.widget.BadgedLayout;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.android.Views;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class BadgedLayout extends FrameLayout {
    public BadgeShape badge;
    public Drawable badgeDrawable;
    public final Path badgePath;
    public AvatarBadgeViewModel currentBadgeViewModel;
    public float gapWithBadge;
    public final RealImageLoader imageLoader;

    public abstract class BadgeShape {

        public final class Circular extends BadgeShape {
            public final int diameter;

            public Circular(int i) {
                this.diameter = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Circular) && this.diameter == ((Circular) obj).diameter;
            }

            public final int hashCode() {
                return Integer.hashCode(this.diameter);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.diameter, "Circular(diameter=", ")");
            }
        }

        public final class Rectangular extends BadgeShape {
            public final float cornerRadius;
            public final int height;
            public final int width;

            public Rectangular(float f, int i, int i2) {
                this.height = i;
                this.width = i2;
                this.cornerRadius = f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Rectangular)) {
                    return false;
                }
                Rectangular rectangular = (Rectangular) obj;
                return this.height == rectangular.height && this.width == rectangular.width && Float.compare(this.cornerRadius, rectangular.cornerRadius) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.cornerRadius) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.width, Integer.hashCode(this.height) * 31, 31);
            }

            public final String toString() {
                return Recorder$$ExternalSyntheticOutline1.m(this.cornerRadius, ")", Recorder$$ExternalSyntheticOutline2.m107m(this.height, this.width, "Rectangular(height=", ", width=", ", cornerRadius="));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgedLayout(Context context, RealImageLoader realImageLoader) {
        super(context);
        realImageLoader.getClass();
        context.getClass();
        this.imageLoader = realImageLoader;
        this.badgePath = new Path();
        this.badge = new BadgeShape.Circular(Views.dip((View) this, 16));
        Views.dip((View) this, 0);
        this.gapWithBadge = Views.dip((View) this, 2.0f);
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        Path path = this.badgePath;
        path.rewind();
        Drawable drawable = this.badgeDrawable;
        if (drawable != null) {
            BadgeShape badgeShape = this.badge;
            if (badgeShape instanceof BadgeShape.Circular) {
                int width = getWidth();
                int i = ((BadgeShape.Circular) badgeShape).diameter;
                drawable.setBounds(width - i, getHeight() - i, getWidth(), getHeight());
                drawable.draw(canvas);
                path.addOval(drawable.getBounds().left - this.gapWithBadge, drawable.getBounds().top - this.gapWithBadge, drawable.getBounds().right + this.gapWithBadge, drawable.getBounds().bottom + this.gapWithBadge, Path.Direction.CW);
            } else {
                if (!(badgeShape instanceof BadgeShape.Rectangular)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                BadgeShape.Rectangular rectangular = (BadgeShape.Rectangular) badgeShape;
                drawable.setBounds(getWidth() - rectangular.width, getHeight() - rectangular.height, getWidth(), getHeight());
                drawable.draw(canvas);
                float f = drawable.getBounds().left - this.gapWithBadge;
                float f2 = drawable.getBounds().top - this.gapWithBadge;
                float f3 = drawable.getBounds().right + this.gapWithBadge;
                float f4 = drawable.getBounds().bottom;
                float f5 = this.gapWithBadge;
                float f6 = rectangular.cornerRadius;
                path.addRoundRect(f, f2, f3, f4 + f5, f6 + f5, f5 + f6, Path.Direction.CW);
            }
        }
        int save = canvas.save();
        try {
            canvas.clipOutPath(path);
            super.dispatchDraw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final GradientDrawable getPlaceholder(BadgeShape badgeShape) {
        if (badgeShape instanceof BadgeShape.Circular) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(ThemeHelpersKt.themeInfo(this).colorPalette.placeholderBackground);
            int i = ((BadgeShape.Circular) badgeShape).diameter;
            gradientDrawable.setSize(i, i);
            gradientDrawable.setShape(1);
            return gradientDrawable;
        }
        if (!(badgeShape instanceof BadgeShape.Rectangular)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        BadgeShape.Rectangular rectangular = (BadgeShape.Rectangular) badgeShape;
        gradientDrawable2.setCornerRadius(rectangular.cornerRadius);
        gradientDrawable2.setColor(ThemeHelpersKt.themeInfo(this).colorPalette.placeholderBackground);
        gradientDrawable2.setSize(rectangular.width, rectangular.height);
        gradientDrawable2.setShape(0);
        return gradientDrawable2;
    }

    public final void loadInto(Image image, Transformation transformation, BadgeShape badgeShape, Lazy lazy, Function1 function1) {
        int i;
        int i2;
        Context context = getContext();
        context.getClass();
        ImageRequest.Builder builder = new ImageRequest.Builder(context);
        builder.data = ThemablesKt.urlForTheme(image, ThemeHelpersKt.themeInfo(this));
        boolean z = badgeShape instanceof BadgeShape.Circular;
        if (z) {
            i = ((BadgeShape.Circular) badgeShape).diameter;
        } else {
            if (!(badgeShape instanceof BadgeShape.Rectangular)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            i = ((BadgeShape.Rectangular) badgeShape).width;
        }
        if (z) {
            i2 = ((BadgeShape.Circular) badgeShape).diameter;
        } else {
            if (!(badgeShape instanceof BadgeShape.Rectangular)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            i2 = ((BadgeShape.Rectangular) badgeShape).height;
        }
        builder.size(i, i2);
        Transformation[] transformationArr = {transformation};
        Extras.Key key = ImageRequestsKt.transformationsKey;
        ImageRequestsKt.transformations(builder, ArraysKt___ArraysKt.toList(transformationArr));
        builder.target = new MetadataRepo(function1, lazy, function1, this);
        builder.placeholder(Image_androidKt.asImage((Drawable) lazy.getValue()));
        this.imageLoader.enqueue(builder.build());
    }

    public final void setBadge(BadgeShape badgeShape) {
        badgeShape.getClass();
        this.badge = badgeShape;
    }

    public final void setBadgeDrawable(Drawable drawable) {
        this.badgeDrawable = drawable;
        invalidate();
    }

    public final void setBaselineDrop(int i) {
        setPadding(i, 0, i, i);
    }

    public final void setGapWithBadge(float f) {
        this.gapWithBadge = f;
    }

    public final void setModel(AvatarBadgeViewModel avatarBadgeViewModel) {
        this.currentBadgeViewModel = avatarBadgeViewModel;
        setBadgeDrawable(null);
        final BadgeShape badgeShape = this.badge;
        final int i = 0;
        if (avatarBadgeViewModel instanceof AvatarBadgeViewModel.CardUrl) {
            if (!(badgeShape instanceof BadgeShape.Rectangular)) {
                a$$ExternalSyntheticBUOutline0.m$3("Badge shape must be Rectangular for CardUrl.");
                return;
            } else {
                AvatarBadgeViewModel.CardUrl cardUrl = (AvatarBadgeViewModel.CardUrl) avatarBadgeViewModel;
                loadInto(cardUrl.image, new RoundedCornersTransformation(((BadgeShape.Rectangular) badgeShape).cornerRadius), badgeShape, LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.ui.widget.BadgedLayout$$ExternalSyntheticLambda0
                    public final /* synthetic */ BadgedLayout f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i2 = i;
                        BadgedLayout.BadgeShape badgeShape2 = badgeShape;
                        BadgedLayout badgedLayout = this.f$0;
                        switch (i2) {
                        }
                        return badgedLayout.getPlaceholder(badgeShape2);
                    }
                }), new BottomSheet$$ExternalSyntheticLambda3(23, cardUrl, this));
                return;
            }
        }
        final int i2 = 1;
        if (avatarBadgeViewModel instanceof AvatarBadgeViewModel.IconUrl) {
            if (!(badgeShape instanceof BadgeShape.Circular)) {
                a$$ExternalSyntheticBUOutline0.m$3("Badge shape must be Circular for IconUrl.");
                return;
            } else {
                AvatarBadgeViewModel.IconUrl iconUrl = (AvatarBadgeViewModel.IconUrl) avatarBadgeViewModel;
                loadInto(iconUrl.image, new CircleCropTransformation(), badgeShape, LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.ui.widget.BadgedLayout$$ExternalSyntheticLambda0
                    public final /* synthetic */ BadgedLayout f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i22 = i2;
                        BadgedLayout.BadgeShape badgeShape2 = badgeShape;
                        BadgedLayout badgedLayout = this.f$0;
                        switch (i22) {
                        }
                        return badgedLayout.getPlaceholder(badgeShape2);
                    }
                }), new BottomSheet$$ExternalSyntheticLambda3(24, iconUrl, this));
                return;
            }
        }
        if (avatarBadgeViewModel instanceof AvatarBadgeViewModel.IconRes) {
            if (!(badgeShape instanceof BadgeShape.Circular)) {
                a$$ExternalSyntheticBUOutline0.m$3("Badge shape must be to Circular for IconRes.");
                return;
            }
            AvatarBadgeViewModel.IconRes iconRes = (AvatarBadgeViewModel.IconRes) avatarBadgeViewModel;
            Context context = getContext();
            context.getClass();
            ThemeInfo findThemeInfo = ThemeHelpersKt.findThemeInfo(context);
            Integer forTheme = DimensionKt.forTheme(iconRes.backgroundColor, findThemeInfo);
            forTheme.getClass();
            int intValue = forTheme.intValue();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(intValue);
            Drawable drawableCompat = PlatformKt.getDrawableCompat(context, iconRes.resId, Integer.valueOf(findThemeInfo.theme == Theme.MooncakeDark ? ThemablesKt.contrastAdjustedColor(-1, intValue, -15263719) : -1));
            drawableCompat.getClass();
            Drawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, drawableCompat});
            layerDrawable.setColorFilter(iconRes.colorFilter);
            setBadgeDrawable(layerDrawable);
            return;
        }
        if (!(avatarBadgeViewModel instanceof AvatarBadgeViewModel.IconToken)) {
            if (avatarBadgeViewModel == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        if (!(badgeShape instanceof BadgeShape.Circular)) {
            a$$ExternalSyntheticBUOutline0.m$3("Badge shape must be Circular for IconToken.");
            return;
        }
        Context context2 = getContext();
        context2.getClass();
        Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context2, ((AvatarBadgeViewModel.IconToken) avatarBadgeViewModel).icon.drawableRes, null);
        drawableCompat2.getClass();
        Colors colors = ThemeHelpersKt.themeInfo(this).arcadeColors;
        drawableCompat2.setTint(ColorKt.m694toArgb8_81llA(colors.semantic.icon.standard));
        int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(colors.semantic.background.subtle);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(m694toArgb8_81llA);
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{gradientDrawable2, drawableCompat2});
        layerDrawable2.setLayerInset(1, Views.dip((View) this, 4), Views.dip((View) this, 4), Views.dip((View) this, 4), Views.dip((View) this, 4));
        setBadgeDrawable(layerDrawable2);
    }
}
