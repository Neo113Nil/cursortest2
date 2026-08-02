package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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

/* loaded from: classes8.dex */
public final class CryptoPayrollRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CryptoPayrollRenderData> CREATOR;
    public final Long allocationBps;
    public final Money converted_amount;
    public final Money total_amount;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Long allocationBps;
        public Money converted_amount;
        public Money total_amount;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new CryptoPayrollRenderData(this.converted_amount, this.total_amount, this.allocationBps, buildUnknownFields());
                default:
                    return new AutoAllocationRenderData(this.converted_amount, this.total_amount, this.allocationBps, buildUnknownFields());
            }
        }
    }

    static {
        CryptoPayrollRenderData$Companion$ADAPTER$1 cryptoPayrollRenderData$Companion$ADAPTER$1 = new CryptoPayrollRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CryptoPayrollRenderData.class), "type.googleapis.com/squareup.franklin.CryptoPayrollRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = cryptoPayrollRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cryptoPayrollRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoPayrollRenderData(Money money, Money money2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.converted_amount = money;
        this.total_amount = money2;
        this.allocationBps = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CryptoPayrollRenderData)) {
            return false;
        }
        CryptoPayrollRenderData cryptoPayrollRenderData = (CryptoPayrollRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), cryptoPayrollRenderData.unknownFields()) && Intrinsics.areEqual(this.converted_amount, cryptoPayrollRenderData.converted_amount) && Intrinsics.areEqual(this.total_amount, cryptoPayrollRenderData.total_amount) && Intrinsics.areEqual(this.allocationBps, cryptoPayrollRenderData.allocationBps);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.converted_amount;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.total_amount;
        int hashCode3 = (hashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Long l = this.allocationBps;
        int hashCode4 = hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.converted_amount = this.converted_amount;
        builder.total_amount = this.total_amount;
        builder.allocationBps = this.allocationBps;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.converted_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("converted_amount=", money, arrayList);
        }
        Money money2 = this.total_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("total_amount=", money2, arrayList);
        }
        Long l = this.allocationBps;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("allocationBps=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoPayrollRenderData{", "}", 0, null, null, 56);
    }
}
