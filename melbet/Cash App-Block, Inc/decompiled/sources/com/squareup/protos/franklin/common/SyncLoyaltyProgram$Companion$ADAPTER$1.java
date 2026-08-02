package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.ui.UiLoyaltyProgram;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncLoyaltyProgram$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncLoyaltyProgram((UiLoyaltyProgram) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiLoyaltyProgram.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncLoyaltyProgram syncLoyaltyProgram = (SyncLoyaltyProgram) obj;
        reverseProtoWriter.getClass();
        syncLoyaltyProgram.getClass();
        reverseProtoWriter.writeBytes(syncLoyaltyProgram.unknownFields());
        UiLoyaltyProgram.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncLoyaltyProgram.loyalty_program);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncLoyaltyProgram syncLoyaltyProgram = (SyncLoyaltyProgram) obj;
        syncLoyaltyProgram.getClass();
        return UiLoyaltyProgram.ADAPTER.encodedSizeWithTag(1, syncLoyaltyProgram.loyalty_program) + syncLoyaltyProgram.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncLoyaltyProgram syncLoyaltyProgram = (SyncLoyaltyProgram) obj;
        syncLoyaltyProgram.getClass();
        UiLoyaltyProgram uiLoyaltyProgram = syncLoyaltyProgram.loyalty_program;
        UiLoyaltyProgram uiLoyaltyProgram2 = uiLoyaltyProgram != null ? (UiLoyaltyProgram) UiLoyaltyProgram.ADAPTER.redact(uiLoyaltyProgram) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SyncLoyaltyProgram(uiLoyaltyProgram2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncLoyaltyProgram syncLoyaltyProgram = (SyncLoyaltyProgram) obj;
        syncLoyaltyProgram.getClass();
        UiLoyaltyProgram.ADAPTER.encodeWithTag(protoWriter, 1, syncLoyaltyProgram.loyalty_program);
        protoWriter.writeBytes(syncLoyaltyProgram.unknownFields());
    }
}
