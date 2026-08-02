package com.squareup.cash.ui.widget;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public abstract class StackedAvatarViewModel {

    /* loaded from: classes5.dex */
    public final class Duo extends StackedAvatarViewModel {
        public final Avatar backAvatar;
        public final Avatar frontAvatar;

        public Duo(Avatar avatar, Avatar avatar2) {
            avatar.getClass();
            avatar2.getClass();
            this.frontAvatar = avatar;
            this.backAvatar = avatar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Duo)) {
                return false;
            }
            Duo duo = (Duo) obj;
            return Intrinsics.areEqual(this.frontAvatar, duo.frontAvatar) && Intrinsics.areEqual(this.backAvatar, duo.backAvatar);
        }

        public final int hashCode() {
            return this.backAvatar.hashCode() + (this.frontAvatar.hashCode() * 31);
        }

        public final String toString() {
            return "Duo(frontAvatar=" + this.frontAvatar + ", backAvatar=" + this.backAvatar + ")";
        }
    }

    public final class Single extends StackedAvatarViewModel {
        public final Avatar avatar;

        public Single(Avatar avatar) {
            avatar.getClass();
            this.avatar = avatar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Single) && Intrinsics.areEqual(this.avatar, ((Single) obj).avatar);
        }

        public final int hashCode() {
            return this.avatar.hashCode();
        }

        public final String toString() {
            return "Single(avatar=" + this.avatar + ")";
        }
    }

    /* loaded from: classes5.dex */
    public final class Trio extends StackedAvatarViewModel {
        public final Avatar backAvatar;
        public final Avatar frontAvatar;
        public final Avatar middleAvatar;
        public final int overflowCount;
        public final boolean showOverflow;

        public Trio(Avatar avatar, Avatar avatar2, Avatar avatar3, boolean z, int i) {
            avatar.getClass();
            avatar2.getClass();
            avatar3.getClass();
            this.frontAvatar = avatar;
            this.middleAvatar = avatar2;
            this.backAvatar = avatar3;
            this.showOverflow = z;
            this.overflowCount = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Trio)) {
                return false;
            }
            Trio trio = (Trio) obj;
            return Intrinsics.areEqual(this.frontAvatar, trio.frontAvatar) && Intrinsics.areEqual(this.middleAvatar, trio.middleAvatar) && Intrinsics.areEqual(this.backAvatar, trio.backAvatar) && this.showOverflow == trio.showOverflow && this.overflowCount == trio.overflowCount;
        }

        public final int hashCode() {
            return Integer.hashCode(this.overflowCount) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.backAvatar.hashCode() + ((this.middleAvatar.hashCode() + (this.frontAvatar.hashCode() * 31)) * 31)) * 31, 31, this.showOverflow);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Trio(frontAvatar=");
            sb.append(this.frontAvatar);
            sb.append(", middleAvatar=");
            sb.append(this.middleAvatar);
            sb.append(", backAvatar=");
            sb.append(this.backAvatar);
            sb.append(", showOverflow=");
            sb.append(this.showOverflow);
            sb.append(", overflowCount=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.overflowCount, ")", sb);
        }
    }

    /* loaded from: classes5.dex */
    public final class Avatar {
        public final ColorModel backgroundColor;
        public final ColorModel borderColor;
        public final Character character;
        public final String contentDescription;
        public final boolean isArcadeIcon;
        public final boolean isFavorite;
        public final boolean isSponsorAllowlisted;
        public final Icon localArcadeIcon;
        public final AvatarDrawableRes localImage;
        public final String monogramText;
        public final ColorModel placeholderFillColor;
        public final ColorModel placeholderTintColor;
        public final Image remoteImage;
        public final Shape shape;
        public final ColorModel transformFillColor;
        public final ColorModel transformTintColor;

        public final class AvatarDrawableRes {
            public final int lightDrawableRes;
            public final boolean vector;

            public AvatarDrawableRes(int i, boolean z, int i2) {
                this.lightDrawableRes = i;
                this.vector = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AvatarDrawableRes)) {
                    return false;
                }
                AvatarDrawableRes avatarDrawableRes = (AvatarDrawableRes) obj;
                return this.lightDrawableRes == avatarDrawableRes.lightDrawableRes && this.vector == avatarDrawableRes.vector;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.vector) + (Integer.hashCode(this.lightDrawableRes) * 961);
            }

            public final String toString() {
                return "AvatarDrawableRes(lightDrawableRes=" + this.lightDrawableRes + ", darkDrawableRes=null, vector=" + this.vector + ")";
            }
        }

        /* loaded from: classes7.dex */
        public interface Shape {

            public final class Circle implements Shape {
                public static final Circle INSTANCE = new Circle();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Circle);
                }

                public final int hashCode() {
                    return 423218698;
                }

                public final String toString() {
                    return "Circle";
                }
            }

            /* loaded from: classes5.dex */
            public final class RoundedRectangle implements Shape {
                public final CornerRadiusSize cornerRadiusSize;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public final class CornerRadiusSize {
                    public static final /* synthetic */ CornerRadiusSize[] $VALUES;
                    public static final CornerRadiusSize None;
                    public static final CornerRadiusSize Standard;

                    static {
                        CornerRadiusSize cornerRadiusSize = new CornerRadiusSize("None", 0);
                        None = cornerRadiusSize;
                        CornerRadiusSize cornerRadiusSize2 = new CornerRadiusSize("Standard", 1);
                        Standard = cornerRadiusSize2;
                        $VALUES = new CornerRadiusSize[]{cornerRadiusSize, cornerRadiusSize2};
                    }

                    public static CornerRadiusSize valueOf(String str) {
                        return (CornerRadiusSize) Enum.valueOf(CornerRadiusSize.class, str);
                    }

                    public static CornerRadiusSize[] values() {
                        return (CornerRadiusSize[]) $VALUES.clone();
                    }
                }

                public RoundedRectangle(CornerRadiusSize cornerRadiusSize) {
                    cornerRadiusSize.getClass();
                    this.cornerRadiusSize = cornerRadiusSize;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof RoundedRectangle) && this.cornerRadiusSize == ((RoundedRectangle) obj).cornerRadiusSize;
                }

                public final int hashCode() {
                    return this.cornerRadiusSize.hashCode();
                }

                public final String toString() {
                    return "RoundedRectangle(cornerRadiusSize=" + this.cornerRadiusSize + ")";
                }
            }
        }

        public /* synthetic */ Avatar(ColorModel colorModel, Character ch, String str, Image image, AvatarDrawableRes avatarDrawableRes, Icon icon, ColorModel colorModel2, ColorModel colorModel3, boolean z, boolean z2, Shape shape, boolean z3, ColorModel colorModel4, String str2, int i) {
            this((i & 1) != 0 ? null : colorModel, (i & 2) != 0 ? null : ch, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : image, (i & 16) != 0 ? null : avatarDrawableRes, (i & 32) != 0 ? null : icon, (i & 128) != 0 ? null : ColorModel.Icon.INSTANCE, (i & 256) != 0 ? null : ColorModel.SecondaryButtonBackground.INSTANCE, (i & 512) != 0 ? null : colorModel2, (i & 1024) != 0 ? null : colorModel3, (i & 2048) != 0 ? false : z, (i & 4096) != 0 ? false : z2, (i & PKIFailureInfo.certRevoked) != 0 ? Shape.Circle.INSTANCE : shape, (i & 16384) != 0 ? false : z3, (32768 & i) != 0 ? null : colorModel4, (i & 65536) != 0 ? null : str2);
        }

        public static Avatar copy$default(Avatar avatar, Character ch, String str, int i) {
            ColorModel colorModel = avatar.backgroundColor;
            Character ch2 = (i & 2) != 0 ? avatar.character : ch;
            String str2 = (i & 4) != 0 ? avatar.contentDescription : str;
            Image image = avatar.remoteImage;
            Character ch3 = ch2;
            String str3 = str2;
            AvatarDrawableRes avatarDrawableRes = avatar.localImage;
            Icon icon = avatar.localArcadeIcon;
            avatar.getClass();
            ColorModel colorModel2 = avatar.placeholderTintColor;
            ColorModel colorModel3 = avatar.placeholderFillColor;
            ColorModel colorModel4 = avatar.transformTintColor;
            ColorModel colorModel5 = (i & 1024) != 0 ? avatar.transformFillColor : null;
            boolean z = avatar.isFavorite;
            boolean z2 = avatar.isSponsorAllowlisted;
            Shape shape = avatar.shape;
            boolean z3 = avatar.isArcadeIcon;
            ColorModel colorModel6 = avatar.borderColor;
            ColorModel colorModel7 = colorModel5;
            String str4 = avatar.monogramText;
            avatar.getClass();
            shape.getClass();
            return new Avatar(colorModel, ch3, str3, image, avatarDrawableRes, icon, colorModel2, colorModel3, colorModel4, colorModel7, z, z2, shape, z3, colorModel6, str4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Avatar)) {
                return false;
            }
            Avatar avatar = (Avatar) obj;
            return Intrinsics.areEqual(this.backgroundColor, avatar.backgroundColor) && Intrinsics.areEqual(this.character, avatar.character) && Intrinsics.areEqual(this.contentDescription, avatar.contentDescription) && Intrinsics.areEqual(this.remoteImage, avatar.remoteImage) && Intrinsics.areEqual(this.localImage, avatar.localImage) && Intrinsics.areEqual(this.localArcadeIcon, avatar.localArcadeIcon) && Intrinsics.areEqual(this.placeholderTintColor, avatar.placeholderTintColor) && Intrinsics.areEqual(this.placeholderFillColor, avatar.placeholderFillColor) && Intrinsics.areEqual(this.transformTintColor, avatar.transformTintColor) && Intrinsics.areEqual(this.transformFillColor, avatar.transformFillColor) && this.isFavorite == avatar.isFavorite && this.isSponsorAllowlisted == avatar.isSponsorAllowlisted && Intrinsics.areEqual(this.shape, avatar.shape) && this.isArcadeIcon == avatar.isArcadeIcon && Intrinsics.areEqual(this.borderColor, avatar.borderColor) && Intrinsics.areEqual(this.monogramText, avatar.monogramText);
        }

        public final int hashCode() {
            ColorModel colorModel = this.backgroundColor;
            int hashCode = (colorModel == null ? 0 : colorModel.hashCode()) * 31;
            Character ch = this.character;
            int hashCode2 = (hashCode + (ch == null ? 0 : ch.hashCode())) * 31;
            String str = this.contentDescription;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Image image = this.remoteImage;
            int hashCode4 = (hashCode3 + (image == null ? 0 : image.hashCode())) * 31;
            AvatarDrawableRes avatarDrawableRes = this.localImage;
            int hashCode5 = (hashCode4 + (avatarDrawableRes == null ? 0 : avatarDrawableRes.hashCode())) * 31;
            Icon icon = this.localArcadeIcon;
            int hashCode6 = (hashCode5 + (icon == null ? 0 : icon.hashCode())) * 961;
            ColorModel colorModel2 = this.placeholderTintColor;
            int hashCode7 = (hashCode6 + (colorModel2 == null ? 0 : colorModel2.hashCode())) * 31;
            ColorModel colorModel3 = this.placeholderFillColor;
            int hashCode8 = (hashCode7 + (colorModel3 == null ? 0 : colorModel3.hashCode())) * 31;
            ColorModel colorModel4 = this.transformTintColor;
            int hashCode9 = (hashCode8 + (colorModel4 == null ? 0 : colorModel4.hashCode())) * 31;
            ColorModel colorModel5 = this.transformFillColor;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.shape.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode9 + (colorModel5 == null ? 0 : colorModel5.hashCode())) * 31, 31, this.isFavorite), 31, this.isSponsorAllowlisted)) * 31, 31, this.isArcadeIcon);
            ColorModel colorModel6 = this.borderColor;
            int hashCode10 = (m + (colorModel6 == null ? 0 : colorModel6.hashCode())) * 31;
            String str2 = this.monogramText;
            return hashCode10 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Avatar(backgroundColor=");
            sb.append(this.backgroundColor);
            sb.append(", character=");
            sb.append(this.character);
            sb.append(", contentDescription=");
            sb.append(this.contentDescription);
            sb.append(", remoteImage=");
            sb.append(this.remoteImage);
            sb.append(", localImage=");
            sb.append(this.localImage);
            sb.append(", localArcadeIcon=");
            sb.append(this.localArcadeIcon);
            sb.append(", placeholderImage=null, placeholderTintColor=");
            sb.append(this.placeholderTintColor);
            sb.append(", placeholderFillColor=");
            sb.append(this.placeholderFillColor);
            sb.append(", transformTintColor=");
            sb.append(this.transformTintColor);
            sb.append(", transformFillColor=");
            sb.append(this.transformFillColor);
            sb.append(", isFavorite=");
            re$$ExternalSyntheticOutline0.m(sb, this.isFavorite, ", isSponsorAllowlisted=", this.isSponsorAllowlisted, ", shape=");
            sb.append(this.shape);
            sb.append(", isArcadeIcon=");
            sb.append(this.isArcadeIcon);
            sb.append(", borderColor=");
            sb.append(this.borderColor);
            sb.append(", monogramText=");
            sb.append(this.monogramText);
            sb.append(")");
            return sb.toString();
        }

        public Avatar(ColorModel colorModel, Character ch, String str, Image image, AvatarDrawableRes avatarDrawableRes, Icon icon, ColorModel colorModel2, ColorModel colorModel3, ColorModel colorModel4, ColorModel colorModel5, boolean z, boolean z2, Shape shape, boolean z3, ColorModel colorModel6, String str2) {
            shape.getClass();
            this.backgroundColor = colorModel;
            this.character = ch;
            this.contentDescription = str;
            this.remoteImage = image;
            this.localImage = avatarDrawableRes;
            this.localArcadeIcon = icon;
            this.placeholderTintColor = colorModel2;
            this.placeholderFillColor = colorModel3;
            this.transformTintColor = colorModel4;
            this.transformFillColor = colorModel5;
            this.isFavorite = z;
            this.isSponsorAllowlisted = z2;
            this.shape = shape;
            this.isArcadeIcon = z3;
            this.borderColor = colorModel6;
            this.monogramText = str2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Avatar(ColorModel colorModel, Character ch, String str, Image image, AvatarDrawableRes avatarDrawableRes, ColorModel colorModel2, ColorModel colorModel3, boolean z, boolean z2, boolean z3, int i) {
            this(r4, ch, r6, r7, r8, null, r10, r11, r12, r13, r0, false, null, null, 65984);
            Shape shape;
            ColorModel colorModel4 = (i & 1) != 0 ? null : colorModel;
            String str2 = (i & 4) != 0 ? null : str;
            Image image2 = (i & 8) != 0 ? null : image;
            AvatarDrawableRes avatarDrawableRes2 = (i & 16) != 0 ? null : avatarDrawableRes;
            ColorModel colorModel5 = (i & 64) != 0 ? null : colorModel2;
            ColorModel colorModel6 = (i & 128) != 0 ? null : colorModel3;
            boolean z4 = (i & 256) != 0 ? false : z;
            boolean z5 = (i & 512) != 0 ? false : z2;
            if (z3) {
                shape = new Shape.RoundedRectangle(Shape.RoundedRectangle.CornerRadiusSize.Standard);
            } else {
                shape = Shape.Circle.INSTANCE;
            }
        }
    }
}
