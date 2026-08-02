package com.squareup.protos.payrollconnector.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiDda;
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
public final class DirectDepositInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DirectDepositInfo> CREATOR;
    public final Boolean amount_supported;
    public final Boolean fractional_amount_supported;
    public final Long max_amount_cents;
    public final Long min_amount_cents;

    static {
        DirectDepositInfo$Companion$ADAPTER$1 directDepositInfo$Companion$ADAPTER$1 = new DirectDepositInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DirectDepositInfo.class), "type.googleapis.com/squareup.payrollconnector.common.DirectDepositInfo", Syntax.PROTO_2, null, "squareup/payroll-connector/common/PayrollProviderProto.proto");
        ADAPTER = directDepositInfo$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(directDepositInfo$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectDepositInfo(Boolean bool, Boolean bool2, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount_supported = bool;
        this.fractional_amount_supported = bool2;
        this.max_amount_cents = l;
        this.min_amount_cents = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DirectDepositInfo)) {
            return false;
        }
        DirectDepositInfo directDepositInfo = (DirectDepositInfo) obj;
        return Intrinsics.areEqual(unknownFields(), directDepositInfo.unknownFields()) && Intrinsics.areEqual(this.amount_supported, directDepositInfo.amount_supported) && Intrinsics.areEqual(this.fractional_amount_supported, directDepositInfo.fractional_amount_supported) && Intrinsics.areEqual(this.max_amount_cents, directDepositInfo.max_amount_cents) && Intrinsics.areEqual(this.min_amount_cents, directDepositInfo.min_amount_cents);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.amount_supported;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.fractional_amount_supported;
        int hashCode3 = (hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Long l = this.max_amount_cents;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.min_amount_cents;
        int hashCode5 = hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiDda.Builder builder = new UiDda.Builder(21);
        builder.enabled = this.amount_supported;
        builder.account = this.fractional_amount_supported;
        builder.button = this.max_amount_cents;
        builder.dda_form = this.min_amount_cents;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.amount_supported;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("amount_supported=", bool, arrayList);
        }
        Boolean bool2 = this.fractional_amount_supported;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("fractional_amount_supported=", bool2, arrayList);
        }
        Long l = this.max_amount_cents;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("max_amount_cents=", l, arrayList);
        }
        Long l2 = this.min_amount_cents;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("min_amount_cents=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DirectDepositInfo{", "}", 0, null, null, 56);
    }
}
