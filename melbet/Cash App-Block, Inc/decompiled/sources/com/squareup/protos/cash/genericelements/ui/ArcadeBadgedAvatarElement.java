package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import coil3.network.internal.Utils_androidKt;
import com.google.android.gms.internal.mlkit_vision_common.zzbc;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ArcadeBadgedAvatarElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ArcadeBadgedAvatarElement> CREATOR;
    public final Alignment alignment;
    public final Utils_androidKt avatar_badge;
    public final zzbc avatar_image;
    public final SemanticBackgroundColor background_color;
    public final String content_description;
    public final Color custom_background_color;
    public final String monogram;
    public final Size size;

    public final class AvatarBadgeLocalIcon extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AvatarBadgeLocalIcon> CREATOR;
        public final SemanticBackgroundColor background_color;
        public final Boolean colorize_image;
        public final String icon_id;
        public final SemanticIconColor tint_color;

        static {
            ArcadeBadgedAvatarElement$AvatarBadgeLocalIcon$Companion$ADAPTER$1 arcadeBadgedAvatarElement$AvatarBadgeLocalIcon$Companion$ADAPTER$1 = new ArcadeBadgedAvatarElement$AvatarBadgeLocalIcon$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvatarBadgeLocalIcon.class), "type.googleapis.com/squareup.cash.genericelements.ui.ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
            ADAPTER = arcadeBadgedAvatarElement$AvatarBadgeLocalIcon$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(arcadeBadgedAvatarElement$AvatarBadgeLocalIcon$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvatarBadgeLocalIcon(String str, SemanticIconColor semanticIconColor, Boolean bool, SemanticBackgroundColor semanticBackgroundColor, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon_id = str;
            this.tint_color = semanticIconColor;
            this.colorize_image = bool;
            this.background_color = semanticBackgroundColor;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarBadgeLocalIcon)) {
                return false;
            }
            AvatarBadgeLocalIcon avatarBadgeLocalIcon = (AvatarBadgeLocalIcon) obj;
            return Intrinsics.areEqual(unknownFields(), avatarBadgeLocalIcon.unknownFields()) && Intrinsics.areEqual(this.icon_id, avatarBadgeLocalIcon.icon_id) && this.tint_color == avatarBadgeLocalIcon.tint_color && Intrinsics.areEqual(this.colorize_image, avatarBadgeLocalIcon.colorize_image) && this.background_color == avatarBadgeLocalIcon.background_color;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.icon_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            SemanticIconColor semanticIconColor = this.tint_color;
            int hashCode3 = (hashCode2 + (semanticIconColor != null ? semanticIconColor.hashCode() : 0)) * 37;
            Boolean bool = this.colorize_image;
            int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            SemanticBackgroundColor semanticBackgroundColor = this.background_color;
            int hashCode5 = hashCode4 + (semanticBackgroundColor != null ? semanticBackgroundColor.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Card.CardPii.Builder builder = new Card.CardPii.Builder(9, false);
            builder.postal_code = this.icon_id;
            builder.last_four_digits = this.tint_color;
            builder.expiration = this.colorize_image;
            builder.ciphertext_ = this.background_color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.icon_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "icon_id=", arrayList);
            }
            SemanticIconColor semanticIconColor = this.tint_color;
            if (semanticIconColor != null) {
                arrayList.add("tint_color=" + semanticIconColor);
            }
            Boolean bool = this.colorize_image;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("colorize_image=", bool, arrayList);
            }
            SemanticBackgroundColor semanticBackgroundColor = this.background_color;
            if (semanticBackgroundColor != null) {
                arrayList.add("background_color=" + semanticBackgroundColor);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AvatarBadgeLocalIcon{", "}", 0, null, null, 56);
        }
    }

    public final class AvatarBadgeRemoteImage extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AvatarBadgeRemoteImage> CREATOR;
        public final SemanticBackgroundColor background_color;
        public final Boolean colorize_image;
        public final Image image;
        public final AvatarBadgeLocalIcon placeholder;
        public final SemanticIconColor tint_color;

        static {
            ArcadeBadgedAvatarElement$AvatarBadgeRemoteImage$Companion$ADAPTER$1 arcadeBadgedAvatarElement$AvatarBadgeRemoteImage$Companion$ADAPTER$1 = new ArcadeBadgedAvatarElement$AvatarBadgeRemoteImage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvatarBadgeRemoteImage.class), "type.googleapis.com/squareup.cash.genericelements.ui.ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
            ADAPTER = arcadeBadgedAvatarElement$AvatarBadgeRemoteImage$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(arcadeBadgedAvatarElement$AvatarBadgeRemoteImage$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvatarBadgeRemoteImage(Image image, Boolean bool, AvatarBadgeLocalIcon avatarBadgeLocalIcon, SemanticIconColor semanticIconColor, SemanticBackgroundColor semanticBackgroundColor, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image = image;
            this.colorize_image = bool;
            this.placeholder = avatarBadgeLocalIcon;
            this.tint_color = semanticIconColor;
            this.background_color = semanticBackgroundColor;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarBadgeRemoteImage)) {
                return false;
            }
            AvatarBadgeRemoteImage avatarBadgeRemoteImage = (AvatarBadgeRemoteImage) obj;
            return Intrinsics.areEqual(unknownFields(), avatarBadgeRemoteImage.unknownFields()) && Intrinsics.areEqual(this.image, avatarBadgeRemoteImage.image) && Intrinsics.areEqual(this.colorize_image, avatarBadgeRemoteImage.colorize_image) && Intrinsics.areEqual(this.placeholder, avatarBadgeRemoteImage.placeholder) && this.tint_color == avatarBadgeRemoteImage.tint_color && this.background_color == avatarBadgeRemoteImage.background_color;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.image;
            int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
            Boolean bool = this.colorize_image;
            int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            AvatarBadgeLocalIcon avatarBadgeLocalIcon = this.placeholder;
            int hashCode4 = (hashCode3 + (avatarBadgeLocalIcon != null ? avatarBadgeLocalIcon.hashCode() : 0)) * 37;
            SemanticIconColor semanticIconColor = this.tint_color;
            int hashCode5 = (hashCode4 + (semanticIconColor != null ? semanticIconColor.hashCode() : 0)) * 37;
            SemanticBackgroundColor semanticBackgroundColor = this.background_color;
            int hashCode6 = hashCode5 + (semanticBackgroundColor != null ? semanticBackgroundColor.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Text.Builder builder = new Text.Builder(7);
            builder.icon = this.image;
            builder.text = this.colorize_image;
            builder.text_style = this.placeholder;
            builder.text_decoration = this.tint_color;
            builder.text_color = this.background_color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            Boolean bool = this.colorize_image;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("colorize_image=", bool, arrayList);
            }
            AvatarBadgeLocalIcon avatarBadgeLocalIcon = this.placeholder;
            if (avatarBadgeLocalIcon != null) {
                arrayList.add("placeholder=" + avatarBadgeLocalIcon);
            }
            SemanticIconColor semanticIconColor = this.tint_color;
            if (semanticIconColor != null) {
                arrayList.add("tint_color=" + semanticIconColor);
            }
            SemanticBackgroundColor semanticBackgroundColor = this.background_color;
            if (semanticBackgroundColor != null) {
                arrayList.add("background_color=" + semanticBackgroundColor);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AvatarBadgeRemoteImage{", "}", 0, null, null, 56);
        }
    }

    public final class AvatarImageLocalIcon extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AvatarImageLocalIcon> CREATOR;
        public final String icon_id;
        public final SemanticIconColor tint_color;

        static {
            ArcadeBadgedAvatarElement$AvatarImageLocalIcon$Companion$ADAPTER$1 arcadeBadgedAvatarElement$AvatarImageLocalIcon$Companion$ADAPTER$1 = new ArcadeBadgedAvatarElement$AvatarImageLocalIcon$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvatarImageLocalIcon.class), "type.googleapis.com/squareup.cash.genericelements.ui.ArcadeBadgedAvatarElement.AvatarImageLocalIcon", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
            ADAPTER = arcadeBadgedAvatarElement$AvatarImageLocalIcon$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(arcadeBadgedAvatarElement$AvatarImageLocalIcon$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvatarImageLocalIcon(String str, SemanticIconColor semanticIconColor, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon_id = str;
            this.tint_color = semanticIconColor;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarImageLocalIcon)) {
                return false;
            }
            AvatarImageLocalIcon avatarImageLocalIcon = (AvatarImageLocalIcon) obj;
            return Intrinsics.areEqual(unknownFields(), avatarImageLocalIcon.unknownFields()) && Intrinsics.areEqual(this.icon_id, avatarImageLocalIcon.icon_id) && this.tint_color == avatarImageLocalIcon.tint_color;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.icon_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            SemanticIconColor semanticIconColor = this.tint_color;
            int hashCode3 = hashCode2 + (semanticIconColor != null ? semanticIconColor.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.Builder builder = new Action.Builder(19);
            builder.f1268type = this.icon_id;
            builder.details = this.tint_color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.icon_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "icon_id=", arrayList);
            }
            SemanticIconColor semanticIconColor = this.tint_color;
            if (semanticIconColor != null) {
                arrayList.add("tint_color=" + semanticIconColor);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AvatarImageLocalIcon{", "}", 0, null, null, 56);
        }
    }

    public final class AvatarImageRemoteIcon extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AvatarImageRemoteIcon> CREATOR;
        public final Boolean colorize_image;
        public final Image image;
        public final AvatarImageLocalIcon placeholder;
        public final SemanticIconColor tint_color;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public Boolean colorize_image;
            public Image image;
            public AvatarImageLocalIcon placeholder;
            public SemanticIconColor tint_color;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new AvatarImageRemoteIcon(this.image, this.colorize_image, this.placeholder, this.tint_color, buildUnknownFields());
                    default:
                        return new AvatarImageRemoteImage(this.image, this.colorize_image, this.placeholder, this.tint_color, buildUnknownFields());
                }
            }
        }

        static {
            ArcadeBadgedAvatarElement$AvatarImageRemoteIcon$Companion$ADAPTER$1 arcadeBadgedAvatarElement$AvatarImageRemoteIcon$Companion$ADAPTER$1 = new ArcadeBadgedAvatarElement$AvatarImageRemoteIcon$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvatarImageRemoteIcon.class), "type.googleapis.com/squareup.cash.genericelements.ui.ArcadeBadgedAvatarElement.AvatarImageRemoteIcon", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
            ADAPTER = arcadeBadgedAvatarElement$AvatarImageRemoteIcon$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(arcadeBadgedAvatarElement$AvatarImageRemoteIcon$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvatarImageRemoteIcon(Image image, Boolean bool, AvatarImageLocalIcon avatarImageLocalIcon, SemanticIconColor semanticIconColor, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image = image;
            this.colorize_image = bool;
            this.placeholder = avatarImageLocalIcon;
            this.tint_color = semanticIconColor;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarImageRemoteIcon)) {
                return false;
            }
            AvatarImageRemoteIcon avatarImageRemoteIcon = (AvatarImageRemoteIcon) obj;
            return Intrinsics.areEqual(unknownFields(), avatarImageRemoteIcon.unknownFields()) && Intrinsics.areEqual(this.image, avatarImageRemoteIcon.image) && Intrinsics.areEqual(this.colorize_image, avatarImageRemoteIcon.colorize_image) && Intrinsics.areEqual(this.placeholder, avatarImageRemoteIcon.placeholder) && this.tint_color == avatarImageRemoteIcon.tint_color;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.image;
            int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
            Boolean bool = this.colorize_image;
            int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            AvatarImageLocalIcon avatarImageLocalIcon = this.placeholder;
            int hashCode4 = (hashCode3 + (avatarImageLocalIcon != null ? avatarImageLocalIcon.hashCode() : 0)) * 37;
            SemanticIconColor semanticIconColor = this.tint_color;
            int hashCode5 = hashCode4 + (semanticIconColor != null ? semanticIconColor.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.image = this.image;
            builder.colorize_image = this.colorize_image;
            builder.placeholder = this.placeholder;
            builder.tint_color = this.tint_color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            Boolean bool = this.colorize_image;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("colorize_image=", bool, arrayList);
            }
            AvatarImageLocalIcon avatarImageLocalIcon = this.placeholder;
            if (avatarImageLocalIcon != null) {
                arrayList.add("placeholder=" + avatarImageLocalIcon);
            }
            SemanticIconColor semanticIconColor = this.tint_color;
            if (semanticIconColor != null) {
                arrayList.add("tint_color=" + semanticIconColor);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AvatarImageRemoteIcon{", "}", 0, null, null, 56);
        }
    }

    public final class AvatarImageRemoteImage extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AvatarImageRemoteImage> CREATOR;
        public final Boolean colorize_image;
        public final Image image;
        public final AvatarImageLocalIcon placeholder;
        public final SemanticIconColor tint_color;

        static {
            ArcadeBadgedAvatarElement$AvatarImageRemoteImage$Companion$ADAPTER$1 arcadeBadgedAvatarElement$AvatarImageRemoteImage$Companion$ADAPTER$1 = new ArcadeBadgedAvatarElement$AvatarImageRemoteImage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvatarImageRemoteImage.class), "type.googleapis.com/squareup.cash.genericelements.ui.ArcadeBadgedAvatarElement.AvatarImageRemoteImage", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
            ADAPTER = arcadeBadgedAvatarElement$AvatarImageRemoteImage$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(arcadeBadgedAvatarElement$AvatarImageRemoteImage$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvatarImageRemoteImage(Image image, Boolean bool, AvatarImageLocalIcon avatarImageLocalIcon, SemanticIconColor semanticIconColor, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image = image;
            this.colorize_image = bool;
            this.placeholder = avatarImageLocalIcon;
            this.tint_color = semanticIconColor;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarImageRemoteImage)) {
                return false;
            }
            AvatarImageRemoteImage avatarImageRemoteImage = (AvatarImageRemoteImage) obj;
            return Intrinsics.areEqual(unknownFields(), avatarImageRemoteImage.unknownFields()) && Intrinsics.areEqual(this.image, avatarImageRemoteImage.image) && Intrinsics.areEqual(this.colorize_image, avatarImageRemoteImage.colorize_image) && Intrinsics.areEqual(this.placeholder, avatarImageRemoteImage.placeholder) && this.tint_color == avatarImageRemoteImage.tint_color;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.image;
            int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
            Boolean bool = this.colorize_image;
            int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            AvatarImageLocalIcon avatarImageLocalIcon = this.placeholder;
            int hashCode4 = (hashCode3 + (avatarImageLocalIcon != null ? avatarImageLocalIcon.hashCode() : 0)) * 37;
            SemanticIconColor semanticIconColor = this.tint_color;
            int hashCode5 = hashCode4 + (semanticIconColor != null ? semanticIconColor.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            AvatarImageRemoteIcon.Builder builder = new AvatarImageRemoteIcon.Builder(1);
            builder.image = this.image;
            builder.colorize_image = this.colorize_image;
            builder.placeholder = this.placeholder;
            builder.tint_color = this.tint_color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            Boolean bool = this.colorize_image;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("colorize_image=", bool, arrayList);
            }
            AvatarImageLocalIcon avatarImageLocalIcon = this.placeholder;
            if (avatarImageLocalIcon != null) {
                arrayList.add("placeholder=" + avatarImageLocalIcon);
            }
            SemanticIconColor semanticIconColor = this.tint_color;
            if (semanticIconColor != null) {
                arrayList.add("tint_color=" + semanticIconColor);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AvatarImageRemoteImage{", "}", 0, null, null, 56);
        }
    }

    public enum Size implements WireEnum {
        Size32(1),
        Size48(2),
        Size64(3),
        Size96(4);

        public final int value;
        public static final Channel.Companion Companion = new Channel.Companion();
        public static final ArcadeBadgedAvatarElement$Size$Companion$ADAPTER$1 ADAPTER = new ArcadeBadgedAvatarElement$Size$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Size.class), Syntax.PROTO_2, null);

        Size(int i) {
            this.value = i;
        }

        public static final Size fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return Size32;
            }
            if (i == 2) {
                return Size48;
            }
            if (i == 3) {
                return Size64;
            }
            if (i != 4) {
                return null;
            }
            return Size96;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ArcadeBadgedAvatarElement$Companion$ADAPTER$1 arcadeBadgedAvatarElement$Companion$ADAPTER$1 = new ArcadeBadgedAvatarElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ArcadeBadgedAvatarElement.class), "type.googleapis.com/squareup.cash.genericelements.ui.ArcadeBadgedAvatarElement", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = arcadeBadgedAvatarElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(arcadeBadgedAvatarElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeBadgedAvatarElement(Size size, String str, SemanticBackgroundColor semanticBackgroundColor, String str2, zzbc zzbcVar, Utils_androidKt utils_androidKt, Alignment alignment, Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.size = size;
        this.monogram = str;
        this.background_color = semanticBackgroundColor;
        this.content_description = str2;
        this.avatar_image = zzbcVar;
        this.avatar_badge = utils_androidKt;
        this.alignment = alignment;
        this.custom_background_color = color;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ArcadeBadgedAvatarElement)) {
            return false;
        }
        ArcadeBadgedAvatarElement arcadeBadgedAvatarElement = (ArcadeBadgedAvatarElement) obj;
        return Intrinsics.areEqual(unknownFields(), arcadeBadgedAvatarElement.unknownFields()) && this.size == arcadeBadgedAvatarElement.size && Intrinsics.areEqual(this.monogram, arcadeBadgedAvatarElement.monogram) && this.background_color == arcadeBadgedAvatarElement.background_color && Intrinsics.areEqual(this.content_description, arcadeBadgedAvatarElement.content_description) && Intrinsics.areEqual(this.avatar_image, arcadeBadgedAvatarElement.avatar_image) && Intrinsics.areEqual(this.avatar_badge, arcadeBadgedAvatarElement.avatar_badge) && this.alignment == arcadeBadgedAvatarElement.alignment && Intrinsics.areEqual(this.custom_background_color, arcadeBadgedAvatarElement.custom_background_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Size size = this.size;
        int hashCode2 = (hashCode + (size != null ? size.hashCode() : 0)) * 37;
        String str = this.monogram;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        SemanticBackgroundColor semanticBackgroundColor = this.background_color;
        int hashCode4 = (hashCode3 + (semanticBackgroundColor != null ? semanticBackgroundColor.hashCode() : 0)) * 37;
        String str2 = this.content_description;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        zzbc zzbcVar = this.avatar_image;
        int hashCode6 = (hashCode5 + (zzbcVar != null ? zzbcVar.hashCode() : 0)) * 37;
        Utils_androidKt utils_androidKt = this.avatar_badge;
        int hashCode7 = (hashCode6 + (utils_androidKt != null ? utils_androidKt.hashCode() : 0)) * 37;
        Alignment alignment = this.alignment;
        int hashCode8 = (hashCode7 + (alignment != null ? alignment.hashCode() : 0)) * 37;
        Color color = this.custom_background_color;
        int hashCode9 = hashCode8 + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(21, false);
        builder.external_version = this.size;
        builder.external_token = this.monogram;
        builder.updated_at = this.background_color;
        builder.customer_token = this.content_description;
        builder.created_at = this.avatar_image;
        builder.is_badged = this.avatar_badge;
        builder.item_type = this.alignment;
        builder.count_groups = this.custom_background_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Size size = this.size;
        if (size != null) {
            arrayList.add("size=" + size);
        }
        String str = this.monogram;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "monogram=", arrayList);
        }
        SemanticBackgroundColor semanticBackgroundColor = this.background_color;
        if (semanticBackgroundColor != null) {
            arrayList.add("background_color=" + semanticBackgroundColor);
        }
        String str2 = this.content_description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "content_description=", arrayList);
        }
        zzbc zzbcVar = this.avatar_image;
        if (zzbcVar != null) {
            arrayList.add("avatar_image=" + zzbcVar);
        }
        Utils_androidKt utils_androidKt = this.avatar_badge;
        if (utils_androidKt != null) {
            arrayList.add("avatar_badge=" + utils_androidKt);
        }
        Alignment alignment = this.alignment;
        if (alignment != null) {
            arrayList.add("alignment=" + alignment);
        }
        Color color = this.custom_background_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("custom_background_color=", color, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ArcadeBadgedAvatarElement{", "}", 0, null, null, 56);
    }
}
