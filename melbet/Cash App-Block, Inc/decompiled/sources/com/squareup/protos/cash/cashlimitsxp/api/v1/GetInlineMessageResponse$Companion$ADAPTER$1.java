package com.squareup.protos.cash.cashlimitsxp.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetInlineMessageResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetInlineMessageResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        TransactorKt transactorKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetInlineMessageResponse(transactorKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                transactorKt = new GetInlineMessageResponse$Response$LimitsHubInlineMessage((GetInlineMessageResponse.LimitsHubInlineMessage) GetInlineMessageResponse.LimitsHubInlineMessage.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                transactorKt = new GetInlineMessageResponse$Response$Empty((Empty) Empty.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetInlineMessageResponse getInlineMessageResponse = (GetInlineMessageResponse) obj;
        reverseProtoWriter.getClass();
        getInlineMessageResponse.getClass();
        reverseProtoWriter.writeBytes(getInlineMessageResponse.unknownFields());
        TransactorKt transactorKt = getInlineMessageResponse.response;
        if (transactorKt instanceof GetInlineMessageResponse$Response$LimitsHubInlineMessage) {
            GetInlineMessageResponse.LimitsHubInlineMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetInlineMessageResponse$Response$LimitsHubInlineMessage) transactorKt).value);
        } else if (transactorKt instanceof GetInlineMessageResponse$Response$Empty) {
            Empty.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetInlineMessageResponse$Response$Empty) transactorKt).getValue());
        } else {
            if (transactorKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetInlineMessageResponse getInlineMessageResponse = (GetInlineMessageResponse) obj;
        getInlineMessageResponse.getClass();
        int size$okio = getInlineMessageResponse.unknownFields().getSize$okio();
        TransactorKt transactorKt = getInlineMessageResponse.response;
        if (transactorKt instanceof GetInlineMessageResponse$Response$LimitsHubInlineMessage) {
            encodedSizeWithTag = GetInlineMessageResponse.LimitsHubInlineMessage.ADAPTER.encodedSizeWithTag(1, ((GetInlineMessageResponse$Response$LimitsHubInlineMessage) transactorKt).value);
        } else {
            if (!(transactorKt instanceof GetInlineMessageResponse$Response$Empty)) {
                if (transactorKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = Empty.ADAPTER.encodedSizeWithTag(2, ((GetInlineMessageResponse$Response$Empty) transactorKt).getValue());
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetInlineMessageResponse getInlineMessageResponse = (GetInlineMessageResponse) obj;
        getInlineMessageResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        TransactorKt transactorKt = getInlineMessageResponse.response;
        byteString.getClass();
        return new GetInlineMessageResponse(transactorKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetInlineMessageResponse getInlineMessageResponse = (GetInlineMessageResponse) obj;
        getInlineMessageResponse.getClass();
        TransactorKt transactorKt = getInlineMessageResponse.response;
        if (transactorKt instanceof GetInlineMessageResponse$Response$LimitsHubInlineMessage) {
            GetInlineMessageResponse.LimitsHubInlineMessage.ADAPTER.encodeWithTag(protoWriter, 1, ((GetInlineMessageResponse$Response$LimitsHubInlineMessage) transactorKt).value);
        } else if (transactorKt instanceof GetInlineMessageResponse$Response$Empty) {
            Empty.ADAPTER.encodeWithTag(protoWriter, 2, ((GetInlineMessageResponse$Response$Empty) transactorKt).getValue());
        } else if (transactorKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getInlineMessageResponse.unknownFields());
    }
}
