package com.squareup.protos.cash.disputron.core;

import android.os.Parcelable;
import com.squareup.protos.cash.cashlimitsxp.api.v1.Empty;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetClaimResolutionStatisticsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetClaimResolutionStatisticsRequest> CREATOR;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetClaimResolutionStatisticsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.disputron.core.GetClaimResolutionStatisticsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetClaimResolutionStatisticsRequest(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    protoReader.readUnknownField(nextTag);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetClaimResolutionStatisticsRequest getClaimResolutionStatisticsRequest = (GetClaimResolutionStatisticsRequest) obj;
                reverseProtoWriter.getClass();
                getClaimResolutionStatisticsRequest.getClass();
                reverseProtoWriter.writeBytes(getClaimResolutionStatisticsRequest.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetClaimResolutionStatisticsRequest getClaimResolutionStatisticsRequest = (GetClaimResolutionStatisticsRequest) obj;
                getClaimResolutionStatisticsRequest.getClass();
                return getClaimResolutionStatisticsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ((GetClaimResolutionStatisticsRequest) obj).getClass();
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new GetClaimResolutionStatisticsRequest(byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetClaimResolutionStatisticsRequest getClaimResolutionStatisticsRequest = (GetClaimResolutionStatisticsRequest) obj;
                getClaimResolutionStatisticsRequest.getClass();
                protoWriter.writeBytes(getClaimResolutionStatisticsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetClaimResolutionStatisticsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetClaimResolutionStatisticsRequest) && Intrinsics.areEqual(unknownFields(), ((GetClaimResolutionStatisticsRequest) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Empty.Builder builder = new Empty.Builder(27);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "GetClaimResolutionStatisticsRequest{}";
    }
}
