package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.RewardSelection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RewardSelection$Active$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RewardSelection.Active(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RewardSelection.Active active = (RewardSelection.Active) obj;
        reverseProtoWriter.getClass();
        active.getClass();
        reverseProtoWriter.writeBytes(active.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RewardSelection.Active active = (RewardSelection.Active) obj;
        active.getClass();
        return active.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((RewardSelection.Active) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RewardSelection.Active(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RewardSelection.Active active = (RewardSelection.Active) obj;
        active.getClass();
        protoWriter.writeBytes(active.unknownFields());
    }
}
