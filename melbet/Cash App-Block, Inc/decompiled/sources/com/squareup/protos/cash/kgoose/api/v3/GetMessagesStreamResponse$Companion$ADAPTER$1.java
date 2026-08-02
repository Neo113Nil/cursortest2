package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.GetMessagesStreamResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetMessagesStreamResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        GetMessagesStreamResponse.Response response = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetMessagesStreamResponse(response, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                response = new GetMessagesStreamResponse.Response.GetMessagesResponse((GetMessagesResponse) GetMessagesResponse.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                response = new GetMessagesStreamResponse.Response.DeltaMessageContent((GetMessagesStreamResponse.DeltaMessageContent) GetMessagesStreamResponse.DeltaMessageContent.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetMessagesStreamResponse getMessagesStreamResponse = (GetMessagesStreamResponse) obj;
        reverseProtoWriter.getClass();
        getMessagesStreamResponse.getClass();
        reverseProtoWriter.writeBytes(getMessagesStreamResponse.unknownFields());
        GetMessagesStreamResponse.Response response = getMessagesStreamResponse.response;
        if (response instanceof GetMessagesStreamResponse.Response.GetMessagesResponse) {
            GetMessagesResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetMessagesStreamResponse.Response.GetMessagesResponse) response).getValue());
        } else if (response instanceof GetMessagesStreamResponse.Response.DeltaMessageContent) {
            GetMessagesStreamResponse.DeltaMessageContent.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetMessagesStreamResponse.Response.DeltaMessageContent) response).getValue());
        } else {
            if (response == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetMessagesStreamResponse getMessagesStreamResponse = (GetMessagesStreamResponse) obj;
        getMessagesStreamResponse.getClass();
        int size$okio = getMessagesStreamResponse.unknownFields().getSize$okio();
        GetMessagesStreamResponse.Response response = getMessagesStreamResponse.response;
        if (response instanceof GetMessagesStreamResponse.Response.GetMessagesResponse) {
            encodedSizeWithTag = GetMessagesResponse.ADAPTER.encodedSizeWithTag(1, ((GetMessagesStreamResponse.Response.GetMessagesResponse) response).getValue());
        } else {
            if (!(response instanceof GetMessagesStreamResponse.Response.DeltaMessageContent)) {
                if (response == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = GetMessagesStreamResponse.DeltaMessageContent.ADAPTER.encodedSizeWithTag(2, ((GetMessagesStreamResponse.Response.DeltaMessageContent) response).getValue());
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetMessagesStreamResponse getMessagesStreamResponse = (GetMessagesStreamResponse) obj;
        getMessagesStreamResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        GetMessagesStreamResponse.Response response = getMessagesStreamResponse.response;
        byteString.getClass();
        return new GetMessagesStreamResponse(response, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetMessagesStreamResponse getMessagesStreamResponse = (GetMessagesStreamResponse) obj;
        getMessagesStreamResponse.getClass();
        GetMessagesStreamResponse.Response response = getMessagesStreamResponse.response;
        if (response instanceof GetMessagesStreamResponse.Response.GetMessagesResponse) {
            GetMessagesResponse.ADAPTER.encodeWithTag(protoWriter, 1, ((GetMessagesStreamResponse.Response.GetMessagesResponse) response).getValue());
        } else if (response instanceof GetMessagesStreamResponse.Response.DeltaMessageContent) {
            GetMessagesStreamResponse.DeltaMessageContent.ADAPTER.encodeWithTag(protoWriter, 2, ((GetMessagesStreamResponse.Response.DeltaMessageContent) response).getValue());
        } else if (response != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getMessagesStreamResponse.unknownFields());
    }
}
