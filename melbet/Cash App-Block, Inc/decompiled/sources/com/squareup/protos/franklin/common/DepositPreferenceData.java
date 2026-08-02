package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.document.Document;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes.dex */
public final class DepositPreferenceData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DepositPreferenceData> CREATOR;
    public final List account_setting_options;
    public final List cash_out_options;
    public final String cash_out_title;
    public final DepositPreference default_preference_option;
    public final DepositFeeData deposit_fee_data;
    public final Boolean display_auto_cash_out_toggle;

    static {
        DepositPreferenceData$Companion$ADAPTER$1 depositPreferenceData$Companion$ADAPTER$1 = new DepositPreferenceData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DepositPreferenceData.class), "type.googleapis.com/squareup.franklin.common.DepositPreferenceData", Syntax.PROTO_2, null, "squareup/franklin/common/deposit_preference.proto");
        ADAPTER = depositPreferenceData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(depositPreferenceData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositPreferenceData(String str, List list, List list2, DepositPreference depositPreference, DepositFeeData depositFeeData, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.cash_out_title = str;
        this.default_preference_option = depositPreference;
        this.deposit_fee_data = depositFeeData;
        this.display_auto_cash_out_toggle = bool;
        this.account_setting_options = TransactorKt.immutableCopyOf("account_setting_options", list);
        this.cash_out_options = TransactorKt.immutableCopyOf("cash_out_options", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DepositPreferenceData)) {
            return false;
        }
        DepositPreferenceData depositPreferenceData = (DepositPreferenceData) obj;
        return Intrinsics.areEqual(unknownFields(), depositPreferenceData.unknownFields()) && Intrinsics.areEqual(this.cash_out_title, depositPreferenceData.cash_out_title) && Intrinsics.areEqual(this.account_setting_options, depositPreferenceData.account_setting_options) && Intrinsics.areEqual(this.cash_out_options, depositPreferenceData.cash_out_options) && this.default_preference_option == depositPreferenceData.default_preference_option && Intrinsics.areEqual(this.deposit_fee_data, depositPreferenceData.deposit_fee_data) && Intrinsics.areEqual(this.display_auto_cash_out_toggle, depositPreferenceData.display_auto_cash_out_toggle);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.cash_out_title;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.account_setting_options), 37, this.cash_out_options);
        DepositPreference depositPreference = this.default_preference_option;
        int hashCode2 = (m + (depositPreference != null ? depositPreference.hashCode() : 0)) * 37;
        DepositFeeData depositFeeData = this.deposit_fee_data;
        int hashCode3 = (hashCode2 + (depositFeeData != null ? depositFeeData.hashCode() : 0)) * 37;
        Boolean bool = this.display_auto_cash_out_toggle;
        int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Document.Builder builder = new Document.Builder(26);
        builder.category = this.cash_out_title;
        builder.token = this.account_setting_options;
        builder.title = this.cash_out_options;
        builder.url = this.default_preference_option;
        builder.owner_token = this.deposit_fee_data;
        builder.document_date = this.display_auto_cash_out_toggle;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.cash_out_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cash_out_title=", arrayList);
        }
        List list = this.account_setting_options;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("account_setting_options=", arrayList, list);
        }
        List list2 = this.cash_out_options;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("cash_out_options=", arrayList, list2);
        }
        DepositPreference depositPreference = this.default_preference_option;
        if (depositPreference != null) {
            arrayList.add("default_preference_option=" + depositPreference);
        }
        DepositFeeData depositFeeData = this.deposit_fee_data;
        if (depositFeeData != null) {
            arrayList.add("deposit_fee_data=" + depositFeeData);
        }
        Boolean bool = this.display_auto_cash_out_toggle;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("display_auto_cash_out_toggle=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DepositPreferenceData{", "}", 0, null, null, 56);
    }
}
