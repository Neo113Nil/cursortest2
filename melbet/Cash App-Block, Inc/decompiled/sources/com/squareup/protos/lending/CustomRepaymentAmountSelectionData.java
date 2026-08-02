package com.squareup.protos.lending;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.rewardly.ui.AppLinks;
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

/* loaded from: classes8.dex */
public final class CustomRepaymentAmountSelectionData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CustomRepaymentAmountSelectionData> CREATOR;
    public final CustomAmountPickerData custom_amount_picker_data;
    public final String reference_token;

    static {
        CustomRepaymentAmountSelectionData$Companion$ADAPTER$1 customRepaymentAmountSelectionData$Companion$ADAPTER$1 = new CustomRepaymentAmountSelectionData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CustomRepaymentAmountSelectionData.class), "type.googleapis.com/squareup.lending.CustomRepaymentAmountSelectionData", Syntax.PROTO_2, null, "squareup/lending/loan_repayment_selection.proto");
        ADAPTER = customRepaymentAmountSelectionData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(customRepaymentAmountSelectionData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomRepaymentAmountSelectionData(String str, CustomAmountPickerData customAmountPickerData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.reference_token = str;
        this.custom_amount_picker_data = customAmountPickerData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomRepaymentAmountSelectionData)) {
            return false;
        }
        CustomRepaymentAmountSelectionData customRepaymentAmountSelectionData = (CustomRepaymentAmountSelectionData) obj;
        return Intrinsics.areEqual(unknownFields(), customRepaymentAmountSelectionData.unknownFields()) && Intrinsics.areEqual(this.reference_token, customRepaymentAmountSelectionData.reference_token) && Intrinsics.areEqual(this.custom_amount_picker_data, customRepaymentAmountSelectionData.custom_amount_picker_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.reference_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        CustomAmountPickerData customAmountPickerData = this.custom_amount_picker_data;
        int hashCode3 = hashCode2 + (customAmountPickerData != null ? customAmountPickerData.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(7);
        builder.f1411android = this.reference_token;
        builder.ios = this.custom_amount_picker_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.reference_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "reference_token=", arrayList);
        }
        CustomAmountPickerData customAmountPickerData = this.custom_amount_picker_data;
        if (customAmountPickerData != null) {
            arrayList.add("custom_amount_picker_data=" + customAmountPickerData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CustomRepaymentAmountSelectionData{", "}", 0, null, null, 56);
    }
}
