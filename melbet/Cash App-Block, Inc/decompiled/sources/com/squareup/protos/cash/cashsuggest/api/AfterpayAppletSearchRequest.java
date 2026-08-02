package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletSearchRequest;
import com.squareup.protos.cash.composer.app.Card;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.franklin.app.SyncContactsRequest;
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
public final class AfterpayAppletSearchRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AfterpayAppletSearchRequest> CREATOR;
    public final List filter_tokens;
    public final List recently_viewed;
    public final String search_text;

    /* loaded from: classes7.dex */
    public final class RecentlyViewed extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RecentlyViewed> CREATOR;
        public final EngagedItemToken engaged_token;
        public final Long last_updated_at_ms;

        static {
            AfterpayAppletSearchRequest$RecentlyViewed$Companion$ADAPTER$1 afterpayAppletSearchRequest$RecentlyViewed$Companion$ADAPTER$1 = new AfterpayAppletSearchRequest$RecentlyViewed$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecentlyViewed.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayAppletSearchRequest.RecentlyViewed", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletSearch.proto");
            ADAPTER = afterpayAppletSearchRequest$RecentlyViewed$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayAppletSearchRequest$RecentlyViewed$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecentlyViewed(Long l, EngagedItemToken engagedItemToken, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
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
            return Intrinsics.areEqual(unknownFields(), recentlyViewed.unknownFields()) && Intrinsics.areEqual(this.last_updated_at_ms, recentlyViewed.last_updated_at_ms) && Intrinsics.areEqual(this.engaged_token, recentlyViewed.engaged_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.last_updated_at_ms;
            int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            EngagedItemToken engagedItemToken = this.engaged_token;
            int hashCode3 = hashCode2 + (engagedItemToken != null ? engagedItemToken.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Card.Builder builder = new Card.Builder(13);
            builder.image_url = this.last_updated_at_ms;
            builder.asset = this.engaged_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
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
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AfterpayAppletSearchRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashsuggest.api.AfterpayAppletSearchRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new AfterpayAppletSearchRequest((String) obj, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        arrayList.add(AfterpayAppletSearchRequest.RecentlyViewed.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                AfterpayAppletSearchRequest afterpayAppletSearchRequest = (AfterpayAppletSearchRequest) obj;
                reverseProtoWriter.getClass();
                afterpayAppletSearchRequest.getClass();
                reverseProtoWriter.writeBytes(afterpayAppletSearchRequest.unknownFields());
                AfterpayAppletSearchRequest.RecentlyViewed.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, afterpayAppletSearchRequest.recently_viewed);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 2, afterpayAppletSearchRequest.filter_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, afterpayAppletSearchRequest.search_text);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                AfterpayAppletSearchRequest afterpayAppletSearchRequest = (AfterpayAppletSearchRequest) obj;
                afterpayAppletSearchRequest.getClass();
                int size$okio = afterpayAppletSearchRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return AfterpayAppletSearchRequest.RecentlyViewed.ADAPTER.asRepeated().encodedSizeWithTag(3, afterpayAppletSearchRequest.recently_viewed) + protoAdapter2.asRepeated().encodedSizeWithTag(2, afterpayAppletSearchRequest.filter_tokens) + protoAdapter2.encodedSizeWithTag(1, afterpayAppletSearchRequest.search_text) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                AfterpayAppletSearchRequest afterpayAppletSearchRequest = (AfterpayAppletSearchRequest) obj;
                afterpayAppletSearchRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(afterpayAppletSearchRequest.recently_viewed, AfterpayAppletSearchRequest.RecentlyViewed.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = afterpayAppletSearchRequest.search_text;
                List list = afterpayAppletSearchRequest.filter_tokens;
                list.getClass();
                byteString.getClass();
                return new AfterpayAppletSearchRequest(str, list, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AfterpayAppletSearchRequest afterpayAppletSearchRequest = (AfterpayAppletSearchRequest) obj;
                afterpayAppletSearchRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, afterpayAppletSearchRequest.search_text);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 2, afterpayAppletSearchRequest.filter_tokens);
                AfterpayAppletSearchRequest.RecentlyViewed.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, afterpayAppletSearchRequest.recently_viewed);
                protoWriter.writeBytes(afterpayAppletSearchRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayAppletSearchRequest(String str, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.search_text = str;
        this.filter_tokens = TransactorKt.immutableCopyOf("filter_tokens", list);
        this.recently_viewed = TransactorKt.immutableCopyOf("recently_viewed", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletSearchRequest)) {
            return false;
        }
        AfterpayAppletSearchRequest afterpayAppletSearchRequest = (AfterpayAppletSearchRequest) obj;
        return Intrinsics.areEqual(unknownFields(), afterpayAppletSearchRequest.unknownFields()) && Intrinsics.areEqual(this.search_text, afterpayAppletSearchRequest.search_text) && Intrinsics.areEqual(this.filter_tokens, afterpayAppletSearchRequest.filter_tokens) && Intrinsics.areEqual(this.recently_viewed, afterpayAppletSearchRequest.recently_viewed);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.search_text;
        int hashCode2 = this.recently_viewed.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.filter_tokens);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SyncContactsRequest.Builder builder = new SyncContactsRequest.Builder(4);
        builder.sync_token = this.search_text;
        builder.add_hashed_aliases = this.filter_tokens;
        builder.remove_hashed_aliases = this.recently_viewed;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.search_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "search_text=", arrayList);
        }
        List list = this.filter_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("filter_tokens=", arrayList, list);
        }
        List list2 = this.recently_viewed;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("recently_viewed=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AfterpayAppletSearchRequest{", "}", 0, null, null, 56);
    }
}
