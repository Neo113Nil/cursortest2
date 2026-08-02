package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.franklin.common.AppLinks;
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
public final class BillPayRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BillPayRenderData> CREATOR;
    public final BillCategory bill_category;
    public final BillPayPaymentState state;

    public enum BillCategory implements WireEnum {
        BILL_CATEGORY_DO_NOT_USE(1),
        UTILITIES(2),
        TELECOM(3),
        CREDIT_CARD(4),
        INSURANCE(5),
        BANK_AND_FINANCE(6),
        LOAN(7),
        MORTGAGE(8),
        SUBSCRIPTIONS(9),
        CLUB_MEMBERSHIP(10),
        HEALTHCARE_SERVICES(11),
        EDUCATIONAL_SERVICES(12),
        GOVERNMENT_SERVICES(13),
        RENTAL_PROPERTIES(14),
        HOMEOWNERS_ASSOCIATION(15),
        HOME_SECURITY(16),
        NON_PROFIT_ORGANIZATION(17),
        TRANSPORTATION(18),
        OTHER(19),
        UNCATEGORIZED(20),
        TAXES(21);

        public final int value;
        public static final Trigger.Companion Companion = new Trigger.Companion();
        public static final BillPayRenderData$BillCategory$Companion$ADAPTER$1 ADAPTER = new BillPayRenderData$BillCategory$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(BillCategory.class), Syntax.PROTO_2, null);

        BillCategory(int i) {
            this.value = i;
        }

        public static final BillCategory fromValue(int i) {
            Companion.getClass();
            return Trigger.Companion.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum BillPayPaymentState implements WireEnum {
        BILL_PAYMENT_STATE_DO_NOT_USE(1),
        COMPLETED(2),
        PRE_FUNDED(3),
        FAILED_NSF(4),
        CANCELED(5),
        FAILED(6);

        public final int value;
        public static final KeyScope.Companion Companion = new KeyScope.Companion();
        public static final BillPayRenderData$BillPayPaymentState$Companion$ADAPTER$1 ADAPTER = new BillPayRenderData$BillPayPaymentState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(BillPayPaymentState.class), Syntax.PROTO_2, null);

        BillPayPaymentState(int i) {
            this.value = i;
        }

        public static final BillPayPaymentState fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 1:
                    return BILL_PAYMENT_STATE_DO_NOT_USE;
                case 2:
                    return COMPLETED;
                case 3:
                    return PRE_FUNDED;
                case 4:
                    return FAILED_NSF;
                case 5:
                    return CANCELED;
                case 6:
                    return FAILED;
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
        BillPayRenderData$Companion$ADAPTER$1 billPayRenderData$Companion$ADAPTER$1 = new BillPayRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BillPayRenderData.class), "type.googleapis.com/squareup.franklin.BillPayRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = billPayRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(billPayRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillPayRenderData(BillCategory billCategory, BillPayPaymentState billPayPaymentState, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.bill_category = billCategory;
        this.state = billPayPaymentState;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BillPayRenderData)) {
            return false;
        }
        BillPayRenderData billPayRenderData = (BillPayRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), billPayRenderData.unknownFields()) && this.bill_category == billPayRenderData.bill_category && this.state == billPayRenderData.state;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BillCategory billCategory = this.bill_category;
        int hashCode2 = (hashCode + (billCategory != null ? billCategory.hashCode() : 0)) * 37;
        BillPayPaymentState billPayPaymentState = this.state;
        int hashCode3 = hashCode2 + (billPayPaymentState != null ? billPayPaymentState.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(2);
        builder.f1372android = this.bill_category;
        builder.ios = this.state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BillCategory billCategory = this.bill_category;
        if (billCategory != null) {
            arrayList.add("bill_category=" + billCategory);
        }
        BillPayPaymentState billPayPaymentState = this.state;
        if (billPayPaymentState != null) {
            arrayList.add("state=" + billPayPaymentState);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BillPayRenderData{", "}", 0, null, null, 56);
    }
}
