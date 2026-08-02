package com.squareup.protos.cash.groups;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ExpenseSlice$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ExpenseSlice((GroupParticipant) obj, (GroupParticipant) obj2, (Money) obj3, (SliceStatus) obj4, (String) obj5, (PrimaryAction) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(GroupParticipant.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(GroupParticipant.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    try {
                        obj4 = SliceStatus.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(PrimaryAction.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ExpenseSlice expenseSlice = (ExpenseSlice) obj;
        reverseProtoWriter.getClass();
        expenseSlice.getClass();
        reverseProtoWriter.writeBytes(expenseSlice.unknownFields());
        PrimaryAction.ADAPTER.encodeWithTag(reverseProtoWriter, 6, expenseSlice.action);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, expenseSlice.slice_token);
        SliceStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 4, expenseSlice.status);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, expenseSlice.amount);
        ProtoAdapter protoAdapter = GroupParticipant.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, expenseSlice.responder);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, expenseSlice.requester);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExpenseSlice expenseSlice = (ExpenseSlice) obj;
        expenseSlice.getClass();
        int size$okio = expenseSlice.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = GroupParticipant.ADAPTER;
        return PrimaryAction.ADAPTER.encodedSizeWithTag(6, expenseSlice.action) + ProtoAdapter.STRING.encodedSizeWithTag(5, expenseSlice.slice_token) + SliceStatus.ADAPTER.encodedSizeWithTag(4, expenseSlice.status) + Money.ADAPTER.encodedSizeWithTag(3, expenseSlice.amount) + protoAdapter.encodedSizeWithTag(2, expenseSlice.responder) + protoAdapter.encodedSizeWithTag(1, expenseSlice.requester) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExpenseSlice expenseSlice = (ExpenseSlice) obj;
        expenseSlice.getClass();
        GroupParticipant groupParticipant = expenseSlice.requester;
        GroupParticipant groupParticipant2 = groupParticipant != null ? (GroupParticipant) GroupParticipant.ADAPTER.redact(groupParticipant) : null;
        GroupParticipant groupParticipant3 = expenseSlice.responder;
        GroupParticipant groupParticipant4 = groupParticipant3 != null ? (GroupParticipant) GroupParticipant.ADAPTER.redact(groupParticipant3) : null;
        Money money = expenseSlice.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        PrimaryAction primaryAction = expenseSlice.action;
        PrimaryAction primaryAction2 = primaryAction != null ? (PrimaryAction) PrimaryAction.ADAPTER.redact(primaryAction) : null;
        ByteString byteString = ByteString.EMPTY;
        SliceStatus sliceStatus = expenseSlice.status;
        String str = expenseSlice.slice_token;
        byteString.getClass();
        return new ExpenseSlice(groupParticipant2, groupParticipant4, money2, sliceStatus, str, primaryAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExpenseSlice expenseSlice = (ExpenseSlice) obj;
        expenseSlice.getClass();
        ProtoAdapter protoAdapter = GroupParticipant.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, expenseSlice.requester);
        protoAdapter.encodeWithTag(protoWriter, 2, expenseSlice.responder);
        Money.ADAPTER.encodeWithTag(protoWriter, 3, expenseSlice.amount);
        SliceStatus.ADAPTER.encodeWithTag(protoWriter, 4, expenseSlice.status);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, expenseSlice.slice_token);
        PrimaryAction.ADAPTER.encodeWithTag(protoWriter, 6, expenseSlice.action);
        protoWriter.writeBytes(expenseSlice.unknownFields());
    }
}
