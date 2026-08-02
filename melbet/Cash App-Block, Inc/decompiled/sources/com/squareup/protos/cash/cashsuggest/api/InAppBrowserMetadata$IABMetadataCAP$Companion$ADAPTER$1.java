package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashstorefronts.api.RewardAmount;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InAppBrowserMetadata$IABMetadataCAP$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InAppBrowserMetadata.IABMetadataCAP((RewardAmount) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(RewardAmount.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InAppBrowserMetadata.IABMetadataCAP iABMetadataCAP = (InAppBrowserMetadata.IABMetadataCAP) obj;
        reverseProtoWriter.getClass();
        iABMetadataCAP.getClass();
        reverseProtoWriter.writeBytes(iABMetadataCAP.unknownFields());
        RewardAmount.ADAPTER.encodeWithTag(reverseProtoWriter, 2, iABMetadataCAP.reward);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InAppBrowserMetadata.IABMetadataCAP iABMetadataCAP = (InAppBrowserMetadata.IABMetadataCAP) obj;
        iABMetadataCAP.getClass();
        return RewardAmount.ADAPTER.encodedSizeWithTag(2, iABMetadataCAP.reward) + iABMetadataCAP.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InAppBrowserMetadata.IABMetadataCAP iABMetadataCAP = (InAppBrowserMetadata.IABMetadataCAP) obj;
        iABMetadataCAP.getClass();
        RewardAmount rewardAmount = iABMetadataCAP.reward;
        RewardAmount rewardAmount2 = rewardAmount != null ? (RewardAmount) RewardAmount.ADAPTER.redact(rewardAmount) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InAppBrowserMetadata.IABMetadataCAP(rewardAmount2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InAppBrowserMetadata.IABMetadataCAP iABMetadataCAP = (InAppBrowserMetadata.IABMetadataCAP) obj;
        iABMetadataCAP.getClass();
        RewardAmount.ADAPTER.encodeWithTag(protoWriter, 2, iABMetadataCAP.reward);
        protoWriter.writeBytes(iABMetadataCAP.unknownFields());
    }
}
