package com.squareup.protos.cash.woodrow.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.woodrow.model.v1.AssetAcquisition$AcquisitionType;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AcquisitionSummary$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        Object obj = AssetAcquisition$AcquisitionType.TYPE_UNSPECIFIED;
        long beginMessage = protoReader.beginMessage();
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AcquisitionSummary((AssetAcquisition$AcquisitionType) obj, (Money) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = AssetAcquisition$AcquisitionType.ADAPTER.decode(protoReader);
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
        AcquisitionSummary acquisitionSummary = (AcquisitionSummary) obj;
        reverseProtoWriter.getClass();
        acquisitionSummary.getClass();
        reverseProtoWriter.writeBytes(acquisitionSummary.unknownFields());
        Money money = acquisitionSummary.amount;
        if (money != null) {
            Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, money);
        }
        AssetAcquisition$AcquisitionType assetAcquisition$AcquisitionType = acquisitionSummary.acquisition_type;
        if (assetAcquisition$AcquisitionType != AssetAcquisition$AcquisitionType.TYPE_UNSPECIFIED) {
            AssetAcquisition$AcquisitionType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, assetAcquisition$AcquisitionType);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AcquisitionSummary acquisitionSummary = (AcquisitionSummary) obj;
        acquisitionSummary.getClass();
        int size$okio = acquisitionSummary.unknownFields().getSize$okio();
        AssetAcquisition$AcquisitionType assetAcquisition$AcquisitionType = acquisitionSummary.acquisition_type;
        if (assetAcquisition$AcquisitionType != AssetAcquisition$AcquisitionType.TYPE_UNSPECIFIED) {
            size$okio += AssetAcquisition$AcquisitionType.ADAPTER.encodedSizeWithTag(1, assetAcquisition$AcquisitionType);
        }
        Money money = acquisitionSummary.amount;
        return money != null ? Money.ADAPTER.encodedSizeWithTag(2, money) + size$okio : size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AcquisitionSummary acquisitionSummary = (AcquisitionSummary) obj;
        acquisitionSummary.getClass();
        Money money = acquisitionSummary.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        AssetAcquisition$AcquisitionType assetAcquisition$AcquisitionType = acquisitionSummary.acquisition_type;
        assetAcquisition$AcquisitionType.getClass();
        byteString.getClass();
        return new AcquisitionSummary(assetAcquisition$AcquisitionType, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AcquisitionSummary acquisitionSummary = (AcquisitionSummary) obj;
        acquisitionSummary.getClass();
        AssetAcquisition$AcquisitionType assetAcquisition$AcquisitionType = acquisitionSummary.acquisition_type;
        if (assetAcquisition$AcquisitionType != AssetAcquisition$AcquisitionType.TYPE_UNSPECIFIED) {
            AssetAcquisition$AcquisitionType.ADAPTER.encodeWithTag(protoWriter, 1, assetAcquisition$AcquisitionType);
        }
        Money money = acquisitionSummary.amount;
        if (money != null) {
            Money.ADAPTER.encodeWithTag(protoWriter, 2, money);
        }
        protoWriter.writeBytes(acquisitionSummary.unknownFields());
    }
}
