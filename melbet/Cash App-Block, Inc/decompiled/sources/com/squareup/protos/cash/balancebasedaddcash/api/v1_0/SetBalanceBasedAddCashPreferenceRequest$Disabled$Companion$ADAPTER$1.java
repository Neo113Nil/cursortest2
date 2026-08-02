package com.squareup.protos.cash.balancebasedaddcash.api.v1_0;

import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.SetBalanceBasedAddCashPreferenceRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SetBalanceBasedAddCashPreferenceRequest$Disabled$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetBalanceBasedAddCashPreferenceRequest.Disabled(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetBalanceBasedAddCashPreferenceRequest.Disabled disabled = (SetBalanceBasedAddCashPreferenceRequest.Disabled) obj;
        reverseProtoWriter.getClass();
        disabled.getClass();
        reverseProtoWriter.writeBytes(disabled.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetBalanceBasedAddCashPreferenceRequest.Disabled disabled = (SetBalanceBasedAddCashPreferenceRequest.Disabled) obj;
        disabled.getClass();
        return disabled.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SetBalanceBasedAddCashPreferenceRequest.Disabled) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SetBalanceBasedAddCashPreferenceRequest.Disabled(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetBalanceBasedAddCashPreferenceRequest.Disabled disabled = (SetBalanceBasedAddCashPreferenceRequest.Disabled) obj;
        disabled.getClass();
        protoWriter.writeBytes(disabled.unknownFields());
    }
}
