package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.core.internal.thread.ThreadExtKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.groups.GroupParticipant;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/CalculateLineItemsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/GroupParticipant$Builder;", "Builder", "com/datadog/android/core/internal/thread/ThreadExtKt", "Success", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CalculateLineItemsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CalculateLineItemsResponse> CREATOR;
    public final ThreadExtKt response;

    public final class Success extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Success> CREATOR;
        public final List applied_discount_codes;
        public final LocalFulfillment fulfillment;
        public final Boolean includes_preorder_items;
        public final List lines;
        public final LocalMoney lines_subtotal;
        public final LocalMoney lines_subtotal_before_discounts;

        public final class Builder extends Message.Builder {
            public List applied_discount_codes;
            public LocalFulfillment fulfillment;
            public Boolean includes_preorder_items;
            public List lines;
            public LocalMoney lines_subtotal;
            public LocalMoney lines_subtotal_before_discounts;

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                return new Success(this.lines, this.lines_subtotal, this.applied_discount_codes, this.lines_subtotal_before_discounts, this.fulfillment, this.includes_preorder_items, buildUnknownFields());
            }
        }

        static {
            CalculateLineItemsResponse$Success$Companion$ADAPTER$1 calculateLineItemsResponse$Success$Companion$ADAPTER$1 = new CalculateLineItemsResponse$Success$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Success.class), "type.googleapis.com/squareup.cash.local.client.v1.CalculateLineItemsResponse.Success", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = calculateLineItemsResponse$Success$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(calculateLineItemsResponse$Success$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(List list, LocalMoney localMoney, List list2, LocalMoney localMoney2, LocalFulfillment localFulfillment, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
            this.lines_subtotal = localMoney;
            this.lines_subtotal_before_discounts = localMoney2;
            this.fulfillment = localFulfillment;
            this.includes_preorder_items = bool;
            this.lines = TransactorKt.immutableCopyOf("lines", list);
            this.applied_discount_codes = TransactorKt.immutableCopyOf("applied_discount_codes", list2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(unknownFields(), success.unknownFields()) && Intrinsics.areEqual(this.lines, success.lines) && Intrinsics.areEqual(this.lines_subtotal, success.lines_subtotal) && Intrinsics.areEqual(this.applied_discount_codes, success.applied_discount_codes) && Intrinsics.areEqual(this.lines_subtotal_before_discounts, success.lines_subtotal_before_discounts) && Intrinsics.areEqual(this.fulfillment, success.fulfillment) && Intrinsics.areEqual(this.includes_preorder_items, success.includes_preorder_items);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.lines);
            LocalMoney localMoney = this.lines_subtotal;
            int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (localMoney != null ? localMoney.hashCode() : 0)) * 37, 37, this.applied_discount_codes);
            LocalMoney localMoney2 = this.lines_subtotal_before_discounts;
            int hashCode = (m2 + (localMoney2 != null ? localMoney2.hashCode() : 0)) * 37;
            LocalFulfillment localFulfillment = this.fulfillment;
            int hashCode2 = (hashCode + (localFulfillment != null ? localFulfillment.hashCode() : 0)) * 37;
            Boolean bool = this.includes_preorder_items;
            int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.lines = this.lines;
            builder.lines_subtotal = this.lines_subtotal;
            builder.applied_discount_codes = this.applied_discount_codes;
            builder.lines_subtotal_before_discounts = this.lines_subtotal_before_discounts;
            builder.fulfillment = this.fulfillment;
            builder.includes_preorder_items = this.includes_preorder_items;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.lines;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("lines=", arrayList, list);
            }
            LocalMoney localMoney = this.lines_subtotal;
            if (localMoney != null) {
                SizeMode$EnumUnboxingLocalUtility.m("lines_subtotal=", localMoney, arrayList);
            }
            List list2 = this.applied_discount_codes;
            if (!list2.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("applied_discount_codes=", arrayList, list2);
            }
            LocalMoney localMoney2 = this.lines_subtotal_before_discounts;
            if (localMoney2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("lines_subtotal_before_discounts=", localMoney2, arrayList);
            }
            LocalFulfillment localFulfillment = this.fulfillment;
            if (localFulfillment != null) {
                arrayList.add("fulfillment=" + localFulfillment);
            }
            Boolean bool = this.includes_preorder_items;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("includes_preorder_items=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Success{", "}", 0, null, null, 56);
        }
    }

    static {
        CalculateLineItemsResponse$Companion$ADAPTER$1 calculateLineItemsResponse$Companion$ADAPTER$1 = new CalculateLineItemsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CalculateLineItemsResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.CalculateLineItemsResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = calculateLineItemsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(calculateLineItemsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalculateLineItemsResponse(ThreadExtKt threadExtKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = threadExtKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CalculateLineItemsResponse)) {
            return false;
        }
        CalculateLineItemsResponse calculateLineItemsResponse = (CalculateLineItemsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), calculateLineItemsResponse.unknownFields()) && Intrinsics.areEqual(this.response, calculateLineItemsResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ThreadExtKt threadExtKt = this.response;
        int hashCode2 = hashCode + (threadExtKt != null ? threadExtKt.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GroupParticipant.Builder builder = new GroupParticipant.Builder(16);
        builder.f1276type = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ThreadExtKt threadExtKt = this.response;
        if (threadExtKt != null) {
            arrayList.add("response=" + threadExtKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CalculateLineItemsResponse{", "}", 0, null, null, 56);
    }
}
