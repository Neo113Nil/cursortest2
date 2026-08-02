package com.squareup.protos.cash.paychecks.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import squareup.cash.paychecks.AllocationDestination;

/* loaded from: classes.dex */
public final class DisablePaycheckAllocationRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DisablePaycheckAllocationRequest> CREATOR;
    public final AllocationDestination allocation_destination;
    public final RequestContext request_context;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public AllocationDestination allocation_destination;
        public RequestContext request_context;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new DisablePaycheckAllocationRequest(this.request_context, this.allocation_destination, buildUnknownFields());
                default:
                    return new AddOrEditAllocationDestinationRequest(this.request_context, this.allocation_destination, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DisablePaycheckAllocationRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.paychecks.api.v1.DisablePaycheckAllocationRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
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
                        return new DisablePaycheckAllocationRequest((RequestContext) obj, (AllocationDestination) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(AllocationDestination.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                DisablePaycheckAllocationRequest disablePaycheckAllocationRequest = (DisablePaycheckAllocationRequest) obj;
                reverseProtoWriter.getClass();
                disablePaycheckAllocationRequest.getClass();
                reverseProtoWriter.writeBytes(disablePaycheckAllocationRequest.unknownFields());
                AllocationDestination.ADAPTER.encodeWithTag(reverseProtoWriter, 2, disablePaycheckAllocationRequest.allocation_destination);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, disablePaycheckAllocationRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                DisablePaycheckAllocationRequest disablePaycheckAllocationRequest = (DisablePaycheckAllocationRequest) obj;
                disablePaycheckAllocationRequest.getClass();
                return AllocationDestination.ADAPTER.encodedSizeWithTag(2, disablePaycheckAllocationRequest.allocation_destination) + RequestContext.ADAPTER.encodedSizeWithTag(1, disablePaycheckAllocationRequest.request_context) + disablePaycheckAllocationRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                DisablePaycheckAllocationRequest disablePaycheckAllocationRequest = (DisablePaycheckAllocationRequest) obj;
                disablePaycheckAllocationRequest.getClass();
                RequestContext requestContext = disablePaycheckAllocationRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                AllocationDestination allocationDestination = disablePaycheckAllocationRequest.allocation_destination;
                AllocationDestination allocationDestination2 = allocationDestination != null ? (AllocationDestination) AllocationDestination.ADAPTER.redact(allocationDestination) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new DisablePaycheckAllocationRequest(requestContext2, allocationDestination2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                DisablePaycheckAllocationRequest disablePaycheckAllocationRequest = (DisablePaycheckAllocationRequest) obj;
                disablePaycheckAllocationRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, disablePaycheckAllocationRequest.request_context);
                AllocationDestination.ADAPTER.encodeWithTag(protoWriter, 2, disablePaycheckAllocationRequest.allocation_destination);
                protoWriter.writeBytes(disablePaycheckAllocationRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisablePaycheckAllocationRequest(RequestContext requestContext, AllocationDestination allocationDestination, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.allocation_destination = allocationDestination;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DisablePaycheckAllocationRequest)) {
            return false;
        }
        DisablePaycheckAllocationRequest disablePaycheckAllocationRequest = (DisablePaycheckAllocationRequest) obj;
        return Intrinsics.areEqual(unknownFields(), disablePaycheckAllocationRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, disablePaycheckAllocationRequest.request_context) && Intrinsics.areEqual(this.allocation_destination, disablePaycheckAllocationRequest.allocation_destination);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        AllocationDestination allocationDestination = this.allocation_destination;
        int hashCode3 = hashCode2 + (allocationDestination != null ? allocationDestination.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.request_context = this.request_context;
        builder.allocation_destination = this.allocation_destination;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        AllocationDestination allocationDestination = this.allocation_destination;
        if (allocationDestination != null) {
            arrayList.add("allocation_destination=" + allocationDestination);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisablePaycheckAllocationRequest{", "}", 0, null, null, 56);
    }
}
