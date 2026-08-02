package com.squareup.protos.cash.portfolios;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.ListPoolsResponse;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BalanceEventList extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BalanceEventList> CREATOR;
    public final List events;

    static {
        BalanceEventList$Companion$ADAPTER$1 balanceEventList$Companion$ADAPTER$1 = new BalanceEventList$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BalanceEventList.class), "type.googleapis.com/squareup.cash.portfolios.BalanceEventList", Syntax.PROTO_2, null, "squareup/cash/portfolios/service.proto");
        ADAPTER = balanceEventList$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(balanceEventList$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalanceEventList(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.events = TransactorKt.immutableCopyOf("events", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BalanceEventList)) {
            return false;
        }
        BalanceEventList balanceEventList = (BalanceEventList) obj;
        return Intrinsics.areEqual(unknownFields(), balanceEventList.unknownFields()) && Intrinsics.areEqual(this.events, balanceEventList.events);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.events.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(10, false);
        builder.pools = this.events;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.events;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("events=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BalanceEventList{", "}", 0, null, null, 56);
    }

    public BalanceEventList() {
        this(EmptyList.INSTANCE, ByteString.EMPTY);
    }
}
