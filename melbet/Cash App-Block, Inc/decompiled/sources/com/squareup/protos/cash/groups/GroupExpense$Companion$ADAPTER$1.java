package com.squareup.protos.cash.groups;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GroupExpense$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        ?? r3 = 0;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Long l = null;
        Object obj4 = null;
        Integer num = null;
        String str3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            String str4 = r3;
            if (nextTag == -1) {
                return new GroupExpense(str4, str, str2, bool, (PrimaryAction) obj, (Money) obj2, (Money) obj3, m, l, (Money) obj4, num, str3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    r3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    str = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                    obj = TransactorKt.decodeMessageOrMerge(PrimaryAction.ADAPTER, protoReader, obj);
                    break;
                case 6:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    break;
                case 7:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 8:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    break;
                case 9:
                    m.add(ExpenseSlice.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 11:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    break;
                case 12:
                    num = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 13:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
            }
            r3 = str4;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GroupExpense groupExpense = (GroupExpense) obj;
        reverseProtoWriter.getClass();
        groupExpense.getClass();
        reverseProtoWriter.writeBytes(groupExpense.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, groupExpense.expense_token);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 12, groupExpense.expense_slices_paid_count);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, groupExpense.paid_amount);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 10, groupExpense.created_at_millis);
        ExpenseSlice.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 9, groupExpense.slice);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, groupExpense.total_amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, groupExpense.pending_amount);
        PrimaryAction.ADAPTER.encodeWithTag(reverseProtoWriter, 5, groupExpense.action);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, groupExpense.is_completed);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, groupExpense.requester_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, groupExpense.group_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, groupExpense.note);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GroupExpense groupExpense = (GroupExpense) obj;
        groupExpense.getClass();
        int size$okio = groupExpense.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = PrimaryAction.ADAPTER.encodedSizeWithTag(5, groupExpense.action) + ProtoAdapter.BOOL.encodedSizeWithTag(4, groupExpense.is_completed) + protoAdapter.encodedSizeWithTag(3, groupExpense.requester_token) + protoAdapter.encodedSizeWithTag(2, groupExpense.group_token) + protoAdapter.encodedSizeWithTag(1, groupExpense.note) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(13, groupExpense.expense_token) + ProtoAdapter.INT32.encodedSizeWithTag(12, groupExpense.expense_slices_paid_count) + protoAdapter2.encodedSizeWithTag(11, groupExpense.paid_amount) + ProtoAdapter.INT64.encodedSizeWithTag(10, groupExpense.created_at_millis) + ExpenseSlice.ADAPTER.asRepeated().encodedSizeWithTag(9, groupExpense.slice) + protoAdapter2.encodedSizeWithTag(8, groupExpense.total_amount) + protoAdapter2.encodedSizeWithTag(6, groupExpense.pending_amount) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GroupExpense groupExpense = (GroupExpense) obj;
        groupExpense.getClass();
        PrimaryAction primaryAction = groupExpense.action;
        PrimaryAction primaryAction2 = primaryAction != null ? (PrimaryAction) PrimaryAction.ADAPTER.redact(primaryAction) : null;
        Money money = groupExpense.pending_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = groupExpense.total_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(groupExpense.slice, ExpenseSlice.ADAPTER);
        Money money5 = groupExpense.paid_amount;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = groupExpense.note;
        String str2 = groupExpense.group_token;
        String str3 = groupExpense.requester_token;
        Boolean bool = groupExpense.is_completed;
        Long l = groupExpense.created_at_millis;
        Integer num = groupExpense.expense_slices_paid_count;
        String str4 = groupExpense.expense_token;
        byteString.getClass();
        return new GroupExpense(str, str2, str3, bool, primaryAction2, money2, money4, m1169redactElements, l, money6, num, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GroupExpense groupExpense = (GroupExpense) obj;
        groupExpense.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, groupExpense.note);
        protoAdapter.encodeWithTag(protoWriter, 2, groupExpense.group_token);
        protoAdapter.encodeWithTag(protoWriter, 3, groupExpense.requester_token);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, groupExpense.is_completed);
        PrimaryAction.ADAPTER.encodeWithTag(protoWriter, 5, groupExpense.action);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 6, groupExpense.pending_amount);
        protoAdapter2.encodeWithTag(protoWriter, 8, groupExpense.total_amount);
        ExpenseSlice.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, groupExpense.slice);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, groupExpense.created_at_millis);
        protoAdapter2.encodeWithTag(protoWriter, 11, groupExpense.paid_amount);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, groupExpense.expense_slices_paid_count);
        protoAdapter.encodeWithTag(protoWriter, 13, groupExpense.expense_token);
        protoWriter.writeBytes(groupExpense.unknownFields());
    }
}
