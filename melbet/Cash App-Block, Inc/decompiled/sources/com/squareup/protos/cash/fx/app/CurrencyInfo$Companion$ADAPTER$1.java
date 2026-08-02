package com.squareup.protos.cash.fx.app;

import com.squareup.protos.common.CurrencyCode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CurrencyInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CurrencyInfo((CurrencyCode) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CurrencyCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CurrencyInfo currencyInfo = (CurrencyInfo) obj;
        reverseProtoWriter.getClass();
        currencyInfo.getClass();
        reverseProtoWriter.writeBytes(currencyInfo.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, currencyInfo.display_name);
        CurrencyCode.ADAPTER.encodeWithTag(reverseProtoWriter, 1, currencyInfo.code);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CurrencyInfo currencyInfo = (CurrencyInfo) obj;
        currencyInfo.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, currencyInfo.display_name) + CurrencyCode.ADAPTER.encodedSizeWithTag(1, currencyInfo.code) + currencyInfo.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CurrencyInfo currencyInfo = (CurrencyInfo) obj;
        currencyInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        CurrencyCode currencyCode = currencyInfo.code;
        String str = currencyInfo.display_name;
        byteString.getClass();
        return new CurrencyInfo(currencyCode, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CurrencyInfo currencyInfo = (CurrencyInfo) obj;
        currencyInfo.getClass();
        CurrencyCode.ADAPTER.encodeWithTag(protoWriter, 1, currencyInfo.code);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, currencyInfo.display_name);
        protoWriter.writeBytes(currencyInfo.unknownFields());
    }
}
