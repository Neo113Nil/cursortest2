package com.squareup.protos.cash.cashstorefronts.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.Channel;
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
public final class ImageAsset extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ImageAsset> CREATOR;
    public final DimmerMode dimmer_mode;
    public final Image image;
    public final String image_type;
    public final TextColor text_color;

    /* renamed from: type, reason: collision with root package name */
    public final ImageType f1258type;

    public enum DimmerMode implements WireEnum {
        UNKNOWN_DIMMER_MODE(0),
        ENABLED(1),
        DISABLED(2);

        public static final ImageAsset$DimmerMode$Companion$ADAPTER$1 ADAPTER;
        public static final Action.Type.Companion Companion;
        public final int value;

        static {
            DimmerMode dimmerMode = UNKNOWN_DIMMER_MODE;
            Companion = new Action.Type.Companion();
            ADAPTER = new ImageAsset$DimmerMode$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DimmerMode.class), Syntax.PROTO_2, dimmerMode);
        }

        DimmerMode(int i) {
            this.value = i;
        }

        public static final DimmerMode fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNKNOWN_DIMMER_MODE;
            }
            if (i == 1) {
                return ENABLED;
            }
            if (i != 2) {
                return null;
            }
            return DISABLED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum ImageType implements WireEnum {
        IMAGE_TYPE_UNSPECIFIED(0),
        CASH_LIFESTYLE_SHORT(1),
        CASH_LIFESTYLE_TALL(2),
        CASH_LOGO(3);

        public static final ImageAsset$ImageType$Companion$ADAPTER$1 ADAPTER;
        public static final Alignment.Companion Companion;
        public final int value;

        static {
            ImageType imageType = IMAGE_TYPE_UNSPECIFIED;
            Companion = new Alignment.Companion();
            ADAPTER = new ImageAsset$ImageType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ImageType.class), Syntax.PROTO_2, imageType);
        }

        ImageType(int i) {
            this.value = i;
        }

        public static final ImageType fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return IMAGE_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return CASH_LIFESTYLE_SHORT;
            }
            if (i == 2) {
                return CASH_LIFESTYLE_TALL;
            }
            if (i != 3) {
                return null;
            }
            return CASH_LOGO;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum TextColor implements WireEnum {
        UNKNOWN_TEXT_COLOR(0),
        BLACK(1),
        WHITE(2);

        public static final ImageAsset$TextColor$Companion$ADAPTER$1 ADAPTER;
        public static final Channel.Companion Companion;
        public final int value;

        static {
            TextColor textColor = UNKNOWN_TEXT_COLOR;
            Companion = new Channel.Companion();
            ADAPTER = new ImageAsset$TextColor$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TextColor.class), Syntax.PROTO_2, textColor);
        }

        TextColor(int i) {
            this.value = i;
        }

        public static final TextColor fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNKNOWN_TEXT_COLOR;
            }
            if (i == 1) {
                return BLACK;
            }
            if (i != 2) {
                return null;
            }
            return WHITE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ImageAsset$Companion$ADAPTER$1 imageAsset$Companion$ADAPTER$1 = new ImageAsset$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ImageAsset.class), "type.googleapis.com/squareup.cash.cashstorefronts.api.ImageAsset", Syntax.PROTO_2, null, "squareup/cash/cashstorefronts/api/Image.proto");
        ADAPTER = imageAsset$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(imageAsset$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAsset(Image image, String str, TextColor textColor, DimmerMode dimmerMode, ImageType imageType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.image = image;
        this.image_type = str;
        this.text_color = textColor;
        this.dimmer_mode = dimmerMode;
        this.f1258type = imageType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageAsset)) {
            return false;
        }
        ImageAsset imageAsset = (ImageAsset) obj;
        return Intrinsics.areEqual(unknownFields(), imageAsset.unknownFields()) && Intrinsics.areEqual(this.image, imageAsset.image) && Intrinsics.areEqual(this.image_type, imageAsset.image_type) && this.text_color == imageAsset.text_color && this.dimmer_mode == imageAsset.dimmer_mode && this.f1258type == imageAsset.f1258type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.image;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        String str = this.image_type;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        TextColor textColor = this.text_color;
        int hashCode4 = (hashCode3 + (textColor != null ? textColor.hashCode() : 0)) * 37;
        DimmerMode dimmerMode = this.dimmer_mode;
        int hashCode5 = (hashCode4 + (dimmerMode != null ? dimmerMode.hashCode() : 0)) * 37;
        ImageType imageType = this.f1258type;
        int hashCode6 = hashCode5 + (imageType != null ? imageType.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Account.Builder builder = new Account.Builder(15, false);
        builder.account_token = this.image;
        builder.customer_token = this.image_type;
        builder.display_name = this.text_color;
        builder.account_type = this.dimmer_mode;
        builder.is_sponsored_account = this.f1258type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
        }
        String str = this.image_type;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "image_type=", arrayList);
        }
        TextColor textColor = this.text_color;
        if (textColor != null) {
            arrayList.add("text_color=" + textColor);
        }
        DimmerMode dimmerMode = this.dimmer_mode;
        if (dimmerMode != null) {
            arrayList.add("dimmer_mode=" + dimmerMode);
        }
        ImageType imageType = this.f1258type;
        if (imageType != null) {
            arrayList.add("type=" + imageType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ImageAsset{", "}", 0, null, null, 56);
    }
}
