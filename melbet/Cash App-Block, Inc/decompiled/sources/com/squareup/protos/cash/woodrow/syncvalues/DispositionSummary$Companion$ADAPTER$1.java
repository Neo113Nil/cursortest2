package com.squareup.protos.cash.woodrow.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.woodrow.model.v1.AssetDisposition$DispositionType;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DispositionSummary$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        Object obj = AssetDisposition$DispositionType.TYPE_UNSPECIFIED;
        long beginMessage = protoReader.beginMessage();
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DispositionSummary((AssetDisposition$DispositionType) obj, (Money) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = AssetDisposition$DispositionType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DispositionSummary dispositionSummary = (DispositionSummary) obj;
        reverseProtoWriter.getClass();
        dispositionSummary.getClass();
        reverseProtoWriter.writeBytes(dispositionSummary.unknownFields());
        Money money = dispositionSummary.amount;
        if (money != null) {
            Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, money);
        }
        AssetDisposition$DispositionType assetDisposition$DispositionType = dispositionSummary.disposition_type;
        if (assetDisposition$DispositionType != AssetDisposition$DispositionType.TYPE_UNSPECIFIED) {
            AssetDisposition$DispositionType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, assetDisposition$DispositionType);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DispositionSummary dispositionSummary = (DispositionSummary) obj;
        dispositionSummary.getClass();
        int size$okio = dispositionSummary.unknownFields().getSize$okio();
        AssetDisposition$DispositionType assetDisposition$DispositionType = dispositionSummary.disposition_type;
        if (assetDisposition$DispositionType != AssetDisposition$DispositionType.TYPE_UNSPECIFIED) {
            size$okio += AssetDisposition$DispositionType.ADAPTER.encodedSizeWithTag(1, assetDisposition$DispositionType);
        }
        Money money = dispositionSummary.amount;
        return money != null ? Money.ADAPTER.encodedSizeWithTag(2, money) + size$okio : size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DispositionSummary dispositionSummary = (DispositionSummary) obj;
        dispositionSummary.getClass();
        Money money = dispositionSummary.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        AssetDisposition$DispositionType assetDisposition$DispositionType = dispositionSummary.disposition_type;
        assetDisposition$DispositionType.getClass();
        byteString.getClass();
        return new DispositionSummary(assetDisposition$DispositionType, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DispositionSummary dispositionSummary = (DispositionSummary) obj;
        dispositionSummary.getClass();
        AssetDisposition$DispositionType assetDisposition$DispositionType = dispositionSummary.disposition_type;
        if (assetDisposition$DispositionType != AssetDisposition$DispositionType.TYPE_UNSPECIFIED) {
            AssetDisposition$DispositionType.ADAPTER.encodeWithTag(protoWriter, 1, assetDisposition$DispositionType);
        }
        Money money = dispositionSummary.amount;
        if (money != null) {
            Money.ADAPTER.encodeWithTag(protoWriter, 2, money);
        }
        protoWriter.writeBytes(dispositionSummary.unknownFields());
    }
}
