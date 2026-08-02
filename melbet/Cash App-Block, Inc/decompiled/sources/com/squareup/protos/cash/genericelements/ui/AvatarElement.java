package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.compass.api.RadioType;
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
public final class AvatarElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AvatarElement> CREATOR;
    public final String accessibility_label;
    public final Action action;
    public final Alignment alignment;
    public final Color backgroundColor;
    public final Badge badge;
    public final Image badge_image;
    public final Boolean colorizeAvatar;
    public final Image image;
    public final Size size;

    public enum Badge implements WireEnum {
        SUCCESS(1),
        STAR(2),
        IMAGE(3);

        public final int value;
        public static final RadioType.Companion Companion = new RadioType.Companion();
        public static final AvatarElement$Badge$Companion$ADAPTER$1 ADAPTER = new AvatarElement$Badge$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Badge.class), Syntax.PROTO_2, null);

        Badge(int i) {
            this.value = i;
        }

        public static final Badge fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return SUCCESS;
            }
            if (i == 2) {
                return STAR;
            }
            if (i != 3) {
                return null;
            }
            return IMAGE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum Size implements WireEnum {
        SMALL(1),
        MEDIUM(2),
        LARGE(3);

        public final int value;
        public static final ImageLayout.Companion Companion = new ImageLayout.Companion();
        public static final AvatarElement$Size$Companion$ADAPTER$1 ADAPTER = new AvatarElement$Size$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Size.class), Syntax.PROTO_2, null);

        Size(int i) {
            this.value = i;
        }

        public static final Size fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return SMALL;
            }
            if (i == 2) {
                return MEDIUM;
            }
            if (i != 3) {
                return null;
            }
            return LARGE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        AvatarElement$Companion$ADAPTER$1 avatarElement$Companion$ADAPTER$1 = new AvatarElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvatarElement.class), "type.googleapis.com/squareup.cash.genericelements.ui.AvatarElement", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = avatarElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(avatarElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarElement(Image image, Size size, Boolean bool, Color color, Alignment alignment, String str, Badge badge, Action action, Image image2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.image = image;
        this.size = size;
        this.colorizeAvatar = bool;
        this.backgroundColor = color;
        this.alignment = alignment;
        this.accessibility_label = str;
        this.badge = badge;
        this.action = action;
        this.badge_image = image2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvatarElement)) {
            return false;
        }
        AvatarElement avatarElement = (AvatarElement) obj;
        return Intrinsics.areEqual(unknownFields(), avatarElement.unknownFields()) && Intrinsics.areEqual(this.image, avatarElement.image) && this.size == avatarElement.size && Intrinsics.areEqual(this.colorizeAvatar, avatarElement.colorizeAvatar) && Intrinsics.areEqual(this.backgroundColor, avatarElement.backgroundColor) && this.alignment == avatarElement.alignment && Intrinsics.areEqual(this.accessibility_label, avatarElement.accessibility_label) && this.badge == avatarElement.badge && Intrinsics.areEqual(this.action, avatarElement.action) && Intrinsics.areEqual(this.badge_image, avatarElement.badge_image);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.image;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        Size size = this.size;
        int hashCode3 = (hashCode2 + (size != null ? size.hashCode() : 0)) * 37;
        Boolean bool = this.colorizeAvatar;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Color color = this.backgroundColor;
        int hashCode5 = (hashCode4 + (color != null ? color.hashCode() : 0)) * 37;
        Alignment alignment = this.alignment;
        int hashCode6 = (hashCode5 + (alignment != null ? alignment.hashCode() : 0)) * 37;
        String str = this.accessibility_label;
        int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 37;
        Badge badge = this.badge;
        int hashCode8 = (hashCode7 + (badge != null ? badge.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode9 = (hashCode8 + (action != null ? action.hashCode() : 0)) * 37;
        Image image2 = this.badge_image;
        int hashCode10 = hashCode9 + (image2 != null ? image2.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(17, false);
        builder.locale = this.image;
        builder.title = this.size;
        builder.info_rows_header = this.colorizeAvatar;
        builder.footer_text = this.backgroundColor;
        builder.loadable_subtitle = this.alignment;
        builder.info_rows = this.accessibility_label;
        builder.primary_footer_button_state = this.badge;
        builder.secondary_footer_button_state = this.action;
        builder.payment_plans_data = this.badge_image;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
        }
        Size size = this.size;
        if (size != null) {
            arrayList.add("size=" + size);
        }
        Boolean bool = this.colorizeAvatar;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("colorizeAvatar=", bool, arrayList);
        }
        Color color = this.backgroundColor;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("backgroundColor=", color, arrayList);
        }
        Alignment alignment = this.alignment;
        if (alignment != null) {
            arrayList.add("alignment=" + alignment);
        }
        String str = this.accessibility_label;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "accessibility_label=", arrayList);
        }
        Badge badge = this.badge;
        if (badge != null) {
            arrayList.add("badge=" + badge);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        Image image2 = this.badge_image;
        if (image2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("badge_image=", image2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AvatarElement{", "}", 0, null, null, 56);
    }
}
