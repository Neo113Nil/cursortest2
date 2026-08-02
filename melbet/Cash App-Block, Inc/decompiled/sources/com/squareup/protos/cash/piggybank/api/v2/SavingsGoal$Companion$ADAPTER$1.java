package com.squareup.protos.cash.piggybank.api.v2;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.piggybank.api.v2.SavingsGoal;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SavingsGoal$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsGoal((String) obj5, (String) obj6, (Money) obj7, (SavingsGoal.GoalState) obj8, (SavingsGoalEmoji) obj9, (String) obj10, (SavingsGoal.GoalSchemaVersion) obj11, (Boolean) obj12, (Money) obj13, (Long) obj14, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = obj6;
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    obj6 = obj;
                    break;
                case 2:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj = obj6;
                    obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                    obj6 = obj;
                    break;
                case 4:
                    obj2 = obj5;
                    obj = obj6;
                    try {
                        obj5 = obj2;
                        obj8 = SavingsGoal.GoalState.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj3 = obj8;
                        obj4 = obj9;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj6 = obj;
                    break;
                case 5:
                    obj9 = TransactorKt.decodeMessageOrMerge(SavingsGoalEmoji.ADAPTER, protoReader, obj9);
                    break;
                case 6:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    try {
                        obj11 = SavingsGoal.GoalSchemaVersion.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj2 = obj5;
                        obj = obj6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 8:
                    obj12 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 9:
                    obj13 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj13);
                    break;
                case 10:
                    obj14 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj2 = obj5;
                    obj = obj6;
                    obj3 = obj8;
                    obj4 = obj9;
                    obj5 = obj2;
                    obj9 = obj4;
                    obj8 = obj3;
                    obj6 = obj;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsGoal savingsGoal = (SavingsGoal) obj;
        reverseProtoWriter.getClass();
        savingsGoal.getClass();
        reverseProtoWriter.writeBytes(savingsGoal.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 10, savingsGoal.goal_balance_version);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, savingsGoal.goal_balance_amount);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 8, savingsGoal.is_active);
        SavingsGoal.GoalSchemaVersion.ADAPTER.encodeWithTag(reverseProtoWriter, 7, savingsGoal.goal_schema_version);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, savingsGoal.label);
        SavingsGoalEmoji.ADAPTER.encodeWithTag(reverseProtoWriter, 5, savingsGoal.title);
        SavingsGoal.GoalState.ADAPTER.encodeWithTag(reverseProtoWriter, 4, savingsGoal.goal_state);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, savingsGoal.goal_amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, savingsGoal.emoji_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, savingsGoal.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsGoal savingsGoal = (SavingsGoal) obj;
        savingsGoal.getClass();
        int size$okio = savingsGoal.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, savingsGoal.emoji_text) + protoAdapter.encodedSizeWithTag(1, savingsGoal.token) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return ProtoAdapter.INT64.encodedSizeWithTag(10, savingsGoal.goal_balance_version) + protoAdapter2.encodedSizeWithTag(9, savingsGoal.goal_balance_amount) + ProtoAdapter.BOOL.encodedSizeWithTag(8, savingsGoal.is_active) + SavingsGoal.GoalSchemaVersion.ADAPTER.encodedSizeWithTag(7, savingsGoal.goal_schema_version) + protoAdapter.encodedSizeWithTag(6, savingsGoal.label) + SavingsGoalEmoji.ADAPTER.encodedSizeWithTag(5, savingsGoal.title) + SavingsGoal.GoalState.ADAPTER.encodedSizeWithTag(4, savingsGoal.goal_state) + protoAdapter2.encodedSizeWithTag(3, savingsGoal.goal_amount) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsGoal savingsGoal = (SavingsGoal) obj;
        savingsGoal.getClass();
        Money money = savingsGoal.goal_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        SavingsGoalEmoji savingsGoalEmoji = savingsGoal.title;
        SavingsGoalEmoji savingsGoalEmoji2 = savingsGoalEmoji != null ? (SavingsGoalEmoji) SavingsGoalEmoji.ADAPTER.redact(savingsGoalEmoji) : null;
        Money money3 = savingsGoal.goal_balance_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = savingsGoal.token;
        String str2 = savingsGoal.emoji_text;
        SavingsGoal.GoalState goalState = savingsGoal.goal_state;
        String str3 = savingsGoal.label;
        SavingsGoal.GoalSchemaVersion goalSchemaVersion = savingsGoal.goal_schema_version;
        Boolean bool = savingsGoal.is_active;
        Long l = savingsGoal.goal_balance_version;
        byteString.getClass();
        return new SavingsGoal(str, str2, money2, goalState, savingsGoalEmoji2, str3, goalSchemaVersion, bool, money4, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsGoal savingsGoal = (SavingsGoal) obj;
        savingsGoal.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, savingsGoal.token);
        protoAdapter.encodeWithTag(protoWriter, 2, savingsGoal.emoji_text);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, savingsGoal.goal_amount);
        SavingsGoal.GoalState.ADAPTER.encodeWithTag(protoWriter, 4, savingsGoal.goal_state);
        SavingsGoalEmoji.ADAPTER.encodeWithTag(protoWriter, 5, savingsGoal.title);
        protoAdapter.encodeWithTag(protoWriter, 6, savingsGoal.label);
        SavingsGoal.GoalSchemaVersion.ADAPTER.encodeWithTag(protoWriter, 7, savingsGoal.goal_schema_version);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, savingsGoal.is_active);
        protoAdapter2.encodeWithTag(protoWriter, 9, savingsGoal.goal_balance_amount);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, savingsGoal.goal_balance_version);
        protoWriter.writeBytes(savingsGoal.unknownFields());
    }
}
