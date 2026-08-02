package com.squareup.protos.cash.balancemover.api.v1;

import com.squareup.protos.cash.balancemover.api.v1.SavingsTransferContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SavingsTransferContext$Home$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsTransferContext.Home(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsTransferContext.Home home = (SavingsTransferContext.Home) obj;
        reverseProtoWriter.getClass();
        home.getClass();
        reverseProtoWriter.writeBytes(home.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsTransferContext.Home home = (SavingsTransferContext.Home) obj;
        home.getClass();
        return home.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SavingsTransferContext.Home) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SavingsTransferContext.Home(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsTransferContext.Home home = (SavingsTransferContext.Home) obj;
        home.getClass();
        protoWriter.writeBytes(home.unknownFields());
    }
}
