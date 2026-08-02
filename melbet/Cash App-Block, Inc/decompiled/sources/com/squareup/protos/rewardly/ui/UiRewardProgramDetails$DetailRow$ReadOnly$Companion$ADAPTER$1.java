package com.squareup.protos.rewardly.ui;

import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiRewardProgramDetails$DetailRow$ReadOnly$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiRewardProgramDetails.DetailRow.ReadOnly(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiRewardProgramDetails.DetailRow.ReadOnly readOnly = (UiRewardProgramDetails.DetailRow.ReadOnly) obj;
        reverseProtoWriter.getClass();
        readOnly.getClass();
        reverseProtoWriter.writeBytes(readOnly.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiRewardProgramDetails.DetailRow.ReadOnly readOnly = (UiRewardProgramDetails.DetailRow.ReadOnly) obj;
        readOnly.getClass();
        return readOnly.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((UiRewardProgramDetails.DetailRow.ReadOnly) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UiRewardProgramDetails.DetailRow.ReadOnly(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiRewardProgramDetails.DetailRow.ReadOnly readOnly = (UiRewardProgramDetails.DetailRow.ReadOnly) obj;
        readOnly.getClass();
        protoWriter.writeBytes(readOnly.unknownFields());
    }
}
