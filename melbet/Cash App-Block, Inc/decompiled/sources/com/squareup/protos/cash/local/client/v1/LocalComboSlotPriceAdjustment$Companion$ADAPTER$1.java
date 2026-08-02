package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalComboSlotPriceAdjustment$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LocalComboSlotPriceAdjustment((String) obj, (String) obj2, (LocalMoney) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalComboSlotPriceAdjustment localComboSlotPriceAdjustment = (LocalComboSlotPriceAdjustment) obj;
        reverseProtoWriter.getClass();
        localComboSlotPriceAdjustment.getClass();
        reverseProtoWriter.writeBytes(localComboSlotPriceAdjustment.unknownFields());
        LocalMoney.ADAPTER.encodeWithTag(reverseProtoWriter, 3, localComboSlotPriceAdjustment.price_adjustment);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localComboSlotPriceAdjustment.variation_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localComboSlotPriceAdjustment.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalComboSlotPriceAdjustment localComboSlotPriceAdjustment = (LocalComboSlotPriceAdjustment) obj;
        localComboSlotPriceAdjustment.getClass();
        int size$okio = localComboSlotPriceAdjustment.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalMoney.ADAPTER.encodedSizeWithTag(3, localComboSlotPriceAdjustment.price_adjustment) + protoAdapter.encodedSizeWithTag(2, localComboSlotPriceAdjustment.variation_token) + protoAdapter.encodedSizeWithTag(1, localComboSlotPriceAdjustment.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalComboSlotPriceAdjustment localComboSlotPriceAdjustment = (LocalComboSlotPriceAdjustment) obj;
        localComboSlotPriceAdjustment.getClass();
        LocalMoney localMoney = localComboSlotPriceAdjustment.price_adjustment;
        LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = localComboSlotPriceAdjustment.token;
        String str2 = localComboSlotPriceAdjustment.variation_token;
        byteString.getClass();
        return new LocalComboSlotPriceAdjustment(str, str2, localMoney2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalComboSlotPriceAdjustment localComboSlotPriceAdjustment = (LocalComboSlotPriceAdjustment) obj;
        localComboSlotPriceAdjustment.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localComboSlotPriceAdjustment.token);
        protoAdapter.encodeWithTag(protoWriter, 2, localComboSlotPriceAdjustment.variation_token);
        LocalMoney.ADAPTER.encodeWithTag(protoWriter, 3, localComboSlotPriceAdjustment.price_adjustment);
        protoWriter.writeBytes(localComboSlotPriceAdjustment.unknownFields());
    }
}
