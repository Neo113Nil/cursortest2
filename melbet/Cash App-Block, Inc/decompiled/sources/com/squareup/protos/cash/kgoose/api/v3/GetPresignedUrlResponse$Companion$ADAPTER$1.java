package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/GetPresignedUrlResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetPresignedUrlResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetPresignedUrlResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPresignedUrlResponse((String) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPresignedUrlResponse getPresignedUrlResponse = (GetPresignedUrlResponse) obj;
        reverseProtoWriter.getClass();
        getPresignedUrlResponse.getClass();
        reverseProtoWriter.writeBytes(getPresignedUrlResponse.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, getPresignedUrlResponse.expires_in_milliseconds);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getPresignedUrlResponse.presigned_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPresignedUrlResponse getPresignedUrlResponse = (GetPresignedUrlResponse) obj;
        getPresignedUrlResponse.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, getPresignedUrlResponse.expires_in_milliseconds) + ProtoAdapter.STRING.encodedSizeWithTag(1, getPresignedUrlResponse.presigned_url) + getPresignedUrlResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPresignedUrlResponse getPresignedUrlResponse = (GetPresignedUrlResponse) obj;
        getPresignedUrlResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = getPresignedUrlResponse.presigned_url;
        Long l = getPresignedUrlResponse.expires_in_milliseconds;
        byteString.getClass();
        return new GetPresignedUrlResponse(str, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPresignedUrlResponse getPresignedUrlResponse = (GetPresignedUrlResponse) obj;
        getPresignedUrlResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getPresignedUrlResponse.presigned_url);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getPresignedUrlResponse.expires_in_milliseconds);
        protoWriter.writeBytes(getPresignedUrlResponse.unknownFields());
    }
}
