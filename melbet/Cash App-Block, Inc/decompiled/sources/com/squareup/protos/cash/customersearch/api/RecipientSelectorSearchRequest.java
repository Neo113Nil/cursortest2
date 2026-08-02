package com.squareup.protos.cash.customersearch.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.janus.api.ContactAlias;
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
public final class RecipientSelectorSearchRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RecipientSelectorSearchRequest> CREATOR;
    public final List client_candidates;
    public final String external_id;
    public final List local_favorite_tokens;
    public final List local_synced_customer_tokens;
    public final String search_text;
    public final Boolean server_reranking;
    public final Boolean should_exclude_blocked_customers;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RecipientSelectorSearchRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new RecipientSelectorSearchRequest((String) obj, (String) obj2, (Boolean) obj3, m, arrayList, arrayList2, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            m.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            arrayList2.add(ClientCandidate.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            obj4 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                RecipientSelectorSearchRequest recipientSelectorSearchRequest = (RecipientSelectorSearchRequest) obj;
                reverseProtoWriter.getClass();
                recipientSelectorSearchRequest.getClass();
                reverseProtoWriter.writeBytes(recipientSelectorSearchRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 7, recipientSelectorSearchRequest.server_reranking);
                ClientCandidate.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, recipientSelectorSearchRequest.client_candidates);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.asRepeated().encodeWithTag(reverseProtoWriter, 5, recipientSelectorSearchRequest.local_synced_customer_tokens);
                protoAdapter3.asRepeated().encodeWithTag(reverseProtoWriter, 4, recipientSelectorSearchRequest.local_favorite_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, recipientSelectorSearchRequest.should_exclude_blocked_customers);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 2, recipientSelectorSearchRequest.external_id);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 1, recipientSelectorSearchRequest.search_text);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                RecipientSelectorSearchRequest recipientSelectorSearchRequest = (RecipientSelectorSearchRequest) obj;
                recipientSelectorSearchRequest.getClass();
                int size$okio = recipientSelectorSearchRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(2, recipientSelectorSearchRequest.external_id) + protoAdapter2.encodedSizeWithTag(1, recipientSelectorSearchRequest.search_text) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                return protoAdapter3.encodedSizeWithTag(7, recipientSelectorSearchRequest.server_reranking) + ClientCandidate.ADAPTER.asRepeated().encodedSizeWithTag(6, recipientSelectorSearchRequest.client_candidates) + protoAdapter2.asRepeated().encodedSizeWithTag(5, recipientSelectorSearchRequest.local_synced_customer_tokens) + protoAdapter2.asRepeated().encodedSizeWithTag(4, recipientSelectorSearchRequest.local_favorite_tokens) + protoAdapter3.encodedSizeWithTag(3, recipientSelectorSearchRequest.should_exclude_blocked_customers) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                RecipientSelectorSearchRequest recipientSelectorSearchRequest = (RecipientSelectorSearchRequest) obj;
                recipientSelectorSearchRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(recipientSelectorSearchRequest.client_candidates, ClientCandidate.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = recipientSelectorSearchRequest.external_id;
                Boolean bool = recipientSelectorSearchRequest.should_exclude_blocked_customers;
                List list = recipientSelectorSearchRequest.local_favorite_tokens;
                List list2 = recipientSelectorSearchRequest.local_synced_customer_tokens;
                Boolean bool2 = recipientSelectorSearchRequest.server_reranking;
                list.getClass();
                list2.getClass();
                byteString.getClass();
                return new RecipientSelectorSearchRequest(null, str, bool, list, list2, m1169redactElements, bool2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                RecipientSelectorSearchRequest recipientSelectorSearchRequest = (RecipientSelectorSearchRequest) obj;
                recipientSelectorSearchRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, recipientSelectorSearchRequest.search_text);
                protoAdapter2.encodeWithTag(protoWriter, 2, recipientSelectorSearchRequest.external_id);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(protoWriter, 3, recipientSelectorSearchRequest.should_exclude_blocked_customers);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, recipientSelectorSearchRequest.local_favorite_tokens);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, recipientSelectorSearchRequest.local_synced_customer_tokens);
                ClientCandidate.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, recipientSelectorSearchRequest.client_candidates);
                protoAdapter3.encodeWithTag(protoWriter, 7, recipientSelectorSearchRequest.server_reranking);
                protoWriter.writeBytes(recipientSelectorSearchRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipientSelectorSearchRequest(String str, String str2, Boolean bool, List list, List list2, List list3, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.search_text = str;
        this.external_id = str2;
        this.should_exclude_blocked_customers = bool;
        this.server_reranking = bool2;
        this.local_favorite_tokens = TransactorKt.immutableCopyOf("local_favorite_tokens", list);
        this.local_synced_customer_tokens = TransactorKt.immutableCopyOf("local_synced_customer_tokens", list2);
        this.client_candidates = TransactorKt.immutableCopyOf("client_candidates", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecipientSelectorSearchRequest)) {
            return false;
        }
        RecipientSelectorSearchRequest recipientSelectorSearchRequest = (RecipientSelectorSearchRequest) obj;
        return Intrinsics.areEqual(unknownFields(), recipientSelectorSearchRequest.unknownFields()) && Intrinsics.areEqual(this.search_text, recipientSelectorSearchRequest.search_text) && Intrinsics.areEqual(this.external_id, recipientSelectorSearchRequest.external_id) && Intrinsics.areEqual(this.should_exclude_blocked_customers, recipientSelectorSearchRequest.should_exclude_blocked_customers) && Intrinsics.areEqual(this.local_favorite_tokens, recipientSelectorSearchRequest.local_favorite_tokens) && Intrinsics.areEqual(this.local_synced_customer_tokens, recipientSelectorSearchRequest.local_synced_customer_tokens) && Intrinsics.areEqual(this.client_candidates, recipientSelectorSearchRequest.client_candidates) && Intrinsics.areEqual(this.server_reranking, recipientSelectorSearchRequest.server_reranking);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.search_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.external_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool = this.should_exclude_blocked_customers;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.local_favorite_tokens), 37, this.local_synced_customer_tokens), 37, this.client_candidates);
        Boolean bool2 = this.server_reranking;
        int hashCode4 = m + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ContactAlias.Builder builder = new ContactAlias.Builder(16);
        builder.customer_token = this.search_text;
        builder.alias_value = this.external_id;
        builder.hashed_alias_token = this.should_exclude_blocked_customers;
        builder.alias_type = this.local_favorite_tokens;
        builder.updated_at = this.local_synced_customer_tokens;
        builder.linked_at = this.client_candidates;
        builder.version = this.server_reranking;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.search_text != null) {
            arrayList.add("search_text=██");
        }
        String str = this.external_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "external_id=", arrayList);
        }
        Boolean bool = this.should_exclude_blocked_customers;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("should_exclude_blocked_customers=", bool, arrayList);
        }
        List list = this.local_favorite_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("local_favorite_tokens=", arrayList, list);
        }
        List list2 = this.local_synced_customer_tokens;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("local_synced_customer_tokens=", arrayList, list2);
        }
        List list3 = this.client_candidates;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("client_candidates=", arrayList, list3);
        }
        Boolean bool2 = this.server_reranking;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("server_reranking=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecipientSelectorSearchRequest{", "}", 0, null, null, 56);
    }
}
