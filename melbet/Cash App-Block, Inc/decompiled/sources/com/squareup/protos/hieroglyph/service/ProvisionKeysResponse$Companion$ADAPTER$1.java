package com.squareup.protos.hieroglyph.service;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.hieroglyph.WrappedKey;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ProvisionKeysResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProvisionKeysResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(WrappedKey.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProvisionKeysResponse provisionKeysResponse = (ProvisionKeysResponse) obj;
        reverseProtoWriter.getClass();
        provisionKeysResponse.getClass();
        reverseProtoWriter.writeBytes(provisionKeysResponse.unknownFields());
        WrappedKey.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, provisionKeysResponse.keys);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProvisionKeysResponse provisionKeysResponse = (ProvisionKeysResponse) obj;
        provisionKeysResponse.getClass();
        return WrappedKey.ADAPTER.asRepeated().encodedSizeWithTag(1, provisionKeysResponse.keys) + provisionKeysResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProvisionKeysResponse provisionKeysResponse = (ProvisionKeysResponse) obj;
        provisionKeysResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(provisionKeysResponse.keys, WrappedKey.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ProvisionKeysResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProvisionKeysResponse provisionKeysResponse = (ProvisionKeysResponse) obj;
        provisionKeysResponse.getClass();
        WrappedKey.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, provisionKeysResponse.keys);
        protoWriter.writeBytes(provisionKeysResponse.unknownFields());
    }
}
