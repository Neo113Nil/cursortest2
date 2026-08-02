package com.squareup.protos.cash.groups;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes7.dex */
public final class GroupExpense extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GroupExpense> CREATOR;
    public final PrimaryAction action;
    public final Long created_at_millis;
    public final Integer expense_slices_paid_count;
    public final String expense_token;
    public final String group_token;
    public final Boolean is_completed;
    public final String note;
    public final Money paid_amount;
    public final Money pending_amount;
    public final String requester_token;
    public final List slice;
    public final Money total_amount;

    static {
        GroupExpense$Companion$ADAPTER$1 groupExpense$Companion$ADAPTER$1 = new GroupExpense$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GroupExpense.class), "type.googleapis.com/squareup.cash.groups.GroupExpense", Syntax.PROTO_2, null, "squareup/cash/groups/expense.proto");
        ADAPTER = groupExpense$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(groupExpense$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupExpense(String str, String str2, String str3, Boolean bool, PrimaryAction primaryAction, Money money, Money money2, List list, Long l, Money money3, Integer num, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.note = str;
        this.group_token = str2;
        this.requester_token = str3;
        this.is_completed = bool;
        this.action = primaryAction;
        this.pending_amount = money;
        this.total_amount = money2;
        this.created_at_millis = l;
        this.paid_amount = money3;
        this.expense_slices_paid_count = num;
        this.expense_token = str4;
        this.slice = TransactorKt.immutableCopyOf("slice", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupExpense)) {
            return false;
        }
        GroupExpense groupExpense = (GroupExpense) obj;
        return Intrinsics.areEqual(unknownFields(), groupExpense.unknownFields()) && Intrinsics.areEqual(this.note, groupExpense.note) && Intrinsics.areEqual(this.group_token, groupExpense.group_token) && Intrinsics.areEqual(this.requester_token, groupExpense.requester_token) && Intrinsics.areEqual(this.is_completed, groupExpense.is_completed) && Intrinsics.areEqual(this.action, groupExpense.action) && Intrinsics.areEqual(this.pending_amount, groupExpense.pending_amount) && Intrinsics.areEqual(this.total_amount, groupExpense.total_amount) && Intrinsics.areEqual(this.slice, groupExpense.slice) && Intrinsics.areEqual(this.created_at_millis, groupExpense.created_at_millis) && Intrinsics.areEqual(this.paid_amount, groupExpense.paid_amount) && Intrinsics.areEqual(this.expense_slices_paid_count, groupExpense.expense_slices_paid_count) && Intrinsics.areEqual(this.expense_token, groupExpense.expense_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.note;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.group_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.requester_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.is_completed;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        PrimaryAction primaryAction = this.action;
        int hashCode6 = (hashCode5 + (primaryAction != null ? primaryAction.hashCode() : 0)) * 37;
        Money money = this.pending_amount;
        int hashCode7 = (hashCode6 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.total_amount;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode7 + (money2 != null ? money2.hashCode() : 0)) * 37, 37, this.slice);
        Long l = this.created_at_millis;
        int hashCode8 = (m + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Money money3 = this.paid_amount;
        int hashCode9 = (hashCode8 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Integer num = this.expense_slices_paid_count;
        int hashCode10 = (hashCode9 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        String str4 = this.expense_token;
        int hashCode11 = hashCode10 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(9, false);
        builder.string_literal = this.note;
        builder.key_path_ref = this.group_token;
        builder.float_literal = this.requester_token;
        builder.bool_literal = this.is_completed;
        builder.blob_literal = this.action;
        builder.unary_op = this.pending_amount;
        builder.binary_op = this.total_amount;
        builder.conditional_op = this.slice;
        builder.int_literal = this.created_at_millis;
        builder.filter_op = this.paid_amount;
        builder.collection_literal = this.expense_slices_paid_count;
        builder.format_string_op = this.expense_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.note;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "note=", arrayList);
        }
        String str2 = this.group_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "group_token=", arrayList);
        }
        String str3 = this.requester_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "requester_token=", arrayList);
        }
        Boolean bool = this.is_completed;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_completed=", bool, arrayList);
        }
        PrimaryAction primaryAction = this.action;
        if (primaryAction != null) {
            arrayList.add("action=" + primaryAction);
        }
        Money money = this.pending_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("pending_amount=", money, arrayList);
        }
        Money money2 = this.total_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("total_amount=", money2, arrayList);
        }
        List list = this.slice;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("slice=", arrayList, list);
        }
        Long l = this.created_at_millis;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at_millis=", l, arrayList);
        }
        Money money3 = this.paid_amount;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("paid_amount=", money3, arrayList);
        }
        Integer num = this.expense_slices_paid_count;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("expense_slices_paid_count=", num, arrayList);
        }
        String str4 = this.expense_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "expense_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GroupExpense{", "}", 0, null, null, 56);
    }
}
