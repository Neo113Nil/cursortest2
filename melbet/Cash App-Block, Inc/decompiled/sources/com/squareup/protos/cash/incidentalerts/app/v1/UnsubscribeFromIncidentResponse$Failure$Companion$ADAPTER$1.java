package com.squareup.protos.cash.incidentalerts.app.v1;

import com.squareup.protos.cash.incidentalerts.app.v1.UnsubscribeFromIncidentResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UnsubscribeFromIncidentResponse$Failure$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UnsubscribeFromIncidentResponse.Failure((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UnsubscribeFromIncidentResponse.Failure failure = (UnsubscribeFromIncidentResponse.Failure) obj;
        reverseProtoWriter.getClass();
        failure.getClass();
        reverseProtoWriter.writeBytes(failure.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, failure.reason);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UnsubscribeFromIncidentResponse.Failure failure = (UnsubscribeFromIncidentResponse.Failure) obj;
        failure.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, failure.reason) + failure.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UnsubscribeFromIncidentResponse.Failure failure = (UnsubscribeFromIncidentResponse.Failure) obj;
        failure.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = failure.reason;
        byteString.getClass();
        return new UnsubscribeFromIncidentResponse.Failure(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UnsubscribeFromIncidentResponse.Failure failure = (UnsubscribeFromIncidentResponse.Failure) obj;
        failure.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, failure.reason);
        protoWriter.writeBytes(failure.unknownFields());
    }
}
