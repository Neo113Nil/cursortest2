package com.squareup.cash.ui.widget;

import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.MoshiJsonIntegration;
import designsystem.arcade.ArcadeColors;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes6.dex */
public abstract class StackedAvatarViewModelKt {
    public static final StackedAvatarViewModel.Avatar toAvatarModel(Avatar avatar) {
        avatar.getClass();
        return toStackedAvatarViewModel(toUiAvatar(avatar)).avatar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final StackedAvatarViewModel.Single toStackedAvatarViewModel(UiAvatar uiAvatar) {
        ColorModel model$default;
        ColorModel colorModel;
        String str;
        Character ch;
        ColorModel accented;
        uiAvatar.getClass();
        Color color = uiAvatar.background_color;
        if (color != null) {
            model$default = new ColorModel.Accented(color);
        } else {
            if (uiAvatar.image != null && !Intrinsics.areEqual(uiAvatar.is_template_avatar, Boolean.TRUE)) {
                colorModel = null;
                str = uiAvatar.monogram_text;
                if (str == null) {
                    ch = str.length() == 1 ? Character.valueOf(str.charAt(0)) : null;
                } else {
                    ch = null;
                }
                String str2 = uiAvatar.monogram_text;
                String str3 = (str2 != null || str2.length() <= 1) ? null : str2;
                String str4 = uiAvatar.accessibility_value;
                Image image = uiAvatar.image;
                if (Intrinsics.areEqual(uiAvatar.is_template_avatar, Boolean.TRUE)) {
                    Color color2 = uiAvatar.tint_color;
                    accented = color2 != null ? new ColorModel.Accented(color2) : null;
                } else {
                    accented = MoshiJsonIntegration.toModel$default(ArcadeColors.IconInverse);
                }
                ColorModel colorModel2 = accented;
                Icon icon = uiAvatar.icon;
                boolean z = icon == null;
                Color color3 = uiAvatar.border_color;
                return new StackedAvatarViewModel.Single(new StackedAvatarViewModel.Avatar(colorModel, ch, str4, image, null, icon, colorModel2, colorModel, false, false, null, z, color3 != null ? new ColorModel.Accented(color3) : null, str3, 14800));
            }
            model$default = MoshiJsonIntegration.toModel$default(ArcadeColors.BackgroundSubtle);
        }
        colorModel = model$default;
        str = uiAvatar.monogram_text;
        if (str == null) {
        }
        String str22 = uiAvatar.monogram_text;
        if (str22 != null) {
        }
        String str42 = uiAvatar.accessibility_value;
        Image image2 = uiAvatar.image;
        if (Intrinsics.areEqual(uiAvatar.is_template_avatar, Boolean.TRUE)) {
        }
        ColorModel colorModel22 = accented;
        Icon icon2 = uiAvatar.icon;
        if (icon2 == null) {
        }
        Color color32 = uiAvatar.border_color;
        return new StackedAvatarViewModel.Single(new StackedAvatarViewModel.Avatar(colorModel, ch, str42, image2, null, icon2, colorModel22, colorModel, false, false, null, z, color32 != null ? new ColorModel.Accented(color32) : null, str3, 14800));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final UiAvatar toUiAvatar(Avatar avatar) {
        Image image;
        String str;
        Color color;
        String str2;
        Character firstOrNull;
        avatar.getClass();
        String str3 = avatar.image_url;
        String str4 = null;
        if (str3 != null) {
            if (avatar.icon != null) {
                str3 = null;
            }
            if (str3 != null) {
                image = new Image(str3, avatar.dark_theme_image_url, 4);
                str = avatar.accent_color;
                if (str == null) {
                    Color.ModeVariant modeVariant = new Color.ModeVariant(str, null, null, null, null, 30, null);
                    String str5 = avatar.dark_theme_accent_color;
                    color = new Color(modeVariant, str5 != null ? new Color.ModeVariant(str5, null, null, null, null, 30, null) : null, 4);
                } else {
                    color = null;
                }
                str2 = avatar.initial;
                if (str2 != null && (firstOrNull = StringsKt___StringsKt.firstOrNull(str2)) != null) {
                    str4 = String.valueOf(firstOrNull.charValue());
                }
                return new UiAvatar(color, str4, avatar.icon, null, image, Boolean.valueOf((Intrinsics.areEqual(avatar.colorize_image, Boolean.TRUE) && avatar.icon == null) ? false : true), null, 32120);
            }
        }
        image = null;
        str = avatar.accent_color;
        if (str == null) {
        }
        str2 = avatar.initial;
        if (str2 != null) {
            str4 = String.valueOf(firstOrNull.charValue());
        }
        return new UiAvatar(color, str4, avatar.icon, null, image, Boolean.valueOf((Intrinsics.areEqual(avatar.colorize_image, Boolean.TRUE) && avatar.icon == null) ? false : true), null, 32120);
    }

    public static final StackedAvatarViewModel.Single toViewModel(Avatar avatar) {
        avatar.getClass();
        return new StackedAvatarViewModel.Single(StackedAvatarViewModel.Avatar.copy$default(toStackedAvatarViewModel(toUiAvatar(avatar)).avatar, null, null, 130047));
    }
}
