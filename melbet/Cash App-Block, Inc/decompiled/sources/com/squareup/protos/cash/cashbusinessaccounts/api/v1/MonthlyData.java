package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.Section;
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

/* loaded from: classes7.dex */
public final class MonthlyData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MonthlyData> CREATOR;
    public final Money earnings;
    public final Integer month;
    public final Integer year;

    static {
        MonthlyData$Companion$ADAPTER$1 monthlyData$Companion$ADAPTER$1 = new MonthlyData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MonthlyData.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.api.v1beta1.MonthlyData", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/api/v1beta1/earnings_tracker.proto");
        ADAPTER = monthlyData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(monthlyData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonthlyData(Money money, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.earnings = money;
        this.month = num;
        this.year = num2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MonthlyData)) {
            return false;
        }
        MonthlyData monthlyData = (MonthlyData) obj;
        return Intrinsics.areEqual(unknownFields(), monthlyData.unknownFields()) && Intrinsics.areEqual(this.earnings, monthlyData.earnings) && Intrinsics.areEqual(this.month, monthlyData.month) && Intrinsics.areEqual(this.year, monthlyData.year);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.earnings;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        Integer num = this.month;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.year;
        int hashCode4 = hashCode3 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(26);
        builder.header_text = this.earnings;
        builder.header_button = this.month;
        builder.groups = this.year;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.earnings;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("earnings=", money, arrayList);
        }
        Integer num = this.month;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("month=", num, arrayList);
        }
        Integer num2 = this.year;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("year=", num2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MonthlyData{", "}", 0, null, null, 56);
    }
}
