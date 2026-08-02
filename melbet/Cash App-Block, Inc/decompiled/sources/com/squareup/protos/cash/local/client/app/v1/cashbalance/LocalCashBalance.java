package com.squareup.protos.cash.local.client.app.v1.cashbalance;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cats.Cats;
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

/* loaded from: classes7.dex */
public final class LocalCashBalance extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalCashBalance> CREATOR;
    public final Long amount;

    static {
        LocalCashBalance$Companion$ADAPTER$1 localCashBalance$Companion$ADAPTER$1 = new LocalCashBalance$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalCashBalance.class), "type.googleapis.com/squareup.cash.local.client.app.v1.cashbalance.LocalCashBalance", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/cashbalance/cashbalance.proto");
        ADAPTER = localCashBalance$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localCashBalance$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCashBalance(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalCashBalance)) {
            return false;
        }
        LocalCashBalance localCashBalance = (LocalCashBalance) obj;
        return Intrinsics.areEqual(unknownFields(), localCashBalance.unknownFields()) && Intrinsics.areEqual(this.amount, localCashBalance.amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.amount;
        int hashCode2 = hashCode + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cats.Builder builder = new Cats.Builder(7);
        builder.cat_count = this.amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.amount;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("amount=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalCashBalance{", "}", 0, null, null, 56);
    }
}
