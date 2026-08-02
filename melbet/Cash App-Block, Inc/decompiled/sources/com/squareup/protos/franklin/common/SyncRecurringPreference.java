package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.franklin.ui.UiCashLimits;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
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
public final class SyncRecurringPreference extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncRecurringPreference> CREATOR;
    public final ScheduledTransactionPreference preference;

    static {
        SyncRecurringPreference$Companion$ADAPTER$1 syncRecurringPreference$Companion$ADAPTER$1 = new SyncRecurringPreference$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncRecurringPreference.class), "type.googleapis.com/squareup.franklin.SyncRecurringPreference", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncRecurringPreference$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncRecurringPreference$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncRecurringPreference(ScheduledTransactionPreference scheduledTransactionPreference, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.preference = scheduledTransactionPreference;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncRecurringPreference)) {
            return false;
        }
        SyncRecurringPreference syncRecurringPreference = (SyncRecurringPreference) obj;
        return Intrinsics.areEqual(unknownFields(), syncRecurringPreference.unknownFields()) && Intrinsics.areEqual(this.preference, syncRecurringPreference.preference);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ScheduledTransactionPreference scheduledTransactionPreference = this.preference;
        int hashCode2 = hashCode + (scheduledTransactionPreference != null ? scheduledTransactionPreference.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(14);
        builder.cash_limit_group = this.preference;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ScheduledTransactionPreference scheduledTransactionPreference = this.preference;
        if (scheduledTransactionPreference != null) {
            arrayList.add("preference=" + scheduledTransactionPreference);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncRecurringPreference{", "}", 0, null, null, 56);
    }
}
