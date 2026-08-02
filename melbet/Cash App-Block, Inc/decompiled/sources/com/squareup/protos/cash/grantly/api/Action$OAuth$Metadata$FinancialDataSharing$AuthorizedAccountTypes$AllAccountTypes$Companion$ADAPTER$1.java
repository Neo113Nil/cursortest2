package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AllAccountTypes$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AllAccountTypes(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AllAccountTypes allAccountTypes = (Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AllAccountTypes) obj;
        reverseProtoWriter.getClass();
        allAccountTypes.getClass();
        reverseProtoWriter.writeBytes(allAccountTypes.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AllAccountTypes allAccountTypes = (Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AllAccountTypes) obj;
        allAccountTypes.getClass();
        return allAccountTypes.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AllAccountTypes) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AllAccountTypes(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AllAccountTypes allAccountTypes = (Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AllAccountTypes) obj;
        allAccountTypes.getClass();
        protoWriter.writeBytes(allAccountTypes.unknownFields());
    }
}
