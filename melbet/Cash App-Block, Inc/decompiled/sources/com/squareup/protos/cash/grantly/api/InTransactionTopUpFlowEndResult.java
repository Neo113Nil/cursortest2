package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
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
public final class InTransactionTopUpFlowEndResult extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InTransactionTopUpFlowEndResult> CREATOR;
    public final InTransactionTopUpInfo in_transaction_top_up_info;
    public final Money last_known_stored_balance_amount;
    public final Money pre_auth_total_amount;
    public final InTransactionTopUpResolution resolution;
    public final Money selected_top_up_amount;

    public enum InTransactionTopUpResolution implements WireEnum {
        SKIPPED(1),
        CONSUMER_INELIGIBLE(2),
        CONSUMER_APPROVED(3),
        CONSUMER_DECLINED(4);

        public final int value;
        public static final ImageLayout.Companion Companion = new ImageLayout.Companion();
        public static final InTransactionTopUpFlowEndResult$InTransactionTopUpResolution$Companion$ADAPTER$1 ADAPTER = new InTransactionTopUpFlowEndResult$InTransactionTopUpResolution$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InTransactionTopUpResolution.class), Syntax.PROTO_2, null);

        InTransactionTopUpResolution(int i) {
            this.value = i;
        }

        public static final InTransactionTopUpResolution fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return SKIPPED;
            }
            if (i == 2) {
                return CONSUMER_INELIGIBLE;
            }
            if (i == 3) {
                return CONSUMER_APPROVED;
            }
            if (i != 4) {
                return null;
            }
            return CONSUMER_DECLINED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        InTransactionTopUpFlowEndResult$Companion$ADAPTER$1 inTransactionTopUpFlowEndResult$Companion$ADAPTER$1 = new InTransactionTopUpFlowEndResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InTransactionTopUpFlowEndResult.class), "type.googleapis.com/squareup.cash.grantly.api.InTransactionTopUpFlowEndResult", Syntax.PROTO_2, null, "squareup/cash/grantly/api/in_transaction_top_up_flow_end_result.proto");
        ADAPTER = inTransactionTopUpFlowEndResult$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(inTransactionTopUpFlowEndResult$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InTransactionTopUpFlowEndResult(InTransactionTopUpInfo inTransactionTopUpInfo, Money money, InTransactionTopUpResolution inTransactionTopUpResolution, Money money2, Money money3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.in_transaction_top_up_info = inTransactionTopUpInfo;
        this.last_known_stored_balance_amount = money;
        this.resolution = inTransactionTopUpResolution;
        this.selected_top_up_amount = money2;
        this.pre_auth_total_amount = money3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InTransactionTopUpFlowEndResult)) {
            return false;
        }
        InTransactionTopUpFlowEndResult inTransactionTopUpFlowEndResult = (InTransactionTopUpFlowEndResult) obj;
        return Intrinsics.areEqual(unknownFields(), inTransactionTopUpFlowEndResult.unknownFields()) && Intrinsics.areEqual(this.in_transaction_top_up_info, inTransactionTopUpFlowEndResult.in_transaction_top_up_info) && Intrinsics.areEqual(this.last_known_stored_balance_amount, inTransactionTopUpFlowEndResult.last_known_stored_balance_amount) && this.resolution == inTransactionTopUpFlowEndResult.resolution && Intrinsics.areEqual(this.selected_top_up_amount, inTransactionTopUpFlowEndResult.selected_top_up_amount) && Intrinsics.areEqual(this.pre_auth_total_amount, inTransactionTopUpFlowEndResult.pre_auth_total_amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        InTransactionTopUpInfo inTransactionTopUpInfo = this.in_transaction_top_up_info;
        int hashCode2 = (hashCode + (inTransactionTopUpInfo != null ? inTransactionTopUpInfo.hashCode() : 0)) * 37;
        Money money = this.last_known_stored_balance_amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        InTransactionTopUpResolution inTransactionTopUpResolution = this.resolution;
        int hashCode4 = (hashCode3 + (inTransactionTopUpResolution != null ? inTransactionTopUpResolution.hashCode() : 0)) * 37;
        Money money2 = this.selected_top_up_amount;
        int hashCode5 = (hashCode4 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.pre_auth_total_amount;
        int hashCode6 = hashCode5 + (money3 != null ? money3.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder(12);
        builder.text = this.in_transaction_top_up_info;
        builder.text_style = this.last_known_stored_balance_amount;
        builder.text_decoration = this.resolution;
        builder.text_color = this.selected_top_up_amount;
        builder.icon = this.pre_auth_total_amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        InTransactionTopUpInfo inTransactionTopUpInfo = this.in_transaction_top_up_info;
        if (inTransactionTopUpInfo != null) {
            arrayList.add("in_transaction_top_up_info=" + inTransactionTopUpInfo);
        }
        Money money = this.last_known_stored_balance_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("last_known_stored_balance_amount=", money, arrayList);
        }
        InTransactionTopUpResolution inTransactionTopUpResolution = this.resolution;
        if (inTransactionTopUpResolution != null) {
            arrayList.add("resolution=" + inTransactionTopUpResolution);
        }
        Money money2 = this.selected_top_up_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("selected_top_up_amount=", money2, arrayList);
        }
        Money money3 = this.pre_auth_total_amount;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("pre_auth_total_amount=", money3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InTransactionTopUpFlowEndResult{", "}", 0, null, null, 56);
    }
}
