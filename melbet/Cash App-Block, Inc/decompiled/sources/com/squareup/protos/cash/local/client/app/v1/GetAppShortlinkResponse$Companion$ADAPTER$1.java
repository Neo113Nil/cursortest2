package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.GetShortlinkResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetAppShortlinkResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAppShortlinkResponse((ResponseContext) obj, (GetShortlinkResponse) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(GetShortlinkResponse.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAppShortlinkResponse getAppShortlinkResponse = (GetAppShortlinkResponse) obj;
        reverseProtoWriter.getClass();
        getAppShortlinkResponse.getClass();
        reverseProtoWriter.writeBytes(getAppShortlinkResponse.unknownFields());
        GetShortlinkResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getAppShortlinkResponse.response);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getAppShortlinkResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAppShortlinkResponse getAppShortlinkResponse = (GetAppShortlinkResponse) obj;
        getAppShortlinkResponse.getClass();
        return GetShortlinkResponse.ADAPTER.encodedSizeWithTag(2, getAppShortlinkResponse.response) + ResponseContext.ADAPTER.encodedSizeWithTag(1, getAppShortlinkResponse.response_context) + getAppShortlinkResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAppShortlinkResponse getAppShortlinkResponse = (GetAppShortlinkResponse) obj;
        getAppShortlinkResponse.getClass();
        ResponseContext responseContext = getAppShortlinkResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        GetShortlinkResponse getShortlinkResponse = getAppShortlinkResponse.response;
        GetShortlinkResponse getShortlinkResponse2 = getShortlinkResponse != null ? (GetShortlinkResponse) GetShortlinkResponse.ADAPTER.redact(getShortlinkResponse) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetAppShortlinkResponse(responseContext2, getShortlinkResponse2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAppShortlinkResponse getAppShortlinkResponse = (GetAppShortlinkResponse) obj;
        getAppShortlinkResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, getAppShortlinkResponse.response_context);
        GetShortlinkResponse.ADAPTER.encodeWithTag(protoWriter, 2, getAppShortlinkResponse.response);
        protoWriter.writeBytes(getAppShortlinkResponse.unknownFields());
    }
}
