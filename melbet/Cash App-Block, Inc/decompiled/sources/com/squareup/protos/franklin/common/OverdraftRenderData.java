package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
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
import squareup.cash.overdraft.OverdraftUsage;

/* loaded from: classes8.dex */
public final class OverdraftRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OverdraftRenderData> CREATOR;
    public final Money overdraft_amount_used;
    public final Money total_transaction_amount;

    static {
        OverdraftRenderData$Companion$ADAPTER$1 overdraftRenderData$Companion$ADAPTER$1 = new OverdraftRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OverdraftRenderData.class), "type.googleapis.com/squareup.franklin.OverdraftRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = overdraftRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(overdraftRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverdraftRenderData(Money money, Money money2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.overdraft_amount_used = money;
        this.total_transaction_amount = money2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OverdraftRenderData)) {
            return false;
        }
        OverdraftRenderData overdraftRenderData = (OverdraftRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), overdraftRenderData.unknownFields()) && Intrinsics.areEqual(this.overdraft_amount_used, overdraftRenderData.overdraft_amount_used) && Intrinsics.areEqual(this.total_transaction_amount, overdraftRenderData.total_transaction_amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.overdraft_amount_used;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.total_transaction_amount;
        int hashCode3 = hashCode2 + (money2 != null ? money2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        OverdraftUsage.Builder builder = new OverdraftUsage.Builder(5);
        builder.limit = this.overdraft_amount_used;
        builder.usage = this.total_transaction_amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.overdraft_amount_used;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("overdraft_amount_used=", money, arrayList);
        }
        Money money2 = this.total_transaction_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("total_transaction_amount=", money2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OverdraftRenderData{", "}", 0, null, null, 56);
    }
}
