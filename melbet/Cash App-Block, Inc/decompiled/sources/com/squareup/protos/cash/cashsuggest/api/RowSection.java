package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashface.api.TrustsData;
import com.squareup.protos.cash.janus.api.ContactAlias;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
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
public final class RowSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RowSection> CREATOR;
    public final List items;

    public final class RowItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RowItem> CREATOR;
        public final Button action_button;
        public final Avatar avatar;
        public final Text header;
        public final String item_action_url;
        public final ItemMetadata metadata;
        public final Text subtitle;
        public final Text title;

        static {
            RowSection$RowItem$Companion$ADAPTER$1 rowSection$RowItem$Companion$ADAPTER$1 = new RowSection$RowItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RowItem.class), "type.googleapis.com/squareup.cash.cashsuggest.api.RowSection.RowItem", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/Common.proto");
            ADAPTER = rowSection$RowItem$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(rowSection$RowItem$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RowItem(ItemMetadata itemMetadata, Avatar avatar, Text text, Text text2, Text text3, String str, Button button, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.metadata = itemMetadata;
            this.avatar = avatar;
            this.header = text;
            this.title = text2;
            this.subtitle = text3;
            this.item_action_url = str;
            this.action_button = button;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RowItem)) {
                return false;
            }
            RowItem rowItem = (RowItem) obj;
            return Intrinsics.areEqual(unknownFields(), rowItem.unknownFields()) && Intrinsics.areEqual(this.metadata, rowItem.metadata) && Intrinsics.areEqual(this.avatar, rowItem.avatar) && Intrinsics.areEqual(this.header, rowItem.header) && Intrinsics.areEqual(this.title, rowItem.title) && Intrinsics.areEqual(this.subtitle, rowItem.subtitle) && Intrinsics.areEqual(this.item_action_url, rowItem.item_action_url) && Intrinsics.areEqual(this.action_button, rowItem.action_button);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ItemMetadata itemMetadata = this.metadata;
            int hashCode2 = (hashCode + (itemMetadata != null ? itemMetadata.hashCode() : 0)) * 37;
            Avatar avatar = this.avatar;
            int hashCode3 = (hashCode2 + (avatar != null ? avatar.hashCode() : 0)) * 37;
            Text text = this.header;
            int hashCode4 = (hashCode3 + (text != null ? text.hashCode() : 0)) * 37;
            Text text2 = this.title;
            int hashCode5 = (hashCode4 + (text2 != null ? text2.hashCode() : 0)) * 37;
            Text text3 = this.subtitle;
            int hashCode6 = (hashCode5 + (text3 != null ? text3.hashCode() : 0)) * 37;
            String str = this.item_action_url;
            int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 37;
            Button button = this.action_button;
            int hashCode8 = hashCode7 + (button != null ? button.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ContactAlias.Builder builder = new ContactAlias.Builder(13, false);
            builder.alias_value = this.metadata;
            builder.hashed_alias_token = this.avatar;
            builder.alias_type = this.header;
            builder.updated_at = this.title;
            builder.linked_at = this.subtitle;
            builder.customer_token = this.item_action_url;
            builder.version = this.action_button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            ItemMetadata itemMetadata = this.metadata;
            if (itemMetadata != null) {
                arrayList.add("metadata=" + itemMetadata);
            }
            Avatar avatar = this.avatar;
            if (avatar != null) {
                arrayList.add("avatar=" + avatar);
            }
            Text text = this.header;
            if (text != null) {
                SizeMode$EnumUnboxingLocalUtility.m("header=", text, arrayList);
            }
            Text text2 = this.title;
            if (text2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("title=", text2, arrayList);
            }
            Text text3 = this.subtitle;
            if (text3 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("subtitle=", text3, arrayList);
            }
            if (this.item_action_url != null) {
                arrayList.add("item_action_url=██");
            }
            Button button = this.action_button;
            if (button != null) {
                arrayList.add("action_button=" + button);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RowItem{", "}", 0, null, null, 56);
        }
    }

    static {
        RowSection$Companion$ADAPTER$1 rowSection$Companion$ADAPTER$1 = new RowSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RowSection.class), "type.googleapis.com/squareup.cash.cashsuggest.api.RowSection", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/Common.proto");
        ADAPTER = rowSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(rowSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowSection(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.items = TransactorKt.immutableCopyOf("items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RowSection)) {
            return false;
        }
        RowSection rowSection = (RowSection) obj;
        return Intrinsics.areEqual(unknownFields(), rowSection.unknownFields()) && Intrinsics.areEqual(this.items, rowSection.items);
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
        TrustsData.Builder builder = new TrustsData.Builder(18);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "RowSection{", "}", 0, null, null, 56);
    }
}
