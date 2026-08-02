package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuItemDealAdjustedPrice$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalMenuItemDealAdjustedPrice((LocalMoney) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuItemDealAdjustedPrice localMenuItemDealAdjustedPrice = (LocalMenuItemDealAdjustedPrice) obj;
        reverseProtoWriter.getClass();
        localMenuItemDealAdjustedPrice.getClass();
        reverseProtoWriter.writeBytes(localMenuItemDealAdjustedPrice.unknownFields());
        LocalMoney.ADAPTER.encodeWithTag(reverseProtoWriter, 1, localMenuItemDealAdjustedPrice.original_price);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMenuItemDealAdjustedPrice localMenuItemDealAdjustedPrice = (LocalMenuItemDealAdjustedPrice) obj;
        localMenuItemDealAdjustedPrice.getClass();
        return LocalMoney.ADAPTER.encodedSizeWithTag(1, localMenuItemDealAdjustedPrice.original_price) + localMenuItemDealAdjustedPrice.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuItemDealAdjustedPrice localMenuItemDealAdjustedPrice = (LocalMenuItemDealAdjustedPrice) obj;
        localMenuItemDealAdjustedPrice.getClass();
        LocalMoney localMoney = localMenuItemDealAdjustedPrice.original_price;
        LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LocalMenuItemDealAdjustedPrice(localMoney2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuItemDealAdjustedPrice localMenuItemDealAdjustedPrice = (LocalMenuItemDealAdjustedPrice) obj;
        localMenuItemDealAdjustedPrice.getClass();
        LocalMoney.ADAPTER.encodeWithTag(protoWriter, 1, localMenuItemDealAdjustedPrice.original_price);
        protoWriter.writeBytes(localMenuItemDealAdjustedPrice.unknownFields());
    }
}
