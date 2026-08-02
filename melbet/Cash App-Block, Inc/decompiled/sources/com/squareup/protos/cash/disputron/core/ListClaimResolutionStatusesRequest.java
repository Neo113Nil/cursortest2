package com.squareup.protos.cash.disputron.core;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.disputron.Pagination;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ListClaimResolutionStatusesRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ListClaimResolutionStatusesRequest> CREATOR;
    public final String customer_token;
    public final Pagination pagination;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ListClaimResolutionStatusesRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.disputron.core.ListClaimResolutionStatusesRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ListClaimResolutionStatusesRequest((Pagination) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(Pagination.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ListClaimResolutionStatusesRequest listClaimResolutionStatusesRequest = (ListClaimResolutionStatusesRequest) obj;
                reverseProtoWriter.getClass();
                listClaimResolutionStatusesRequest.getClass();
                reverseProtoWriter.writeBytes(listClaimResolutionStatusesRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, listClaimResolutionStatusesRequest.customer_token);
                Pagination.ADAPTER.encodeWithTag(reverseProtoWriter, 1, listClaimResolutionStatusesRequest.pagination);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ListClaimResolutionStatusesRequest listClaimResolutionStatusesRequest = (ListClaimResolutionStatusesRequest) obj;
                listClaimResolutionStatusesRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(2, listClaimResolutionStatusesRequest.customer_token) + Pagination.ADAPTER.encodedSizeWithTag(1, listClaimResolutionStatusesRequest.pagination) + listClaimResolutionStatusesRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ListClaimResolutionStatusesRequest listClaimResolutionStatusesRequest = (ListClaimResolutionStatusesRequest) obj;
                listClaimResolutionStatusesRequest.getClass();
                Pagination pagination = listClaimResolutionStatusesRequest.pagination;
                Pagination pagination2 = pagination != null ? (Pagination) Pagination.ADAPTER.redact(pagination) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = listClaimResolutionStatusesRequest.customer_token;
                byteString.getClass();
                return new ListClaimResolutionStatusesRequest(pagination2, str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ListClaimResolutionStatusesRequest listClaimResolutionStatusesRequest = (ListClaimResolutionStatusesRequest) obj;
                listClaimResolutionStatusesRequest.getClass();
                Pagination.ADAPTER.encodeWithTag(protoWriter, 1, listClaimResolutionStatusesRequest.pagination);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, listClaimResolutionStatusesRequest.customer_token);
                protoWriter.writeBytes(listClaimResolutionStatusesRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListClaimResolutionStatusesRequest(Pagination pagination, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.pagination = pagination;
        this.customer_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListClaimResolutionStatusesRequest)) {
            return false;
        }
        ListClaimResolutionStatusesRequest listClaimResolutionStatusesRequest = (ListClaimResolutionStatusesRequest) obj;
        return Intrinsics.areEqual(unknownFields(), listClaimResolutionStatusesRequest.unknownFields()) && Intrinsics.areEqual(this.pagination, listClaimResolutionStatusesRequest.pagination) && Intrinsics.areEqual(this.customer_token, listClaimResolutionStatusesRequest.customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Pagination pagination = this.pagination;
        int hashCode2 = (hashCode + (pagination != null ? pagination.hashCode() : 0)) * 37;
        String str = this.customer_token;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(12);
        builder.f1268type = this.pagination;
        builder.details = this.customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Pagination pagination = this.pagination;
        if (pagination != null) {
            arrayList.add("pagination=" + pagination);
        }
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListClaimResolutionStatusesRequest{", "}", 0, null, null, 56);
    }
}
