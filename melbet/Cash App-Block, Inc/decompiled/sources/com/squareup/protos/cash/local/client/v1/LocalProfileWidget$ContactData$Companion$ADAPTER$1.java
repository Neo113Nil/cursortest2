package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalProfileWidget$ContactData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalProfileWidget.ContactData(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalProfileWidget.ContactData contactData = (LocalProfileWidget.ContactData) obj;
        reverseProtoWriter.getClass();
        contactData.getClass();
        reverseProtoWriter.writeBytes(contactData.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalProfileWidget.ContactData contactData = (LocalProfileWidget.ContactData) obj;
        contactData.getClass();
        return contactData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((LocalProfileWidget.ContactData) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LocalProfileWidget.ContactData(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalProfileWidget.ContactData contactData = (LocalProfileWidget.ContactData) obj;
        contactData.getClass();
        protoWriter.writeBytes(contactData.unknownFields());
    }
}
