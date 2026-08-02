package com.squareup.protos.cash.discover.api.app.v1.model;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.grantly.api.SandboxMetadata;
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
public final class CardSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardSection> CREATOR;
    public final List items;

    public final class CardItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CardItem> CREATOR;
        public final String item_action_url;
        public final ItemMetadata metadata;
        public final Image picture;
        public final Text subtitle;
        public final Text title;

        static {
            CardSection$CardItem$Companion$ADAPTER$1 cardSection$CardItem$Companion$ADAPTER$1 = new CardSection$CardItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardItem.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.CardSection.CardItem", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/sections.proto");
            ADAPTER = cardSection$CardItem$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardSection$CardItem$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardItem(ItemMetadata itemMetadata, Image image, Text text, Text text2, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.metadata = itemMetadata;
            this.picture = image;
            this.title = text;
            this.subtitle = text2;
            this.item_action_url = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CardItem)) {
                return false;
            }
            CardItem cardItem = (CardItem) obj;
            return Intrinsics.areEqual(unknownFields(), cardItem.unknownFields()) && Intrinsics.areEqual(this.metadata, cardItem.metadata) && Intrinsics.areEqual(this.picture, cardItem.picture) && Intrinsics.areEqual(this.title, cardItem.title) && Intrinsics.areEqual(this.subtitle, cardItem.subtitle) && Intrinsics.areEqual(this.item_action_url, cardItem.item_action_url);
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
            Text text = this.title;
            int hashCode4 = (hashCode3 + (text != null ? text.hashCode() : 0)) * 37;
            Text text2 = this.subtitle;
            int hashCode5 = (hashCode4 + (text2 != null ? text2.hashCode() : 0)) * 37;
            String str = this.item_action_url;
            int hashCode6 = hashCode5 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Text.Builder builder = new Text.Builder(3);
            builder.text_style = this.metadata;
            builder.icon = this.picture;
            builder.text_decoration = this.title;
            builder.text_color = this.subtitle;
            builder.text = this.item_action_url;
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
            return CollectionsKt.joinToString$default(arrayList, ", ", "CardItem{", "}", 0, null, null, 56);
        }
    }

    static {
        CardSection$Companion$ADAPTER$1 cardSection$Companion$ADAPTER$1 = new CardSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardSection.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.CardSection", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/sections.proto");
        ADAPTER = cardSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSection(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.items = TransactorKt.immutableCopyOf("items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardSection)) {
            return false;
        }
        CardSection cardSection = (CardSection) obj;
        return Intrinsics.areEqual(unknownFields(), cardSection.unknownFields()) && Intrinsics.areEqual(this.items, cardSection.items);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.items.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SandboxMetadata.Builder builder = new SandboxMetadata.Builder(9, false);
        builder.scenarios = this.items;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.items;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("items=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardSection{", "}", 0, null, null, 56);
    }
}
