package com.squareup.protos.cash.cashface.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.franklin.common.RewardsData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$BoostElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement.BoostElement((RewardsData) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RewardsData.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement.BoostElement boostElement = (GenericProfileElement.BoostElement) obj;
        reverseProtoWriter.getClass();
        boostElement.getClass();
        reverseProtoWriter.writeBytes(boostElement.unknownFields());
        RewardsData.ADAPTER.encodeWithTag(reverseProtoWriter, 1, boostElement.rewards_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericProfileElement.BoostElement boostElement = (GenericProfileElement.BoostElement) obj;
        boostElement.getClass();
        return RewardsData.ADAPTER.encodedSizeWithTag(1, boostElement.rewards_data) + boostElement.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement.BoostElement boostElement = (GenericProfileElement.BoostElement) obj;
        boostElement.getClass();
        RewardsData rewardsData = boostElement.rewards_data;
        RewardsData rewardsData2 = rewardsData != null ? (RewardsData) RewardsData.ADAPTER.redact(rewardsData) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GenericProfileElement.BoostElement(rewardsData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.BoostElement boostElement = (GenericProfileElement.BoostElement) obj;
        boostElement.getClass();
        RewardsData.ADAPTER.encodeWithTag(protoWriter, 1, boostElement.rewards_data);
        protoWriter.writeBytes(boostElement.unknownFields());
    }
}
