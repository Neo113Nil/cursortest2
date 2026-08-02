package com.squareup.protos.cash.portfolios.syncvalues;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.time.DateTime;
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

/* loaded from: classes7.dex */
public final class BalanceHistory extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BalanceHistory> CREATOR;
    public final List balance_ticks;
    public final String currency_code;
    public final Long end_time;
    public final Long start_time;
    public final Long tick_frequency_ms;

    static {
        BalanceHistory$Companion$ADAPTER$1 balanceHistory$Companion$ADAPTER$1 = new BalanceHistory$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BalanceHistory.class), "type.googleapis.com/squareup.cash.portfolios.syncvalues.BalanceHistory", Syntax.PROTO_2, null, "squareup/cash/portfolios/syncvalues/portfolios_historical_data_value.proto");
        ADAPTER = balanceHistory$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(balanceHistory$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalanceHistory(Long l, Long l2, String str, List list, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.start_time = l;
        this.tick_frequency_ms = l2;
        this.currency_code = str;
        this.end_time = l3;
        this.balance_ticks = TransactorKt.immutableCopyOf("balance_ticks", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BalanceHistory)) {
            return false;
        }
        BalanceHistory balanceHistory = (BalanceHistory) obj;
        return Intrinsics.areEqual(unknownFields(), balanceHistory.unknownFields()) && Intrinsics.areEqual(this.start_time, balanceHistory.start_time) && Intrinsics.areEqual(this.tick_frequency_ms, balanceHistory.tick_frequency_ms) && Intrinsics.areEqual(this.currency_code, balanceHistory.currency_code) && Intrinsics.areEqual(this.balance_ticks, balanceHistory.balance_ticks) && Intrinsics.areEqual(this.end_time, balanceHistory.end_time);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.start_time;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.tick_frequency_ms;
        int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str = this.currency_code;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str != null ? str.hashCode() : 0)) * 37, 37, this.balance_ticks);
        Long l3 = this.end_time;
        int hashCode4 = m + (l3 != null ? Long.hashCode(l3.longValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(6, false);
        builder.instant_usec = this.start_time;
        builder.ordinal = this.tick_frequency_ms;
        builder.posix_tz = this.currency_code;
        builder.tz_name = this.balance_ticks;
        builder.timezone_offset_min = this.end_time;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.start_time;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("start_time=", l, arrayList);
        }
        Long l2 = this.tick_frequency_ms;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tick_frequency_ms=", l2, arrayList);
        }
        String str = this.currency_code;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "currency_code=", arrayList);
        }
        List list = this.balance_ticks;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("balance_ticks=", arrayList, list);
        }
        Long l3 = this.end_time;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("end_time=", l3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BalanceHistory{", "}", 0, null, null, 56);
    }
}
