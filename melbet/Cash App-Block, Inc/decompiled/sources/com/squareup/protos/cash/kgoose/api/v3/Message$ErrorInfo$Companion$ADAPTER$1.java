package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/Message$ErrorInfo$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/Message$ErrorInfo;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Message$ErrorInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Message.ErrorInfo((String) obj2, (Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Message.ErrorInfo errorInfo = (Message.ErrorInfo) obj;
        reverseProtoWriter.getClass();
        errorInfo.getClass();
        reverseProtoWriter.writeBytes(errorInfo.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, errorInfo.cause);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, errorInfo.is_error);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Message.ErrorInfo errorInfo = (Message.ErrorInfo) obj;
        errorInfo.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, errorInfo.cause) + ProtoAdapter.BOOL.encodedSizeWithTag(1, errorInfo.is_error) + errorInfo.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Message.ErrorInfo errorInfo = (Message.ErrorInfo) obj;
        errorInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = errorInfo.is_error;
        String str = errorInfo.cause;
        byteString.getClass();
        return new Message.ErrorInfo(str, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Message.ErrorInfo errorInfo = (Message.ErrorInfo) obj;
        errorInfo.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, errorInfo.is_error);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, errorInfo.cause);
        protoWriter.writeBytes(errorInfo.unknownFields());
    }
}
