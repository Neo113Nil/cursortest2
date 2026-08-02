package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.local.client.v1.BatchGetLocationStatusRequest;
import com.squareup.protos.cash.money.content.MoneyTab;
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
public final class BatchGetLocationStatusRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BatchGetLocationStatusRequest> CREATOR;
    public final List requests;

    /* loaded from: classes7.dex */
    public final class GetLocationStatusRequest extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<GetLocationStatusRequest> CREATOR;
        public final String brand_token;
        public final String location_token;

        static {
            BatchGetLocationStatusRequest$GetLocationStatusRequest$Companion$ADAPTER$1 batchGetLocationStatusRequest$GetLocationStatusRequest$Companion$ADAPTER$1 = new BatchGetLocationStatusRequest$GetLocationStatusRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetLocationStatusRequest.class), "type.googleapis.com/squareup.cash.local.client.v1.BatchGetLocationStatusRequest.GetLocationStatusRequest", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = batchGetLocationStatusRequest$GetLocationStatusRequest$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(batchGetLocationStatusRequest$GetLocationStatusRequest$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetLocationStatusRequest(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.brand_token = str;
            this.location_token = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetLocationStatusRequest)) {
                return false;
            }
            GetLocationStatusRequest getLocationStatusRequest = (GetLocationStatusRequest) obj;
            return Intrinsics.areEqual(unknownFields(), getLocationStatusRequest.unknownFields()) && Intrinsics.areEqual(this.brand_token, getLocationStatusRequest.brand_token) && Intrinsics.areEqual(this.location_token, getLocationStatusRequest.location_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.brand_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.location_token;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            FullName.Builder builder = new FullName.Builder(15);
            builder.given_name = this.brand_token;
            builder.family_name = this.location_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.brand_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "brand_token=", arrayList);
            }
            String str2 = this.location_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "location_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "GetLocationStatusRequest{", "}", 0, null, null, 56);
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BatchGetLocationStatusRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.v1.BatchGetLocationStatusRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new BatchGetLocationStatusRequest(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(BatchGetLocationStatusRequest.GetLocationStatusRequest.ADAPTER.decode(protoReader));
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                BatchGetLocationStatusRequest batchGetLocationStatusRequest = (BatchGetLocationStatusRequest) obj;
                reverseProtoWriter.getClass();
                batchGetLocationStatusRequest.getClass();
                reverseProtoWriter.writeBytes(batchGetLocationStatusRequest.unknownFields());
                BatchGetLocationStatusRequest.GetLocationStatusRequest.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, batchGetLocationStatusRequest.requests);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                BatchGetLocationStatusRequest batchGetLocationStatusRequest = (BatchGetLocationStatusRequest) obj;
                batchGetLocationStatusRequest.getClass();
                return BatchGetLocationStatusRequest.GetLocationStatusRequest.ADAPTER.asRepeated().encodedSizeWithTag(1, batchGetLocationStatusRequest.requests) + batchGetLocationStatusRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                BatchGetLocationStatusRequest batchGetLocationStatusRequest = (BatchGetLocationStatusRequest) obj;
                batchGetLocationStatusRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(batchGetLocationStatusRequest.requests, BatchGetLocationStatusRequest.GetLocationStatusRequest.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new BatchGetLocationStatusRequest(m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                BatchGetLocationStatusRequest batchGetLocationStatusRequest = (BatchGetLocationStatusRequest) obj;
                batchGetLocationStatusRequest.getClass();
                BatchGetLocationStatusRequest.GetLocationStatusRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchGetLocationStatusRequest.requests);
                protoWriter.writeBytes(batchGetLocationStatusRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchGetLocationStatusRequest(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.requests = TransactorKt.immutableCopyOf("requests", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BatchGetLocationStatusRequest)) {
            return false;
        }
        BatchGetLocationStatusRequest batchGetLocationStatusRequest = (BatchGetLocationStatusRequest) obj;
        return Intrinsics.areEqual(unknownFields(), batchGetLocationStatusRequest.unknownFields()) && Intrinsics.areEqual(this.requests, batchGetLocationStatusRequest.requests);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.requests.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        MoneyTab.Builder builder = new MoneyTab.Builder(4);
        builder.applets = this.requests;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.requests;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("requests=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BatchGetLocationStatusRequest{", "}", 0, null, null, 56);
    }
}
