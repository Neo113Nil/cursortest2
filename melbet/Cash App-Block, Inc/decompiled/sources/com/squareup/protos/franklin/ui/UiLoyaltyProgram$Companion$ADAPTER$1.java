package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.loyalty.LoyaltyProgram;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiLoyaltyProgram$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiLoyaltyProgram((LoyaltyProgram) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LoyaltyProgram.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiLoyaltyProgram uiLoyaltyProgram = (UiLoyaltyProgram) obj;
        reverseProtoWriter.getClass();
        uiLoyaltyProgram.getClass();
        reverseProtoWriter.writeBytes(uiLoyaltyProgram.unknownFields());
        LoyaltyProgram.ADAPTER.encodeWithTag(reverseProtoWriter, 1, uiLoyaltyProgram.loyalty_program);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiLoyaltyProgram uiLoyaltyProgram = (UiLoyaltyProgram) obj;
        uiLoyaltyProgram.getClass();
        return LoyaltyProgram.ADAPTER.encodedSizeWithTag(1, uiLoyaltyProgram.loyalty_program) + uiLoyaltyProgram.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiLoyaltyProgram uiLoyaltyProgram = (UiLoyaltyProgram) obj;
        uiLoyaltyProgram.getClass();
        LoyaltyProgram loyaltyProgram = uiLoyaltyProgram.loyalty_program;
        LoyaltyProgram loyaltyProgram2 = loyaltyProgram != null ? (LoyaltyProgram) LoyaltyProgram.ADAPTER.redact(loyaltyProgram) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UiLoyaltyProgram(loyaltyProgram2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiLoyaltyProgram uiLoyaltyProgram = (UiLoyaltyProgram) obj;
        uiLoyaltyProgram.getClass();
        LoyaltyProgram.ADAPTER.encodeWithTag(protoWriter, 1, uiLoyaltyProgram.loyalty_program);
        protoWriter.writeBytes(uiLoyaltyProgram.unknownFields());
    }
}
