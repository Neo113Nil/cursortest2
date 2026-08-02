package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.CryptoPayrollRenderData;
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
public final class AutoAllocationRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AutoAllocationRenderData> CREATOR;
    public final Money allocated_amount;
    public final Long allocation_bps;
    public final Money total_amount;

    static {
        AutoAllocationRenderData$Companion$ADAPTER$1 autoAllocationRenderData$Companion$ADAPTER$1 = new AutoAllocationRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AutoAllocationRenderData.class), "type.googleapis.com/squareup.franklin.AutoAllocationRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = autoAllocationRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(autoAllocationRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoAllocationRenderData(Money money, Money money2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.allocated_amount = money;
        this.total_amount = money2;
        this.allocation_bps = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoAllocationRenderData)) {
            return false;
        }
        AutoAllocationRenderData autoAllocationRenderData = (AutoAllocationRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), autoAllocationRenderData.unknownFields()) && Intrinsics.areEqual(this.allocated_amount, autoAllocationRenderData.allocated_amount) && Intrinsics.areEqual(this.total_amount, autoAllocationRenderData.total_amount) && Intrinsics.areEqual(this.allocation_bps, autoAllocationRenderData.allocation_bps);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.allocated_amount;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.total_amount;
        int hashCode3 = (hashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Long l = this.allocation_bps;
        int hashCode4 = hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CryptoPayrollRenderData.Builder builder = new CryptoPayrollRenderData.Builder(1);
        builder.converted_amount = this.allocated_amount;
        builder.total_amount = this.total_amount;
        builder.allocationBps = this.allocation_bps;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.allocated_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("allocated_amount=", money, arrayList);
        }
        Money money2 = this.total_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("total_amount=", money2, arrayList);
        }
        Long l = this.allocation_bps;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("allocation_bps=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AutoAllocationRenderData{", "}", 0, null, null, 56);
    }
}
