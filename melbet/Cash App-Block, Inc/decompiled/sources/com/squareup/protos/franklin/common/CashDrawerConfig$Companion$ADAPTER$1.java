package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.CashDrawerConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CashDrawerConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashDrawerConfig((CashDrawerConfig.GetCardAsset) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CashDrawerConfig.GetCardAsset.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashDrawerConfig cashDrawerConfig = (CashDrawerConfig) obj;
        reverseProtoWriter.getClass();
        cashDrawerConfig.getClass();
        reverseProtoWriter.writeBytes(cashDrawerConfig.unknownFields());
        CashDrawerConfig.GetCardAsset.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cashDrawerConfig.get_card_asset);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashDrawerConfig cashDrawerConfig = (CashDrawerConfig) obj;
        cashDrawerConfig.getClass();
        return CashDrawerConfig.GetCardAsset.ADAPTER.encodedSizeWithTag(1, cashDrawerConfig.get_card_asset) + cashDrawerConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashDrawerConfig cashDrawerConfig = (CashDrawerConfig) obj;
        cashDrawerConfig.getClass();
        CashDrawerConfig.GetCardAsset getCardAsset = cashDrawerConfig.get_card_asset;
        CashDrawerConfig.GetCardAsset getCardAsset2 = getCardAsset != null ? (CashDrawerConfig.GetCardAsset) CashDrawerConfig.GetCardAsset.ADAPTER.redact(getCardAsset) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashDrawerConfig(getCardAsset2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashDrawerConfig cashDrawerConfig = (CashDrawerConfig) obj;
        cashDrawerConfig.getClass();
        CashDrawerConfig.GetCardAsset.ADAPTER.encodeWithTag(protoWriter, 1, cashDrawerConfig.get_card_asset);
        protoWriter.writeBytes(cashDrawerConfig.unknownFields());
    }
}
