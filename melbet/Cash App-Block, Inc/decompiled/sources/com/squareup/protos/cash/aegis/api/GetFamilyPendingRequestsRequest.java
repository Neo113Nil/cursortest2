package com.squareup.protos.cash.aegis.api;

import android.os.Parcelable;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.aegis.api.GetFamilyPendingRequestsRequest;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetFamilyPendingRequestsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetFamilyPendingRequestsRequest> CREATOR;
    public final RequestType request_type;

    /* loaded from: classes7.dex */
    public enum RequestType implements WireEnum {
        REQUESTS(1),
        INVITATIONS(2);

        public final int value;
        public static final Edge.Companion Companion = new Edge.Companion(14);
        public static final GetFamilyPendingRequestsRequest$RequestType$Companion$ADAPTER$1 ADAPTER = new GetFamilyPendingRequestsRequest$RequestType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RequestType.class), Syntax.PROTO_2, null);

        RequestType(int i) {
            this.value = i;
        }

        public static final RequestType fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return REQUESTS;
            }
            if (i != 2) {
                return null;
            }
            return INVITATIONS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetFamilyPendingRequestsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.aegis.api.GetFamilyPendingRequestsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetFamilyPendingRequestsRequest((GetFamilyPendingRequestsRequest.RequestType) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = GetFamilyPendingRequestsRequest.RequestType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetFamilyPendingRequestsRequest getFamilyPendingRequestsRequest = (GetFamilyPendingRequestsRequest) obj;
                reverseProtoWriter.getClass();
                getFamilyPendingRequestsRequest.getClass();
                reverseProtoWriter.writeBytes(getFamilyPendingRequestsRequest.unknownFields());
                GetFamilyPendingRequestsRequest.RequestType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getFamilyPendingRequestsRequest.request_type);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetFamilyPendingRequestsRequest getFamilyPendingRequestsRequest = (GetFamilyPendingRequestsRequest) obj;
                getFamilyPendingRequestsRequest.getClass();
                return GetFamilyPendingRequestsRequest.RequestType.ADAPTER.encodedSizeWithTag(1, getFamilyPendingRequestsRequest.request_type) + getFamilyPendingRequestsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetFamilyPendingRequestsRequest getFamilyPendingRequestsRequest = (GetFamilyPendingRequestsRequest) obj;
                getFamilyPendingRequestsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                GetFamilyPendingRequestsRequest.RequestType requestType = getFamilyPendingRequestsRequest.request_type;
                byteString.getClass();
                return new GetFamilyPendingRequestsRequest(requestType, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetFamilyPendingRequestsRequest getFamilyPendingRequestsRequest = (GetFamilyPendingRequestsRequest) obj;
                getFamilyPendingRequestsRequest.getClass();
                GetFamilyPendingRequestsRequest.RequestType.ADAPTER.encodeWithTag(protoWriter, 1, getFamilyPendingRequestsRequest.request_type);
                protoWriter.writeBytes(getFamilyPendingRequestsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFamilyPendingRequestsRequest(RequestType requestType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_type = requestType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetFamilyPendingRequestsRequest)) {
            return false;
        }
        GetFamilyPendingRequestsRequest getFamilyPendingRequestsRequest = (GetFamilyPendingRequestsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getFamilyPendingRequestsRequest.unknownFields()) && this.request_type == getFamilyPendingRequestsRequest.request_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestType requestType = this.request_type;
        int hashCode2 = hashCode + (requestType != null ? requestType.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(16);
        builder.f1245type = this.request_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestType requestType = this.request_type;
        if (requestType != null) {
            arrayList.add("request_type=" + requestType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFamilyPendingRequestsRequest{", "}", 0, null, null, 56);
    }
}
