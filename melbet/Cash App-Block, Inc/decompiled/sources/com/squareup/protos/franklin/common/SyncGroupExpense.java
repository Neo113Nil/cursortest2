package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.cash.groups.GroupExpense;
import com.squareup.protos.franklin.ui.UiCashLimits;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncGroupExpense extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncGroupExpense> CREATOR;
    public final GroupExpense expense;

    static {
        SyncGroupExpense$Companion$ADAPTER$1 syncGroupExpense$Companion$ADAPTER$1 = new SyncGroupExpense$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncGroupExpense.class), "type.googleapis.com/squareup.franklin.SyncGroupExpense", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncGroupExpense$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncGroupExpense$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncGroupExpense(GroupExpense groupExpense, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.expense = groupExpense;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncGroupExpense)) {
            return false;
        }
        SyncGroupExpense syncGroupExpense = (SyncGroupExpense) obj;
        return Intrinsics.areEqual(unknownFields(), syncGroupExpense.unknownFields()) && Intrinsics.areEqual(this.expense, syncGroupExpense.expense);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        GroupExpense groupExpense = this.expense;
        int hashCode2 = hashCode + (groupExpense != null ? groupExpense.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(9);
        builder.cash_limit_group = this.expense;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        GroupExpense groupExpense = this.expense;
        if (groupExpense != null) {
            arrayList.add("expense=" + groupExpense);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncGroupExpense{", "}", 0, null, null, 56);
    }
}
