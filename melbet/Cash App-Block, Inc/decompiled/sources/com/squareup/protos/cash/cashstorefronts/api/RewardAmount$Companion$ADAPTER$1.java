package com.squareup.protos.cash.cashstorefronts.api;

import com.google.android.gms.internal.mlkit_vision_barcode.zzuk;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RewardAmount$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzuk zzukVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RewardAmount(zzukVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzukVar = new RewardAmount$Data$RewardRelativeAmount((RewardRelativeAmount) RewardRelativeAmount.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzukVar = new RewardAmount$Data$RewardConstantAmount((RewardConstantAmount) RewardConstantAmount.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RewardAmount rewardAmount = (RewardAmount) obj;
        reverseProtoWriter.getClass();
        rewardAmount.getClass();
        reverseProtoWriter.writeBytes(rewardAmount.unknownFields());
        zzuk zzukVar = rewardAmount.data;
        if (zzukVar instanceof RewardAmount$Data$RewardRelativeAmount) {
            RewardRelativeAmount.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((RewardAmount$Data$RewardRelativeAmount) zzukVar).value);
        } else if (zzukVar instanceof RewardAmount$Data$RewardConstantAmount) {
            RewardConstantAmount.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((RewardAmount$Data$RewardConstantAmount) zzukVar).value);
        } else {
            if (zzukVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        RewardAmount rewardAmount = (RewardAmount) obj;
        rewardAmount.getClass();
        int size$okio = rewardAmount.unknownFields().getSize$okio();
        zzuk zzukVar = rewardAmount.data;
        if (zzukVar instanceof RewardAmount$Data$RewardRelativeAmount) {
            encodedSizeWithTag = RewardRelativeAmount.ADAPTER.encodedSizeWithTag(1, ((RewardAmount$Data$RewardRelativeAmount) zzukVar).value);
        } else {
            if (!(zzukVar instanceof RewardAmount$Data$RewardConstantAmount)) {
                if (zzukVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = RewardConstantAmount.ADAPTER.encodedSizeWithTag(2, ((RewardAmount$Data$RewardConstantAmount) zzukVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RewardAmount rewardAmount = (RewardAmount) obj;
        rewardAmount.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzuk zzukVar = rewardAmount.data;
        byteString.getClass();
        return new RewardAmount(zzukVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RewardAmount rewardAmount = (RewardAmount) obj;
        rewardAmount.getClass();
        zzuk zzukVar = rewardAmount.data;
        if (zzukVar instanceof RewardAmount$Data$RewardRelativeAmount) {
            RewardRelativeAmount.ADAPTER.encodeWithTag(protoWriter, 1, ((RewardAmount$Data$RewardRelativeAmount) zzukVar).value);
        } else if (zzukVar instanceof RewardAmount$Data$RewardConstantAmount) {
            RewardConstantAmount.ADAPTER.encodeWithTag(protoWriter, 2, ((RewardAmount$Data$RewardConstantAmount) zzukVar).value);
        } else if (zzukVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(rewardAmount.unknownFields());
    }
}
