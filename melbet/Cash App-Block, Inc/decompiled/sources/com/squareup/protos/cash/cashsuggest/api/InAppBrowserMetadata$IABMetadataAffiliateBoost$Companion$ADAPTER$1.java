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
public final class InAppBrowserMetadata$IABMetadataAffiliateBoost$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InAppBrowserMetadata.IABMetadataAffiliateBoost((String) obj, (RewardAmount) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(RewardAmount.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InAppBrowserMetadata.IABMetadataAffiliateBoost iABMetadataAffiliateBoost = (InAppBrowserMetadata.IABMetadataAffiliateBoost) obj;
        reverseProtoWriter.getClass();
        iABMetadataAffiliateBoost.getClass();
        reverseProtoWriter.writeBytes(iABMetadataAffiliateBoost.unknownFields());
        RewardAmount.ADAPTER.encodeWithTag(reverseProtoWriter, 3, iABMetadataAffiliateBoost.reward);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, iABMetadataAffiliateBoost.boost_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InAppBrowserMetadata.IABMetadataAffiliateBoost iABMetadataAffiliateBoost = (InAppBrowserMetadata.IABMetadataAffiliateBoost) obj;
        iABMetadataAffiliateBoost.getClass();
        return RewardAmount.ADAPTER.encodedSizeWithTag(3, iABMetadataAffiliateBoost.reward) + ProtoAdapter.STRING.encodedSizeWithTag(2, iABMetadataAffiliateBoost.boost_token) + iABMetadataAffiliateBoost.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InAppBrowserMetadata.IABMetadataAffiliateBoost iABMetadataAffiliateBoost = (InAppBrowserMetadata.IABMetadataAffiliateBoost) obj;
        iABMetadataAffiliateBoost.getClass();
        RewardAmount rewardAmount = iABMetadataAffiliateBoost.reward;
        RewardAmount rewardAmount2 = rewardAmount != null ? (RewardAmount) RewardAmount.ADAPTER.redact(rewardAmount) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = iABMetadataAffiliateBoost.boost_token;
        byteString.getClass();
        return new InAppBrowserMetadata.IABMetadataAffiliateBoost(str, rewardAmount2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InAppBrowserMetadata.IABMetadataAffiliateBoost iABMetadataAffiliateBoost = (InAppBrowserMetadata.IABMetadataAffiliateBoost) obj;
        iABMetadataAffiliateBoost.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, iABMetadataAffiliateBoost.boost_token);
        RewardAmount.ADAPTER.encodeWithTag(protoWriter, 3, iABMetadataAffiliateBoost.reward);
        protoWriter.writeBytes(iABMetadataAffiliateBoost.unknownFields());
    }
}
