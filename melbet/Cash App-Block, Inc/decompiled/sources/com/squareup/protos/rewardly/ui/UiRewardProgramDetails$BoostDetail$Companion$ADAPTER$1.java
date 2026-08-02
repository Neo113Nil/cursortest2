package com.squareup.protos.rewardly.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import com.squareup.protos.rewardly.ui.common.Icon;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class UiRewardProgramDetails$BoostDetail$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiRewardProgramDetails.BoostDetail((Icon) obj, (IconAsset) obj2, (String) obj3, (com.squareup.protos.cash.ui.Icon) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Icon.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(IconAsset.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(com.squareup.protos.cash.ui.Icon.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiRewardProgramDetails.BoostDetail boostDetail = (UiRewardProgramDetails.BoostDetail) obj;
        reverseProtoWriter.getClass();
        boostDetail.getClass();
        reverseProtoWriter.writeBytes(boostDetail.unknownFields());
        com.squareup.protos.cash.ui.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 4, boostDetail.arcade_icon);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, boostDetail.detail_text);
        IconAsset.ADAPTER.encodeWithTag(reverseProtoWriter, 3, boostDetail.icon_asset);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, boostDetail.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiRewardProgramDetails.BoostDetail boostDetail = (UiRewardProgramDetails.BoostDetail) obj;
        boostDetail.getClass();
        return com.squareup.protos.cash.ui.Icon.ADAPTER.encodedSizeWithTag(4, boostDetail.arcade_icon) + ProtoAdapter.STRING.encodedSizeWithTag(2, boostDetail.detail_text) + IconAsset.ADAPTER.encodedSizeWithTag(3, boostDetail.icon_asset) + Icon.ADAPTER.encodedSizeWithTag(1, boostDetail.icon) + boostDetail.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiRewardProgramDetails.BoostDetail boostDetail = (UiRewardProgramDetails.BoostDetail) obj;
        boostDetail.getClass();
        IconAsset iconAsset = boostDetail.icon_asset;
        IconAsset iconAsset2 = iconAsset != null ? (IconAsset) IconAsset.ADAPTER.redact(iconAsset) : null;
        com.squareup.protos.cash.ui.Icon icon = boostDetail.arcade_icon;
        com.squareup.protos.cash.ui.Icon icon2 = icon != null ? (com.squareup.protos.cash.ui.Icon) com.squareup.protos.cash.ui.Icon.ADAPTER.redact(icon) : null;
        ByteString byteString = ByteString.EMPTY;
        Icon icon3 = boostDetail.icon;
        String str = boostDetail.detail_text;
        byteString.getClass();
        return new UiRewardProgramDetails.BoostDetail(icon3, iconAsset2, str, icon2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiRewardProgramDetails.BoostDetail boostDetail = (UiRewardProgramDetails.BoostDetail) obj;
        boostDetail.getClass();
        Icon.ADAPTER.encodeWithTag(protoWriter, 1, boostDetail.icon);
        IconAsset.ADAPTER.encodeWithTag(protoWriter, 3, boostDetail.icon_asset);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, boostDetail.detail_text);
        com.squareup.protos.cash.ui.Icon.ADAPTER.encodeWithTag(protoWriter, 4, boostDetail.arcade_icon);
        protoWriter.writeBytes(boostDetail.unknownFields());
    }
}
