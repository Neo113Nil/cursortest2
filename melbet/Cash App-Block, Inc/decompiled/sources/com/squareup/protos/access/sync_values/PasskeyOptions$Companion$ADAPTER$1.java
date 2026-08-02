package com.squareup.protos.access.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PasskeyOptions$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PasskeyOptions(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Credential.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PasskeyOptions passkeyOptions = (PasskeyOptions) obj;
        reverseProtoWriter.getClass();
        passkeyOptions.getClass();
        reverseProtoWriter.writeBytes(passkeyOptions.unknownFields());
        Credential.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, passkeyOptions.registered_credentials);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PasskeyOptions passkeyOptions = (PasskeyOptions) obj;
        passkeyOptions.getClass();
        return Credential.ADAPTER.asRepeated().encodedSizeWithTag(1, passkeyOptions.registered_credentials) + passkeyOptions.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PasskeyOptions passkeyOptions = (PasskeyOptions) obj;
        passkeyOptions.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(passkeyOptions.registered_credentials, Credential.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PasskeyOptions(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PasskeyOptions passkeyOptions = (PasskeyOptions) obj;
        passkeyOptions.getClass();
        Credential.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, passkeyOptions.registered_credentials);
        protoWriter.writeBytes(passkeyOptions.unknownFields());
    }
}
