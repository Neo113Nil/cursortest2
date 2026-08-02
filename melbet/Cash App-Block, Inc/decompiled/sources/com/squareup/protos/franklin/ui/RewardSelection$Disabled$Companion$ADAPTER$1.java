package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.RewardSelection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RewardSelection$Disabled$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RewardSelection.Disabled(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RewardSelection.Disabled disabled = (RewardSelection.Disabled) obj;
        reverseProtoWriter.getClass();
        disabled.getClass();
        reverseProtoWriter.writeBytes(disabled.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RewardSelection.Disabled disabled = (RewardSelection.Disabled) obj;
        disabled.getClass();
        return disabled.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((RewardSelection.Disabled) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RewardSelection.Disabled(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RewardSelection.Disabled disabled = (RewardSelection.Disabled) obj;
        disabled.getClass();
        protoWriter.writeBytes(disabled.unknownFields());
    }
}
