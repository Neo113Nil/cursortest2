package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CryptoPayrollRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CryptoPayrollRenderData((Money) obj, (Money) obj2, (Long) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CryptoPayrollRenderData cryptoPayrollRenderData = (CryptoPayrollRenderData) obj;
        reverseProtoWriter.getClass();
        cryptoPayrollRenderData.getClass();
        reverseProtoWriter.writeBytes(cryptoPayrollRenderData.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, cryptoPayrollRenderData.allocationBps);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cryptoPayrollRenderData.total_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cryptoPayrollRenderData.converted_amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CryptoPayrollRenderData cryptoPayrollRenderData = (CryptoPayrollRenderData) obj;
        cryptoPayrollRenderData.getClass();
        int size$okio = cryptoPayrollRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return ProtoAdapter.INT64.encodedSizeWithTag(3, cryptoPayrollRenderData.allocationBps) + protoAdapter.encodedSizeWithTag(2, cryptoPayrollRenderData.total_amount) + protoAdapter.encodedSizeWithTag(1, cryptoPayrollRenderData.converted_amount) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CryptoPayrollRenderData cryptoPayrollRenderData = (CryptoPayrollRenderData) obj;
        cryptoPayrollRenderData.getClass();
        Money money = cryptoPayrollRenderData.converted_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = cryptoPayrollRenderData.total_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = cryptoPayrollRenderData.allocationBps;
        byteString.getClass();
        return new CryptoPayrollRenderData(money2, money4, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CryptoPayrollRenderData cryptoPayrollRenderData = (CryptoPayrollRenderData) obj;
        cryptoPayrollRenderData.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, cryptoPayrollRenderData.converted_amount);
        protoAdapter.encodeWithTag(protoWriter, 2, cryptoPayrollRenderData.total_amount);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, cryptoPayrollRenderData.allocationBps);
        protoWriter.writeBytes(cryptoPayrollRenderData.unknownFields());
    }
}
