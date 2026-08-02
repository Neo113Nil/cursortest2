package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.gambit.api.v1.checkdeposit.DeclineReason;
import com.squareup.protos.common.Money;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.hieroglyph.KeyScope;
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
public final class CheckDepositRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CheckDepositRenderData> CREATOR;
    public final DeclineReason decline_reason;
    public final String detail;
    public final Long funds_hold_business_days;
    public final Money past_amount;
    public final Long return_date;
    public final ReviewResult review_result;
    public final Status status;
    public final String title;

    public enum ReviewResult implements WireEnum {
        APPROVED(1),
        APPROVED_WITH_FUNDS_HOLD(2);

        public final int value;
        public static final Trigger.Companion Companion = new Trigger.Companion();
        public static final CheckDepositRenderData$ReviewResult$Companion$ADAPTER$1 ADAPTER = new CheckDepositRenderData$ReviewResult$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ReviewResult.class), Syntax.PROTO_2, null);

        ReviewResult(int i) {
            this.value = i;
        }

        public static final ReviewResult fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return APPROVED;
            }
            if (i != 2) {
                return null;
            }
            return APPROVED_WITH_FUNDS_HOLD;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum Status implements WireEnum {
        IN_REVIEW(1),
        PROCESSING(2),
        ACCEPTED(3),
        REJECTED(4),
        BOUNCED(5),
        WAITING_REVIEW(6);

        public final int value;
        public static final KeyScope.Companion Companion = new KeyScope.Companion();
        public static final CheckDepositRenderData$Status$Companion$ADAPTER$1 ADAPTER = new CheckDepositRenderData$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, null);

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 1:
                    return IN_REVIEW;
                case 2:
                    return PROCESSING;
                case 3:
                    return ACCEPTED;
                case 4:
                    return REJECTED;
                case 5:
                    return BOUNCED;
                case 6:
                    return WAITING_REVIEW;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CheckDepositRenderData$Companion$ADAPTER$1 checkDepositRenderData$Companion$ADAPTER$1 = new CheckDepositRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CheckDepositRenderData.class), "type.googleapis.com/squareup.franklin.CheckDepositRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = checkDepositRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(checkDepositRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckDepositRenderData(String str, String str2, Status status, DeclineReason declineReason, ReviewResult reviewResult, Long l, Money money, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.detail = str2;
        this.status = status;
        this.decline_reason = declineReason;
        this.review_result = reviewResult;
        this.return_date = l;
        this.past_amount = money;
        this.funds_hold_business_days = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CheckDepositRenderData)) {
            return false;
        }
        CheckDepositRenderData checkDepositRenderData = (CheckDepositRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), checkDepositRenderData.unknownFields()) && Intrinsics.areEqual(this.title, checkDepositRenderData.title) && Intrinsics.areEqual(this.detail, checkDepositRenderData.detail) && this.status == checkDepositRenderData.status && this.decline_reason == checkDepositRenderData.decline_reason && this.review_result == checkDepositRenderData.review_result && Intrinsics.areEqual(this.return_date, checkDepositRenderData.return_date) && Intrinsics.areEqual(this.past_amount, checkDepositRenderData.past_amount) && Intrinsics.areEqual(this.funds_hold_business_days, checkDepositRenderData.funds_hold_business_days);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.detail;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Status status = this.status;
        int hashCode4 = (hashCode3 + (status != null ? status.hashCode() : 0)) * 37;
        DeclineReason declineReason = this.decline_reason;
        int hashCode5 = (hashCode4 + (declineReason != null ? declineReason.hashCode() : 0)) * 37;
        ReviewResult reviewResult = this.review_result;
        int hashCode6 = (hashCode5 + (reviewResult != null ? reviewResult.hashCode() : 0)) * 37;
        Long l = this.return_date;
        int hashCode7 = (hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Money money = this.past_amount;
        int hashCode8 = (hashCode7 + (money != null ? money.hashCode() : 0)) * 37;
        Long l2 = this.funds_hold_business_days;
        int hashCode9 = hashCode8 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(24, false);
        builder.category = this.title;
        builder.token = this.detail;
        builder.title = this.status;
        builder.client_route = this.decline_reason;
        builder.url = this.review_result;
        builder.owner_token = this.return_date;
        builder.version_data = this.past_amount;
        builder.localizable_title = this.funds_hold_business_days;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.detail;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "detail=", arrayList);
        }
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        DeclineReason declineReason = this.decline_reason;
        if (declineReason != null) {
            arrayList.add("decline_reason=" + declineReason);
        }
        ReviewResult reviewResult = this.review_result;
        if (reviewResult != null) {
            arrayList.add("review_result=" + reviewResult);
        }
        Long l = this.return_date;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("return_date=", l, arrayList);
        }
        Money money = this.past_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("past_amount=", money, arrayList);
        }
        Long l2 = this.funds_hold_business_days;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("funds_hold_business_days=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CheckDepositRenderData{", "}", 0, null, null, 56);
    }
}
