package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.protos.cash.cashsuggest.api.OffersTabSearchRequest;
import com.squareup.protos.cash.janus.api.ContactAlias;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class OffersTabSearchRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OffersTabSearchRequest> CREATOR;
    public final String filters_tokens;
    public final String pagination_token;
    public final List recently_viewed;
    public final List recently_viewed_tokens;
    public final String search_flow_token;
    public final String search_text;
    public final String shop_flow_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OffersTabSearchRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashsuggest.api.OffersTabSearchRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new OffersTabSearchRequest((String) obj, (String) obj2, (String) obj3, m, arrayList, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            obj4 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            m.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            obj5 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            arrayList.add(OffersTabSearchRequest.RecentlyViewed.ADAPTER.decode(protoReader));
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                OffersTabSearchRequest offersTabSearchRequest = (OffersTabSearchRequest) obj;
                reverseProtoWriter.getClass();
                offersTabSearchRequest.getClass();
                reverseProtoWriter.writeBytes(offersTabSearchRequest.unknownFields());
                OffersTabSearchRequest.RecentlyViewed.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, offersTabSearchRequest.recently_viewed);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, offersTabSearchRequest.pagination_token);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 5, offersTabSearchRequest.recently_viewed_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, offersTabSearchRequest.filters_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, offersTabSearchRequest.search_flow_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, offersTabSearchRequest.shop_flow_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, offersTabSearchRequest.search_text);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                OffersTabSearchRequest offersTabSearchRequest = (OffersTabSearchRequest) obj;
                offersTabSearchRequest.getClass();
                int size$okio = offersTabSearchRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return OffersTabSearchRequest.RecentlyViewed.ADAPTER.asRepeated().encodedSizeWithTag(7, offersTabSearchRequest.recently_viewed) + protoAdapter2.encodedSizeWithTag(6, offersTabSearchRequest.pagination_token) + protoAdapter2.asRepeated().encodedSizeWithTag(5, offersTabSearchRequest.recently_viewed_tokens) + protoAdapter2.encodedSizeWithTag(4, offersTabSearchRequest.filters_tokens) + protoAdapter2.encodedSizeWithTag(3, offersTabSearchRequest.search_flow_token) + protoAdapter2.encodedSizeWithTag(2, offersTabSearchRequest.shop_flow_token) + protoAdapter2.encodedSizeWithTag(1, offersTabSearchRequest.search_text) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                OffersTabSearchRequest offersTabSearchRequest = (OffersTabSearchRequest) obj;
                offersTabSearchRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(offersTabSearchRequest.recently_viewed, OffersTabSearchRequest.RecentlyViewed.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = offersTabSearchRequest.search_text;
                String str2 = offersTabSearchRequest.shop_flow_token;
                String str3 = offersTabSearchRequest.search_flow_token;
                String str4 = offersTabSearchRequest.filters_tokens;
                List list = offersTabSearchRequest.recently_viewed_tokens;
                String str5 = offersTabSearchRequest.pagination_token;
                list.getClass();
                byteString.getClass();
                return new OffersTabSearchRequest(str, str2, str3, list, m1169redactElements, str4, str5, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                OffersTabSearchRequest offersTabSearchRequest = (OffersTabSearchRequest) obj;
                offersTabSearchRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, offersTabSearchRequest.search_text);
                protoAdapter2.encodeWithTag(protoWriter, 2, offersTabSearchRequest.shop_flow_token);
                protoAdapter2.encodeWithTag(protoWriter, 3, offersTabSearchRequest.search_flow_token);
                protoAdapter2.encodeWithTag(protoWriter, 4, offersTabSearchRequest.filters_tokens);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, offersTabSearchRequest.recently_viewed_tokens);
                protoAdapter2.encodeWithTag(protoWriter, 6, offersTabSearchRequest.pagination_token);
                OffersTabSearchRequest.RecentlyViewed.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, offersTabSearchRequest.recently_viewed);
                protoWriter.writeBytes(offersTabSearchRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersTabSearchRequest(String str, String str2, String str3, List list, List list2, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.search_text = str;
        this.shop_flow_token = str2;
        this.search_flow_token = str3;
        this.filters_tokens = str4;
        this.pagination_token = str5;
        this.recently_viewed_tokens = TransactorKt.immutableCopyOf("recently_viewed_tokens", list);
        this.recently_viewed = TransactorKt.immutableCopyOf("recently_viewed", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OffersTabSearchRequest)) {
            return false;
        }
        OffersTabSearchRequest offersTabSearchRequest = (OffersTabSearchRequest) obj;
        return Intrinsics.areEqual(unknownFields(), offersTabSearchRequest.unknownFields()) && Intrinsics.areEqual(this.search_text, offersTabSearchRequest.search_text) && Intrinsics.areEqual(this.shop_flow_token, offersTabSearchRequest.shop_flow_token) && Intrinsics.areEqual(this.search_flow_token, offersTabSearchRequest.search_flow_token) && Intrinsics.areEqual(this.filters_tokens, offersTabSearchRequest.filters_tokens) && Intrinsics.areEqual(this.recently_viewed_tokens, offersTabSearchRequest.recently_viewed_tokens) && Intrinsics.areEqual(this.pagination_token, offersTabSearchRequest.pagination_token) && Intrinsics.areEqual(this.recently_viewed, offersTabSearchRequest.recently_viewed);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.search_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.shop_flow_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.search_flow_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.filters_tokens;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37, 37, this.recently_viewed_tokens);
        String str5 = this.pagination_token;
        int hashCode5 = this.recently_viewed.hashCode() + ((m + (str5 != null ? str5.hashCode() : 0)) * 37);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ContactAlias.Builder builder = new ContactAlias.Builder(12);
        builder.customer_token = this.search_text;
        builder.alias_value = this.shop_flow_token;
        builder.hashed_alias_token = this.search_flow_token;
        builder.alias_type = this.filters_tokens;
        builder.updated_at = this.recently_viewed_tokens;
        builder.linked_at = this.pagination_token;
        builder.version = this.recently_viewed;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.search_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "search_text=", arrayList);
        }
        String str2 = this.shop_flow_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "shop_flow_token=", arrayList);
        }
        String str3 = this.search_flow_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "search_flow_token=", arrayList);
        }
        String str4 = this.filters_tokens;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "filters_tokens=", arrayList);
        }
        List list = this.recently_viewed_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("recently_viewed_tokens=", arrayList, list);
        }
        String str5 = this.pagination_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "pagination_token=", arrayList);
        }
        List list2 = this.recently_viewed;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("recently_viewed=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OffersTabSearchRequest{", "}", 0, null, null, 56);
    }

    /* loaded from: classes7.dex */
    public final class RecentlyViewed extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RecentlyViewed> CREATOR;
        public final String business_token;
        public final EngagedItemToken engaged_token;
        public final Long last_updated_at_ms;

        static {
            OffersTabSearchRequest$RecentlyViewed$Companion$ADAPTER$1 offersTabSearchRequest$RecentlyViewed$Companion$ADAPTER$1 = new OffersTabSearchRequest$RecentlyViewed$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecentlyViewed.class), "type.googleapis.com/squareup.cash.cashsuggest.api.OffersTabSearchRequest.RecentlyViewed", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/OffersTabSearch.proto");
            ADAPTER = offersTabSearchRequest$RecentlyViewed$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(offersTabSearchRequest$RecentlyViewed$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecentlyViewed(String str, Long l, EngagedItemToken engagedItemToken, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.business_token = str;
            this.last_updated_at_ms = l;
            this.engaged_token = engagedItemToken;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RecentlyViewed)) {
                return false;
            }
            RecentlyViewed recentlyViewed = (RecentlyViewed) obj;
            return Intrinsics.areEqual(unknownFields(), recentlyViewed.unknownFields()) && Intrinsics.areEqual(this.business_token, recentlyViewed.business_token) && Intrinsics.areEqual(this.last_updated_at_ms, recentlyViewed.last_updated_at_ms) && Intrinsics.areEqual(this.engaged_token, recentlyViewed.engaged_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.business_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Long l = this.last_updated_at_ms;
            int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            EngagedItemToken engagedItemToken = this.engaged_token;
            int hashCode4 = hashCode3 + (engagedItemToken != null ? engagedItemToken.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Row.Builder builder = new Row.Builder(27);
            builder.title = this.business_token;
            builder.subtitle = this.last_updated_at_ms;
            builder.action = this.engaged_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.business_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "business_token=", arrayList);
            }
            Long l = this.last_updated_at_ms;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("last_updated_at_ms=", l, arrayList);
            }
            EngagedItemToken engagedItemToken = this.engaged_token;
            if (engagedItemToken != null) {
                arrayList.add("engaged_token=" + engagedItemToken);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RecentlyViewed{", "}", 0, null, null, 56);
        }

        public /* synthetic */ RecentlyViewed(String str, Long l, EngagedItemToken engagedItemToken) {
            this(str, l, engagedItemToken, ByteString.EMPTY);
        }
    }
}
