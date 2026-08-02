package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalCashBackOfferPercentage;
import com.squareup.protos.cash.local.client.v1.LocalEstimatedCompletionDuration;
import com.squareup.protos.cash.local.client.v1.LocalOpenHours;
import com.squareup.protos.cash.local.client.v1.LocalOpenStatus;
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
import xyz.block.protos.genie.Expression;

/* loaded from: classes7.dex */
public final class MarketScreenRowCell extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MarketScreenRowCell> CREATOR;
    public final String brand_token;
    public final String button_client_route;
    public final String button_text;
    public final String cashback_offer_token;
    public final String category;
    public final String default_client_route;
    public final LocalEstimatedCompletionDuration estimated_pickup_wait_time;
    public final LocalOpenHours open_hours;
    public final LocalOpenStatus open_status;
    public final LocalCashBackOfferPercentage percentage;
    public final String time_zone;
    public final String title;

    static {
        MarketScreenRowCell$Companion$ADAPTER$1 marketScreenRowCell$Companion$ADAPTER$1 = new MarketScreenRowCell$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MarketScreenRowCell.class), "type.googleapis.com/squareup.cash.local.client.app.v1.MarketScreenRowCell", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/model.proto");
        ADAPTER = marketScreenRowCell$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(marketScreenRowCell$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketScreenRowCell(String str, String str2, String str3, LocalOpenStatus localOpenStatus, LocalOpenHours localOpenHours, LocalCashBackOfferPercentage localCashBackOfferPercentage, String str4, String str5, String str6, String str7, String str8, LocalEstimatedCompletionDuration localEstimatedCompletionDuration, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.brand_token = str;
        this.title = str2;
        this.category = str3;
        this.open_status = localOpenStatus;
        this.open_hours = localOpenHours;
        this.percentage = localCashBackOfferPercentage;
        this.button_text = str4;
        this.button_client_route = str5;
        this.default_client_route = str6;
        this.time_zone = str7;
        this.cashback_offer_token = str8;
        this.estimated_pickup_wait_time = localEstimatedCompletionDuration;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarketScreenRowCell)) {
            return false;
        }
        MarketScreenRowCell marketScreenRowCell = (MarketScreenRowCell) obj;
        return Intrinsics.areEqual(unknownFields(), marketScreenRowCell.unknownFields()) && Intrinsics.areEqual(this.brand_token, marketScreenRowCell.brand_token) && Intrinsics.areEqual(this.title, marketScreenRowCell.title) && Intrinsics.areEqual(this.category, marketScreenRowCell.category) && this.open_status == marketScreenRowCell.open_status && Intrinsics.areEqual(this.open_hours, marketScreenRowCell.open_hours) && Intrinsics.areEqual(this.percentage, marketScreenRowCell.percentage) && Intrinsics.areEqual(this.button_text, marketScreenRowCell.button_text) && Intrinsics.areEqual(this.button_client_route, marketScreenRowCell.button_client_route) && Intrinsics.areEqual(this.default_client_route, marketScreenRowCell.default_client_route) && Intrinsics.areEqual(this.time_zone, marketScreenRowCell.time_zone) && Intrinsics.areEqual(this.cashback_offer_token, marketScreenRowCell.cashback_offer_token) && Intrinsics.areEqual(this.estimated_pickup_wait_time, marketScreenRowCell.estimated_pickup_wait_time);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.brand_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.category;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        LocalOpenStatus localOpenStatus = this.open_status;
        int hashCode5 = (hashCode4 + (localOpenStatus != null ? localOpenStatus.hashCode() : 0)) * 37;
        LocalOpenHours localOpenHours = this.open_hours;
        int hashCode6 = (hashCode5 + (localOpenHours != null ? localOpenHours.hashCode() : 0)) * 37;
        LocalCashBackOfferPercentage localCashBackOfferPercentage = this.percentage;
        int hashCode7 = (hashCode6 + (localCashBackOfferPercentage != null ? localCashBackOfferPercentage.hashCode() : 0)) * 37;
        String str4 = this.button_text;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.button_client_route;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.default_client_route;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.time_zone;
        int hashCode11 = (hashCode10 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.cashback_offer_token;
        int hashCode12 = (hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 37;
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration = this.estimated_pickup_wait_time;
        int hashCode13 = hashCode12 + (localEstimatedCompletionDuration != null ? localEstimatedCompletionDuration.hashCode() : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(11, false);
        builder.string_literal = this.brand_token;
        builder.key_path_ref = this.title;
        builder.int_literal = this.category;
        builder.float_literal = this.open_status;
        builder.bool_literal = this.open_hours;
        builder.blob_literal = this.percentage;
        builder.unary_op = this.button_text;
        builder.binary_op = this.button_client_route;
        builder.conditional_op = this.default_client_route;
        builder.filter_op = this.time_zone;
        builder.collection_literal = this.cashback_offer_token;
        builder.format_string_op = this.estimated_pickup_wait_time;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.brand_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "brand_token=", arrayList);
        }
        String str2 = this.title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
        }
        String str3 = this.category;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "category=", arrayList);
        }
        LocalOpenStatus localOpenStatus = this.open_status;
        if (localOpenStatus != null) {
            arrayList.add("open_status=" + localOpenStatus);
        }
        LocalOpenHours localOpenHours = this.open_hours;
        if (localOpenHours != null) {
            arrayList.add("open_hours=" + localOpenHours);
        }
        LocalCashBackOfferPercentage localCashBackOfferPercentage = this.percentage;
        if (localCashBackOfferPercentage != null) {
            arrayList.add("percentage=" + localCashBackOfferPercentage);
        }
        String str4 = this.button_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "button_text=", arrayList);
        }
        String str5 = this.button_client_route;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "button_client_route=", arrayList);
        }
        String str6 = this.default_client_route;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "default_client_route=", arrayList);
        }
        String str7 = this.time_zone;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "time_zone=", arrayList);
        }
        String str8 = this.cashback_offer_token;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "cashback_offer_token=", arrayList);
        }
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration = this.estimated_pickup_wait_time;
        if (localEstimatedCompletionDuration != null) {
            arrayList.add("estimated_pickup_wait_time=" + localEstimatedCompletionDuration);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarketScreenRowCell{", "}", 0, null, null, 56);
    }
}
