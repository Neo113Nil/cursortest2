package com.squareup.protos.cash.customersearch.api;

import android.os.Parcelable;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.composer.app.Asset;
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
public final class SearchCommonPlaceholderSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SearchCommonPlaceholderSection> CREATOR;
    public final Identifier identifier;

    public enum Identifier implements WireEnum {
        RECENTLY_VIEWED(1),
        RECENT_SEARCHES(2),
        ZERO_SEARCH_RESULTS(3);

        public final int value;
        public static final RadioType.Companion Companion = new RadioType.Companion();
        public static final SearchCommonPlaceholderSection$Identifier$Companion$ADAPTER$1 ADAPTER = new SearchCommonPlaceholderSection$Identifier$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Identifier.class), Syntax.PROTO_2, null);

        Identifier(int i) {
            this.value = i;
        }

        public static final Identifier fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return RECENTLY_VIEWED;
            }
            if (i == 2) {
                return RECENT_SEARCHES;
            }
            if (i != 3) {
                return null;
            }
            return ZERO_SEARCH_RESULTS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SearchCommonPlaceholderSection$Companion$ADAPTER$1 searchCommonPlaceholderSection$Companion$ADAPTER$1 = new SearchCommonPlaceholderSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchCommonPlaceholderSection.class), "type.googleapis.com/squareup.cash.customersearch.api.SearchCommonPlaceholderSection", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/SearchCommon.proto");
        ADAPTER = searchCommonPlaceholderSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(searchCommonPlaceholderSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCommonPlaceholderSection(Identifier identifier, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.identifier = identifier;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchCommonPlaceholderSection)) {
            return false;
        }
        SearchCommonPlaceholderSection searchCommonPlaceholderSection = (SearchCommonPlaceholderSection) obj;
        return Intrinsics.areEqual(unknownFields(), searchCommonPlaceholderSection.unknownFields()) && this.identifier == searchCommonPlaceholderSection.identifier;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Identifier identifier = this.identifier;
        int hashCode2 = hashCode + (identifier != null ? identifier.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Asset.Builder builder = new Asset.Builder(8);
        builder.asset_type = this.identifier;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Identifier identifier = this.identifier;
        if (identifier != null) {
            arrayList.add("identifier=" + identifier);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchCommonPlaceholderSection{", "}", 0, null, null, 56);
    }
}
