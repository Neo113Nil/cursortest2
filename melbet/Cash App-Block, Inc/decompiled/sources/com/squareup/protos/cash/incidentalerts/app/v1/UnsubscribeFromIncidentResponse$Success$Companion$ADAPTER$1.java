package com.squareup.protos.cash.incidentalerts.app.v1;

import com.squareup.protos.cash.incidentalerts.app.v1.UnsubscribeFromIncidentResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UnsubscribeFromIncidentResponse$Success$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UnsubscribeFromIncidentResponse.Success(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UnsubscribeFromIncidentResponse.Success success = (UnsubscribeFromIncidentResponse.Success) obj;
        reverseProtoWriter.getClass();
        success.getClass();
        reverseProtoWriter.writeBytes(success.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UnsubscribeFromIncidentResponse.Success success = (UnsubscribeFromIncidentResponse.Success) obj;
        success.getClass();
        return success.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((UnsubscribeFromIncidentResponse.Success) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UnsubscribeFromIncidentResponse.Success(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UnsubscribeFromIncidentResponse.Success success = (UnsubscribeFromIncidentResponse.Success) obj;
        success.getClass();
        protoWriter.writeBytes(success.unknownFields());
    }
}
