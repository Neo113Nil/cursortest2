package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
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
import squareup.cash.earnings.Earning;

/* loaded from: classes7.dex */
public final class DailyData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DailyData> CREATOR;
    public final Integer date;
    public final Money earnings;
    public final Integer month;
    public final Integer year;

    static {
        DailyData$Companion$ADAPTER$1 dailyData$Companion$ADAPTER$1 = new DailyData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DailyData.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.api.v1beta1.DailyData", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/api/v1beta1/earnings_tracker.proto");
        ADAPTER = dailyData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(dailyData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyData(Money money, Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.date = num;
        this.earnings = money;
        this.month = num2;
        this.year = num3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DailyData)) {
            return false;
        }
        DailyData dailyData = (DailyData) obj;
        return Intrinsics.areEqual(unknownFields(), dailyData.unknownFields()) && Intrinsics.areEqual(this.date, dailyData.date) && Intrinsics.areEqual(this.earnings, dailyData.earnings) && Intrinsics.areEqual(this.month, dailyData.month) && Intrinsics.areEqual(this.year, dailyData.year);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.date;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Money money = this.earnings;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Integer num2 = this.month;
        int hashCode4 = (hashCode3 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Integer num3 = this.year;
        int hashCode5 = hashCode4 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Earning.Builder builder = new Earning.Builder(1);
        builder.year = this.date;
        builder.amount = this.earnings;
        builder.month = this.month;
        builder.day = this.year;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.date;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("date=", num, arrayList);
        }
        Money money = this.earnings;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("earnings=", money, arrayList);
        }
        Integer num2 = this.month;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("month=", num2, arrayList);
        }
        Integer num3 = this.year;
        if (num3 != null) {
            re$$ExternalSyntheticOutline0.m("year=", num3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DailyData{", "}", 0, null, null, 56);
    }
}
