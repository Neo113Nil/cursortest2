package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.RewardsData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BoostCarouselContainer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BoostCarouselContainer((RewardsData) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        BoostCarouselContainer boostCarouselContainer = (BoostCarouselContainer) obj;
        reverseProtoWriter.getClass();
        boostCarouselContainer.getClass();
        reverseProtoWriter.writeBytes(boostCarouselContainer.unknownFields());
        RewardsData.ADAPTER.encodeWithTag(reverseProtoWriter, 1, boostCarouselContainer.rewards_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BoostCarouselContainer boostCarouselContainer = (BoostCarouselContainer) obj;
        boostCarouselContainer.getClass();
        return RewardsData.ADAPTER.encodedSizeWithTag(1, boostCarouselContainer.rewards_data) + boostCarouselContainer.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BoostCarouselContainer boostCarouselContainer = (BoostCarouselContainer) obj;
        boostCarouselContainer.getClass();
        RewardsData rewardsData = boostCarouselContainer.rewards_data;
        RewardsData rewardsData2 = rewardsData != null ? (RewardsData) RewardsData.ADAPTER.redact(rewardsData) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BoostCarouselContainer(rewardsData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BoostCarouselContainer boostCarouselContainer = (BoostCarouselContainer) obj;
        boostCarouselContainer.getClass();
        RewardsData.ADAPTER.encodeWithTag(protoWriter, 1, boostCarouselContainer.rewards_data);
        protoWriter.writeBytes(boostCarouselContainer.unknownFields());
    }
}
