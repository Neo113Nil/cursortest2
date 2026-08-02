package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.document.Document;
import com.squareup.protos.franklin.api.DepositPreference;
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
public final class DepositPreferenceOption extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DepositPreferenceOption> CREATOR;
    public final ConfirmationSheetData confirmation_sheet_data;
    public final DepositPreference deposit_preference;
    public final FeeData fee_data;
    public final String options_description_text;
    public final String options_text;
    public final Boolean suppress_fee;

    static {
        DepositPreferenceOption$Companion$ADAPTER$1 depositPreferenceOption$Companion$ADAPTER$1 = new DepositPreferenceOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DepositPreferenceOption.class), "type.googleapis.com/squareup.franklin.common.DepositPreferenceOption", Syntax.PROTO_2, null, "squareup/franklin/common/deposit_preference.proto");
        ADAPTER = depositPreferenceOption$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(depositPreferenceOption$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositPreferenceOption(DepositPreference depositPreference, FeeData feeData, String str, String str2, ConfirmationSheetData confirmationSheetData, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.deposit_preference = depositPreference;
        this.fee_data = feeData;
        this.options_text = str;
        this.options_description_text = str2;
        this.confirmation_sheet_data = confirmationSheetData;
        this.suppress_fee = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DepositPreferenceOption)) {
            return false;
        }
        DepositPreferenceOption depositPreferenceOption = (DepositPreferenceOption) obj;
        return Intrinsics.areEqual(unknownFields(), depositPreferenceOption.unknownFields()) && this.deposit_preference == depositPreferenceOption.deposit_preference && Intrinsics.areEqual(this.fee_data, depositPreferenceOption.fee_data) && Intrinsics.areEqual(this.options_text, depositPreferenceOption.options_text) && Intrinsics.areEqual(this.options_description_text, depositPreferenceOption.options_description_text) && Intrinsics.areEqual(this.confirmation_sheet_data, depositPreferenceOption.confirmation_sheet_data) && Intrinsics.areEqual(this.suppress_fee, depositPreferenceOption.suppress_fee);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DepositPreference depositPreference = this.deposit_preference;
        int hashCode2 = (hashCode + (depositPreference != null ? depositPreference.hashCode() : 0)) * 37;
        FeeData feeData = this.fee_data;
        int hashCode3 = (hashCode2 + (feeData != null ? feeData.hashCode() : 0)) * 37;
        String str = this.options_text;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.options_description_text;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        ConfirmationSheetData confirmationSheetData = this.confirmation_sheet_data;
        int hashCode6 = (hashCode5 + (confirmationSheetData != null ? confirmationSheetData.hashCode() : 0)) * 37;
        Boolean bool = this.suppress_fee;
        int hashCode7 = hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Document.Builder builder = new Document.Builder(27, false);
        builder.title = this.deposit_preference;
        builder.url = this.fee_data;
        builder.category = this.options_text;
        builder.token = this.options_description_text;
        builder.owner_token = this.confirmation_sheet_data;
        builder.document_date = this.suppress_fee;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DepositPreference depositPreference = this.deposit_preference;
        if (depositPreference != null) {
            arrayList.add("deposit_preference=" + depositPreference);
        }
        FeeData feeData = this.fee_data;
        if (feeData != null) {
            arrayList.add("fee_data=" + feeData);
        }
        String str = this.options_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "options_text=", arrayList);
        }
        String str2 = this.options_description_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "options_description_text=", arrayList);
        }
        ConfirmationSheetData confirmationSheetData = this.confirmation_sheet_data;
        if (confirmationSheetData != null) {
            arrayList.add("confirmation_sheet_data=" + confirmationSheetData);
        }
        Boolean bool = this.suppress_fee;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("suppress_fee=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DepositPreferenceOption{", "}", 0, null, null, 56);
    }
}
