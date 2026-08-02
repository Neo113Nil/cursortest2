package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$CheckingBalance$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.CheckingBalance(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.CheckingBalance checkingBalance = (Action.CheckingBalance) obj;
        reverseProtoWriter.getClass();
        checkingBalance.getClass();
        reverseProtoWriter.writeBytes(checkingBalance.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.CheckingBalance checkingBalance = (Action.CheckingBalance) obj;
        checkingBalance.getClass();
        return checkingBalance.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((Action.CheckingBalance) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Action.CheckingBalance(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.CheckingBalance checkingBalance = (Action.CheckingBalance) obj;
        checkingBalance.getClass();
        protoWriter.writeBytes(checkingBalance.unknownFields());
    }
}
