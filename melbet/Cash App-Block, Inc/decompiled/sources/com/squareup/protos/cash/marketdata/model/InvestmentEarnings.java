package com.squareup.protos.cash.marketdata.model;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzjk;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GiftCard;
import com.squareup.protos.cash.local.client.v1.InputValue;
import com.squareup.protos.common.Money;
import com.squareup.protos.invest.ui.Section;
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
public final class InvestmentEarnings extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InvestmentEarnings> CREATOR;
    public final List earnings;
    public final Section.Row.MoreInfo more_info;

    public final class Earning extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Earning> CREATOR;
        public final Money expected_eps;
        public final String quarter;
        public final zzjk upcoming_eps;
        public final String year;

        static {
            InvestmentEarnings$Earning$Companion$ADAPTER$1 investmentEarnings$Earning$Companion$ADAPTER$1 = new InvestmentEarnings$Earning$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Earning.class), "type.googleapis.com/squareup.cash.marketdata.model.InvestmentEarnings.Earning", Syntax.PROTO_2, null, "squareup/cash/marketdata/model/investment_metrics.proto");
            ADAPTER = investmentEarnings$Earning$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(investmentEarnings$Earning$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Earning(String str, String str2, Money money, zzjk zzjkVar, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.quarter = str;
            this.year = str2;
            this.expected_eps = money;
            this.upcoming_eps = zzjkVar;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Earning)) {
                return false;
            }
            Earning earning = (Earning) obj;
            return Intrinsics.areEqual(unknownFields(), earning.unknownFields()) && Intrinsics.areEqual(this.quarter, earning.quarter) && Intrinsics.areEqual(this.year, earning.year) && Intrinsics.areEqual(this.expected_eps, earning.expected_eps) && Intrinsics.areEqual(this.upcoming_eps, earning.upcoming_eps);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.quarter;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.year;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Money money = this.expected_eps;
            int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
            zzjk zzjkVar = this.upcoming_eps;
            int hashCode5 = hashCode4 + (zzjkVar != null ? zzjkVar.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GiftCard.Builder builder = new GiftCard.Builder(18, false);
            builder.id = this.quarter;
            builder.last_4 = this.year;
            builder.gift_card_id = this.expected_eps;
            builder.gift_card_amount = this.upcoming_eps;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.quarter;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "quarter=", arrayList);
            }
            String str2 = this.year;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "year=", arrayList);
            }
            Money money = this.expected_eps;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("expected_eps=", money, arrayList);
            }
            zzjk zzjkVar = this.upcoming_eps;
            if (zzjkVar != null) {
                arrayList.add("upcoming_eps=" + zzjkVar);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Earning{", "}", 0, null, null, 56);
        }
    }

    static {
        InvestmentEarnings$Companion$ADAPTER$1 investmentEarnings$Companion$ADAPTER$1 = new InvestmentEarnings$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InvestmentEarnings.class), "type.googleapis.com/squareup.cash.marketdata.model.InvestmentEarnings", Syntax.PROTO_2, null, "squareup/cash/marketdata/model/investment_metrics.proto");
        ADAPTER = investmentEarnings$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(investmentEarnings$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentEarnings(List list, Section.Row.MoreInfo moreInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.more_info = moreInfo;
        this.earnings = TransactorKt.immutableCopyOf("earnings", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvestmentEarnings)) {
            return false;
        }
        InvestmentEarnings investmentEarnings = (InvestmentEarnings) obj;
        return Intrinsics.areEqual(unknownFields(), investmentEarnings.unknownFields()) && Intrinsics.areEqual(this.earnings, investmentEarnings.earnings) && Intrinsics.areEqual(this.more_info, investmentEarnings.more_info);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.earnings);
        Section.Row.MoreInfo moreInfo = this.more_info;
        int hashCode = m + (moreInfo != null ? moreInfo.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InputValue.Builder builder = new InputValue.Builder(24);
        builder.input_id = this.earnings;
        builder.value = this.more_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.earnings;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("earnings=", arrayList, list);
        }
        Section.Row.MoreInfo moreInfo = this.more_info;
        if (moreInfo != null) {
            arrayList.add("more_info=" + moreInfo);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentEarnings{", "}", 0, null, null, 56);
    }
}
