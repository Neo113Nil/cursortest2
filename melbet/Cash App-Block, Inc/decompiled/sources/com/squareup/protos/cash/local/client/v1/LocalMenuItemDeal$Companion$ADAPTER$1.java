package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuItemDeal$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        LocalMenuItemDeal$Deal$AdjustedPrice localMenuItemDeal$Deal$AdjustedPrice = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalMenuItemDeal(localMenuItemDeal$Deal$AdjustedPrice, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                localMenuItemDeal$Deal$AdjustedPrice = new LocalMenuItemDeal$Deal$AdjustedPrice((LocalMenuItemDealAdjustedPrice) LocalMenuItemDealAdjustedPrice.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuItemDeal localMenuItemDeal = (LocalMenuItemDeal) obj;
        reverseProtoWriter.getClass();
        localMenuItemDeal.getClass();
        reverseProtoWriter.writeBytes(localMenuItemDeal.unknownFields());
        LocalMenuItemDeal$Deal$AdjustedPrice localMenuItemDeal$Deal$AdjustedPrice = localMenuItemDeal.deal;
        if (localMenuItemDeal$Deal$AdjustedPrice != null) {
            LocalMenuItemDealAdjustedPrice.ADAPTER.encodeWithTag(reverseProtoWriter, 1, localMenuItemDeal$Deal$AdjustedPrice.value);
        } else {
            if (localMenuItemDeal$Deal$AdjustedPrice == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMenuItemDeal localMenuItemDeal = (LocalMenuItemDeal) obj;
        localMenuItemDeal.getClass();
        int size$okio = localMenuItemDeal.unknownFields().getSize$okio();
        LocalMenuItemDeal$Deal$AdjustedPrice localMenuItemDeal$Deal$AdjustedPrice = localMenuItemDeal.deal;
        if (localMenuItemDeal$Deal$AdjustedPrice != null) {
            return LocalMenuItemDealAdjustedPrice.ADAPTER.encodedSizeWithTag(1, localMenuItemDeal$Deal$AdjustedPrice.value) + size$okio;
        }
        if (localMenuItemDeal$Deal$AdjustedPrice == null) {
            return size$okio;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuItemDeal localMenuItemDeal = (LocalMenuItemDeal) obj;
        localMenuItemDeal.getClass();
        ByteString byteString = ByteString.EMPTY;
        LocalMenuItemDeal$Deal$AdjustedPrice localMenuItemDeal$Deal$AdjustedPrice = localMenuItemDeal.deal;
        byteString.getClass();
        return new LocalMenuItemDeal(localMenuItemDeal$Deal$AdjustedPrice, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuItemDeal localMenuItemDeal = (LocalMenuItemDeal) obj;
        localMenuItemDeal.getClass();
        LocalMenuItemDeal$Deal$AdjustedPrice localMenuItemDeal$Deal$AdjustedPrice = localMenuItemDeal.deal;
        if (localMenuItemDeal$Deal$AdjustedPrice != null) {
            LocalMenuItemDealAdjustedPrice.ADAPTER.encodeWithTag(protoWriter, 1, localMenuItemDeal$Deal$AdjustedPrice.value);
        } else if (localMenuItemDeal$Deal$AdjustedPrice != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(localMenuItemDeal.unknownFields());
    }
}
