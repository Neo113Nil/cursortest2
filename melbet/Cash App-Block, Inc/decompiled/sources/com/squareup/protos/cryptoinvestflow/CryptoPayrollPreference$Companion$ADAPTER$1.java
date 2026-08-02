package com.squareup.protos.cryptoinvestflow;

import com.squareup.protos.common.CurrencyCode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CryptoPayrollPreference$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CryptoPayrollPreference((Integer) obj, (CurrencyCode) obj2, (CurrencyCode) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = CurrencyCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = CurrencyCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CryptoPayrollPreference cryptoPayrollPreference = (CryptoPayrollPreference) obj;
        reverseProtoWriter.getClass();
        cryptoPayrollPreference.getClass();
        reverseProtoWriter.writeBytes(cryptoPayrollPreference.unknownFields());
        ProtoAdapter protoAdapter = CurrencyCode.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cryptoPayrollPreference.target_currency);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cryptoPayrollPreference.source_currency);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, cryptoPayrollPreference.allocation_bps);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CryptoPayrollPreference cryptoPayrollPreference = (CryptoPayrollPreference) obj;
        cryptoPayrollPreference.getClass();
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, cryptoPayrollPreference.allocation_bps) + cryptoPayrollPreference.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = CurrencyCode.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, cryptoPayrollPreference.target_currency) + protoAdapter.encodedSizeWithTag(2, cryptoPayrollPreference.source_currency) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CryptoPayrollPreference cryptoPayrollPreference = (CryptoPayrollPreference) obj;
        cryptoPayrollPreference.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = cryptoPayrollPreference.allocation_bps;
        CurrencyCode currencyCode = cryptoPayrollPreference.source_currency;
        CurrencyCode currencyCode2 = cryptoPayrollPreference.target_currency;
        byteString.getClass();
        return new CryptoPayrollPreference(num, currencyCode, currencyCode2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CryptoPayrollPreference cryptoPayrollPreference = (CryptoPayrollPreference) obj;
        cryptoPayrollPreference.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, cryptoPayrollPreference.allocation_bps);
        ProtoAdapter protoAdapter = CurrencyCode.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, cryptoPayrollPreference.source_currency);
        protoAdapter.encodeWithTag(protoWriter, 3, cryptoPayrollPreference.target_currency);
        protoWriter.writeBytes(cryptoPayrollPreference.unknownFields());
    }
}
