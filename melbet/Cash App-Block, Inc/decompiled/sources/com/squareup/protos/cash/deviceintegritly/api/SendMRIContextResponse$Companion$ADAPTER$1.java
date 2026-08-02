package com.squareup.protos.cash.deviceintegritly.api;

import androidx.room.TransactorKt;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SendMRIContextResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            return new SendMRIContextResponse(bool.booleanValue(), endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "message_received");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SendMRIContextResponse sendMRIContextResponse = (SendMRIContextResponse) obj;
        reverseProtoWriter.getClass();
        sendMRIContextResponse.getClass();
        reverseProtoWriter.writeBytes(sendMRIContextResponse.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, Boolean.valueOf(sendMRIContextResponse.message_received));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SendMRIContextResponse sendMRIContextResponse = (SendMRIContextResponse) obj;
        sendMRIContextResponse.getClass();
        int size$okio = sendMRIContextResponse.unknownFields().getSize$okio();
        return SizeMode$EnumUnboxingLocalUtility.m(sendMRIContextResponse.message_received, ProtoAdapter.BOOL, 1, size$okio);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SendMRIContextResponse sendMRIContextResponse = (SendMRIContextResponse) obj;
        sendMRIContextResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        boolean z = sendMRIContextResponse.message_received;
        byteString.getClass();
        return new SendMRIContextResponse(z, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SendMRIContextResponse sendMRIContextResponse = (SendMRIContextResponse) obj;
        sendMRIContextResponse.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, Boolean.valueOf(sendMRIContextResponse.message_received));
        protoWriter.writeBytes(sendMRIContextResponse.unknownFields());
    }
}
