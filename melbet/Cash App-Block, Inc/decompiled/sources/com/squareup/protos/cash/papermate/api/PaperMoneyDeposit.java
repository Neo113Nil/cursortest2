package com.squareup.protos.cash.papermate.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.papermate.enums.ExternalSystem;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.protos.cash.papermate.states.PaperMoneyDepositState;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiControl;
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
public final class PaperMoneyDeposit extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaperMoneyDeposit> CREATOR;
    public final Money amount;
    public final String barcode_number;
    public final Long created_at;
    public final String customer_token;
    public final String decline_reason;
    public final Long declined_at;
    public final String device_id;
    public final String device_installation_id;
    public final String external_reference_id;
    public final ExternalSystem external_system;
    public final Long failed_at;
    public final String failure_reason;
    public final Money fee;
    public final FeeType fee_type;
    public final Long pending_at;
    public final Long pending_ledgered_at;
    public final String reversal_message;
    public final Long reversed_at;
    public final Long reversed_ledgered_at;
    public final Long settled_at;
    public final PaperMoneyDepositState state;
    public final String token;
    public final Long validated_at;

    static {
        PaperMoneyDeposit$Companion$ADAPTER$1 paperMoneyDeposit$Companion$ADAPTER$1 = new PaperMoneyDeposit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaperMoneyDeposit.class), "type.googleapis.com/squareup.cash.papermate.app.PaperMoneyDeposit", Syntax.PROTO_2, null, "squareup/cash/papermate/api/entities.proto");
        ADAPTER = paperMoneyDeposit$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paperMoneyDeposit$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaperMoneyDeposit(String str, String str2, String str3, PaperMoneyDepositState paperMoneyDepositState, Money money, Money money2, Long l, String str4, Long l2, Long l3, Long l4, Long l5, String str5, Long l6, String str6, String str7, Long l7, Long l8, Long l9, FeeType feeType, ExternalSystem externalSystem, String str8, String str9, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.customer_token = str2;
        this.barcode_number = str3;
        this.state = paperMoneyDepositState;
        this.amount = money;
        this.fee = money2;
        this.declined_at = l;
        this.decline_reason = str4;
        this.pending_at = l2;
        this.validated_at = l3;
        this.settled_at = l4;
        this.failed_at = l5;
        this.failure_reason = str5;
        this.reversed_at = l6;
        this.reversal_message = str6;
        this.external_reference_id = str7;
        this.created_at = l7;
        this.pending_ledgered_at = l8;
        this.reversed_ledgered_at = l9;
        this.fee_type = feeType;
        this.external_system = externalSystem;
        this.device_id = str8;
        this.device_installation_id = str9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaperMoneyDeposit)) {
            return false;
        }
        PaperMoneyDeposit paperMoneyDeposit = (PaperMoneyDeposit) obj;
        return Intrinsics.areEqual(unknownFields(), paperMoneyDeposit.unknownFields()) && Intrinsics.areEqual(this.token, paperMoneyDeposit.token) && Intrinsics.areEqual(this.customer_token, paperMoneyDeposit.customer_token) && Intrinsics.areEqual(this.barcode_number, paperMoneyDeposit.barcode_number) && this.state == paperMoneyDeposit.state && Intrinsics.areEqual(this.amount, paperMoneyDeposit.amount) && Intrinsics.areEqual(this.fee, paperMoneyDeposit.fee) && Intrinsics.areEqual(this.declined_at, paperMoneyDeposit.declined_at) && Intrinsics.areEqual(this.decline_reason, paperMoneyDeposit.decline_reason) && Intrinsics.areEqual(this.pending_at, paperMoneyDeposit.pending_at) && Intrinsics.areEqual(this.validated_at, paperMoneyDeposit.validated_at) && Intrinsics.areEqual(this.settled_at, paperMoneyDeposit.settled_at) && Intrinsics.areEqual(this.failed_at, paperMoneyDeposit.failed_at) && Intrinsics.areEqual(this.failure_reason, paperMoneyDeposit.failure_reason) && Intrinsics.areEqual(this.reversed_at, paperMoneyDeposit.reversed_at) && Intrinsics.areEqual(this.reversal_message, paperMoneyDeposit.reversal_message) && Intrinsics.areEqual(this.external_reference_id, paperMoneyDeposit.external_reference_id) && Intrinsics.areEqual(this.created_at, paperMoneyDeposit.created_at) && Intrinsics.areEqual(this.pending_ledgered_at, paperMoneyDeposit.pending_ledgered_at) && Intrinsics.areEqual(this.reversed_ledgered_at, paperMoneyDeposit.reversed_ledgered_at) && this.fee_type == paperMoneyDeposit.fee_type && this.external_system == paperMoneyDeposit.external_system && Intrinsics.areEqual(this.device_id, paperMoneyDeposit.device_id) && Intrinsics.areEqual(this.device_installation_id, paperMoneyDeposit.device_installation_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.customer_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.barcode_number;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        PaperMoneyDepositState paperMoneyDepositState = this.state;
        int hashCode5 = (hashCode4 + (paperMoneyDepositState != null ? paperMoneyDepositState.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode6 = (hashCode5 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.fee;
        int hashCode7 = (hashCode6 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Long l = this.declined_at;
        int hashCode8 = (hashCode7 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str4 = this.decline_reason;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Long l2 = this.pending_at;
        int hashCode10 = (hashCode9 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.validated_at;
        int hashCode11 = (hashCode10 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.settled_at;
        int hashCode12 = (hashCode11 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        Long l5 = this.failed_at;
        int hashCode13 = (hashCode12 + (l5 != null ? Long.hashCode(l5.longValue()) : 0)) * 37;
        String str5 = this.failure_reason;
        int hashCode14 = (hashCode13 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Long l6 = this.reversed_at;
        int hashCode15 = (hashCode14 + (l6 != null ? Long.hashCode(l6.longValue()) : 0)) * 37;
        String str6 = this.reversal_message;
        int hashCode16 = (hashCode15 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.external_reference_id;
        int hashCode17 = (hashCode16 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Long l7 = this.created_at;
        int hashCode18 = (hashCode17 + (l7 != null ? Long.hashCode(l7.longValue()) : 0)) * 37;
        Long l8 = this.pending_ledgered_at;
        int hashCode19 = (hashCode18 + (l8 != null ? Long.hashCode(l8.longValue()) : 0)) * 37;
        Long l9 = this.reversed_ledgered_at;
        int hashCode20 = (hashCode19 + (l9 != null ? Long.hashCode(l9.longValue()) : 0)) * 37;
        FeeType feeType = this.fee_type;
        int hashCode21 = (hashCode20 + (feeType != null ? feeType.hashCode() : 0)) * 37;
        ExternalSystem externalSystem = this.external_system;
        int hashCode22 = (hashCode21 + (externalSystem != null ? externalSystem.hashCode() : 0)) * 37;
        String str8 = this.device_id;
        int hashCode23 = (hashCode22 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.device_installation_id;
        int hashCode24 = hashCode23 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = hashCode24;
        return hashCode24;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiControl.Builder builder = new UiControl.Builder(3);
        builder.main_text = this.token;
        builder.sub_text = this.customer_token;
        builder.accessibility_text = this.barcode_number;
        builder.f1401type = this.state;
        builder.state = this.amount;
        builder.localizable_text = this.fee;
        builder.localizable_main_text = this.declined_at;
        builder.action_url_to_open = this.decline_reason;
        builder.localizable_sub_text = this.pending_at;
        builder.localizable_accessibility_text = this.validated_at;
        builder.localizable_info_text = this.settled_at;
        builder.main_text_color_override = this.failed_at;
        builder.support_node_token = this.failure_reason;
        builder.accent_color = this.reversed_at;
        builder.info_text = this.reversal_message;
        builder.button = this.external_reference_id;
        builder.icon = this.created_at;
        builder.action = this.pending_ledgered_at;
        builder.client_scenario = this.reversed_ledgered_at;
        builder.status_result = this.fee_type;
        builder.dialog = this.external_system;
        builder.enabled = this.device_id;
        builder.info_text_style = this.device_installation_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.customer_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "customer_token=", arrayList);
        }
        String str3 = this.barcode_number;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "barcode_number=", arrayList);
        }
        PaperMoneyDepositState paperMoneyDepositState = this.state;
        if (paperMoneyDepositState != null) {
            arrayList.add("state=" + paperMoneyDepositState);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        Money money2 = this.fee;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("fee=", money2, arrayList);
        }
        Long l = this.declined_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("declined_at=", l, arrayList);
        }
        String str4 = this.decline_reason;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "decline_reason=", arrayList);
        }
        Long l2 = this.pending_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("pending_at=", l2, arrayList);
        }
        Long l3 = this.validated_at;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("validated_at=", l3, arrayList);
        }
        Long l4 = this.settled_at;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("settled_at=", l4, arrayList);
        }
        Long l5 = this.failed_at;
        if (l5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("failed_at=", l5, arrayList);
        }
        String str5 = this.failure_reason;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "failure_reason=", arrayList);
        }
        Long l6 = this.reversed_at;
        if (l6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("reversed_at=", l6, arrayList);
        }
        String str6 = this.reversal_message;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "reversal_message=", arrayList);
        }
        String str7 = this.external_reference_id;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "external_reference_id=", arrayList);
        }
        Long l7 = this.created_at;
        if (l7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l7, arrayList);
        }
        Long l8 = this.pending_ledgered_at;
        if (l8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("pending_ledgered_at=", l8, arrayList);
        }
        Long l9 = this.reversed_ledgered_at;
        if (l9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("reversed_ledgered_at=", l9, arrayList);
        }
        FeeType feeType = this.fee_type;
        if (feeType != null) {
            arrayList.add("fee_type=" + feeType);
        }
        ExternalSystem externalSystem = this.external_system;
        if (externalSystem != null) {
            arrayList.add("external_system=" + externalSystem);
        }
        String str8 = this.device_id;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "device_id=", arrayList);
        }
        String str9 = this.device_installation_id;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "device_installation_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaperMoneyDeposit{", "}", 0, null, null, 56);
    }
}
