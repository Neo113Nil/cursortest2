package com.squareup.protos.cash.pay;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
import com.squareup.protos.common.Money;
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

/* loaded from: classes7.dex */
public final class CashAppPayExternalIncentiveRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppPayExternalIncentiveRenderData> CREATOR;
    public final Money amount_money;
    public final Integer bps;
    public final String name;
    public final Scope scope;
    public final String uid;

    public enum Scope implements WireEnum {
        ORDER(1),
        LINE_ITEM(2);

        public final int value;
        public static final SliceStatus.Companion Companion = new SliceStatus.Companion();
        public static final CashAppPayExternalIncentiveRenderData$Scope$Companion$ADAPTER$1 ADAPTER = new CashAppPayExternalIncentiveRenderData$Scope$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Scope.class), Syntax.PROTO_2, null);

        Scope(int i) {
            this.value = i;
        }

        public static final Scope fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return ORDER;
            }
            if (i != 2) {
                return null;
            }
            return LINE_ITEM;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CashAppPayExternalIncentiveRenderData$Companion$ADAPTER$1 cashAppPayExternalIncentiveRenderData$Companion$ADAPTER$1 = new CashAppPayExternalIncentiveRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppPayExternalIncentiveRenderData.class), "type.googleapis.com/squareup.cash.pay.CashAppPayExternalIncentiveRenderData", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_incentive.proto");
        ADAPTER = cashAppPayExternalIncentiveRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayExternalIncentiveRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppPayExternalIncentiveRenderData(String str, String str2, Money money, Integer num, Scope scope, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.uid = str;
        this.name = str2;
        this.amount_money = money;
        this.bps = num;
        this.scope = scope;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppPayExternalIncentiveRenderData)) {
            return false;
        }
        CashAppPayExternalIncentiveRenderData cashAppPayExternalIncentiveRenderData = (CashAppPayExternalIncentiveRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppPayExternalIncentiveRenderData.unknownFields()) && Intrinsics.areEqual(this.uid, cashAppPayExternalIncentiveRenderData.uid) && Intrinsics.areEqual(this.name, cashAppPayExternalIncentiveRenderData.name) && Intrinsics.areEqual(this.amount_money, cashAppPayExternalIncentiveRenderData.amount_money) && Intrinsics.areEqual(this.bps, cashAppPayExternalIncentiveRenderData.bps) && this.scope == cashAppPayExternalIncentiveRenderData.scope;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.uid;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money = this.amount_money;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        Integer num = this.bps;
        int hashCode5 = (hashCode4 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Scope scope = this.scope;
        int hashCode6 = hashCode5 + (scope != null ? scope.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(26);
        builder.icon = this.uid;
        builder.title = this.name;
        builder.subtitle = this.amount_money;
        builder.action = this.bps;
        builder.icon_background_color = this.scope;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.uid;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "uid=", arrayList);
        }
        String str2 = this.name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
        }
        Money money = this.amount_money;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount_money=", money, arrayList);
        }
        Integer num = this.bps;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("bps=", num, arrayList);
        }
        Scope scope = this.scope;
        if (scope != null) {
            arrayList.add("scope=" + scope);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppPayExternalIncentiveRenderData{", "}", 0, null, null, 56);
    }
}
