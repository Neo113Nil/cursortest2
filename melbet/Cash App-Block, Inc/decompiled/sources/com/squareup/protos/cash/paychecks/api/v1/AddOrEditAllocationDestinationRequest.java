package com.squareup.protos.cash.paychecks.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.paychecks.api.v1.DisablePaycheckAllocationRequest;
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
public final class AddOrEditAllocationDestinationRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddOrEditAllocationDestinationRequest> CREATOR;
    public final AllocationDestination allocation_destination;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AddOrEditAllocationDestinationRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.paychecks.api.v1.AddOrEditAllocationDestinationRequest$Companion$ADAPTER$1
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
                        return new AddOrEditAllocationDestinationRequest((RequestContext) obj, (AllocationDestination) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                AddOrEditAllocationDestinationRequest addOrEditAllocationDestinationRequest = (AddOrEditAllocationDestinationRequest) obj;
                reverseProtoWriter.getClass();
                addOrEditAllocationDestinationRequest.getClass();
                reverseProtoWriter.writeBytes(addOrEditAllocationDestinationRequest.unknownFields());
                AllocationDestination.ADAPTER.encodeWithTag(reverseProtoWriter, 2, addOrEditAllocationDestinationRequest.allocation_destination);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, addOrEditAllocationDestinationRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                AddOrEditAllocationDestinationRequest addOrEditAllocationDestinationRequest = (AddOrEditAllocationDestinationRequest) obj;
                addOrEditAllocationDestinationRequest.getClass();
                return AllocationDestination.ADAPTER.encodedSizeWithTag(2, addOrEditAllocationDestinationRequest.allocation_destination) + RequestContext.ADAPTER.encodedSizeWithTag(1, addOrEditAllocationDestinationRequest.request_context) + addOrEditAllocationDestinationRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                AddOrEditAllocationDestinationRequest addOrEditAllocationDestinationRequest = (AddOrEditAllocationDestinationRequest) obj;
                addOrEditAllocationDestinationRequest.getClass();
                RequestContext requestContext = addOrEditAllocationDestinationRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                AllocationDestination allocationDestination = addOrEditAllocationDestinationRequest.allocation_destination;
                AllocationDestination allocationDestination2 = allocationDestination != null ? (AllocationDestination) AllocationDestination.ADAPTER.redact(allocationDestination) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new AddOrEditAllocationDestinationRequest(requestContext2, allocationDestination2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AddOrEditAllocationDestinationRequest addOrEditAllocationDestinationRequest = (AddOrEditAllocationDestinationRequest) obj;
                addOrEditAllocationDestinationRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, addOrEditAllocationDestinationRequest.request_context);
                AllocationDestination.ADAPTER.encodeWithTag(protoWriter, 2, addOrEditAllocationDestinationRequest.allocation_destination);
                protoWriter.writeBytes(addOrEditAllocationDestinationRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddOrEditAllocationDestinationRequest(RequestContext requestContext, AllocationDestination allocationDestination, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.allocation_destination = allocationDestination;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddOrEditAllocationDestinationRequest)) {
            return false;
        }
        AddOrEditAllocationDestinationRequest addOrEditAllocationDestinationRequest = (AddOrEditAllocationDestinationRequest) obj;
        return Intrinsics.areEqual(unknownFields(), addOrEditAllocationDestinationRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, addOrEditAllocationDestinationRequest.request_context) && Intrinsics.areEqual(this.allocation_destination, addOrEditAllocationDestinationRequest.allocation_destination);
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
        DisablePaycheckAllocationRequest.Builder builder = new DisablePaycheckAllocationRequest.Builder(1);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "AddOrEditAllocationDestinationRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ AddOrEditAllocationDestinationRequest(RequestContext requestContext, AllocationDestination allocationDestination) {
        this(requestContext, allocationDestination, ByteString.EMPTY);
    }
}
