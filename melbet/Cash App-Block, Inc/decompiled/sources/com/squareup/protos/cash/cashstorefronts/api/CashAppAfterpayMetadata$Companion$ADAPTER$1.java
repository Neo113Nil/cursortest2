package com.squareup.protos.cash.cashstorefronts.api;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppAfterpayMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppAfterpayMetadata((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppAfterpayMetadata cashAppAfterpayMetadata = (CashAppAfterpayMetadata) obj;
        reverseProtoWriter.getClass();
        cashAppAfterpayMetadata.getClass();
        reverseProtoWriter.writeBytes(cashAppAfterpayMetadata.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, cashAppAfterpayMetadata.categories);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cashAppAfterpayMetadata.affiliate_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppAfterpayMetadata cashAppAfterpayMetadata = (CashAppAfterpayMetadata) obj;
        cashAppAfterpayMetadata.getClass();
        int size$okio = cashAppAfterpayMetadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.asRepeated().encodedSizeWithTag(2, cashAppAfterpayMetadata.categories) + protoAdapter.encodedSizeWithTag(1, cashAppAfterpayMetadata.affiliate_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppAfterpayMetadata cashAppAfterpayMetadata = (CashAppAfterpayMetadata) obj;
        cashAppAfterpayMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = cashAppAfterpayMetadata.affiliate_url;
        List list = cashAppAfterpayMetadata.categories;
        list.getClass();
        byteString.getClass();
        return new CashAppAfterpayMetadata(str, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppAfterpayMetadata cashAppAfterpayMetadata = (CashAppAfterpayMetadata) obj;
        cashAppAfterpayMetadata.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashAppAfterpayMetadata.affiliate_url);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, cashAppAfterpayMetadata.categories);
        protoWriter.writeBytes(cashAppAfterpayMetadata.unknownFields());
    }
}
