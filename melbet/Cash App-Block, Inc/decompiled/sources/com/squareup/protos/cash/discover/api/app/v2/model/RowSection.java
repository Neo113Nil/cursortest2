package com.squareup.protos.cash.discover.api.app.v2.model;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.decode.StaticImageDecoderKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v2.model.Section;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.LoanOption;
import com.squareup.protos.cash.janus.api.ContactAlias;
import com.squareup.protos.franklin.ui.UiAvatar;
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
    public final String id;
    public final Page page;
    public final Text title;

    public final class Item extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Item> CREATOR;
        public final StaticImageDecoderKt item;
        public final String metadata_json;

        static {
            RowSection$Item$Companion$ADAPTER$1 rowSection$Item$Companion$ADAPTER$1 = new RowSection$Item$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Item.class), "type.googleapis.com/squareup.cash.discover.api.app.v2.model.RowSection.Item", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v2/model/section.proto");
            ADAPTER = rowSection$Item$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(rowSection$Item$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Item(StaticImageDecoderKt staticImageDecoderKt, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.item = staticImageDecoderKt;
            this.metadata_json = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.areEqual(unknownFields(), item.unknownFields()) && Intrinsics.areEqual(this.item, item.item) && Intrinsics.areEqual(this.metadata_json, item.metadata_json);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            StaticImageDecoderKt staticImageDecoderKt = this.item;
            int hashCode2 = (hashCode + (staticImageDecoderKt != null ? staticImageDecoderKt.hashCode() : 0)) * 37;
            String str = this.metadata_json;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.Builder builder = new Action.Builder(10);
            builder.f1268type = this.item;
            builder.details = this.metadata_json;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            StaticImageDecoderKt staticImageDecoderKt = this.item;
            if (staticImageDecoderKt != null) {
                arrayList.add("item=" + staticImageDecoderKt);
            }
            String str = this.metadata_json;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "metadata_json=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Item{", "}", 0, null, null, 56);
        }
    }

    public final class Page extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Page> CREATOR;
        public final String cursor;
        public final List items;
        public final Section.Modal warning;

        static {
            RowSection$Page$Companion$ADAPTER$1 rowSection$Page$Companion$ADAPTER$1 = new RowSection$Page$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Page.class), "type.googleapis.com/squareup.cash.discover.api.app.v2.model.RowSection.Page", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v2/model/section.proto");
            ADAPTER = rowSection$Page$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(rowSection$Page$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Page(List list, String str, Section.Modal modal, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.cursor = str;
            this.warning = modal;
            this.items = TransactorKt.immutableCopyOf("items", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Page)) {
                return false;
            }
            Page page = (Page) obj;
            return Intrinsics.areEqual(unknownFields(), page.unknownFields()) && Intrinsics.areEqual(this.items, page.items) && Intrinsics.areEqual(this.cursor, page.cursor) && Intrinsics.areEqual(this.warning, page.warning);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.items);
            String str = this.cursor;
            int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
            Section.Modal modal = this.warning;
            int hashCode2 = hashCode + (modal != null ? modal.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            LoanOption.Builder builder = new LoanOption.Builder(15);
            builder.payment_schedule = this.items;
            builder.loan_type = this.cursor;
            builder.tila_data = this.warning;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.items;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("items=", arrayList, list);
            }
            String str = this.cursor;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cursor=", arrayList);
            }
            Section.Modal modal = this.warning;
            if (modal != null) {
                arrayList.add("warning=" + modal);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Page{", "}", 0, null, null, 56);
        }
    }

    public final class SearchRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SearchRow> CREATOR;
        public final String action_url;
        public final UiAvatar avatar;
        public final String entity_type;
        public final String id;
        public final Boolean is_hidden;
        public final Text subtitle;
        public final Text title;

        static {
            RowSection$SearchRow$Companion$ADAPTER$1 rowSection$SearchRow$Companion$ADAPTER$1 = new RowSection$SearchRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchRow.class), "type.googleapis.com/squareup.cash.discover.api.app.v2.model.RowSection.SearchRow", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v2/model/section.proto");
            ADAPTER = rowSection$SearchRow$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(rowSection$SearchRow$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchRow(String str, UiAvatar uiAvatar, Text text, Text text2, String str2, String str3, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.id = str;
            this.avatar = uiAvatar;
            this.title = text;
            this.subtitle = text2;
            this.action_url = str2;
            this.entity_type = str3;
            this.is_hidden = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SearchRow)) {
                return false;
            }
            SearchRow searchRow = (SearchRow) obj;
            return Intrinsics.areEqual(unknownFields(), searchRow.unknownFields()) && Intrinsics.areEqual(this.id, searchRow.id) && Intrinsics.areEqual(this.avatar, searchRow.avatar) && Intrinsics.areEqual(this.title, searchRow.title) && Intrinsics.areEqual(this.subtitle, searchRow.subtitle) && Intrinsics.areEqual(this.action_url, searchRow.action_url) && Intrinsics.areEqual(this.entity_type, searchRow.entity_type) && Intrinsics.areEqual(this.is_hidden, searchRow.is_hidden);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            UiAvatar uiAvatar = this.avatar;
            int hashCode3 = (hashCode2 + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
            Text text = this.title;
            int hashCode4 = (hashCode3 + (text != null ? text.hashCode() : 0)) * 37;
            Text text2 = this.subtitle;
            int hashCode5 = (hashCode4 + (text2 != null ? text2.hashCode() : 0)) * 37;
            String str2 = this.action_url;
            int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.entity_type;
            int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
            Boolean bool = this.is_hidden;
            int hashCode8 = hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ContactAlias.Builder builder = new ContactAlias.Builder(23, false);
            builder.customer_token = this.id;
            builder.alias_type = this.avatar;
            builder.updated_at = this.title;
            builder.linked_at = this.subtitle;
            builder.alias_value = this.action_url;
            builder.hashed_alias_token = this.entity_type;
            builder.version = this.is_hidden;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
            }
            UiAvatar uiAvatar = this.avatar;
            if (uiAvatar != null) {
                Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
            }
            Text text = this.title;
            if (text != null) {
                arrayList.add("title=" + text);
            }
            Text text2 = this.subtitle;
            if (text2 != null) {
                arrayList.add("subtitle=" + text2);
            }
            if (this.action_url != null) {
                arrayList.add("action_url=██");
            }
            String str2 = this.entity_type;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "entity_type=", arrayList);
            }
            Boolean bool = this.is_hidden;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_hidden=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SearchRow{", "}", 0, null, null, 56);
        }
    }

    static {
        RowSection$Companion$ADAPTER$1 rowSection$Companion$ADAPTER$1 = new RowSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RowSection.class), "type.googleapis.com/squareup.cash.discover.api.app.v2.model.RowSection", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v2/model/section.proto");
        ADAPTER = rowSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(rowSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowSection(Text text, Page page, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = text;
        this.page = page;
        this.id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RowSection)) {
            return false;
        }
        RowSection rowSection = (RowSection) obj;
        return Intrinsics.areEqual(unknownFields(), rowSection.unknownFields()) && Intrinsics.areEqual(this.title, rowSection.title) && Intrinsics.areEqual(this.page, rowSection.page) && Intrinsics.areEqual(this.id, rowSection.id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Text text = this.title;
        int hashCode2 = (hashCode + (text != null ? text.hashCode() : 0)) * 37;
        Page page = this.page;
        int hashCode3 = (hashCode2 + (page != null ? page.hashCode() : 0)) * 37;
        String str = this.id;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder(14);
        builder.loan_type = this.title;
        builder.payment_schedule = this.page;
        builder.tila_data = this.id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Text text = this.title;
        if (text != null) {
            arrayList.add("title=" + text);
        }
        Page page = this.page;
        if (page != null) {
            arrayList.add("page=" + page);
        }
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RowSection{", "}", 0, null, null, 56);
    }
}
