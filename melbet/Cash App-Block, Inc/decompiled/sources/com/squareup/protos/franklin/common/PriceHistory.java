package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.portfolios.HoldingBalanceHistory;
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

/* loaded from: classes.dex */
public final class PriceHistory extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PriceHistory> CREATOR;
    public final String base_currency_code;
    public final Long end_time;
    public final List price_ticks;
    public final String quote_currency_code;
    public final Long start_time;
    public final Long tick_frequency_ms;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String base_currency_code;
        public Long end_time;
        public List price_ticks;
        public String quote_currency_code;
        public Long start_time;
        public Long tick_frequency_ms;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    break;
                default:
                    this.price_ticks = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new PriceHistory(this.start_time, this.end_time, this.tick_frequency_ms, this.base_currency_code, this.quote_currency_code, this.price_ticks, buildUnknownFields());
                default:
                    return new HoldingBalanceHistory(this.start_time, this.end_time, this.tick_frequency_ms, this.base_currency_code, this.quote_currency_code, this.price_ticks, buildUnknownFields());
            }
        }
    }

    static {
        PriceHistory$Companion$ADAPTER$1 priceHistory$Companion$ADAPTER$1 = new PriceHistory$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PriceHistory.class), "type.googleapis.com/squareup.franklin.common.PriceHistory", Syntax.PROTO_2, null, "squareup/franklin/common/price.proto");
        ADAPTER = priceHistory$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(priceHistory$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceHistory(Long l, Long l2, Long l3, String str, String str2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.start_time = l;
        this.end_time = l2;
        this.tick_frequency_ms = l3;
        this.base_currency_code = str;
        this.quote_currency_code = str2;
        this.price_ticks = TransactorKt.immutableCopyOf("price_ticks", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PriceHistory)) {
            return false;
        }
        PriceHistory priceHistory = (PriceHistory) obj;
        return Intrinsics.areEqual(unknownFields(), priceHistory.unknownFields()) && Intrinsics.areEqual(this.start_time, priceHistory.start_time) && Intrinsics.areEqual(this.end_time, priceHistory.end_time) && Intrinsics.areEqual(this.tick_frequency_ms, priceHistory.tick_frequency_ms) && Intrinsics.areEqual(this.base_currency_code, priceHistory.base_currency_code) && Intrinsics.areEqual(this.quote_currency_code, priceHistory.quote_currency_code) && Intrinsics.areEqual(this.price_ticks, priceHistory.price_ticks);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.start_time;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.end_time;
        int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.tick_frequency_ms;
        int hashCode4 = (hashCode3 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        String str = this.base_currency_code;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.quote_currency_code;
        int hashCode6 = this.price_ticks.hashCode() + ((hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.start_time = this.start_time;
        builder.end_time = this.end_time;
        builder.tick_frequency_ms = this.tick_frequency_ms;
        builder.base_currency_code = this.base_currency_code;
        builder.quote_currency_code = this.quote_currency_code;
        builder.price_ticks = this.price_ticks;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.start_time;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("start_time=", l, arrayList);
        }
        Long l2 = this.end_time;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("end_time=", l2, arrayList);
        }
        Long l3 = this.tick_frequency_ms;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tick_frequency_ms=", l3, arrayList);
        }
        String str = this.base_currency_code;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "base_currency_code=", arrayList);
        }
        String str2 = this.quote_currency_code;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "quote_currency_code=", arrayList);
        }
        List list = this.price_ticks;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("price_ticks=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PriceHistory{", "}", 0, null, null, 56);
    }
}
