package com.squareup.protos.rewardly.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class UiRewardProgramDetails$BottomUpsell$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new UiRewardProgramDetails.BottomUpsell((Icon) obj3, (String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiRewardProgramDetails.BottomUpsell bottomUpsell = (UiRewardProgramDetails.BottomUpsell) obj;
        reverseProtoWriter.getClass();
        bottomUpsell.getClass();
        reverseProtoWriter.writeBytes(bottomUpsell.unknownFields());
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 3, bottomUpsell.arcade_icon);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, bottomUpsell.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, bottomUpsell.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiRewardProgramDetails.BottomUpsell bottomUpsell = (UiRewardProgramDetails.BottomUpsell) obj;
        bottomUpsell.getClass();
        int size$okio = bottomUpsell.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Icon.ADAPTER.encodedSizeWithTag(3, bottomUpsell.arcade_icon) + protoAdapter.encodedSizeWithTag(2, bottomUpsell.body) + protoAdapter.encodedSizeWithTag(1, bottomUpsell.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiRewardProgramDetails.BottomUpsell bottomUpsell = (UiRewardProgramDetails.BottomUpsell) obj;
        bottomUpsell.getClass();
        Icon icon = bottomUpsell.arcade_icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = bottomUpsell.title;
        String str2 = bottomUpsell.body;
        byteString.getClass();
        return new UiRewardProgramDetails.BottomUpsell(icon2, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiRewardProgramDetails.BottomUpsell bottomUpsell = (UiRewardProgramDetails.BottomUpsell) obj;
        bottomUpsell.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, bottomUpsell.title);
        protoAdapter.encodeWithTag(protoWriter, 2, bottomUpsell.body);
        Icon.ADAPTER.encodeWithTag(protoWriter, 3, bottomUpsell.arcade_icon);
        protoWriter.writeBytes(bottomUpsell.unknownFields());
    }
}
