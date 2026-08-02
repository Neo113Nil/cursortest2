package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import app.cash.redwood.layout.view.FlexboxHelpersKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.cash.cashface.api.Activity;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.protos.cash.janus.api.ContactAlias;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AvatarOverlayCardSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AvatarOverlayCardSection> CREATOR;
    public final ImageLayout image_layout;
    public final List items;
    public final List overlay_items;

    public final class AvatarOverlayCardItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AvatarOverlayCardItem> CREATOR;
        public final Avatar avatar;
        public final ShopInfoResponse half_sheet;
        public final String item_action_url;
        public final ItemMetadata metadata;
        public final Image picture;
        public final ImageLayout picture_layout;
        public final Text subtitle;
        public final Text title;

        static {
            AvatarOverlayCardSection$AvatarOverlayCardItem$Companion$ADAPTER$1 avatarOverlayCardSection$AvatarOverlayCardItem$Companion$ADAPTER$1 = new AvatarOverlayCardSection$AvatarOverlayCardItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvatarOverlayCardItem.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AvatarOverlayCardSection.AvatarOverlayCardItem", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/Common.proto");
            ADAPTER = avatarOverlayCardSection$AvatarOverlayCardItem$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(avatarOverlayCardSection$AvatarOverlayCardItem$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvatarOverlayCardItem(ItemMetadata itemMetadata, Image image, ImageLayout imageLayout, Avatar avatar, Text text, Text text2, String str, ShopInfoResponse shopInfoResponse, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.metadata = itemMetadata;
            this.picture = image;
            this.picture_layout = imageLayout;
            this.avatar = avatar;
            this.title = text;
            this.subtitle = text2;
            this.item_action_url = str;
            this.half_sheet = shopInfoResponse;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarOverlayCardItem)) {
                return false;
            }
            AvatarOverlayCardItem avatarOverlayCardItem = (AvatarOverlayCardItem) obj;
            return Intrinsics.areEqual(unknownFields(), avatarOverlayCardItem.unknownFields()) && Intrinsics.areEqual(this.metadata, avatarOverlayCardItem.metadata) && Intrinsics.areEqual(this.picture, avatarOverlayCardItem.picture) && this.picture_layout == avatarOverlayCardItem.picture_layout && Intrinsics.areEqual(this.avatar, avatarOverlayCardItem.avatar) && Intrinsics.areEqual(this.title, avatarOverlayCardItem.title) && Intrinsics.areEqual(this.subtitle, avatarOverlayCardItem.subtitle) && Intrinsics.areEqual(this.item_action_url, avatarOverlayCardItem.item_action_url) && Intrinsics.areEqual(this.half_sheet, avatarOverlayCardItem.half_sheet);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ItemMetadata itemMetadata = this.metadata;
            int hashCode2 = (hashCode + (itemMetadata != null ? itemMetadata.hashCode() : 0)) * 37;
            Image image = this.picture;
            int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 37;
            ImageLayout imageLayout = this.picture_layout;
            int hashCode4 = (hashCode3 + (imageLayout != null ? imageLayout.hashCode() : 0)) * 37;
            Avatar avatar = this.avatar;
            int hashCode5 = (hashCode4 + (avatar != null ? avatar.hashCode() : 0)) * 37;
            Text text = this.title;
            int hashCode6 = (hashCode5 + (text != null ? text.hashCode() : 0)) * 37;
            Text text2 = this.subtitle;
            int hashCode7 = (hashCode6 + (text2 != null ? text2.hashCode() : 0)) * 37;
            String str = this.item_action_url;
            int hashCode8 = (hashCode7 + (str != null ? str.hashCode() : 0)) * 37;
            ShopInfoResponse shopInfoResponse = this.half_sheet;
            int hashCode9 = hashCode8 + (shopInfoResponse != null ? shopInfoResponse.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Badge.Builder builder = new Badge.Builder(13, false);
            builder.customer_token = this.metadata;
            builder.external_version = this.picture;
            builder.updated_at = this.picture_layout;
            builder.created_at = this.avatar;
            builder.is_badged = this.title;
            builder.item_type = this.subtitle;
            builder.external_token = this.item_action_url;
            builder.count_groups = this.half_sheet;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            ItemMetadata itemMetadata = this.metadata;
            if (itemMetadata != null) {
                arrayList.add("metadata=" + itemMetadata);
            }
            Image image = this.picture;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("picture=", image, arrayList);
            }
            ImageLayout imageLayout = this.picture_layout;
            if (imageLayout != null) {
                arrayList.add("picture_layout=" + imageLayout);
            }
            Avatar avatar = this.avatar;
            if (avatar != null) {
                arrayList.add("avatar=" + avatar);
            }
            Text text = this.title;
            if (text != null) {
                SizeMode$EnumUnboxingLocalUtility.m("title=", text, arrayList);
            }
            Text text2 = this.subtitle;
            if (text2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("subtitle=", text2, arrayList);
            }
            if (this.item_action_url != null) {
                arrayList.add("item_action_url=██");
            }
            ShopInfoResponse shopInfoResponse = this.half_sheet;
            if (shopInfoResponse != null) {
                arrayList.add("half_sheet=" + shopInfoResponse);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AvatarOverlayCardItem{", "}", 0, null, null, 56);
        }
    }

    public final class InfoOverlayCardItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InfoOverlayCardItem> CREATOR;
        public final Color background_color;
        public final Text description;
        public final ShopInfoResponse half_sheet;
        public final Boolean hide_close_button;
        public final Image icon;
        public final ItemMetadata metadata;
        public final Text title;

        static {
            AvatarOverlayCardSection$InfoOverlayCardItem$Companion$ADAPTER$1 avatarOverlayCardSection$InfoOverlayCardItem$Companion$ADAPTER$1 = new AvatarOverlayCardSection$InfoOverlayCardItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InfoOverlayCardItem.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AvatarOverlayCardSection.InfoOverlayCardItem", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/Common.proto");
            ADAPTER = avatarOverlayCardSection$InfoOverlayCardItem$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(avatarOverlayCardSection$InfoOverlayCardItem$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InfoOverlayCardItem(ItemMetadata itemMetadata, Image image, Text text, Text text2, ShopInfoResponse shopInfoResponse, Color color, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.metadata = itemMetadata;
            this.icon = image;
            this.title = text;
            this.description = text2;
            this.half_sheet = shopInfoResponse;
            this.background_color = color;
            this.hide_close_button = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InfoOverlayCardItem)) {
                return false;
            }
            InfoOverlayCardItem infoOverlayCardItem = (InfoOverlayCardItem) obj;
            return Intrinsics.areEqual(unknownFields(), infoOverlayCardItem.unknownFields()) && Intrinsics.areEqual(this.metadata, infoOverlayCardItem.metadata) && Intrinsics.areEqual(this.icon, infoOverlayCardItem.icon) && Intrinsics.areEqual(this.title, infoOverlayCardItem.title) && Intrinsics.areEqual(this.description, infoOverlayCardItem.description) && Intrinsics.areEqual(this.half_sheet, infoOverlayCardItem.half_sheet) && Intrinsics.areEqual(this.background_color, infoOverlayCardItem.background_color) && Intrinsics.areEqual(this.hide_close_button, infoOverlayCardItem.hide_close_button);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ItemMetadata itemMetadata = this.metadata;
            int hashCode2 = (hashCode + (itemMetadata != null ? itemMetadata.hashCode() : 0)) * 37;
            Image image = this.icon;
            int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 37;
            Text text = this.title;
            int hashCode4 = (hashCode3 + (text != null ? text.hashCode() : 0)) * 37;
            Text text2 = this.description;
            int hashCode5 = (hashCode4 + (text2 != null ? text2.hashCode() : 0)) * 37;
            ShopInfoResponse shopInfoResponse = this.half_sheet;
            int hashCode6 = (hashCode5 + (shopInfoResponse != null ? shopInfoResponse.hashCode() : 0)) * 37;
            Color color = this.background_color;
            int hashCode7 = (hashCode6 + (color != null ? color.hashCode() : 0)) * 37;
            Boolean bool = this.hide_close_button;
            int hashCode8 = hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ContactAlias.Builder builder = new ContactAlias.Builder(10, false);
            builder.customer_token = this.metadata;
            builder.alias_value = this.icon;
            builder.hashed_alias_token = this.title;
            builder.alias_type = this.description;
            builder.updated_at = this.half_sheet;
            builder.linked_at = this.background_color;
            builder.version = this.hide_close_button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            ItemMetadata itemMetadata = this.metadata;
            if (itemMetadata != null) {
                arrayList.add("metadata=" + itemMetadata);
            }
            Image image = this.icon;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
            }
            Text text = this.title;
            if (text != null) {
                SizeMode$EnumUnboxingLocalUtility.m("title=", text, arrayList);
            }
            Text text2 = this.description;
            if (text2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("description=", text2, arrayList);
            }
            ShopInfoResponse shopInfoResponse = this.half_sheet;
            if (shopInfoResponse != null) {
                arrayList.add("half_sheet=" + shopInfoResponse);
            }
            Color color = this.background_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
            }
            Boolean bool = this.hide_close_button;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("hide_close_button=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InfoOverlayCardItem{", "}", 0, null, null, 56);
        }
    }

    public final class OverlayCardItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OverlayCardItem> CREATOR;
        public final FlexboxHelpersKt content;

        static {
            AvatarOverlayCardSection$OverlayCardItem$Companion$ADAPTER$1 avatarOverlayCardSection$OverlayCardItem$Companion$ADAPTER$1 = new AvatarOverlayCardSection$OverlayCardItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OverlayCardItem.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AvatarOverlayCardSection.OverlayCardItem", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/Common.proto");
            ADAPTER = avatarOverlayCardSection$OverlayCardItem$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(avatarOverlayCardSection$OverlayCardItem$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OverlayCardItem(FlexboxHelpersKt flexboxHelpersKt, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.content = flexboxHelpersKt;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OverlayCardItem)) {
                return false;
            }
            OverlayCardItem overlayCardItem = (OverlayCardItem) obj;
            return Intrinsics.areEqual(unknownFields(), overlayCardItem.unknownFields()) && Intrinsics.areEqual(this.content, overlayCardItem.content);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            FlexboxHelpersKt flexboxHelpersKt = this.content;
            int hashCode2 = hashCode + (flexboxHelpersKt != null ? flexboxHelpersKt.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Activity.Builder builder = new Activity.Builder(24);
            builder.activity = this.content;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            FlexboxHelpersKt flexboxHelpersKt = this.content;
            if (flexboxHelpersKt != null) {
                arrayList.add("content=" + flexboxHelpersKt);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OverlayCardItem{", "}", 0, null, null, 56);
        }
    }

    static {
        AvatarOverlayCardSection$Companion$ADAPTER$1 avatarOverlayCardSection$Companion$ADAPTER$1 = new AvatarOverlayCardSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvatarOverlayCardSection.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AvatarOverlayCardSection", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/Common.proto");
        ADAPTER = avatarOverlayCardSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(avatarOverlayCardSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarOverlayCardSection(List list, ImageLayout imageLayout, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.image_layout = imageLayout;
        this.items = TransactorKt.immutableCopyOf("items", list);
        this.overlay_items = TransactorKt.immutableCopyOf("overlay_items", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvatarOverlayCardSection)) {
            return false;
        }
        AvatarOverlayCardSection avatarOverlayCardSection = (AvatarOverlayCardSection) obj;
        return Intrinsics.areEqual(unknownFields(), avatarOverlayCardSection.unknownFields()) && Intrinsics.areEqual(this.items, avatarOverlayCardSection.items) && this.image_layout == avatarOverlayCardSection.image_layout && Intrinsics.areEqual(this.overlay_items, avatarOverlayCardSection.overlay_items);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.items);
        ImageLayout imageLayout = this.image_layout;
        int hashCode = this.overlay_items.hashCode() + ((m + (imageLayout != null ? imageLayout.hashCode() : 0)) * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Row.Builder builder = new Row.Builder(23);
        builder.title = this.items;
        builder.subtitle = this.image_layout;
        builder.action = this.overlay_items;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.items;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("items=", arrayList, list);
        }
        ImageLayout imageLayout = this.image_layout;
        if (imageLayout != null) {
            arrayList.add("image_layout=" + imageLayout);
        }
        List list2 = this.overlay_items;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("overlay_items=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AvatarOverlayCardSection{", "}", 0, null, null, 56);
    }
}
