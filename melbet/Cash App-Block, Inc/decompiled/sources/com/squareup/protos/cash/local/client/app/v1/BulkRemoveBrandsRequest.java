package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.app.v1.BulkRemoveBrandsRequest;
import com.squareup.protos.cash.pools.Instrument;
import com.squareup.protos.franklin.app.InviteContactsRequest;
import com.squareup.protos.franklin.common.RequestContext;
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
public final class BulkRemoveBrandsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BulkRemoveBrandsRequest> CREATOR;
    public final RequestContext request_context;
    public final List requests;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BulkRemoveBrandsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.app.v1.BulkRemoveBrandsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new BulkRemoveBrandsRequest((RequestContext) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.add(BulkRemoveBrandsRequest.RemoveBrandRequest.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                BulkRemoveBrandsRequest bulkRemoveBrandsRequest = (BulkRemoveBrandsRequest) obj;
                reverseProtoWriter.getClass();
                bulkRemoveBrandsRequest.getClass();
                reverseProtoWriter.writeBytes(bulkRemoveBrandsRequest.unknownFields());
                BulkRemoveBrandsRequest.RemoveBrandRequest.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, bulkRemoveBrandsRequest.requests);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bulkRemoveBrandsRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                BulkRemoveBrandsRequest bulkRemoveBrandsRequest = (BulkRemoveBrandsRequest) obj;
                bulkRemoveBrandsRequest.getClass();
                return BulkRemoveBrandsRequest.RemoveBrandRequest.ADAPTER.asRepeated().encodedSizeWithTag(2, bulkRemoveBrandsRequest.requests) + RequestContext.ADAPTER.encodedSizeWithTag(1, bulkRemoveBrandsRequest.request_context) + bulkRemoveBrandsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                BulkRemoveBrandsRequest bulkRemoveBrandsRequest = (BulkRemoveBrandsRequest) obj;
                bulkRemoveBrandsRequest.getClass();
                RequestContext requestContext = bulkRemoveBrandsRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(bulkRemoveBrandsRequest.requests, BulkRemoveBrandsRequest.RemoveBrandRequest.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new BulkRemoveBrandsRequest(requestContext2, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                BulkRemoveBrandsRequest bulkRemoveBrandsRequest = (BulkRemoveBrandsRequest) obj;
                bulkRemoveBrandsRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, bulkRemoveBrandsRequest.request_context);
                BulkRemoveBrandsRequest.RemoveBrandRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, bulkRemoveBrandsRequest.requests);
                protoWriter.writeBytes(bulkRemoveBrandsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkRemoveBrandsRequest(RequestContext requestContext, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.requests = TransactorKt.immutableCopyOf("requests", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BulkRemoveBrandsRequest)) {
            return false;
        }
        BulkRemoveBrandsRequest bulkRemoveBrandsRequest = (BulkRemoveBrandsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), bulkRemoveBrandsRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, bulkRemoveBrandsRequest.request_context) && Intrinsics.areEqual(this.requests, bulkRemoveBrandsRequest.requests);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = this.requests.hashCode() + ((hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InviteContactsRequest.Builder builder = new InviteContactsRequest.Builder(5);
        builder.request_context = this.request_context;
        builder.email_addresses = this.requests;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        List list = this.requests;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("requests=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BulkRemoveBrandsRequest{", "}", 0, null, null, 56);
    }

    /* loaded from: classes7.dex */
    public final class RemoveBrandRequest extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RemoveBrandRequest> CREATOR;
        public final String brand_token;

        static {
            BulkRemoveBrandsRequest$RemoveBrandRequest$Companion$ADAPTER$1 bulkRemoveBrandsRequest$RemoveBrandRequest$Companion$ADAPTER$1 = new BulkRemoveBrandsRequest$RemoveBrandRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RemoveBrandRequest.class), "type.googleapis.com/squareup.cash.local.client.app.v1.BulkRemoveBrandsRequest.RemoveBrandRequest", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/cash_app_local_client_app_service.proto");
            ADAPTER = bulkRemoveBrandsRequest$RemoveBrandRequest$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(bulkRemoveBrandsRequest$RemoveBrandRequest$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoveBrandRequest(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            str.getClass();
            byteString.getClass();
            this.brand_token = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RemoveBrandRequest)) {
                return false;
            }
            RemoveBrandRequest removeBrandRequest = (RemoveBrandRequest) obj;
            return Intrinsics.areEqual(unknownFields(), removeBrandRequest.unknownFields()) && Intrinsics.areEqual(this.brand_token, removeBrandRequest.brand_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.brand_token.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Instrument.Builder builder = new Instrument.Builder(4);
            builder.token = this.brand_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.brand_token, "brand_token=", arrayList);
            return CollectionsKt.joinToString$default(arrayList, ", ", "RemoveBrandRequest{", "}", 0, null, null, 56);
        }

        public /* synthetic */ RemoveBrandRequest(String str) {
            this(str, ByteString.EMPTY);
        }
    }

    public BulkRemoveBrandsRequest(List list) {
        this(null, list, ByteString.EMPTY);
    }
}
