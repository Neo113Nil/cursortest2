package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MoneyBar$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MoneyBar((CreditLineType) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CreditLineType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneyBar moneyBar = (MoneyBar) obj;
        reverseProtoWriter.getClass();
        moneyBar.getClass();
        reverseProtoWriter.writeBytes(moneyBar.unknownFields());
        CreditLineType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, moneyBar.credit_line);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneyBar moneyBar = (MoneyBar) obj;
        moneyBar.getClass();
        return CreditLineType.ADAPTER.encodedSizeWithTag(1, moneyBar.credit_line) + moneyBar.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneyBar moneyBar = (MoneyBar) obj;
        moneyBar.getClass();
        ByteString byteString = ByteString.EMPTY;
        CreditLineType creditLineType = moneyBar.credit_line;
        byteString.getClass();
        return new MoneyBar(creditLineType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneyBar moneyBar = (MoneyBar) obj;
        moneyBar.getClass();
        CreditLineType.ADAPTER.encodeWithTag(protoWriter, 1, moneyBar.credit_line);
        protoWriter.writeBytes(moneyBar.unknownFields());
    }
}
