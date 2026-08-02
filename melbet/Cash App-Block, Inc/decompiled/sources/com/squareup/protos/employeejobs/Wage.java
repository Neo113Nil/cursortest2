package com.squareup.protos.employeejobs;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.common.Money;
import com.squareup.protos.document.Document;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Wage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Wage> CREATOR;
    public final Money annual_wage;
    public final Money hourly_wage;
    public final Integer hours_worked_per_week;
    public final Boolean overtime_exempt;
    public final Boolean tip_eligible;
    public final WageType wage_type;

    public enum WageType implements WireEnum {
        HOURLY(0),
        ANNUAL(1),
        NONE(2);

        public static final Wage$WageType$Companion$ADAPTER$1 ADAPTER;
        public static final TransactionType.Companion Companion;
        public final int value;

        static {
            WageType wageType = HOURLY;
            Companion = new TransactionType.Companion();
            ADAPTER = new Wage$WageType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(WageType.class), Syntax.PROTO_2, wageType);
        }

        WageType(int i) {
            this.value = i;
        }

        public static final WageType fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return HOURLY;
            }
            if (i == 1) {
                return ANNUAL;
            }
            if (i != 2) {
                return null;
            }
            return NONE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Wage$Companion$ADAPTER$1 wage$Companion$ADAPTER$1 = new Wage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Wage.class), "type.googleapis.com/squareup.employeejobs.Wage", Syntax.PROTO_2, null, "squareup/employeejobs/data.proto");
        ADAPTER = wage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(wage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wage(WageType wageType, Money money, Money money2, Integer num, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.wage_type = wageType;
        this.hourly_wage = money;
        this.annual_wage = money2;
        this.hours_worked_per_week = num;
        this.tip_eligible = bool;
        this.overtime_exempt = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Wage)) {
            return false;
        }
        Wage wage = (Wage) obj;
        return Intrinsics.areEqual(unknownFields(), wage.unknownFields()) && this.wage_type == wage.wage_type && Intrinsics.areEqual(this.hourly_wage, wage.hourly_wage) && Intrinsics.areEqual(this.annual_wage, wage.annual_wage) && Intrinsics.areEqual(this.hours_worked_per_week, wage.hours_worked_per_week) && Intrinsics.areEqual(this.tip_eligible, wage.tip_eligible) && Intrinsics.areEqual(this.overtime_exempt, wage.overtime_exempt);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        WageType wageType = this.wage_type;
        int hashCode2 = (hashCode + (wageType != null ? wageType.hashCode() : 0)) * 37;
        Money money = this.hourly_wage;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.annual_wage;
        int hashCode4 = (hashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Integer num = this.hours_worked_per_week;
        int hashCode5 = (hashCode4 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Boolean bool = this.tip_eligible;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.overtime_exempt;
        int hashCode7 = hashCode6 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Document.Builder builder = new Document.Builder(11, false);
        builder.category = this.wage_type;
        builder.token = this.hourly_wage;
        builder.title = this.annual_wage;
        builder.url = this.hours_worked_per_week;
        builder.owner_token = this.tip_eligible;
        builder.document_date = this.overtime_exempt;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        WageType wageType = this.wage_type;
        if (wageType != null) {
            arrayList.add("wage_type=" + wageType);
        }
        Money money = this.hourly_wage;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("hourly_wage=", money, arrayList);
        }
        Money money2 = this.annual_wage;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("annual_wage=", money2, arrayList);
        }
        Integer num = this.hours_worked_per_week;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("hours_worked_per_week=", num, arrayList);
        }
        Boolean bool = this.tip_eligible;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tip_eligible=", bool, arrayList);
        }
        Boolean bool2 = this.overtime_exempt;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("overtime_exempt=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Wage{", "}", 0, null, null, 56);
    }
}
