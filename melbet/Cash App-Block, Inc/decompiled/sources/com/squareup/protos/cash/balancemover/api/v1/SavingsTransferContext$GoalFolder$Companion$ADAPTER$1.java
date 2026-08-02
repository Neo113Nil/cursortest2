package com.squareup.protos.cash.balancemover.api.v1;

import com.squareup.protos.cash.balancemover.api.v1.SavingsTransferContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SavingsTransferContext$GoalFolder$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsTransferContext.GoalFolder((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SavingsTransferContext.GoalFolder goalFolder = (SavingsTransferContext.GoalFolder) obj;
        reverseProtoWriter.getClass();
        goalFolder.getClass();
        reverseProtoWriter.writeBytes(goalFolder.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, goalFolder.goal_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsTransferContext.GoalFolder goalFolder = (SavingsTransferContext.GoalFolder) obj;
        goalFolder.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, goalFolder.goal_token) + goalFolder.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsTransferContext.GoalFolder goalFolder = (SavingsTransferContext.GoalFolder) obj;
        goalFolder.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = goalFolder.goal_token;
        byteString.getClass();
        return new SavingsTransferContext.GoalFolder(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsTransferContext.GoalFolder goalFolder = (SavingsTransferContext.GoalFolder) obj;
        goalFolder.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, goalFolder.goal_token);
        protoWriter.writeBytes(goalFolder.unknownFields());
    }
}
