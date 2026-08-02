package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzkq;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashface.api.Avatar;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.pools.ListPoolsResponse;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.document.Document;
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

/* loaded from: classes8.dex */
public final class CategoryTileSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CategoryTileSection> CREATOR;
    public final List tiles;

    static {
        CategoryTileSection$Companion$ADAPTER$1 categoryTileSection$Companion$ADAPTER$1 = new CategoryTileSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CategoryTileSection.class), "type.googleapis.com/squareup.cash.shop.rendering.api.CategoryTileSection", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/CategoryTileSection.proto");
        ADAPTER = categoryTileSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(categoryTileSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryTileSection(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.tiles = TransactorKt.immutableCopyOf("tiles", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CategoryTileSection)) {
            return false;
        }
        CategoryTileSection categoryTileSection = (CategoryTileSection) obj;
        return Intrinsics.areEqual(unknownFields(), categoryTileSection.unknownFields()) && Intrinsics.areEqual(this.tiles, categoryTileSection.tiles);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.tiles.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(22, false);
        builder.pools = this.tiles;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.tiles;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tiles=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CategoryTileSection{", "}", 0, null, null, 56);
    }

    public final class CategoryTile extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CategoryTile> CREATOR;
        public final AnalyticsEvent analytics_view_event;
        public final LocalizedString l_title;
        public final Image picture;
        public final zzkq style;
        public final TapAction tap_action;
        public final StyledText title;

        public final class ImageStyle extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ImageStyle> CREATOR;
            public final Image background_image;

            static {
                CategoryTileSection$CategoryTile$ImageStyle$Companion$ADAPTER$1 categoryTileSection$CategoryTile$ImageStyle$Companion$ADAPTER$1 = new CategoryTileSection$CategoryTile$ImageStyle$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ImageStyle.class), "type.googleapis.com/squareup.cash.shop.rendering.api.CategoryTileSection.CategoryTile.ImageStyle", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/CategoryTileSection.proto");
                ADAPTER = categoryTileSection$CategoryTile$ImageStyle$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(categoryTileSection$CategoryTile$ImageStyle$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ImageStyle(Image image, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.background_image = image;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ImageStyle)) {
                    return false;
                }
                ImageStyle imageStyle = (ImageStyle) obj;
                return Intrinsics.areEqual(unknownFields(), imageStyle.unknownFields()) && Intrinsics.areEqual(this.background_image, imageStyle.background_image);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Image image = this.background_image;
                int hashCode2 = hashCode + (image != null ? image.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Avatar.Builder builder = new Avatar.Builder(4);
                builder.photo = this.background_image;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Image image = this.background_image;
                if (image != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("background_image=", image, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ImageStyle{", "}", 0, null, null, 56);
            }
        }

        static {
            CategoryTileSection$CategoryTile$Companion$ADAPTER$1 categoryTileSection$CategoryTile$Companion$ADAPTER$1 = new CategoryTileSection$CategoryTile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CategoryTile.class), "type.googleapis.com/squareup.cash.shop.rendering.api.CategoryTileSection.CategoryTile", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/CategoryTileSection.proto");
            ADAPTER = categoryTileSection$CategoryTile$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(categoryTileSection$CategoryTile$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CategoryTile(AnalyticsEvent analyticsEvent, TapAction tapAction, LocalizedString localizedString, zzkq zzkqVar, StyledText styledText, Image image, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.analytics_view_event = analyticsEvent;
            this.tap_action = tapAction;
            this.l_title = localizedString;
            this.style = zzkqVar;
            this.title = styledText;
            this.picture = image;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CategoryTile)) {
                return false;
            }
            CategoryTile categoryTile = (CategoryTile) obj;
            return Intrinsics.areEqual(unknownFields(), categoryTile.unknownFields()) && Intrinsics.areEqual(this.analytics_view_event, categoryTile.analytics_view_event) && Intrinsics.areEqual(this.tap_action, categoryTile.tap_action) && Intrinsics.areEqual(this.l_title, categoryTile.l_title) && Intrinsics.areEqual(this.style, categoryTile.style) && Intrinsics.areEqual(this.title, categoryTile.title) && Intrinsics.areEqual(this.picture, categoryTile.picture);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AnalyticsEvent analyticsEvent = this.analytics_view_event;
            int hashCode2 = (hashCode + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
            TapAction tapAction = this.tap_action;
            int hashCode3 = (hashCode2 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.l_title;
            int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            zzkq zzkqVar = this.style;
            int hashCode5 = (hashCode4 + (zzkqVar != null ? zzkqVar.hashCode() : 0)) * 37;
            StyledText styledText = this.title;
            int hashCode6 = (hashCode5 + (styledText != null ? styledText.hashCode() : 0)) * 37;
            Image image = this.picture;
            int hashCode7 = hashCode6 + (image != null ? image.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Document.Builder builder = new Document.Builder(4, false);
            builder.category = this.analytics_view_event;
            builder.token = this.tap_action;
            builder.title = this.l_title;
            builder.url = this.style;
            builder.owner_token = this.title;
            builder.document_date = this.picture;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            AnalyticsEvent analyticsEvent = this.analytics_view_event;
            if (analyticsEvent != null) {
                SizeMode$EnumUnboxingLocalUtility.m("analytics_view_event=", analyticsEvent, arrayList);
            }
            TapAction tapAction = this.tap_action;
            if (tapAction != null) {
                SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
            }
            LocalizedString localizedString = this.l_title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("l_title=", localizedString, arrayList);
            }
            zzkq zzkqVar = this.style;
            if (zzkqVar != null) {
                arrayList.add("style=" + zzkqVar);
            }
            StyledText styledText = this.title;
            if (styledText != null) {
                SizeMode$EnumUnboxingLocalUtility.m("title=", styledText, arrayList);
            }
            Image image = this.picture;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("picture=", image, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CategoryTile{", "}", 0, null, null, 56);
        }

        public final class IconStyle extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<IconStyle> CREATOR;
            public final Icon arcade_icon;
            public final Color background_color;
            public final Image icon;

            static {
                CategoryTileSection$CategoryTile$IconStyle$Companion$ADAPTER$1 categoryTileSection$CategoryTile$IconStyle$Companion$ADAPTER$1 = new CategoryTileSection$CategoryTile$IconStyle$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IconStyle.class), "type.googleapis.com/squareup.cash.shop.rendering.api.CategoryTileSection.CategoryTile.IconStyle", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/CategoryTileSection.proto");
                ADAPTER = categoryTileSection$CategoryTile$IconStyle$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(categoryTileSection$CategoryTile$IconStyle$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IconStyle(Icon icon, Image image, Color color, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.arcade_icon = icon;
                this.icon = image;
                this.background_color = color;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof IconStyle)) {
                    return false;
                }
                IconStyle iconStyle = (IconStyle) obj;
                return Intrinsics.areEqual(unknownFields(), iconStyle.unknownFields()) && Intrinsics.areEqual(this.arcade_icon, iconStyle.arcade_icon) && Intrinsics.areEqual(this.icon, iconStyle.icon) && Intrinsics.areEqual(this.background_color, iconStyle.background_color);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Icon icon = this.arcade_icon;
                int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
                Image image = this.icon;
                int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 37;
                Color color = this.background_color;
                int hashCode4 = hashCode3 + (color != null ? color.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                CardScheme.Builder builder = new CardScheme.Builder(18);
                builder.modules = this.arcade_icon;
                builder.overflow_modules = this.icon;
                builder.card_home_actions = this.background_color;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Icon icon = this.arcade_icon;
                if (icon != null) {
                    Matcher$$ExternalSyntheticOutline0.m("arcade_icon=", icon, arrayList);
                }
                Image image = this.icon;
                if (image != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
                }
                Color color = this.background_color;
                if (color != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "IconStyle{", "}", 0, null, null, 56);
            }

            public /* synthetic */ IconStyle(Image image, Color color) {
                this(null, image, color, ByteString.EMPTY);
            }
        }
    }
}
