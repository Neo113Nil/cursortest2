package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.FeeRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FeeRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new FeeRenderData((Money) obj, (String) obj2, (FeeRenderData.FeeType) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = FeeRenderData.FeeType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FeeRenderData feeRenderData = (FeeRenderData) obj;
        reverseProtoWriter.getClass();
        feeRenderData.getClass();
        reverseProtoWriter.writeBytes(feeRenderData.unknownFields());
        FeeRenderData.FeeType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, feeRenderData.f1378type);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, feeRenderData.description);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, feeRenderData.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FeeRenderData feeRenderData = (FeeRenderData) obj;
        feeRenderData.getClass();
        return FeeRenderData.FeeType.ADAPTER.encodedSizeWithTag(3, feeRenderData.f1378type) + ProtoAdapter.STRING.encodedSizeWithTag(2, feeRenderData.description) + Money.ADAPTER.encodedSizeWithTag(1, feeRenderData.amount) + feeRenderData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FeeRenderData feeRenderData = (FeeRenderData) obj;
        feeRenderData.getClass();
        Money money = feeRenderData.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = feeRenderData.description;
        FeeRenderData.FeeType feeType = feeRenderData.f1378type;
        byteString.getClass();
        return new FeeRenderData(money2, str, feeType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FeeRenderData feeRenderData = (FeeRenderData) obj;
        feeRenderData.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, feeRenderData.amount);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, feeRenderData.description);
        FeeRenderData.FeeType.ADAPTER.encodeWithTag(protoWriter, 3, feeRenderData.f1378type);
        protoWriter.writeBytes(feeRenderData.unknownFields());
    }
}
