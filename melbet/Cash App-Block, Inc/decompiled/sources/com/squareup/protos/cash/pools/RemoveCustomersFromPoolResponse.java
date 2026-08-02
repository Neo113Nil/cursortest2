package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.ListPoolsResponse;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/pools/RemoveCustomersFromPoolResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/pools/ListPoolsResponse$Builder;", "Builder", "RemoveCustomerResult", "Status", "FailureReason", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RemoveCustomersFromPoolResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RemoveCustomersFromPoolResponse> CREATOR;
    public final List results;

    /* loaded from: classes8.dex */
    public enum FailureReason implements WireEnum {
        FAILURE_REASON_UNSPECIFIED(0),
        FAILURE_REASON_FORBIDDEN_POOL_OWNERSHIP(1),
        FAILURE_REASON_CONTRIBUTED_CUSTOMER_NON_REMOVABLE(2),
        FAILURE_REASON_CLOSED_POOL(3),
        FAILURE_REASON_CUSTOMER_NO_MEMBERSHIP(4),
        FAILURE_REASON_RATE_LIMIT_EXCEEDED(5);

        public static final RemoveCustomersFromPoolResponse$FailureReason$Companion$ADAPTER$1 ADAPTER;
        public static final TaxEnvironment.Companion Companion;
        public final int value;

        static {
            FailureReason failureReason = FAILURE_REASON_UNSPECIFIED;
            Companion = new TaxEnvironment.Companion();
            ADAPTER = new RemoveCustomersFromPoolResponse$FailureReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(FailureReason.class), Syntax.PROTO_2, failureReason);
        }

        FailureReason(int i) {
            this.value = i;
        }

        public static final FailureReason fromValue(int i) {
            Companion.getClass();
            return TaxEnvironment.Companion.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class RemoveCustomerResult extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RemoveCustomerResult> CREATOR;
        public final String customer_token;
        public final FailureReason failure_reason;
        public final Status status;

        static {
            RemoveCustomersFromPoolResponse$RemoveCustomerResult$Companion$ADAPTER$1 removeCustomersFromPoolResponse$RemoveCustomerResult$Companion$ADAPTER$1 = new RemoveCustomersFromPoolResponse$RemoveCustomerResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RemoveCustomerResult.class), "type.googleapis.com/squareup.cash.pools.v1beta.RemoveCustomersFromPoolResponse.RemoveCustomerResult", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/pools.proto");
            ADAPTER = removeCustomersFromPoolResponse$RemoveCustomerResult$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(removeCustomersFromPoolResponse$RemoveCustomerResult$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoveCustomerResult(String str, Status status, FailureReason failureReason, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.customer_token = str;
            this.status = status;
            this.failure_reason = failureReason;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RemoveCustomerResult)) {
                return false;
            }
            RemoveCustomerResult removeCustomerResult = (RemoveCustomerResult) obj;
            return Intrinsics.areEqual(unknownFields(), removeCustomerResult.unknownFields()) && Intrinsics.areEqual(this.customer_token, removeCustomerResult.customer_token) && this.status == removeCustomerResult.status && this.failure_reason == removeCustomerResult.failure_reason;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.customer_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Status status = this.status;
            int hashCode3 = (hashCode2 + (status != null ? status.hashCode() : 0)) * 37;
            FailureReason failureReason = this.failure_reason;
            int hashCode4 = hashCode3 + (failureReason != null ? failureReason.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CardScheme.Builder builder = new CardScheme.Builder(4);
            builder.modules = this.customer_token;
            builder.overflow_modules = this.status;
            builder.card_home_actions = this.failure_reason;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.customer_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
            }
            Status status = this.status;
            if (status != null) {
                arrayList.add("status=" + status);
            }
            FailureReason failureReason = this.failure_reason;
            if (failureReason != null) {
                arrayList.add("failure_reason=" + failureReason);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RemoveCustomerResult{", "}", 0, null, null, 56);
        }
    }

    public enum Status implements WireEnum {
        STATUS_UNSPECIFIED(0),
        STATUS_SUCCESS(1),
        STATUS_FAILURE(2);

        public static final RemoveCustomersFromPoolResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final TextSize.Companion Companion;
        public final int value;

        static {
            Status status = STATUS_UNSPECIFIED;
            Companion = new TextSize.Companion();
            ADAPTER = new RemoveCustomersFromPoolResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return STATUS_UNSPECIFIED;
            }
            if (i == 1) {
                return STATUS_SUCCESS;
            }
            if (i != 2) {
                return null;
            }
            return STATUS_FAILURE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        RemoveCustomersFromPoolResponse$Companion$ADAPTER$1 removeCustomersFromPoolResponse$Companion$ADAPTER$1 = new RemoveCustomersFromPoolResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RemoveCustomersFromPoolResponse.class), "type.googleapis.com/squareup.cash.pools.v1beta.RemoveCustomersFromPoolResponse", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/pools.proto");
        ADAPTER = removeCustomersFromPoolResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(removeCustomersFromPoolResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveCustomersFromPoolResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.results = TransactorKt.immutableCopyOf("results", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RemoveCustomersFromPoolResponse)) {
            return false;
        }
        RemoveCustomersFromPoolResponse removeCustomersFromPoolResponse = (RemoveCustomersFromPoolResponse) obj;
        return Intrinsics.areEqual(unknownFields(), removeCustomersFromPoolResponse.unknownFields()) && Intrinsics.areEqual(this.results, removeCustomersFromPoolResponse.results);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.results.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(9, false);
        builder.pools = this.results;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.results;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("results=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RemoveCustomersFromPoolResponse{", "}", 0, null, null, 56);
    }
}
