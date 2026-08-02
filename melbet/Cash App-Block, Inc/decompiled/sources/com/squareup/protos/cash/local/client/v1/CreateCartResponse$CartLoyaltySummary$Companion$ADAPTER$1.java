package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateCartResponse$CartLoyaltySummary$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateCartResponse.CartLoyaltySummary((LocalLoyaltyProgram) obj, (LocalLoyaltyAccount) obj2, m, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalLoyaltyProgram.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalLoyaltyAccount.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateCartResponse.CartLoyaltySummary cartLoyaltySummary = (CreateCartResponse.CartLoyaltySummary) obj;
        reverseProtoWriter.getClass();
        cartLoyaltySummary.getClass();
        reverseProtoWriter.writeBytes(cartLoyaltySummary.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cartLoyaltySummary.selected_reward_token);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, cartLoyaltySummary.applicable_reward_tokens);
        LocalLoyaltyAccount.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cartLoyaltySummary.loyalty_account);
        LocalLoyaltyProgram.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cartLoyaltySummary.loyalty_program);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateCartResponse.CartLoyaltySummary cartLoyaltySummary = (CreateCartResponse.CartLoyaltySummary) obj;
        cartLoyaltySummary.getClass();
        int encodedSizeWithTag = LocalLoyaltyAccount.ADAPTER.encodedSizeWithTag(2, cartLoyaltySummary.loyalty_account) + LocalLoyaltyProgram.ADAPTER.encodedSizeWithTag(1, cartLoyaltySummary.loyalty_program) + cartLoyaltySummary.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, cartLoyaltySummary.selected_reward_token) + protoAdapter.asRepeated().encodedSizeWithTag(3, cartLoyaltySummary.applicable_reward_tokens) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateCartResponse.CartLoyaltySummary cartLoyaltySummary = (CreateCartResponse.CartLoyaltySummary) obj;
        cartLoyaltySummary.getClass();
        LocalLoyaltyProgram localLoyaltyProgram = cartLoyaltySummary.loyalty_program;
        LocalLoyaltyProgram localLoyaltyProgram2 = localLoyaltyProgram != null ? (LocalLoyaltyProgram) LocalLoyaltyProgram.ADAPTER.redact(localLoyaltyProgram) : null;
        LocalLoyaltyAccount localLoyaltyAccount = cartLoyaltySummary.loyalty_account;
        LocalLoyaltyAccount localLoyaltyAccount2 = localLoyaltyAccount != null ? (LocalLoyaltyAccount) LocalLoyaltyAccount.ADAPTER.redact(localLoyaltyAccount) : null;
        ByteString byteString = ByteString.EMPTY;
        List list = cartLoyaltySummary.applicable_reward_tokens;
        String str = cartLoyaltySummary.selected_reward_token;
        list.getClass();
        byteString.getClass();
        return new CreateCartResponse.CartLoyaltySummary(localLoyaltyProgram2, localLoyaltyAccount2, list, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateCartResponse.CartLoyaltySummary cartLoyaltySummary = (CreateCartResponse.CartLoyaltySummary) obj;
        cartLoyaltySummary.getClass();
        LocalLoyaltyProgram.ADAPTER.encodeWithTag(protoWriter, 1, cartLoyaltySummary.loyalty_program);
        LocalLoyaltyAccount.ADAPTER.encodeWithTag(protoWriter, 2, cartLoyaltySummary.loyalty_account);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, cartLoyaltySummary.applicable_reward_tokens);
        protoAdapter.encodeWithTag(protoWriter, 4, cartLoyaltySummary.selected_reward_token);
        protoWriter.writeBytes(cartLoyaltySummary.unknownFields());
    }
}
