package com.squareup.cash.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextPaint;
import android.widget.ImageView;
import androidx.compose.foundation.contextmenu.ContextMenuPopupPositionProvider;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import coil3.request.ImageRequests_androidKt;
import coil3.size.DimensionKt;
import coil3.size.Scale;
import coil3.transform.CircleCropTransformation;
import coil3.transform.RoundedCornersTransformation;
import com.bugsnag.android.TraceParser$parse$1;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.coil.TintTransformation;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlinx.coroutines.DeferredCoroutine;

/* loaded from: classes7.dex */
public abstract class StackedAvatarViewKt {
    public static CallbackToFutureAdapter$SafeFuture asListenableFuture$default(DeferredCoroutine deferredCoroutine) {
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
        callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
        callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
        try {
            deferredCoroutine.invokeOnCompletion(new TraceParser$parse$1(6, callbackToFutureAdapter$Completer, deferredCoroutine));
            callbackToFutureAdapter$Completer.tag = "Deferred.asListenableFuture";
        } catch (Exception e) {
            callbackToFutureAdapter$SafeFuture.setException(e);
        }
        return callbackToFutureAdapter$SafeFuture;
    }

    public static final Drawable createAvatarMonogram(Context context, String str, ColorModel colorModel, ThemeInfo themeInfo, int i, int i2, StackedAvatarViewModel.Avatar.Shape shape) {
        String str2;
        Integer forTheme;
        Typeface font = ResourcesCompat.getFont(context, R.font.cashsans_medium);
        ColorPalette colorPalette = themeInfo.colorPalette;
        int i3 = colorPalette.placeholderBackground;
        int i4 = colorPalette.primaryButtonTint;
        font.getClass();
        AvatarPlaceholder avatarPlaceholder = new AvatarPlaceholder(i3, i4, i, font, null);
        avatarPlaceholder.setAccentColor(colorModel != null ? DimensionKt.forTheme(colorModel, themeInfo) : null);
        char charAt = (str == null || StringsKt.isBlank(str)) ? (char) 0 : str.charAt(0);
        if (Character.isDefined(charAt)) {
            String valueOf = String.valueOf(charAt);
            Locale locale = Locale.US;
            locale.getClass();
            str2 = valueOf.toUpperCase(locale);
            str2.getClass();
        } else {
            str2 = "";
        }
        avatarPlaceholder.initial = str2;
        Rect rect = new Rect();
        String str3 = avatarPlaceholder.initial;
        int length = str3.length();
        TextPaint textPaint = avatarPlaceholder.textPaint;
        textPaint.getTextBounds(str3, 0, length, rect);
        avatarPlaceholder.initialWidth = textPaint.measureText(avatarPlaceholder.initial);
        avatarPlaceholder.initialHeight = rect.height();
        avatarPlaceholder.invalidateSelf();
        if (shape instanceof StackedAvatarViewModel.Avatar.Shape.Circle) {
            avatarPlaceholder.setAccentColor(colorModel != null ? DimensionKt.forTheme(colorModel, themeInfo) : null);
            return avatarPlaceholder;
        }
        if (shape instanceof StackedAvatarViewModel.Avatar.Shape.RoundedRectangle) {
            avatarPlaceholder.setAccentColor(0);
            return new LayerDrawable(new Drawable[]{AvatarDrawables.createBackgroundDrawable$ui(context, (colorModel == null || (forTheme = DimensionKt.forTheme(colorModel, themeInfo)) == null) ? colorPalette.placeholderBackground : forTheme.intValue(), shape), avatarPlaceholder});
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final int drawableResForTheme(StackedAvatarViewModel.Avatar.AvatarDrawableRes avatarDrawableRes, ThemeInfo themeInfo) {
        avatarDrawableRes.getClass();
        if (!(avatarDrawableRes instanceof StackedAvatarViewModel.Avatar.AvatarDrawableRes)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        int ordinal = themeInfo.theme.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        return avatarDrawableRes.lightDrawableRes;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewBitcoinBuy.deepLinkSpecs;
    }

    public static final String getMonogramTextOrCharacter(StackedAvatarViewModel.Avatar avatar) {
        String str = avatar.monogramText;
        if (str != null) {
            return str;
        }
        Character ch = avatar.character;
        if (ch != null) {
            return String.valueOf(ch.charValue());
        }
        return null;
    }

    public static void loadAvatarInto$default(Context context, RealImageLoader realImageLoader, StackedAvatarViewModel.Avatar avatar, ImageView imageView, ThemeInfo themeInfo, int i, int i2, Drawable drawable, Function0 function0) {
        float f;
        context.getClass();
        realImageLoader.getClass();
        Image image = avatar.remoteImage;
        imageView.getClass();
        StackedAvatarViewModel.Avatar.Shape shape = avatar.shape;
        ColorModel colorModel = avatar.transformFillColor;
        ColorModel colorModel2 = avatar.transformTintColor;
        StackedAvatarViewModel.Avatar.AvatarDrawableRes avatarDrawableRes = avatar.localImage;
        if (image == null && avatarDrawableRes == null) {
            if (getMonogramTextOrCharacter(avatar) != null) {
                imageView.setImageDrawable(createAvatarMonogram(context, getMonogramTextOrCharacter(avatar), avatar.backgroundColor, themeInfo, i, i2, avatar.shape));
                return;
            } else {
                imageView.setImageDrawable(AvatarDrawables.createUnknownAvatarPlaceholder$ui(context, themeInfo, drawable, i, avatar));
                return;
            }
        }
        Object obj = null;
        if (avatarDrawableRes != null) {
            if (!(avatarDrawableRes instanceof StackedAvatarViewModel.Avatar.AvatarDrawableRes)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            if (avatarDrawableRes.vector) {
                Drawable drawableCompat = PlatformKt.getDrawableCompat(context, drawableResForTheme(avatarDrawableRes, themeInfo), colorModel2 != null ? DimensionKt.forTheme(colorModel2, themeInfo) : null);
                if (colorModel != null) {
                    Integer forTheme = DimensionKt.forTheme(colorModel, themeInfo);
                    forTheme.getClass();
                    imageView.setBackground(AvatarDrawables.createBackgroundDrawable$ui(context, forTheme.intValue(), shape));
                }
                imageView.setImageDrawable(drawableCompat);
                return;
            }
        }
        Drawable createAvatarMonogram = getMonogramTextOrCharacter(avatar) != null ? createAvatarMonogram(context, getMonogramTextOrCharacter(avatar), avatar.backgroundColor, themeInfo, i, i2, avatar.shape) : AvatarDrawables.createUnknownAvatarPlaceholder$ui(context, themeInfo, drawable, i, avatar);
        ArrayList arrayList = new ArrayList();
        Integer forTheme2 = colorModel2 != null ? DimensionKt.forTheme(colorModel2, themeInfo) : null;
        if (forTheme2 != null) {
            arrayList.add(new TintTransformation(forTheme2.intValue(), 0));
        }
        if (shape instanceof StackedAvatarViewModel.Avatar.Shape.RoundedRectangle) {
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
                    return;
                }
                f = resources.getDimension(R.dimen.avatar_rounded_rectangle_corner_radius);
            }
            arrayList.add(new RoundedCornersTransformation(f));
        } else {
            if (!(shape instanceof StackedAvatarViewModel.Avatar.Shape.Circle)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            Integer forTheme3 = colorModel != null ? DimensionKt.forTheme(colorModel, themeInfo) : null;
            if (forTheme3 != null) {
                arrayList.add(new TintTransformation(forTheme3.intValue(), 1));
            } else {
                arrayList.add(new CircleCropTransformation());
            }
        }
        ImageRequest.Builder builder = new ImageRequest.Builder(context);
        if (avatarDrawableRes != null) {
            obj = Integer.valueOf(drawableResForTheme(avatarDrawableRes, themeInfo));
        } else if (image != null) {
            obj = ThemablesKt.urlForTheme(image, themeInfo);
        }
        builder.data = obj;
        ImageRequestsKt.transformations(builder, arrayList);
        ImageRequests_androidKt.placeholder(builder, createAvatarMonogram);
        ImageRequests_androidKt.error(builder, createAvatarMonogram);
        builder.scale = Scale.FILL;
        ImageRequests_androidKt.target(builder, imageView);
        builder.listener = new ContextMenuPopupPositionProvider(function0);
        realImageLoader.enqueue(builder.build());
    }
}
