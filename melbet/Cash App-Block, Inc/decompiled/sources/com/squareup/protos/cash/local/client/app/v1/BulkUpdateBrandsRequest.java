package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.Group;
import com.squareup.protos.cash.local.client.app.v1.BulkUpdateBrandsRequest;
import com.squareup.protos.cash.pools.Instrument;
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
public final class BulkUpdateBrandsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BulkUpdateBrandsRequest> CREATOR;
    public final List add_requests;
    public final List remove_requests;
    public final RequestContext request_context;

    /* loaded from: classes7.dex */
    public final class AddBrandRequest extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AddBrandRequest> CREATOR;
        public final String brand_token;

        static {
            BulkUpdateBrandsRequest$AddBrandRequest$Companion$ADAPTER$1 bulkUpdateBrandsRequest$AddBrandRequest$Companion$ADAPTER$1 = new BulkUpdateBrandsRequest$AddBrandRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AddBrandRequest.class), "type.googleapis.com/squareup.cash.local.client.app.v1.BulkUpdateBrandsRequest.AddBrandRequest", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/cash_app_local_client_app_service.proto");
            ADAPTER = bulkUpdateBrandsRequest$AddBrandRequest$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(bulkUpdateBrandsRequest$AddBrandRequest$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddBrandRequest(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            str.getClass();
            byteString.getClass();
            this.brand_token = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AddBrandRequest)) {
                return false;
            }
            AddBrandRequest addBrandRequest = (AddBrandRequest) obj;
            return Intrinsics.areEqual(unknownFields(), addBrandRequest.unknownFields()) && Intrinsics.areEqual(this.brand_token, addBrandRequest.brand_token);
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
            Instrument.Builder builder = new Instrument.Builder(5);
            builder.token = this.brand_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.brand_token, "brand_token=", arrayList);
            return CollectionsKt.joinToString$default(arrayList, ", ", "AddBrandRequest{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes7.dex */
    public final class RemoveBrandRequest extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RemoveBrandRequest> CREATOR;
        public final String brand_token;

        static {
            BulkUpdateBrandsRequest$RemoveBrandRequest$Companion$ADAPTER$1 bulkUpdateBrandsRequest$RemoveBrandRequest$Companion$ADAPTER$1 = new BulkUpdateBrandsRequest$RemoveBrandRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RemoveBrandRequest.class), "type.googleapis.com/squareup.cash.local.client.app.v1.BulkUpdateBrandsRequest.RemoveBrandRequest", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/cash_app_local_client_app_service.proto");
            ADAPTER = bulkUpdateBrandsRequest$RemoveBrandRequest$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(bulkUpdateBrandsRequest$RemoveBrandRequest$Companion$ADAPTER$1);
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
            Instrument.Builder builder = new Instrument.Builder(6);
            builder.token = this.brand_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.brand_token, "brand_token=", arrayList);
            return CollectionsKt.joinToString$default(arrayList, ", ", "RemoveBrandRequest{", "}", 0, null, null, 56);
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BulkUpdateBrandsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.app.v1.BulkUpdateBrandsRequest$Companion$ADAPTER$1
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
                        return new BulkUpdateBrandsRequest((RequestContext) obj, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        m.add(BulkUpdateBrandsRequest.AddBrandRequest.ADAPTER.decode(protoReader));
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        arrayList.add(BulkUpdateBrandsRequest.RemoveBrandRequest.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                BulkUpdateBrandsRequest bulkUpdateBrandsRequest = (BulkUpdateBrandsRequest) obj;
                reverseProtoWriter.getClass();
                bulkUpdateBrandsRequest.getClass();
                reverseProtoWriter.writeBytes(bulkUpdateBrandsRequest.unknownFields());
                BulkUpdateBrandsRequest.RemoveBrandRequest.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, bulkUpdateBrandsRequest.remove_requests);
                BulkUpdateBrandsRequest.AddBrandRequest.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, bulkUpdateBrandsRequest.add_requests);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bulkUpdateBrandsRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                BulkUpdateBrandsRequest bulkUpdateBrandsRequest = (BulkUpdateBrandsRequest) obj;
                bulkUpdateBrandsRequest.getClass();
                return BulkUpdateBrandsRequest.RemoveBrandRequest.ADAPTER.asRepeated().encodedSizeWithTag(3, bulkUpdateBrandsRequest.remove_requests) + BulkUpdateBrandsRequest.AddBrandRequest.ADAPTER.asRepeated().encodedSizeWithTag(2, bulkUpdateBrandsRequest.add_requests) + RequestContext.ADAPTER.encodedSizeWithTag(1, bulkUpdateBrandsRequest.request_context) + bulkUpdateBrandsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                BulkUpdateBrandsRequest bulkUpdateBrandsRequest = (BulkUpdateBrandsRequest) obj;
                bulkUpdateBrandsRequest.getClass();
                RequestContext requestContext = bulkUpdateBrandsRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(bulkUpdateBrandsRequest.add_requests, BulkUpdateBrandsRequest.AddBrandRequest.ADAPTER);
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(bulkUpdateBrandsRequest.remove_requests, BulkUpdateBrandsRequest.RemoveBrandRequest.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new BulkUpdateBrandsRequest(requestContext2, m1169redactElements, m1169redactElements2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                BulkUpdateBrandsRequest bulkUpdateBrandsRequest = (BulkUpdateBrandsRequest) obj;
                bulkUpdateBrandsRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, bulkUpdateBrandsRequest.request_context);
                BulkUpdateBrandsRequest.AddBrandRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, bulkUpdateBrandsRequest.add_requests);
                BulkUpdateBrandsRequest.RemoveBrandRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, bulkUpdateBrandsRequest.remove_requests);
                protoWriter.writeBytes(bulkUpdateBrandsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkUpdateBrandsRequest(RequestContext requestContext, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.request_context = requestContext;
        this.add_requests = TransactorKt.immutableCopyOf("add_requests", list);
        this.remove_requests = TransactorKt.immutableCopyOf("remove_requests", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BulkUpdateBrandsRequest)) {
            return false;
        }
        BulkUpdateBrandsRequest bulkUpdateBrandsRequest = (BulkUpdateBrandsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), bulkUpdateBrandsRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, bulkUpdateBrandsRequest.request_context) && Intrinsics.areEqual(this.add_requests, bulkUpdateBrandsRequest.add_requests) && Intrinsics.areEqual(this.remove_requests, bulkUpdateBrandsRequest.remove_requests);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = this.remove_requests.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37, 37, this.add_requests);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder();
        builder.name = this.request_context;
        builder.participants = this.add_requests;
        builder.group_image = this.remove_requests;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        List list = this.add_requests;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("add_requests=", arrayList, list);
        }
        List list2 = this.remove_requests;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("remove_requests=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BulkUpdateBrandsRequest{", "}", 0, null, null, 56);
    }
}
