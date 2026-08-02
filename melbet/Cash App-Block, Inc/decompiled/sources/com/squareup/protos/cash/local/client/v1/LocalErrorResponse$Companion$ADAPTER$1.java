package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalErrorResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalErrorResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(LocalErrorResponse.Error.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalErrorResponse localErrorResponse = (LocalErrorResponse) obj;
        reverseProtoWriter.getClass();
        localErrorResponse.getClass();
        reverseProtoWriter.writeBytes(localErrorResponse.unknownFields());
        LocalErrorResponse.Error.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, localErrorResponse.errors);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalErrorResponse localErrorResponse = (LocalErrorResponse) obj;
        localErrorResponse.getClass();
        return LocalErrorResponse.Error.ADAPTER.asRepeated().encodedSizeWithTag(1, localErrorResponse.errors) + localErrorResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalErrorResponse localErrorResponse = (LocalErrorResponse) obj;
        localErrorResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(localErrorResponse.errors, LocalErrorResponse.Error.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LocalErrorResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalErrorResponse localErrorResponse = (LocalErrorResponse) obj;
        localErrorResponse.getClass();
        LocalErrorResponse.Error.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, localErrorResponse.errors);
        protoWriter.writeBytes(localErrorResponse.unknownFields());
    }
}
