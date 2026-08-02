package com.squareup.protos.rewardly.ui;

import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiRewardProgramDetails$DetailRow$OpenUrl$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiRewardProgramDetails.DetailRow.OpenUrl((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiRewardProgramDetails.DetailRow.OpenUrl openUrl = (UiRewardProgramDetails.DetailRow.OpenUrl) obj;
        reverseProtoWriter.getClass();
        openUrl.getClass();
        reverseProtoWriter.writeBytes(openUrl.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, openUrl.url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiRewardProgramDetails.DetailRow.OpenUrl openUrl = (UiRewardProgramDetails.DetailRow.OpenUrl) obj;
        openUrl.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, openUrl.url) + openUrl.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiRewardProgramDetails.DetailRow.OpenUrl openUrl = (UiRewardProgramDetails.DetailRow.OpenUrl) obj;
        openUrl.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = openUrl.url;
        byteString.getClass();
        return new UiRewardProgramDetails.DetailRow.OpenUrl(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiRewardProgramDetails.DetailRow.OpenUrl openUrl = (UiRewardProgramDetails.DetailRow.OpenUrl) obj;
        openUrl.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, openUrl.url);
        protoWriter.writeBytes(openUrl.unknownFields());
    }
}
