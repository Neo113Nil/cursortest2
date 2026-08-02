package com.squareup.protos.common.time;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.p2pencore.v1.Date;
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
public final class YearMonthDay extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<YearMonthDay> CREATOR;
    public final Integer day_of_month;
    public final Integer month_of_year;
    public final Integer year;

    static {
        YearMonthDay$Companion$ADAPTER$1 yearMonthDay$Companion$ADAPTER$1 = new YearMonthDay$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(YearMonthDay.class), "type.googleapis.com/squareup.common.time.YearMonthDay", Syntax.PROTO_2, null, "squareup/common/time.proto");
        ADAPTER = yearMonthDay$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(yearMonthDay$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YearMonthDay(Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.year = num;
        this.month_of_year = num2;
        this.day_of_month = num3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof YearMonthDay)) {
            return false;
        }
        YearMonthDay yearMonthDay = (YearMonthDay) obj;
        return Intrinsics.areEqual(unknownFields(), yearMonthDay.unknownFields()) && Intrinsics.areEqual(this.year, yearMonthDay.year) && Intrinsics.areEqual(this.month_of_year, yearMonthDay.month_of_year) && Intrinsics.areEqual(this.day_of_month, yearMonthDay.day_of_month);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.year;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.month_of_year;
        int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Integer num3 = this.day_of_month;
        int hashCode4 = hashCode3 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Date.Builder builder = new Date.Builder(3);
        builder.year = this.year;
        builder.month = this.month_of_year;
        builder.day = this.day_of_month;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.year;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("year=", num, arrayList);
        }
        Integer num2 = this.month_of_year;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("month_of_year=", num2, arrayList);
        }
        Integer num3 = this.day_of_month;
        if (num3 != null) {
            re$$ExternalSyntheticOutline0.m("day_of_month=", num3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "YearMonthDay{", "}", 0, null, null, 56);
    }
}
