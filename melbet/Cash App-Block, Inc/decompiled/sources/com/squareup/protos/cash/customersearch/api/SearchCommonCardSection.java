package com.squareup.protos.cash.customersearch.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashface.api.TrustsData;
import com.squareup.protos.cash.janus.api.ContactAlias;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
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
public final class SearchCommonCardSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SearchCommonCardSection> CREATOR;
    public final List items;

    public final class SearchCommonCardItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SearchCommonCardItem> CREATOR;
        public final String item_action_url;
        public final Metadata metadata;
        public final Image picture;
        public final Text primary_text;
        public final Text secondary_text;
        public final Text tertiary_left_text;
        public final Text tertiary_right_text;

        static {
            SearchCommonCardSection$SearchCommonCardItem$Companion$ADAPTER$1 searchCommonCardSection$SearchCommonCardItem$Companion$ADAPTER$1 = new SearchCommonCardSection$SearchCommonCardItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchCommonCardItem.class), "type.googleapis.com/squareup.cash.customersearch.api.SearchCommonCardSection.SearchCommonCardItem", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/SearchCommon.proto");
            ADAPTER = searchCommonCardSection$SearchCommonCardItem$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(searchCommonCardSection$SearchCommonCardItem$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchCommonCardItem(Metadata metadata, Image image, Text text, Text text2, Text text3, Text text4, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.metadata = metadata;
            this.picture = image;
            this.primary_text = text;
            this.secondary_text = text2;
            this.tertiary_left_text = text3;
            this.tertiary_right_text = text4;
            this.item_action_url = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SearchCommonCardItem)) {
                return false;
            }
            SearchCommonCardItem searchCommonCardItem = (SearchCommonCardItem) obj;
            return Intrinsics.areEqual(unknownFields(), searchCommonCardItem.unknownFields()) && Intrinsics.areEqual(this.metadata, searchCommonCardItem.metadata) && Intrinsics.areEqual(this.picture, searchCommonCardItem.picture) && Intrinsics.areEqual(this.primary_text, searchCommonCardItem.primary_text) && Intrinsics.areEqual(this.secondary_text, searchCommonCardItem.secondary_text) && Intrinsics.areEqual(this.tertiary_left_text, searchCommonCardItem.tertiary_left_text) && Intrinsics.areEqual(this.tertiary_right_text, searchCommonCardItem.tertiary_right_text) && Intrinsics.areEqual(this.item_action_url, searchCommonCardItem.item_action_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Metadata metadata = this.metadata;
            int hashCode2 = (hashCode + (metadata != null ? metadata.hashCode() : 0)) * 37;
            Image image = this.picture;
            int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 37;
            Text text = this.primary_text;
            int hashCode4 = (hashCode3 + (text != null ? text.hashCode() : 0)) * 37;
            Text text2 = this.secondary_text;
            int hashCode5 = (hashCode4 + (text2 != null ? text2.hashCode() : 0)) * 37;
            Text text3 = this.tertiary_left_text;
            int hashCode6 = (hashCode5 + (text3 != null ? text3.hashCode() : 0)) * 37;
            Text text4 = this.tertiary_right_text;
            int hashCode7 = (hashCode6 + (text4 != null ? text4.hashCode() : 0)) * 37;
            String str = this.item_action_url;
            int hashCode8 = hashCode7 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ContactAlias.Builder builder = new ContactAlias.Builder(17, false);
            builder.alias_value = this.metadata;
            builder.hashed_alias_token = this.picture;
            builder.alias_type = this.primary_text;
            builder.updated_at = this.secondary_text;
            builder.linked_at = this.tertiary_left_text;
            builder.version = this.tertiary_right_text;
            builder.customer_token = this.item_action_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Metadata metadata = this.metadata;
            if (metadata != null) {
                arrayList.add("metadata=" + metadata);
            }
            Image image = this.picture;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("picture=", image, arrayList);
            }
            Text text = this.primary_text;
            if (text != null) {
                SizeMode$EnumUnboxingLocalUtility.m("primary_text=", text, arrayList);
            }
            Text text2 = this.secondary_text;
            if (text2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("secondary_text=", text2, arrayList);
            }
            Text text3 = this.tertiary_left_text;
            if (text3 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("tertiary_left_text=", text3, arrayList);
            }
            Text text4 = this.tertiary_right_text;
            if (text4 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("tertiary_right_text=", text4, arrayList);
            }
            if (this.item_action_url != null) {
                arrayList.add("item_action_url=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SearchCommonCardItem{", "}", 0, null, null, 56);
        }
    }

    static {
        SearchCommonCardSection$Companion$ADAPTER$1 searchCommonCardSection$Companion$ADAPTER$1 = new SearchCommonCardSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchCommonCardSection.class), "type.googleapis.com/squareup.cash.customersearch.api.SearchCommonCardSection", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/SearchCommon.proto");
        ADAPTER = searchCommonCardSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(searchCommonCardSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCommonCardSection(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.items = TransactorKt.immutableCopyOf("items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchCommonCardSection)) {
            return false;
        }
        SearchCommonCardSection searchCommonCardSection = (SearchCommonCardSection) obj;
        return Intrinsics.areEqual(unknownFields(), searchCommonCardSection.unknownFields()) && Intrinsics.areEqual(this.items, searchCommonCardSection.items);
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
        TrustsData.Builder builder = new TrustsData.Builder(28);
        builder.trust = this.items;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.items;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("items=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchCommonCardSection{", "}", 0, null, null, 56);
    }
}
