package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.franklin.common.SavingsTransferRenderData;
import com.squareup.protos.franklin.data.LinkResult;
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
public final class SavingsInterestPaymentRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsInterestPaymentRenderData> CREATOR;
    public final String balance_token;
    public final Long interest_apy_bips;
    public final SavingsInterestPaymentState savings_interest_payment_state;
    public final SavingsTransferRenderData.SavingsFolderMetadata target_savings_folder_metadata;

    public enum SavingsInterestPaymentState implements WireEnum {
        SAVINGS_INTEREST_PAYMENT_STATE_UNSPECIFIED(0),
        SAVINGS_INTEREST_PAYMENT_STATE_ESTIMATED(1),
        SAVINGS_INTEREST_PAYMENT_STATE_COMPLETE(2);

        public static final SavingsInterestPaymentRenderData$SavingsInterestPaymentState$Companion$ADAPTER$1 ADAPTER;
        public static final LinkResult.Companion Companion;
        public final int value;

        static {
            SavingsInterestPaymentState savingsInterestPaymentState = SAVINGS_INTEREST_PAYMENT_STATE_UNSPECIFIED;
            Companion = new LinkResult.Companion();
            ADAPTER = new SavingsInterestPaymentRenderData$SavingsInterestPaymentState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SavingsInterestPaymentState.class), Syntax.PROTO_2, savingsInterestPaymentState);
        }

        SavingsInterestPaymentState(int i) {
            this.value = i;
        }

        public static final SavingsInterestPaymentState fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return SAVINGS_INTEREST_PAYMENT_STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return SAVINGS_INTEREST_PAYMENT_STATE_ESTIMATED;
            }
            if (i != 2) {
                return null;
            }
            return SAVINGS_INTEREST_PAYMENT_STATE_COMPLETE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SavingsInterestPaymentRenderData$Companion$ADAPTER$1 savingsInterestPaymentRenderData$Companion$ADAPTER$1 = new SavingsInterestPaymentRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsInterestPaymentRenderData.class), "type.googleapis.com/squareup.franklin.SavingsInterestPaymentRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = savingsInterestPaymentRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsInterestPaymentRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsInterestPaymentRenderData(SavingsInterestPaymentState savingsInterestPaymentState, Long l, String str, SavingsTransferRenderData.SavingsFolderMetadata savingsFolderMetadata, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.savings_interest_payment_state = savingsInterestPaymentState;
        this.interest_apy_bips = l;
        this.balance_token = str;
        this.target_savings_folder_metadata = savingsFolderMetadata;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsInterestPaymentRenderData)) {
            return false;
        }
        SavingsInterestPaymentRenderData savingsInterestPaymentRenderData = (SavingsInterestPaymentRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), savingsInterestPaymentRenderData.unknownFields()) && this.savings_interest_payment_state == savingsInterestPaymentRenderData.savings_interest_payment_state && Intrinsics.areEqual(this.interest_apy_bips, savingsInterestPaymentRenderData.interest_apy_bips) && Intrinsics.areEqual(this.balance_token, savingsInterestPaymentRenderData.balance_token) && Intrinsics.areEqual(this.target_savings_folder_metadata, savingsInterestPaymentRenderData.target_savings_folder_metadata);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SavingsInterestPaymentState savingsInterestPaymentState = this.savings_interest_payment_state;
        int hashCode2 = (hashCode + (savingsInterestPaymentState != null ? savingsInterestPaymentState.hashCode() : 0)) * 37;
        Long l = this.interest_apy_bips;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str = this.balance_token;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        SavingsTransferRenderData.SavingsFolderMetadata savingsFolderMetadata = this.target_savings_folder_metadata;
        int hashCode5 = hashCode4 + (savingsFolderMetadata != null ? savingsFolderMetadata.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder(27);
        builder.button_color = this.savings_interest_payment_state;
        builder.text_color = this.interest_apy_bips;
        builder.text = this.balance_token;
        builder.action = this.target_savings_folder_metadata;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SavingsInterestPaymentState savingsInterestPaymentState = this.savings_interest_payment_state;
        if (savingsInterestPaymentState != null) {
            arrayList.add("savings_interest_payment_state=" + savingsInterestPaymentState);
        }
        Long l = this.interest_apy_bips;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("interest_apy_bips=", l, arrayList);
        }
        String str = this.balance_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "balance_token=", arrayList);
        }
        SavingsTransferRenderData.SavingsFolderMetadata savingsFolderMetadata = this.target_savings_folder_metadata;
        if (savingsFolderMetadata != null) {
            arrayList.add("target_savings_folder_metadata=" + savingsFolderMetadata);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsInterestPaymentRenderData{", "}", 0, null, null, 56);
    }
}
