package com.squareup.protos.cash.customersearch.api;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashface.api.Banner;
import com.squareup.protos.cash.cashface.api.Trust;
import com.squareup.protos.cash.p2p.profile_directory.ui.HighlightText;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SearchCommonTextRowItem extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SearchCommonTextRowItem> CREATOR;
    public final String action_url;
    public final Image icon;
    public final Metadata metadata;
    public final HighlightText text;

    public final class Metadata extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Metadata> CREATOR;
        public final String search_text;

        static {
            SearchCommonTextRowItem$Metadata$Companion$ADAPTER$1 searchCommonTextRowItem$Metadata$Companion$ADAPTER$1 = new SearchCommonTextRowItem$Metadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Metadata.class), "type.googleapis.com/squareup.cash.customersearch.api.SearchCommonTextRowItem.Metadata", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/SearchCommon.proto");
            ADAPTER = searchCommonTextRowItem$Metadata$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(searchCommonTextRowItem$Metadata$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Metadata(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.search_text = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            return Intrinsics.areEqual(unknownFields(), metadata.unknownFields()) && Intrinsics.areEqual(this.search_text, metadata.search_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.search_text;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Banner.Builder builder = new Banner.Builder(25);
            builder.banner_color = this.search_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.search_text != null) {
                arrayList.add("search_text=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Metadata{", "}", 0, null, null, 56);
        }
    }

    static {
        SearchCommonTextRowItem$Companion$ADAPTER$1 searchCommonTextRowItem$Companion$ADAPTER$1 = new SearchCommonTextRowItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchCommonTextRowItem.class), "type.googleapis.com/squareup.cash.customersearch.api.SearchCommonTextRowItem", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/SearchCommon.proto");
        ADAPTER = searchCommonTextRowItem$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(searchCommonTextRowItem$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCommonTextRowItem(Metadata metadata, HighlightText highlightText, Image image, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.metadata = metadata;
        this.text = highlightText;
        this.icon = image;
        this.action_url = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchCommonTextRowItem)) {
            return false;
        }
        SearchCommonTextRowItem searchCommonTextRowItem = (SearchCommonTextRowItem) obj;
        return Intrinsics.areEqual(unknownFields(), searchCommonTextRowItem.unknownFields()) && Intrinsics.areEqual(this.metadata, searchCommonTextRowItem.metadata) && Intrinsics.areEqual(this.text, searchCommonTextRowItem.text) && Intrinsics.areEqual(this.icon, searchCommonTextRowItem.icon) && Intrinsics.areEqual(this.action_url, searchCommonTextRowItem.action_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Metadata metadata = this.metadata;
        int hashCode2 = (hashCode + (metadata != null ? metadata.hashCode() : 0)) * 37;
        HighlightText highlightText = this.text;
        int hashCode3 = (hashCode2 + (highlightText != null ? highlightText.hashCode() : 0)) * 37;
        Image image = this.icon;
        int hashCode4 = (hashCode3 + (image != null ? image.hashCode() : 0)) * 37;
        String str = this.action_url;
        int hashCode5 = hashCode4 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(28, false);
        builder.enabled = this.metadata;
        builder.id = this.text;
        builder.icon = this.icon;
        builder.title = this.action_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Metadata metadata = this.metadata;
        if (metadata != null) {
            arrayList.add("metadata=" + metadata);
        }
        HighlightText highlightText = this.text;
        if (highlightText != null) {
            arrayList.add("text=" + highlightText);
        }
        Image image = this.icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
        }
        if (this.action_url != null) {
            arrayList.add("action_url=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchCommonTextRowItem{", "}", 0, null, null, 56);
    }
}
