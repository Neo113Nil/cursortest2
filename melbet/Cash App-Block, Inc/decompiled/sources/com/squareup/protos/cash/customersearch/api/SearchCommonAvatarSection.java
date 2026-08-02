package com.squareup.protos.cash.customersearch.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashface.api.TrustsData;
import com.squareup.protos.cash.grantly.api.LoanOption;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
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
public final class SearchCommonAvatarSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SearchCommonAvatarSection> CREATOR;
    public final List items;

    public final class SearchCommonAvatarItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SearchCommonAvatarItem> CREATOR;
        public final Avatar avatar;
        public final Metadata metadata;
        public final Text title;

        static {
            SearchCommonAvatarSection$SearchCommonAvatarItem$Companion$ADAPTER$1 searchCommonAvatarSection$SearchCommonAvatarItem$Companion$ADAPTER$1 = new SearchCommonAvatarSection$SearchCommonAvatarItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchCommonAvatarItem.class), "type.googleapis.com/squareup.cash.customersearch.api.SearchCommonAvatarSection.SearchCommonAvatarItem", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/SearchCommon.proto");
            ADAPTER = searchCommonAvatarSection$SearchCommonAvatarItem$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(searchCommonAvatarSection$SearchCommonAvatarItem$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchCommonAvatarItem(Metadata metadata, Avatar avatar, Text text, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.metadata = metadata;
            this.avatar = avatar;
            this.title = text;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SearchCommonAvatarItem)) {
                return false;
            }
            SearchCommonAvatarItem searchCommonAvatarItem = (SearchCommonAvatarItem) obj;
            return Intrinsics.areEqual(unknownFields(), searchCommonAvatarItem.unknownFields()) && Intrinsics.areEqual(this.metadata, searchCommonAvatarItem.metadata) && Intrinsics.areEqual(this.avatar, searchCommonAvatarItem.avatar) && Intrinsics.areEqual(this.title, searchCommonAvatarItem.title);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Metadata metadata = this.metadata;
            int hashCode2 = (hashCode + (metadata != null ? metadata.hashCode() : 0)) * 37;
            Avatar avatar = this.avatar;
            int hashCode3 = (hashCode2 + (avatar != null ? avatar.hashCode() : 0)) * 37;
            Text text = this.title;
            int hashCode4 = hashCode3 + (text != null ? text.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            LoanOption.Builder builder = new LoanOption.Builder(5);
            builder.loan_type = this.metadata;
            builder.payment_schedule = this.avatar;
            builder.tila_data = this.title;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Metadata metadata = this.metadata;
            if (metadata != null) {
                arrayList.add("metadata=" + metadata);
            }
            Avatar avatar = this.avatar;
            if (avatar != null) {
                arrayList.add("avatar=" + avatar);
            }
            Text text = this.title;
            if (text != null) {
                SizeMode$EnumUnboxingLocalUtility.m("title=", text, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SearchCommonAvatarItem{", "}", 0, null, null, 56);
        }
    }

    static {
        SearchCommonAvatarSection$Companion$ADAPTER$1 searchCommonAvatarSection$Companion$ADAPTER$1 = new SearchCommonAvatarSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchCommonAvatarSection.class), "type.googleapis.com/squareup.cash.customersearch.api.SearchCommonAvatarSection", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/SearchCommon.proto");
        ADAPTER = searchCommonAvatarSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(searchCommonAvatarSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCommonAvatarSection(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.items = TransactorKt.immutableCopyOf("items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchCommonAvatarSection)) {
            return false;
        }
        SearchCommonAvatarSection searchCommonAvatarSection = (SearchCommonAvatarSection) obj;
        return Intrinsics.areEqual(unknownFields(), searchCommonAvatarSection.unknownFields()) && Intrinsics.areEqual(this.items, searchCommonAvatarSection.items);
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
        TrustsData.Builder builder = new TrustsData.Builder(27);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchCommonAvatarSection{", "}", 0, null, null, 56);
    }
}
