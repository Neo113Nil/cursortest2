package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.ResetBadgeResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ResetBadgeResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ResetBadgeResponse((ResetBadgeResponse.Status) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = ResetBadgeResponse.Status.ADAPTER.decode(protoReader);
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
        ResetBadgeResponse resetBadgeResponse = (ResetBadgeResponse) obj;
        reverseProtoWriter.getClass();
        resetBadgeResponse.getClass();
        reverseProtoWriter.writeBytes(resetBadgeResponse.unknownFields());
        ResetBadgeResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, resetBadgeResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ResetBadgeResponse resetBadgeResponse = (ResetBadgeResponse) obj;
        resetBadgeResponse.getClass();
        return ResetBadgeResponse.Status.ADAPTER.encodedSizeWithTag(1, resetBadgeResponse.status) + resetBadgeResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ResetBadgeResponse resetBadgeResponse = (ResetBadgeResponse) obj;
        resetBadgeResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        ResetBadgeResponse.Status status = resetBadgeResponse.status;
        byteString.getClass();
        return new ResetBadgeResponse(status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ResetBadgeResponse resetBadgeResponse = (ResetBadgeResponse) obj;
        resetBadgeResponse.getClass();
        ResetBadgeResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, resetBadgeResponse.status);
        protoWriter.writeBytes(resetBadgeResponse.unknownFields());
    }
}
