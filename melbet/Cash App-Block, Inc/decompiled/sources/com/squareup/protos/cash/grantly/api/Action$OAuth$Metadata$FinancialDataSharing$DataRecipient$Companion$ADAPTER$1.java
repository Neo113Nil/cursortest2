package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$OAuth$Metadata$FinancialDataSharing$DataRecipient$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.OAuth.Metadata.FinancialDataSharing.DataRecipient((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        Action.OAuth.Metadata.FinancialDataSharing.DataRecipient dataRecipient = (Action.OAuth.Metadata.FinancialDataSharing.DataRecipient) obj;
        reverseProtoWriter.getClass();
        dataRecipient.getClass();
        reverseProtoWriter.writeBytes(dataRecipient.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, dataRecipient.client_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing.DataRecipient dataRecipient = (Action.OAuth.Metadata.FinancialDataSharing.DataRecipient) obj;
        dataRecipient.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, dataRecipient.client_id) + dataRecipient.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing.DataRecipient dataRecipient = (Action.OAuth.Metadata.FinancialDataSharing.DataRecipient) obj;
        dataRecipient.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = dataRecipient.client_id;
        byteString.getClass();
        return new Action.OAuth.Metadata.FinancialDataSharing.DataRecipient(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing.DataRecipient dataRecipient = (Action.OAuth.Metadata.FinancialDataSharing.DataRecipient) obj;
        dataRecipient.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, dataRecipient.client_id);
        protoWriter.writeBytes(dataRecipient.unknownFields());
    }
}
