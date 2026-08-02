package com.squareup.protos.cash.portfolios.syncvalues;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.time.DateTime;
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
public final class BalanceTick extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BalanceTick> CREATOR;
    public final Long amount_cents;
    public final String display_text;
    public final Long gain_amount_cents;
    public final Long gain_bps;
    public final Long time_sec;

    static {
        BalanceTick$Companion$ADAPTER$1 balanceTick$Companion$ADAPTER$1 = new BalanceTick$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BalanceTick.class), "type.googleapis.com/squareup.cash.portfolios.syncvalues.BalanceTick", Syntax.PROTO_2, null, "squareup/cash/portfolios/syncvalues/portfolios_historical_data_value.proto");
        ADAPTER = balanceTick$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(balanceTick$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalanceTick(Long l, Long l2, Long l3, Long l4, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount_cents = l;
        this.time_sec = l2;
        this.gain_amount_cents = l3;
        this.gain_bps = l4;
        this.display_text = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BalanceTick)) {
            return false;
        }
        BalanceTick balanceTick = (BalanceTick) obj;
        return Intrinsics.areEqual(unknownFields(), balanceTick.unknownFields()) && Intrinsics.areEqual(this.amount_cents, balanceTick.amount_cents) && Intrinsics.areEqual(this.time_sec, balanceTick.time_sec) && Intrinsics.areEqual(this.gain_amount_cents, balanceTick.gain_amount_cents) && Intrinsics.areEqual(this.gain_bps, balanceTick.gain_bps) && Intrinsics.areEqual(this.display_text, balanceTick.display_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.amount_cents;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.time_sec;
        int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.gain_amount_cents;
        int hashCode4 = (hashCode3 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.gain_bps;
        int hashCode5 = (hashCode4 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        String str = this.display_text;
        int hashCode6 = hashCode5 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(7, false);
        builder.instant_usec = this.amount_cents;
        builder.ordinal = this.time_sec;
        builder.timezone_offset_min = this.gain_amount_cents;
        builder.tz_name = this.gain_bps;
        builder.posix_tz = this.display_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.amount_cents != null) {
            arrayList.add("amount_cents=██");
        }
        Long l = this.time_sec;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("time_sec=", l, arrayList);
        }
        if (this.gain_amount_cents != null) {
            arrayList.add("gain_amount_cents=██");
        }
        Long l2 = this.gain_bps;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("gain_bps=", l2, arrayList);
        }
        String str = this.display_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "display_text=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BalanceTick{", "}", 0, null, null, 56);
    }
}
