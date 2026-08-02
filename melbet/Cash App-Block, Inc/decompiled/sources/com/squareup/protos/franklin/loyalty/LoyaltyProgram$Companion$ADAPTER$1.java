package com.squareup.protos.franklin.loyalty;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LoyaltyProgram$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoyaltyProgram((String) obj, (String) obj2, (ProgramRewards) obj3, (LoyaltyUnit) obj4, (String) obj5, (String) obj6, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag != 1) {
                switch (nextTag) {
                    case 7:
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        obj3 = TransactorKt.decodeMessageOrMerge(ProgramRewards.ADAPTER, protoReader, obj3);
                        break;
                    case 9:
                        obj4 = TransactorKt.decodeMessageOrMerge(LoyaltyUnit.ADAPTER, protoReader, obj4);
                        break;
                    case 10:
                        obj5 = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 11:
                        obj6 = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 12:
                        obj7 = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        protoReader.readUnknownField(nextTag);
                        break;
                }
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LoyaltyProgram loyaltyProgram = (LoyaltyProgram) obj;
        reverseProtoWriter.getClass();
        loyaltyProgram.getClass();
        reverseProtoWriter.writeBytes(loyaltyProgram.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, loyaltyProgram.deep_link_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, loyaltyProgram.program_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, loyaltyProgram.render_json);
        LoyaltyUnit.ADAPTER.encodeWithTag(reverseProtoWriter, 9, loyaltyProgram.loyalty_unit);
        ProgramRewards.ADAPTER.encodeWithTag(reverseProtoWriter, 8, loyaltyProgram.program_rewards);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, loyaltyProgram.cash_merchant_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, loyaltyProgram.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoyaltyProgram loyaltyProgram = (LoyaltyProgram) obj;
        loyaltyProgram.getClass();
        int size$okio = loyaltyProgram.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(12, loyaltyProgram.deep_link_token) + protoAdapter.encodedSizeWithTag(11, loyaltyProgram.program_description) + protoAdapter.encodedSizeWithTag(10, loyaltyProgram.render_json) + LoyaltyUnit.ADAPTER.encodedSizeWithTag(9, loyaltyProgram.loyalty_unit) + ProgramRewards.ADAPTER.encodedSizeWithTag(8, loyaltyProgram.program_rewards) + protoAdapter.encodedSizeWithTag(7, loyaltyProgram.cash_merchant_token) + protoAdapter.encodedSizeWithTag(1, loyaltyProgram.id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoyaltyProgram loyaltyProgram = (LoyaltyProgram) obj;
        loyaltyProgram.getClass();
        ProgramRewards programRewards = loyaltyProgram.program_rewards;
        ProgramRewards programRewards2 = programRewards != null ? (ProgramRewards) ProgramRewards.ADAPTER.redact(programRewards) : null;
        LoyaltyUnit loyaltyUnit = loyaltyProgram.loyalty_unit;
        LoyaltyUnit loyaltyUnit2 = loyaltyUnit != null ? (LoyaltyUnit) LoyaltyUnit.ADAPTER.redact(loyaltyUnit) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = loyaltyProgram.id;
        String str2 = loyaltyProgram.cash_merchant_token;
        String str3 = loyaltyProgram.render_json;
        String str4 = loyaltyProgram.program_description;
        String str5 = loyaltyProgram.deep_link_token;
        byteString.getClass();
        return new LoyaltyProgram(str, str2, programRewards2, loyaltyUnit2, str3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoyaltyProgram loyaltyProgram = (LoyaltyProgram) obj;
        loyaltyProgram.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, loyaltyProgram.id);
        protoAdapter.encodeWithTag(protoWriter, 7, loyaltyProgram.cash_merchant_token);
        ProgramRewards.ADAPTER.encodeWithTag(protoWriter, 8, loyaltyProgram.program_rewards);
        LoyaltyUnit.ADAPTER.encodeWithTag(protoWriter, 9, loyaltyProgram.loyalty_unit);
        protoAdapter.encodeWithTag(protoWriter, 10, loyaltyProgram.render_json);
        protoAdapter.encodeWithTag(protoWriter, 11, loyaltyProgram.program_description);
        protoAdapter.encodeWithTag(protoWriter, 12, loyaltyProgram.deep_link_token);
        protoWriter.writeBytes(loyaltyProgram.unknownFields());
    }
}
