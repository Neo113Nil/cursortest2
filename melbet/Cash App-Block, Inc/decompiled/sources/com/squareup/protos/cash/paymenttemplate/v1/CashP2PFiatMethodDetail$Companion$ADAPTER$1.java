package com.squareup.protos.cash.paymenttemplate.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashP2PFiatMethodDetail$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashP2PFiatMethodDetail(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashP2PFiatMethodDetail cashP2PFiatMethodDetail = (CashP2PFiatMethodDetail) obj;
        reverseProtoWriter.getClass();
        cashP2PFiatMethodDetail.getClass();
        reverseProtoWriter.writeBytes(cashP2PFiatMethodDetail.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashP2PFiatMethodDetail cashP2PFiatMethodDetail = (CashP2PFiatMethodDetail) obj;
        cashP2PFiatMethodDetail.getClass();
        return cashP2PFiatMethodDetail.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((CashP2PFiatMethodDetail) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashP2PFiatMethodDetail(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashP2PFiatMethodDetail cashP2PFiatMethodDetail = (CashP2PFiatMethodDetail) obj;
        cashP2PFiatMethodDetail.getClass();
        protoWriter.writeBytes(cashP2PFiatMethodDetail.unknownFields());
    }
}
