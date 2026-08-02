package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.timecards.Timecard;
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
public final class Operation extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Operation> CREATOR;
    public final String amount;
    public final String completed_at;
    public final String counterparty;
    public final String created_at;
    public final Integer decimals;
    public final Chain dest_chain;
    public final String dest_tx_hash;
    public final OperationFailureReason failure_code;
    public final String failure_reason;
    public final String operation_token;
    public final String parent_operation_token;
    public final Chain source_chain;
    public final String source_tx_hash;
    public final OperationStatus status;
    public final String token_address;

    /* renamed from: type, reason: collision with root package name */
    public final OperationType f1253type;
    public final String wallet_address;

    static {
        Operation$Companion$ADAPTER$1 operation$Companion$ADAPTER$1 = new Operation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Operation.class), "type.googleapis.com/squareup.cash.cashliteorchestrator.api.v1beta1.Operation", Syntax.PROTO_2, null, "squareup/cash/cashliteorchestrator/api/v1beta1/orchestrator.proto");
        ADAPTER = operation$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(operation$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Operation(String str, OperationType operationType, OperationStatus operationStatus, Chain chain, Chain chain2, String str2, String str3, String str4, String str5, OperationFailureReason operationFailureReason, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.operation_token = str;
        this.f1253type = operationType;
        this.status = operationStatus;
        this.source_chain = chain;
        this.dest_chain = chain2;
        this.counterparty = str2;
        this.amount = str3;
        this.source_tx_hash = str4;
        this.dest_tx_hash = str5;
        this.failure_code = operationFailureReason;
        this.failure_reason = str6;
        this.created_at = str7;
        this.completed_at = str8;
        this.decimals = num;
        this.token_address = str9;
        this.wallet_address = str10;
        this.parent_operation_token = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Operation)) {
            return false;
        }
        Operation operation2 = (Operation) obj;
        return Intrinsics.areEqual(unknownFields(), operation2.unknownFields()) && Intrinsics.areEqual(this.operation_token, operation2.operation_token) && this.f1253type == operation2.f1253type && this.status == operation2.status && this.source_chain == operation2.source_chain && this.dest_chain == operation2.dest_chain && Intrinsics.areEqual(this.counterparty, operation2.counterparty) && Intrinsics.areEqual(this.amount, operation2.amount) && Intrinsics.areEqual(this.source_tx_hash, operation2.source_tx_hash) && Intrinsics.areEqual(this.dest_tx_hash, operation2.dest_tx_hash) && this.failure_code == operation2.failure_code && Intrinsics.areEqual(this.failure_reason, operation2.failure_reason) && Intrinsics.areEqual(this.created_at, operation2.created_at) && Intrinsics.areEqual(this.completed_at, operation2.completed_at) && Intrinsics.areEqual(this.decimals, operation2.decimals) && Intrinsics.areEqual(this.token_address, operation2.token_address) && Intrinsics.areEqual(this.wallet_address, operation2.wallet_address) && Intrinsics.areEqual(this.parent_operation_token, operation2.parent_operation_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.operation_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        OperationType operationType = this.f1253type;
        int hashCode3 = (hashCode2 + (operationType != null ? operationType.hashCode() : 0)) * 37;
        OperationStatus operationStatus = this.status;
        int hashCode4 = (hashCode3 + (operationStatus != null ? operationStatus.hashCode() : 0)) * 37;
        Chain chain = this.source_chain;
        int hashCode5 = (hashCode4 + (chain != null ? chain.hashCode() : 0)) * 37;
        Chain chain2 = this.dest_chain;
        int hashCode6 = (hashCode5 + (chain2 != null ? chain2.hashCode() : 0)) * 37;
        String str2 = this.counterparty;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.amount;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.source_tx_hash;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.dest_tx_hash;
        int hashCode10 = (hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 37;
        OperationFailureReason operationFailureReason = this.failure_code;
        int hashCode11 = (hashCode10 + (operationFailureReason != null ? operationFailureReason.hashCode() : 0)) * 37;
        String str6 = this.failure_reason;
        int hashCode12 = (hashCode11 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.created_at;
        int hashCode13 = (hashCode12 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.completed_at;
        int hashCode14 = (hashCode13 + (str8 != null ? str8.hashCode() : 0)) * 37;
        Integer num = this.decimals;
        int hashCode15 = (hashCode14 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        String str9 = this.token_address;
        int hashCode16 = (hashCode15 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.wallet_address;
        int hashCode17 = (hashCode16 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.parent_operation_token;
        int hashCode18 = hashCode17 + (str11 != null ? str11.hashCode() : 0);
        this.hashCode = hashCode18;
        return hashCode18;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Timecard.Builder builder = new Timecard.Builder(4);
        builder.token = this.operation_token;
        builder.employee = this.f1253type;
        builder.deleted = this.status;
        builder.was_automatically_clocked_out = this.source_chain;
        builder.clockin_timestamp_ms = this.dest_chain;
        builder.shift_id = this.counterparty;
        builder.merchant_token = this.amount;
        builder.employee_token = this.source_tx_hash;
        builder.clockin_unit_token = this.dest_tx_hash;
        builder.clockout_timestamp_ms = this.failure_code;
        builder.clockout_unit_token = this.failure_reason;
        builder.note = this.created_at;
        builder.created_at_timestamp_ms = this.completed_at;
        builder.updated_at_timestamp_ms = this.decimals;
        builder.hourly_wage = this.token_address;
        builder.declared_tip = this.wallet_address;
        builder.employee_job_info = this.parent_operation_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.operation_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "operation_token=", arrayList);
        }
        OperationType operationType = this.f1253type;
        if (operationType != null) {
            arrayList.add("type=" + operationType);
        }
        OperationStatus operationStatus = this.status;
        if (operationStatus != null) {
            arrayList.add("status=" + operationStatus);
        }
        Chain chain = this.source_chain;
        if (chain != null) {
            arrayList.add("source_chain=" + chain);
        }
        Chain chain2 = this.dest_chain;
        if (chain2 != null) {
            arrayList.add("dest_chain=" + chain2);
        }
        String str2 = this.counterparty;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "counterparty=", arrayList);
        }
        String str3 = this.amount;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "amount=", arrayList);
        }
        String str4 = this.source_tx_hash;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "source_tx_hash=", arrayList);
        }
        String str5 = this.dest_tx_hash;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "dest_tx_hash=", arrayList);
        }
        OperationFailureReason operationFailureReason = this.failure_code;
        if (operationFailureReason != null) {
            arrayList.add("failure_code=" + operationFailureReason);
        }
        String str6 = this.failure_reason;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "failure_reason=", arrayList);
        }
        String str7 = this.created_at;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "created_at=", arrayList);
        }
        String str8 = this.completed_at;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "completed_at=", arrayList);
        }
        Integer num = this.decimals;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("decimals=", num, arrayList);
        }
        String str9 = this.token_address;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "token_address=", arrayList);
        }
        String str10 = this.wallet_address;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "wallet_address=", arrayList);
        }
        String str11 = this.parent_operation_token;
        if (str11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, "parent_operation_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Operation{", "}", 0, null, null, 56);
    }
}
