package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.local.client.app.v1.BulkAddBrandsRequest;
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
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class BulkAddBrandsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BulkAddBrandsRequest> CREATOR;
    public final RequestContext request_context;
    public final List requests;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BulkAddBrandsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.app.v1.BulkAddBrandsRequest$Companion$ADAPTER$1
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
                        return new BulkAddBrandsRequest((RequestContext) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.add(BulkAddBrandsRequest.AddBrandRequest.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                BulkAddBrandsRequest bulkAddBrandsRequest = (BulkAddBrandsRequest) obj;
                reverseProtoWriter.getClass();
                bulkAddBrandsRequest.getClass();
                reverseProtoWriter.writeBytes(bulkAddBrandsRequest.unknownFields());
                BulkAddBrandsRequest.AddBrandRequest.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, bulkAddBrandsRequest.requests);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bulkAddBrandsRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                BulkAddBrandsRequest bulkAddBrandsRequest = (BulkAddBrandsRequest) obj;
                bulkAddBrandsRequest.getClass();
                return BulkAddBrandsRequest.AddBrandRequest.ADAPTER.asRepeated().encodedSizeWithTag(2, bulkAddBrandsRequest.requests) + RequestContext.ADAPTER.encodedSizeWithTag(1, bulkAddBrandsRequest.request_context) + bulkAddBrandsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                BulkAddBrandsRequest bulkAddBrandsRequest = (BulkAddBrandsRequest) obj;
                bulkAddBrandsRequest.getClass();
                RequestContext requestContext = bulkAddBrandsRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(bulkAddBrandsRequest.requests, BulkAddBrandsRequest.AddBrandRequest.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new BulkAddBrandsRequest(requestContext2, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                BulkAddBrandsRequest bulkAddBrandsRequest = (BulkAddBrandsRequest) obj;
                bulkAddBrandsRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, bulkAddBrandsRequest.request_context);
                BulkAddBrandsRequest.AddBrandRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, bulkAddBrandsRequest.requests);
                protoWriter.writeBytes(bulkAddBrandsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkAddBrandsRequest(RequestContext requestContext, List list, ByteString byteString) {
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
        if (!(obj instanceof BulkAddBrandsRequest)) {
            return false;
        }
        BulkAddBrandsRequest bulkAddBrandsRequest = (BulkAddBrandsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), bulkAddBrandsRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, bulkAddBrandsRequest.request_context) && Intrinsics.areEqual(this.requests, bulkAddBrandsRequest.requests);
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
        InviteContactsRequest.Builder builder = new InviteContactsRequest.Builder(4);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "BulkAddBrandsRequest{", "}", 0, null, null, 56);
    }

    /* loaded from: classes7.dex */
    public final class AddBrandRequest extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AddBrandRequest> CREATOR;
        public final String brand_token;
        public final String location_token;

        static {
            BulkAddBrandsRequest$AddBrandRequest$Companion$ADAPTER$1 bulkAddBrandsRequest$AddBrandRequest$Companion$ADAPTER$1 = new BulkAddBrandsRequest$AddBrandRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AddBrandRequest.class), "type.googleapis.com/squareup.cash.local.client.app.v1.BulkAddBrandsRequest.AddBrandRequest", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/cash_app_local_client_app_service.proto");
            ADAPTER = bulkAddBrandsRequest$AddBrandRequest$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(bulkAddBrandsRequest$AddBrandRequest$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddBrandRequest(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            str.getClass();
            byteString.getClass();
            this.brand_token = str;
            this.location_token = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AddBrandRequest)) {
                return false;
            }
            AddBrandRequest addBrandRequest = (AddBrandRequest) obj;
            return Intrinsics.areEqual(unknownFields(), addBrandRequest.unknownFields()) && Intrinsics.areEqual(this.brand_token, addBrandRequest.brand_token) && Intrinsics.areEqual(this.location_token, addBrandRequest.location_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.brand_token);
            String str = this.location_token;
            int hashCode = m + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            FullName.Builder builder = new FullName.Builder(12);
            builder.given_name = this.brand_token;
            builder.family_name = this.location_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.brand_token, "brand_token=", arrayList);
            String str = this.location_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "location_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AddBrandRequest{", "}", 0, null, null, 56);
        }

        public /* synthetic */ AddBrandRequest(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }
    }

    public BulkAddBrandsRequest(List list) {
        this(null, list, ByteString.EMPTY);
    }
}
